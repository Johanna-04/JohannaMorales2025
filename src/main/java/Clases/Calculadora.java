/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

    import java.util.Stack;

public class Calculadora {



    private Stack<Integer> stackDeshacer;
    private Stack<Integer> stackRehacer;
    private int resultado;

    public Calculadora() {
        this.stackDeshacer = new Stack<>();
        this.stackRehacer = new Stack<>();
        this.resultado=0;
}
    public void sumar(int n) {
        stackDeshacer.push(resultado); 
        resultado += n;
        stackRehacer.clear();
       
    }     
    public void Deshacer(){
        if (!stackDeshacer.isEmpty()) {
            stackRehacer.push(resultado); 
            resultado = stackDeshacer.pop();
          System.out.println("Deshacer" + resultado);
        } else {
            System.out.println("No existen datos que deshacer");
        }
        }
     public void Rehacer()  {
        if (!stackRehacer.isEmpty()){
            stackDeshacer.pop();
            resultado = stackDeshacer.pop();
            System.out.println("Deshacer" + resultado);
        } else {
            System.out.println("No existen datos que rehacer");
        }
        
        } 
    public int getResultado() {
        return resultado;
     } 
}     
