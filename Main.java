public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Camilo");
        persona.setEdad(19);
        persona.setTelefono(314243242);

        System.out.println("La persona tiene los datos = " + persona.getNombre() + ", " + persona.getEdad() + ", " + persona.getTelefono());
    }
}