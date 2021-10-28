package ventaonline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VentaOnline {
    public static void main(String[] args) {
    List<Producto> carrito = new ArrayList<Producto>();
    Liquidos cerveza = new Liquidos(1.0,"Cervezas",001,"Escudo",990,0);
    Liquidos bebida = new Liquidos(0.0,"Bebidas",002,"Inca-Cola",1290,0);
    Aseo cloro = new Aseo(true,"aseo",003,"Clorinda",1300,0);
    Aseo lavaloza = new Aseo(true,"aseo",004,"Magistral",2200,0);

    Scanner s = new Scanner(System.in);
    var opcion = 0;
    
        while (opcion != 5) {
            System.out.println("1.-Ver Productos 2.-Ver carrito  5.-Salir");
            opcion = s.nextInt();
            if (opcion == 1) {
                cerveza.Mostrar();
                bebida.Mostrar();
                cloro.Mostrar();
                lavaloza.Mostrar();
                
                
                System.out.println("---------------------------------------");
                System.out.println("Que productos desea agregar al carrito?");
                System.out.println("1. Cerverza 2. Bebida 3. Cloro 4. Lavaloza");
                int opcion2 = 0;
                opcion2 = s.nextInt();
                if (opcion2 == 1){
                    carrito.add(cerveza);
                    System.out.println("Cuantos productos desea agregar al carrito?");
                    var Cant = s.nextInt();
                    cerveza.setCantidad(Cant);
                }
                if (opcion2 == 2) {
                    carrito.add(bebida);
                    System.out.println("Cuantos productos desea agregar al carrito?");
                    var Cant = s.nextInt();
                    bebida.setCantidad(Cant);
                }
                if (opcion2 == 3) {
                    carrito.add(cloro);
                    System.out.println("Cuantos productos desea agregar al carrito?");
                    var Cant = s.nextInt();
                    cloro.setCantidad(Cant);
                }
                if (opcion2 == 4) {
                    carrito.add(lavaloza);
                    System.out.println("Cuantos productos desea agregar al carrito?");
                    var Cant = s.nextInt();
                    lavaloza.setCantidad(Cant);
                }
                
            }
            if (opcion == 2){
                System.out.println("Su Carrito contiene:");
                for (Producto producto : carrito) {
                    System.out.println("Produto: " + producto.getDescripcion() + " Precio: "+ producto.getPrecio() + " Cantidad: " + producto.getCantidad());
                    
                }
                int t = cerveza.getPrecio() * cerveza.getCantidad() + bebida.getPrecio() * bebida.getCantidad() + cloro.getPrecio() * cloro.getCantidad()+ lavaloza.getPrecio() * lavaloza.getCantidad();
                
                System.out.println("Total compra: " + t);
            

            }
            if(opcion == 3){
                
            }
        }
    
    
    

    
    
    }
    
}
