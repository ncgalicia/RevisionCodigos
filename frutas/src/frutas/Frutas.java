package frutas;

public class Frutas {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el número de mangos: ");
	        int mangos = scanner.nextInt();

	        System.out.println("Ingrese el número de naranjas: ");
	        int naranjas = scanner.nextInt();

	        MangosNaranjas mn = new MangosNaranjas(mangos, naranjas);
	        mn.imprimir();

	        scanner.close();
	    }
	}
}

