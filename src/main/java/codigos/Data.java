/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigos;

/**
 *
 * @author aluno tds
 */
public class Data {
    private Biblioteca biblioteca;

    public Data() {
        initDados();
    }
    
    private void initDados(){
        // Inicializa biblioteca
        this.biblioteca = new Biblioteca("Biblioteca Municipal");
        this.biblioteca.addLivro(new Livro("Biblia","Não informado","Religião"));
        this.biblioteca.addLivro(new Livro("Turma da Mônica","Maurício de Souza","Infantil"));
        this.biblioteca.addLivro(new Livro("Harry Potter","J.K. Rownling","Fantasia"));
        this.biblioteca.addLivro(new Livro("O Código Da Vinci","Dan Brown","Ficção"));
        this.biblioteca.addLivro(new Livro("Vinte mil léguas submarinas","Julio Verne","Ficção"));
    }
    
    public Biblioteca getBiblioteca(){
        return this.biblioteca;
    }
}
