package ventaonline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class VentaOnline {
    public static void main(String[] args) {
    List<Producto> carrito = new ArrayList<Producto>();
    Liquidos cerveza = new Liquidos(1.0,"Cervezas",001,"Escudo",990);
    Liquidos bebida = new Liquidos(0.0,"Bebidas",002,"Inca-Cola",1290);
    Aseo cloro = new Aseo(true,"aseo",003,"Clorinda",1300);
    Aseo lavaloza = new Aseo(true,"aseo",004,"Magistral",2200);

    Scanner s = new Scanner(System.in);
    var opcion = 0;
    
        while (opcion != 5) {
            System.out.println("1.-Ver Productos\n 2.-Ver carrito \n5.-Salir");
            opcion = s.nextInt();
            if (opcion == 1) {
                cerveza.Mostrar();
                bebida.Mostrar();
                cloro.Mostrar();
                lavaloza.Mostrar();
            }
            if (opcion == 2){
                System.out.println("Que productos desea agregar al carrito?");
                opcion = s.nextInt();
                if (opcion == 1){
                    carrito.add(cerveza);

                }
            }
            if(opcion == 3){
                Producto pr = new Producto();
            }
        }
    
    
    

    
    
    }
    
}
