package airbnb.pet.model;

public class Perro extends Mascota {
    private boolean saleAEjercitar; // “salen a hacer ejercicio durante el día”

    public Perro() { }

    public Perro(String codigo, String nombre, double peso, int edad, int diasAlojamiento, boolean supervisionNocturna,
                 boolean saleAEjercitar) {
        super(codigo, nombre, peso, edad, diasAlojamiento, supervisionNocturna);
        this.saleAEjercitar = saleAEjercitar;
    }

    public boolean isSaleAEjercitar() { return saleAEjercitar; }
    public void setSaleAEjercitar(boolean saleAEjercitar) { this.saleAEjercitar = saleAEjercitar; }

    @Override
    public String mostrarDatos() {
        return "Perro {" +
                "codigo='" + getCodigo() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", peso=" + getPeso() +
                ", edad=" + getEdad() +
                ", dias=" + getDiasAlojamiento() +
                ", supervisionNocturna=" + isSupervisionNocturna() +
                ", saleAEjercitar=" + saleAEjercitar +
                '}';
    }
}
