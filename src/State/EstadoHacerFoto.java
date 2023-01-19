package State;

public class EstadoHacerFoto extends Estado{
    public EstadoHacerFoto(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "Telefono ya desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "Camara ya desbloqueada";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiarEstado(new EstadoBloqueado(telefono));
        return "La foto ya se ha hecho";
    }
}
