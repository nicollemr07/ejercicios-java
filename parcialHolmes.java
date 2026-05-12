public class Espia {
    String nombreClave;
    int perfilesRastreados;
    String plataformaFavorita;

    public Espia(String nombreClave, int perfilesRastreados, String plataformaFavorita) {
        this.nombreClave = nombreClave;
        this.perfilesRastreados = perfilesRastreados;
        this.plataformaFavorita = plataformaFavorita;
    }

    public void informarRastreoDigital() {
        System.out.println("La agente rastreo " + perfilesRastreados + " perfiles en " + plataformaFavorita);
    }

    public static void main(String[] args) {
        Espia agente = new Espia("Aurora Quebrada", 1000, "Instagram");
        agente.informarRastreoDigital();
    }
}
