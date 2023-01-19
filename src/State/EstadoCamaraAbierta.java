package State;

public class EstadoCamaraAbierta extends Estado{
    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "ya esta desbloqueado el telefono";
    }

    @Override
    public String abrirCamara() {
        return "camara ya estab abierta";
    }

    @Override
    public String hacerFoto() {
         telefono.cambiarEstado(new EstadoHacerFoto(telefono));
        return "La camara se va a disparar";
    }
}
