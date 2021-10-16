package test;

public class Motor {
    
    String tipo;
    int numeroCilindros;
    int registro;
    
    public void cambiarRegistro(int registro){
        this.registro = registro;
    }
    
    public void asignarTipo(String tipo){
        if tipo.equals("gasolina") || (tipo.equals("electrico")){
            this.tipo = tipo;                  
        }
    }
}
