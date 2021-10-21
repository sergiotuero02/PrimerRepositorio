package Principal;

import java.util.Scanner;

import entidades.*;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);

		Persona luis, sergio;
		luis = new Persona();
		sergio = new Persona();

		luis.setId(444);
		String nombreLuis = "Luis de blas";
		luis.setNombre(nombreLuis);
		long edadLuis = 0;
		luis.setEdad(edadLuis);

		String aux;
		aux = luis.getNombre();
		String asignaturaFavLuis = "matemáticas";
		// Luis.setAsignaturaFav(asignaturaFavLuis);

		// System.out.println(Luis.getAsignaturaFav);
		System.out.println("identificador de\t" + aux + " es:\t" + luis.getId());

		Persona persona1 = new Persona();

		System.out.println("Introduce el id de la persona:");
		long idPersona1 = teclado.nextLong();
		persona1.setId(idPersona1);

		System.out.println("Introduce el nombre de la persona:");
		String nombrePersona1 = teclado.next();
		persona1.setNombre(nombrePersona1);

		System.out.println("Introduce la inicial de la persona:");
		char inicialPersona1 = teclado.next().charAt(0);
		persona1.setInicial(inicialPersona1);

		System.out.println("Introduce la edad de la persona:");
		long edadPersona1 = teclado.nextLong();
		persona1.setEdad(edadPersona1);

		System.out.println("Introduce el número de premios de la persona:");
		int numpremiosPersona1 = teclado.nextInt();
		persona1.setNumpremios(numpremiosPersona1);

		System.out.println("Introduce la estatura de la persona:");
		double estaturaPersona1 = teclado.nextDouble();
		persona1.setEstatura(estaturaPersona1);

		System.out.println("Indica si la persona es vip o no: ");
		boolean vipPersona1 = teclado.nextBoolean();
		persona1.setVip(vipPersona1);

		System.out.println(persona1);

	}

}
