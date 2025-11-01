package airbnb.pet.repository;

import airbnb.pet.model.Mascota;

import java.util.ArrayList;
import java.util.List;

public class RegistroMascotas {
    private final List<Mascota> alojadas = new ArrayList<>();

    // Valida que no exista por código antes de ingresar
    public boolean agregar(Mascota m) {
        if (m == null || m.getCodigo() == null) return false;
        if (buscarPorCodigo(m.getCodigo()) != null) return false; // ya existe
        return alojadas.add(m);
    }

    public Mascota buscarPorCodigo(String codigo) {
        for (Mascota m : alojadas) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) return m;
        }
        return null;
    }

    public List<Mascota> listarTodas() {
        return new ArrayList<>(alojadas); // copia defensiva
    }

    public int cantidad() {
        return alojadas.size();
    }
}

