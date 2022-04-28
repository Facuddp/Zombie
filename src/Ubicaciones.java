import java.util.ArrayList;

public class Ubicaciones {
    private String nombreUbicacion;
    private float distancia;
    private int cantidadZombies;
    public static ArrayList<Ubicaciones> miUbicaciones = new ArrayList<>();

    public Ubicaciones(String nombreUbicacion, float distancia, int cantidadZombies) {
        this.nombreUbicacion = nombreUbicacion;
        this.distancia = distancia;
        this.cantidadZombies = cantidadZombies;
        Ubicaciones.miUbicaciones.add(this);
    }




        public String getNombreUbicacion() {
            return nombreUbicacion;
        }

        public float getDistancia() {
            return distancia;
        }

        public int getCantidadZombies() {
            return cantidadZombies;
        }

        public void setNombreUbicacion(String nombreUbicacion) {
            this.nombreUbicacion = nombreUbicacion;
        }

        public void setDistancia(float distancia) {
            this.distancia = distancia;
        }

        public void setCantidadZombies(int cantidadZombies) {
            this.cantidadZombies = cantidadZombies;
        }


    public static void ordenamientoDistancia(ArrayList<Ubicaciones>miUbicaciones,int n){
        int menor;
        float temp;
        for (int i = 0; i < n - 1; i++) {
            menor = i;
            for (int j = i + 1; j < n; j++) {
                if (miUbicaciones.get(j).getDistancia() < miUbicaciones.get(menor).getDistancia()){
                    menor = j;
                }
            }
            temp = miUbicaciones.get(i).getDistancia();
            miUbicaciones.get(i).setDistancia(miUbicaciones.get(menor).getDistancia());
            miUbicaciones.get(menor).setDistancia(temp);
        }
    }

    public static void ordenamientoCantidad(ArrayList<Ubicaciones>miUbicaciones,int n){
        int menor;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            menor = i;
            for (int j = i + 1; j < n; j++) {
                if (miUbicaciones.get(j).getCantidadZombies() < miUbicaciones.get(menor).getCantidadZombies()){
                    menor = j;
                }
            }
            temp = miUbicaciones.get(i).getCantidadZombies();
            miUbicaciones.get(i).setCantidadZombies(miUbicaciones.get(menor).getCantidadZombies());
            miUbicaciones.get(menor).setCantidadZombies(temp);
        }
    }

}
