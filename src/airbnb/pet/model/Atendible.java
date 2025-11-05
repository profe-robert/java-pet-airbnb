package airbnb.pet.model;

public interface Atendible {
    // Método que cada mascota implementará según sus necesidades
    // La interfáz obligará a cada clase que implemente una funcionalidad para obtenerCuidados
    String obtenerCuidadosDiarios(); // Solo se define acá el nombre de la función que queremos obligar a implementar en cada clase
}
