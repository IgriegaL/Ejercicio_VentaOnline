
package ventaonline;
public class Producto {
    private String categoria;
    private int codigo;
    private String descripcion;
    private int precio;

    public Producto() {
    }

    public Producto(String categoria, int codigo, String descripcion, int precio) {
        this.categoria = categoria;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
        public void Mostrar (){
        System.out.println("Producto: " + getDescripcion() + " Precio: " + getPrecio());
    }
        
    
    
    
}
