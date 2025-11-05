package airbnb.pet.model;

public class Conejo extends Mascota {
    private String dieta; // “tipo de comida / dieta”

    public Conejo() { }

    public Conejo(String codigo, String nombre, double peso, int edad, int diasAlojamiento, boolean supervisionNocturna,
                  String dieta) {
        super(codigo, nombre, peso, edad, diasAlojamiento, supervisionNocturna);
        this.dieta = dieta;
    }

    public String getDieta() { return dieta; }
    public void setDieta(String dieta) { this.dieta = dieta; }

    @Override
    public String mostrarDatos() {
        return "Conejo {" +
                "codigo='" + getCodigo() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", peso=" + getPeso() +
                ", edad=" + getEdad() +
                ", dias=" + getDiasAlojamiento() +
                ", supervisionNocturna=" + isSupervisionNocturna() +
                ", dieta='" + dieta + '\'' +
                '}';
    }
    
    // Implementación de la interfáz (si no la implementa el programa tirará error)
    @Override
    public String obtenerCuidadosDiarios() {
        return "Proveer heno fresco, revisar dieta y mantener area de juego segura.";
    }
}

