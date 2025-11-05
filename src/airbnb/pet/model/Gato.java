package airbnb.pet.model;

public class Gato extends Mascota {
    private String pedigri; // “definen por pedigrí”

    public Gato() { }

    public Gato(String codigo, String nombre, double peso, int edad, int diasAlojamiento, boolean supervisionNocturna,
                String pedigri) {
        super(codigo, nombre, peso, edad, diasAlojamiento, supervisionNocturna);
        this.pedigri = pedigri;
    }

    public String getPedigri() { return pedigri; }
    public void setPedigri(String pedigri) { this.pedigri = pedigri; }

    @Override
    public String mostrarDatos() {
        return "Gato {" +
                "codigo='" + getCodigo() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", peso=" + getPeso() +
                ", edad=" + getEdad() +
                ", dias=" + getDiasAlojamiento() +
                ", supervisionNocturna=" + isSupervisionNocturna() +
                ", pedigri='" + pedigri + '\'' +
                '}';
    }
    
    // Implementación de la interfáz (si no la implementa el programa tirará error)
    @Override
    public String obtenerCuidadosDiarios() {
        return "Limpieza de arenero, supervision tranquila y cuidado del pelaje.";
    }
}
