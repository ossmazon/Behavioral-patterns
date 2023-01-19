package State;

public class Telefono  {

    public Estado estado;

    public Telefono(){
        this.estado=new EstadoBloqueado(this);
    }

    public void cambiarEstado(Estado estado){
        System.out.println("Estado inicial: "+this.estado.getClass().getName());
        this.estado=estado;
        System.out.println("Estado final: "+this.estado.getClass().getName());


    }

    public Estado getEstado(){
        return estado;
    }

}
