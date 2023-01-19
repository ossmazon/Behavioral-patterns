package Strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFichero implements User{

    private String ficheroUsuarios="usuario.txt";
    private PrintStream fichero;

    public UsuariosFichero(){
        try {
            fichero=new PrintStream(ficheroUsuarios);
        }catch (Exception e){
            System.out.println("No puedo abrir el fichero "+e.getMessage());
        }
    }
    @Override
    public void crear(String nombre){
        fichero.println(nombre);
    }
    @Override
    public ArrayList<String> lista(){

        ArrayList<String>usuarios= new ArrayList<>();


        try {
            Scanner scanner=new Scanner(new File(ficheroUsuarios));

            while (scanner.hasNext()){
                usuarios.add(scanner.next());
            }

        }catch (Exception e){
            System.out.println("Error leyenfo "+e.getMessage());
        }

        return usuarios;
    }
}
