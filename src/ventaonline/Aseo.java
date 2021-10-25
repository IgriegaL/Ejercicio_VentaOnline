/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaonline;

/**
 *
 * @author pc
 */
public class Aseo extends Producto{
    
    private boolean cuidadoEspecial;

    public Aseo(boolean cuidadoEspecial, String categoria, int codigo, String descripcion, int precio) {
        super(categoria, codigo, descripcion, precio);
        this.cuidadoEspecial = cuidadoEspecial;
    }

    public Aseo() {
    }

    public boolean isCuidadoEspecial() {
        return cuidadoEspecial;
    }

    public void setCuidadoEspecial(boolean cuidadoEspecial) {
        this.cuidadoEspecial = cuidadoEspecial;
    }

    @Override
    public void Mostrar() {
        super.Mostrar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
