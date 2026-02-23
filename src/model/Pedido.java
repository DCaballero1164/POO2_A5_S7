package model;

public class Pedido {
    //Se definen las variables de Pedido.
    private String id;
    private String direccion;
    private String tipo;

    //Constructor de la clase Pedido.
    public Pedido(String id, String direccion, String tipo) {
        this.id = id;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    //Getter
    public String getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipo() {
        return tipo;
    }

    //Metodo util para mostrar datos en la tabla
    public Object[] toArray() {return new Object[]{id, direccion, tipo}; }
}
