class Usuario {
    int id;
    String nombre;
    String rol;

    Usuario(int id, String nombre, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
    }

    void mostrar() {
        System.out.println(id + " - " + nombre + " | Rol: " + rol);
    }

    boolean tienePermiso(String permiso) {
        if (rol.equals("admin")) return true;
        if (rol.equals("editor") && (permiso.equals("editar") || permiso.equals("ver"))) return true;
        if (rol.equals("lector") && permiso.equals("ver")) return true;
        return false;
    }
}

public class InventarioSimple {
    public static void main(String[] args) {
        Usuario u1 = new Usuario(1, "Ana", "admin");
        Usuario u2 = new Usuario(2, "Luis", "editor");
        Usuario u3 = new Usuario(3, "Sofía", "lector");

        u1.mostrar();
        u2.mostrar();
        u3.mostrar();

        System.out.println("\n¿Luis puede editar?");
        System.out.println(u2.tienePermiso("editar")); // true

        System.out.println("\n¿Sofía puede eliminar?");
        System.out.println(u3.tienePermiso("eliminar")); // false
    }
}
