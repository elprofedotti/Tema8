public class Main {
    public static void main(String[] args) {

        Persona persona=new Persona();
        persona.setNombre("Matias");
        persona.setTelefono("155547849");
        persona.setEdad(43);
        System.out.println("*********************************");
        System.out.println("El nombre de la persona es "+persona.getNombre());
        System.out.println("La persona tiene "+persona.getEdad()+" años");
        System.out.println("Y su telefono es "+persona.getTelefono());

    }
}
