import com.google.gson.Gson;

public class Datos {
    public static void main(String[] args) {
        // Creamos un objeto de ejemplo
        Persona persona = new Persona("Ana", 25);

        // Creamos un objeto Gson
        Gson gson = new Gson();

        // Convertimos el objeto a formato JSON
        String json = gson.toJson(persona);

        // Mostramos el JSON
        System.out.println(json);
    }
}

// Clase auxiliar para el ejemplo
class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}