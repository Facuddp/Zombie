import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Principal.mostrarMenu();


    }


    public static void mostrarMenu() {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        String fecha = "";

        while (flag) {
            System.out.println("\nOprima 0 para cerrar el programa");
            System.out.println("Oprima 1 para cargar un zombie");
            System.out.println("Oprima 2 para ver la informacion de los zombies almacenados");
            System.out.println("Oprima 3 para ver la cantidad zombies almacenados");
            System.out.println("Oprima 4 para ver la información de los zombies con sangre tipo O+ y AB+");
            System.out.println("Oprima 5 para ver la información de los zombies nacidos despues del 2000");
            System.out.println("Oprima 6 para lanzar bomba");
            System.out.println("Oprima 7 para cargar una ubicación");
            System.out.println("Oprima 8 para ver la información de las ubicaciones almacenados");
            System.out.println("Oprima 9 para ver la información de las ubicaciones más seguras");
            System.out.println("Oprima 10 para ver la informacion de las ubicaciones más cercanas a Alexandria");
            System.out.println("Oprima 11 para ver una frase de un zombie");
            System.out.println("Oprima 12 para ver los zombies con menos salud");

            System.out.println("Ingrese un numero: ");
            int numero = sc.nextInt();
            switch (numero) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("\nIngrese el nombre de un Zombie:");
                    String nombre = sc.next();
                    System.out.println("Ingrese la salud de un Zombie (0-100): ");
                    double salud = sc.nextDouble();
                    System.out.println("Ingrese la fecha de nacimiento de un Zombies(DD/MM/AAAA): ");
                    fecha = sc.next();
                    System.out.println("Ingrese el tipo de sangre de un Zombie:");
                    String tipoSangre = sc.next();
                    tipoSangre = tipoSangre.toUpperCase();
                    Zombies z1 = new Zombies(nombre, salud, fecha, tipoSangre);
                    break;
                case 2:
                    if (Zombies.miZombies.size() == 0) {
                        System.out.println("\nNo hay zombies almacendos");
                    } else {
                        System.out.println("los zombies almacenados son: ");
                        for (int i = 0; i < Zombies.miZombies.size(); i++) {
                            System.out.println("\nZombie[" + (i + 1) + "]: ");
                            System.out.println("Nombre: " + Zombies.miZombies.get(i).getNombre());
                            System.out.println("Salud:  " + Zombies.miZombies.get(i).getSalud());
                            System.out.println("Fecha de nacimiento: " + Zombies.miZombies.get(i).getFecha());
                            System.out.println("Tipo de sangre: " + Zombies.miZombies.get(i).getTipoSangre());
                        }
                    }
                    break;
                case 3:
                    System.out.println("La cantidad de zombies almacenados es: " + Zombies.miZombies.size());
                    break;
                case 4:
                    int contador = 0;
                    if (Zombies.miZombies.size() <= 0) {
                        System.out.println("\nNo hay zombies almacenados");
                        contador++;
                    }
                    for (int i = 0; i < Zombies.miZombies.size(); i++) {
                        if (Zombies.miZombies.get(i).getTipoSangre().equals("O+") || Zombies.miZombies.get(i).getTipoSangre().equals("AB+")) {
                            System.out.println("\nZombie[" + (i + 1) + "]: ");
                            System.out.println("Nombre: " + Zombies.miZombies.get(i).getNombre());
                            System.out.println("Salud:  " + Zombies.miZombies.get(i).getSalud());
                            System.out.println("Fecha de nacimiento: " + Zombies.miZombies.get(i).getFecha());
                            System.out.println("Tipo de sangre: " + Zombies.miZombies.get(i).getTipoSangre());
                            contador++;
                        }
                    }
                    if (contador == 0) {
                    System.out.println("No hay zombies almacenados con estos tipos de sangre");
                    }
                    break;
                case 5:
                    contador = 0;
                    if(Zombies.miZombies.size()<=0){
                        System.out.println("\nNo hay informacion de ningun zombie");
                        contador++;
                    }
                    for (int i = 0; i < Zombies.miZombies.size(); i++){
                        String letra = Zombies.miZombies.get(i).getFecha().substring(7);
                        if (Zombies.miZombies.get(i).getFecha().charAt(6)=='2') {
                            System.out.println("\nZombie[" + (i + 1) + "]: ");
                            System.out.println("Nombre: " + Zombies.miZombies.get(i).getNombre());
                            System.out.println("Salud:  " + Zombies.miZombies.get(i).getSalud());
                            System.out.println("Fecha de nacimiento: " + Zombies.miZombies.get(i).getFecha());
                            System.out.println("Tipo de sangre: " + Zombies.miZombies.get(i).getTipoSangre());
                            contador++;
                        }
                    }
                    if (contador == 0) {
                    System.out.println("No hay zombies almacenados nacidos despues del 2000");
                    }
                    break;

                case 6:
                    for (int i = 0; i < Zombies.miZombies.size(); i++){
                        Zombies.miZombies.get(i).setSalud(Zombies.miZombies.get(i).getSalud()/2);
                    }
                    System.out.println("\nLa bomba exploto");
                    break;
                case 7:
                    System.out.println("\nIngrese el nombre de la ubicacion:");
                    String nombreUbicacion = sc.next();
                    System.out.println("Ingrese la distancia a Alexandria: ");
                    float distancia = sc.nextFloat();
                    System.out.println("Ingrese la cantidad de zombies: ");
                    int cantidadZombies = sc.nextInt();
                    Ubicaciones u1 = new Ubicaciones(nombreUbicacion, distancia, cantidadZombies);
                    break;
                case 8:
                    if (Ubicaciones.miUbicaciones.size() == 0) {
                        System.out.println("\nNo hay ubicaciones almacendas");
                    } else {
                        System.out.println("las ubicaciones almacenados son: ");
                        for (int i = 0; i < Ubicaciones.miUbicaciones.size(); i++) {
                            System.out.println("\nUbicacion[" + (i+1) + "]:");
                            System.out.println("Nombre: " + Ubicaciones.miUbicaciones.get(i).getNombreUbicacion());
                            System.out.println("Distancia: " + Ubicaciones.miUbicaciones.get(i).getDistancia());
                            System.out.println("Cantidad de zombies: " + Ubicaciones.miUbicaciones.get(i).getCantidadZombies());

                        }
                    }
                    break;
                case 9:
                    if(Ubicaciones.miUbicaciones.size() == 0){
                        System.out.println("\nNo hay ubicaciones almacenadas");
                    }else{
                        Ubicaciones.ordenamientoCantidad(Ubicaciones.miUbicaciones,Ubicaciones.miUbicaciones.size());
                        System.out.println("\nlas ubicaciones mas seguras son:");
                        for(int i=0; i<Ubicaciones.miUbicaciones.size(); i++){
                            System.out.println("\nUbicacion[" + (i+1) + "]:");
                            System.out.println("Nombre: " + Ubicaciones.miUbicaciones.get(i).getNombreUbicacion());
                            System.out.println("Distancia: " + Ubicaciones.miUbicaciones.get(i).getDistancia());
                            System.out.println("Cantidad de zombies: " + Ubicaciones.miUbicaciones.get(i).getCantidadZombies());
                        }
                    }
                    break;
                case 10:
                    if(Ubicaciones.miUbicaciones.size() == 0){
                        System.out.println("\nNo hay ubicaciones almacenadas");
                    }else{
                        Ubicaciones.ordenamientoDistancia(Ubicaciones.miUbicaciones,Ubicaciones.miUbicaciones.size());
                        System.out.println("\nlas ubicaciones más cercanas a Alexandria son:");
                        for(int i=0; i<Ubicaciones.miUbicaciones.size(); i++){
                            System.out.println("\nUbicacion[" + (i+1) + "]:");
                            System.out.println("Nombre: " + Ubicaciones.miUbicaciones.get(i).getNombreUbicacion());
                            System.out.println("Distancia: " + Ubicaciones.miUbicaciones.get(i).getDistancia());
                            System.out.println("Cantidad de zombies: " + Ubicaciones.miUbicaciones.get(i).getCantidadZombies());
                        }
                    }
                    break;


                case 11:
                    String[] frases = new String[] {"Te comere el cerebro", "El apolcalipsis se acerca", "Corre que te deborare", "Que sangre tan deliciosa", "Soy un zombie"};

                    int random = (int)(Math.random()*5);
                    System.out.println(frases[random]);
                    break;
                case 12:
                    if(Zombies.miZombies.size() == 0){
                        System.out.println("\nNo hay zombies almacenados");
                    }else{
                        Zombies.ordenamientoSalud(Zombies.miZombies,Zombies.miZombies.size());
                        System.out.println("\nlos zombies que tienen menos salud son:");
                        for(int i=0; i<Zombies.miZombies.size(); i++){
                            System.out.println("\nZombie[" + (i + 1) + "]: ");
                            System.out.println("Nombre: " + Zombies.miZombies.get(i).getNombre());
                            System.out.println("Salud:  " + Zombies.miZombies.get(i).getSalud());
                            System.out.println("Fecha de nacimiento: " + Zombies.miZombies.get(i).getFecha());
                            System.out.println("Tipo de sangre: " + Zombies.miZombies.get(i).getTipoSangre());
                        }
                    }
                    break;



            }


        }

    }
}
