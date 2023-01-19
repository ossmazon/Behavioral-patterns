package Itertator;

public class TesterMain {

    //podemos iterar un arreglo sin importat el tipo de dato en que este guardado
    public static void main(String[] args) {

        Usuarios user1 =new Usuarios();
        user1.Crear(new Usuario("Uno",20));
        user1.Crear(new Usuario("Dos",21));
        user1.Crear(new Usuario("Tres",22));
        user1.Crear(new Usuario("Cuatro",23));
        user1.Crear(new Usuario("Sinco",24));
        user1.Crear(new Usuario("Seis",29));

        while (user1.hayMas()){
            Usuario usuario=user1.siguiente();
            System.out.println("usuarios es: "+usuario.getName() );
        }
        user1.Crear(new Usuario("siete",52));

        user1.reinicia();

        System.out.println();

        while (user1.hayMas()){
            Usuario usuario=user1.siguiente();
            System.out.println("usuarios es: "+usuario.getName() );
        }
    }
}
