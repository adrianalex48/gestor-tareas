public class Tarea {
    private String descripcion;
    private boolean completada;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false; // Por defecto, cuando la creas, NO está completada
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    @Override
    public String toString() {
        if (completada) {
            return "[X] " + descripcion; // Tarea lista
        } else {
            return "[ ] " + descripcion; // Tarea pendiente
        }
    }
}