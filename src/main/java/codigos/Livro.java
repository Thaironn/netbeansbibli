/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigos;

/**
 *
 * @author aluno tds
 */
public class Livro {
    
    private int id;
    private String categoria;
    private String título;
    private String Autor;
    private boolean Disponível;

    public Livro(String categoria, String título, String Autor) {
        this.categoria = categoria;
        this.título = título;
        this.Autor = Autor;
        
        
    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return Autor;
    }

    public boolean isDisponível() {
        return Disponível;
    }

    public void setDisponível(boolean Disponível) {
        this.Disponível = Disponível;
    }
    
    
}
