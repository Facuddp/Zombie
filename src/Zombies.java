import java.util.ArrayList;

public class Zombies {
    private String nombre;
    private double salud;
    private String fecha;
    private String tipoSangre;
    public static ArrayList<Zombies> miZombies = new ArrayList<>();

    public Zombies(String nombre, double salud, String fecha, String tipoSangre){
        this.nombre = nombre;
        this.fecha = fecha;
        this.salud = salud;
        this.tipoSangre = tipoSangre;
        Zombies.miZombies.add(this);
    }


    public String getNombre() {
        return nombre;
    }

    public double getSalud() {
        return salud;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


    public static void ordenamientoSalud(ArrayList<Zombies>miZombies,int n){
        int menor;
        double temp;
        for (int i = 0; i < n - 1; i++) {
            menor = i;
            for (int j = i + 1; j < n; j++) {
                if (miZombies.get(j).getSalud() < miZombies.get(menor).getSalud()){
                    menor = j;
                }
            }
            temp = miZombies.get(i).getSalud();
            miZombies.get(i).setSalud(miZombies.get(menor).getSalud());
            miZombies.get(menor).setSalud(temp);
        }
    }
}
