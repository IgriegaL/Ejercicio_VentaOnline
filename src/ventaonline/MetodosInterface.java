/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaonline;

/**
 *
 * @author pc
 */
public class MetodosInterface implements Interface{
    private String comentario;

    public MetodosInterface(String comentario) {
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    @Override
    public void Comentar() {
        System.out.println("Su comentario fue agregado : " + this.comentario);
    }
    
    
}
