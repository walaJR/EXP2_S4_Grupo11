package Models;


public abstract class EquipoDecorator implements Component{
    
    private Component componente;

    public EquipoDecorator(Component componente) {
        this.componente = componente;
    }

    public EquipoDecorator() {
    }
    
    
    protected Component getComponent(){
    return componente;
    }
    
}
