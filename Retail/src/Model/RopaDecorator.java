package Model;


public abstract class RopaDecorator implements Component{
    
    private Component componente;

    public RopaDecorator(Component componente) {
        this.componente = componente;
    }

    public RopaDecorator() {
    }
    
    
    protected Component getComponent(){
    return componente;
    }
    
}
