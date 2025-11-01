package airbnb.pet;

import airbnb.pet.model.*; // traemos todas las clases dentro de model
import airbnb.pet.repository.RegistroMascotas;

public class AirbnbPet {

    public static void main(String[] args) {
        
        System.out.println("AirbnbPet - Registro de Mascotas (EA2)");

        RegistroMascotas registro = new RegistroMascotas();

        // Agregar 3 perros
        registro.agregar(new Perro("P-001","Rocky", 18.5, 5, 3, true,  true));
        registro.agregar(new Perro("P-002","Luna",  11.2, 3, 5, false, true));
        registro.agregar(new Perro("P-003","Milo",  22.0, 7, 2, true,  false));

        // Agregar 2 gatos
        registro.agregar(new Gato("G-001","Misha", 4.0, 2, 4, false, "Siamés-CFA"));
        registro.agregar(new Gato("G-002","Nina",  3.5, 1, 1, true,  "Europeo"));

        // Agregar 2 conejos
        registro.agregar(new Conejo("C-001","Snow", 1.2, 1, 2, false, "Heno y verduras"));
        registro.agregar(new Conejo("C-002","Bunny",0.9, 1, 3, true,  "Pienso + heno"));

        // Listar todas (polimorfismo: cada tipo sobrescribe mostrarDatos)
        System.out.println("\nListado de mascotas alojadas:");
        for (Mascota m : registro.listarTodas()) {
            System.out.println(m.mostrarDatos());
        }

        // Total
        System.out.println("\nTotal de mascotas: " + registro.cantidad());
        
    }    
}
