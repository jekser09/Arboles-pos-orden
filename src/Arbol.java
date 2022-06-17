
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Torrev_101
 */
public class Arbol {
    static Nodo p;
    static Nodo q;
    static Nodo cab;
    static Nodo finii;
    static Nodo finid;
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        
    }
    
    private static void crearArbol(){        
        p=new Nodo();
        System.out.println("cabecera");
        p.dato=sc.nextInt();
        q=p;
        cab=p;
        System.out.println("lado izquierdo");
        q.ei=ladoIzquierdo(q);
        q=cab;
        System.out.println("lado derecho");
        q.ed=ladoDerecho(q);
        p=cab;
        recorrido(p);
    }
    private static Nodo ladoIzquierdo(Nodo n){        
            p=new Nodo();
            p.dato=sc.nextInt();
            n=p;
            p=new Nodo();
            p.dato=sc.nextInt();
            n.ei=p;
            p=new Nodo();
            p.dato=sc.nextInt();
            n.ed=p;            
        return n;
    }
    private static Nodo ladoDerecho(Nodo n){
        p=new Nodo();
            p.dato=sc.nextInt();
            n=p;
            p=new Nodo();
            p.dato=sc.nextInt();
            n.ei=p;
            p=new Nodo();
            p.dato=sc.nextInt();
            n.ed=p;        
        return n;
    }
    private static void recorrido(Nodo n){
        boolean a=true;
        while(a==true){
            boolean b=true;
            while(b==true){
                if(n.ei!=null){
                   n=n.ei;               
                }else{
                    finii=n;
                }
            }
        }
    }
    

    private static Nodo ulimoNodo(Nodo n){
        return n;
    }
    
    
}
class Nodo{
    Nodo ei=null;
    int dato;
    Nodo ed=null;
}
