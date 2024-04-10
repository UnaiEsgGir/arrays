package practica3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EmpleadoMain {

	/*
	 * Clase que nos permite dar de alta a los empleados de diferentes departamentos y consultar su información.
	 * Autor: Unai Esgueva Gironda 
	 * Fecha: 12/03/2024
	 */
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		try {
			String opc;
			
			// Declaramos dos arrays, uno que contiene los nombres de los departamentos y otro que va a contener la información de los empleados.
			String [] vDepartamento = {"Informática", "Compras", "Ventas", "Contabilidad", "Recursos humanos"};
			Empleado [] [] vEmpleado = new Empleado [vDepartamento.length] [];
			do {
				// Me mostramos el menu y sus opciones hasta que decida salir el usuario.
				opc = menu(); 
				
				switch (opc) {
					case "Alta":	
						altaEmpleado(vDepartamento, vEmpleado); 
						break;
					case "Listado empleados por departamento":
						listarDept(vDepartamento, vEmpleado);
						
						break;
					case "Listar todos":
						listarTodo(vDepartamento, vEmpleado);
						
						break;
					case "Salir":
						salir();
						
						break;
					default:
						System.out.println(" ");
				}
				
			}while(!opc.equals("Salir"));
		}
		// Catch para las excepciones.
		catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, 
					"VALORES NULOS",
					"ERROR",
					JOptionPane.ERROR_MESSAGE
					);
		}
		catch(ArrayIndexOutOfBoundsException e2) { 
			JOptionPane.showMessageDialog(null, 
					"ARRAY FUERA DE RANGO",
					"ERROR",
					JOptionPane.ERROR_MESSAGE
					);
		}
		catch(NumberFormatException e3) {
			JOptionPane.showMessageDialog(null, 
					"FORMATO NO VALIDO",
					"ERROR",
					JOptionPane.ERROR_MESSAGE
					);
		}
		catch(Exception e4) { // Para excepciones en general.
			JOptionPane.showMessageDialog(null, 
					"ERROR",
					"ERROR",
					JOptionPane.ERROR_MESSAGE
					);
		}
		
	}
	
	// Método que muestra un mensaje de despedida al salir.
	private static void salir() {
		JOptionPane.showMessageDialog(null, 
				"Has salido del programa.",
				"SALIR",
				JOptionPane.WARNING_MESSAGE
				);
	}
	
	// Método para listar los empleados de un departamento en específico.
	private static void listarDept(String[] vDepartamento, Empleado[][] vEmpleado) {
		String dep = (String) JOptionPane.showInputDialog(null, // Le pedimos al usuario el departamento del que quiere hacer la consulta.
				"¿De que departamento listar los empleados?", 
				"LISTAR", 
				JOptionPane.QUESTION_MESSAGE,
				null, 
				vDepartamento, 
				vDepartamento[0]);
		int i = 0;
		boolean encontrado = false;
		for(i = 0; i < vDepartamento.length && !encontrado; i++) { // Buscamos la posicion en el array del departamento seleccionado.
			if(vDepartamento[i].equals(dep)) {
				encontrado = true;
			}
		}
		JOptionPane.showMessageDialog(null, // Le mostramos la información de ese departamento.
				mostrar2(vDepartamento, vEmpleado, i),
				"LISTADO",
				JOptionPane.INFORMATION_MESSAGE
				);
	}
	
	private static String mostrar2(String[] vDepartamento, Empleado[][] vEmpleado, int i) {
		String datos ="";
		if(vEmpleado[i-1] != null) { // Si el departamento no está en null mostramos los nombres de sus empleados.
				datos = datos + vDepartamento[i-1] +"\n";
				for(int posColum = 0; posColum < vEmpleado[i-1].length; posColum++) {
					datos = datos + " 	-" + vEmpleado[i-1][posColum].getNombre() + "\n";
					// Empleado emp = (Empleado) vEmpleado[i-1][posColum]; OTRA OPCIÓN
					// datos = datos + " 	-" + emp.getNombre() + "\n";
				}
		}
		else { // Si está en null le decimos que no tiene empleados.
			datos = "Este departamento no tiene empleados.";
		}
		return datos;
	}
	
	// Método para listar todos los empleados de la empresa.
	private static void listarTodo(String[] vDepartamento, Empleado[][] vEmpleado) {
		JOptionPane.showMessageDialog(null, 
				mostrar(vEmpleado, vDepartamento),
				"LISTADO",
				JOptionPane.INFORMATION_MESSAGE
				);
	}
	
	// Método que muestra los datos de todos los departamentos.
	private static String mostrar(Empleado [][] vEmpleado, String [] vDepartamento) {
		String datos ="";
		for(int posFila = 0; posFila < vDepartamento.length; posFila++) {
			datos = datos + vDepartamento[posFila] +"\n";
			if(vEmpleado[posFila] != null) {
				for(int posColum = 0; posColum < vEmpleado[posFila].length; posColum++) {
					datos = datos + " 	-" + vEmpleado[posFila][posColum].getNombre() + "\n";
				}
			}
		}
		return datos;
	}
	
	// Método para dar de alta a los empleados de un departamento.
	private static void altaEmpleado(String[] vDepartamento, Empleado[][] vEmpleado) {
		String dep = (String) JOptionPane.showInputDialog(null, // Le pedimos el departamento.
			"¿De que departamento quieres agregar empleados?", 
			"ALTA", 
			JOptionPane.QUESTION_MESSAGE,
			null, 
			vDepartamento, 
			vDepartamento[0]);
		String num = JOptionPane.showInputDialog(null, // Le pedimos el número de empleados que tiene dicho departamento.
			"¿Cuantos empleados tiene?", 
			"ALTA", 
			JOptionPane.QUESTION_MESSAGE); 

		int i = 0;
		boolean encontrado = false;
		for(i = 0; i < vDepartamento.length && !encontrado; i++) { // Buscamos la posicion del departamento en el array.
			if(vDepartamento[i].equals(dep)) {
				encontrado = true;
			}
		}
		
		vEmpleado [i-1] = new Empleado [Integer.parseInt(num)]; // Le pasamos la longitud al array.
		for(int j = 0; j < Integer.parseInt(num); j++) {
			String nombre = JOptionPane.showInputDialog(null,
					"Nombre del empleado:", 
					"ALTA", 
					JOptionPane.QUESTION_MESSAGE); 
			String salario = JOptionPane.showInputDialog(null,
					"Sueldo del empleado:", 
					"ALTA", 
					JOptionPane.QUESTION_MESSAGE);
			double sueldo = Double.parseDouble(salario);
			Empleado emp = new Empleado(nombre,sueldo);  // Creamos un objeto de empleado con los valores.
			vEmpleado[i-1][j] = emp; // Agregamos a los empleados al array.
			// vEmpleado[i-1][j] = new Empleado(nombre,sueldo);  OTRA OPCIÓN
		}
	}

	// Método para mostrar al usuario las opciones del programa.
	private static String menu() {
		String[] valores = { "Alta", "Listado empleados por departamento", "Listar todos", "Salir" };
		String opc = (String) JOptionPane.showInputDialog(null, 
			"Elige una opción:", 
			"MENÚ", 
			JOptionPane.QUESTION_MESSAGE, 
			null, 
			valores, 
			valores[0]);
		return opc;
	}

}
