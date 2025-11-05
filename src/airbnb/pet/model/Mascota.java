package airbnb.pet.model;

public abstract class Mascota implements Atendible /* ahora implementamos la interfáz en la clase abstracta, lo que obliga a implementarlña a cada clase que herede de Mascota*/ {
    private String codigo;              // alfanumérico único
    private String nombre;
    private double peso;
    private int edad;
    private int diasAlojamiento;
    private boolean supervisionNocturna;

    // Constructor vacío (requerimiento)
    public Mascota() { }

    // Constructor completo (requerimiento)
    public Mascota(String codigo, String nombre, double peso, int edad, int diasAlojamiento, boolean supervisionNocturna) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.diasAlojamiento = diasAlojamiento;
        this.supervisionNocturna = supervisionNocturna;
    }

    // Método que debe ser sobrescrito por tipo
    public abstract String mostrarDatos();

    // Getters y Setters (accesadores y mutadores)
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public int getDiasAlojamiento() { return diasAlojamiento; }
    public void setDiasAlojamiento(int diasAlojamiento) { this.diasAlojamiento = diasAlojamiento; }
    public boolean isSupervisionNocturna() { return supervisionNocturna; }
    public void setSupervisionNocturna(boolean supervisionNocturna) { this.supervisionNocturna = supervisionNocturna; }
}

