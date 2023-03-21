public class Tv {

    private String fecha;
    private String dano;
    private String dueno;

    public Tv(String fecha, String dano, String dueno) {
        this.fecha = fecha;
        this.dano = dano;
        this.dueno = dueno;
    }

    public void recibirTv(String fecha, String dano, String dueno) {
        this.fecha = fecha;
        this.dano = dano;
        this.dueno = dueno;
    }

    public void entregarTv() {
        this.fecha = "2023-03-21";
        this.dano = "cambio de pantalla";
        this.dueno = "hijo";
    }

    // Getters y setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDano() {
        return dano;
    }

    public void setDano(String dano) {
        this.dano = dano;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
}
