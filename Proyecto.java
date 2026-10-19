public class Proyecto {
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProgreso() {
        return this.progreso;
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            if (this.progreso == 100) {
                this.terminado = true;
            }
        }
    }

    public String getResponsable() {
        return this.responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public boolean isTerminado() {
        return this.terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            this.progreso += porcentaje;
            if (this.progreso >= 100) {
                this.progreso = 100;
                this.terminado = true;
            }
        }
    }
}
