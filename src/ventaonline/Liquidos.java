
package ventaonline;

public class Liquidos extends Producto{



    private double gradoAlcohol;

    public Liquidos(double gradoAlcohol, String categoria, int codigo, String descripcion, int precio, int cantidad) {
        super(categoria, codigo, descripcion, precio, cantidad);
        this.gradoAlcohol = gradoAlcohol;
    }


    public Liquidos() {
    }

    public double getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(double gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    @Override
    public void Mostrar() {
        super.Mostrar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
