/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesexpresiones;

/**
 *
 * @author KALAS
 */
public class ArbolesExpresiones {
class Nodo
      {
        String info;
        Nodo izq, der;
      }
      Nodo raiz;

      public ArbolesExpresiones() {
          raiz=null;
      }
      
      public void insertar (String info)
      {
          Nodo nuevo;
          nuevo = new Nodo ();
          nuevo.info = info;
          nuevo.izq = null;
          nuevo.der = null;
          if (raiz == null)
              raiz = nuevo;
          else
             if(info.equals("+")||info.equals("-")||info.equals("*")||info.equals("/")){
              //{
         if(raiz.info !="+"&&raiz.info!="-"&&raiz.info!="*"&&raiz.info!="/"){
             
           Nodo reco;
           reco=raiz;
           raiz=nuevo;
           raiz.izq=reco;}
         else{
              Nodo reco,anterior,reco2;
              reco=raiz;
              anterior=reco;
              reco2=anterior;
              while(reco!=null){
          anterior=reco; 
          reco2=anterior;
          reco=reco.der;
          }
              anterior=nuevo;
              nuevo.izq=reco2;
       //       System.out.println(anterior.info);
         
         }
             
             
             
             }
             
             else{
          if(info !="+"&&info !="-"&&info!="*"&&info!="/")
          {
              //System.out.println("Entra");
              Nodo reco,anterior;
              reco=raiz;
              anterior=reco;
          while(reco!=null){
          anterior=reco;    
          reco=reco.der;
          
          
          }
          if (anterior.izq==null){
              anterior.izq=nuevo;      
            }
          else
              if (anterior.der==null)
              anterior.der=nuevo;
          
          }}
         
        // }
              
              
              
//          {
//              
//              Nodo reco;
//              Nodo anterior=null;
//             // System.out.println(anterior.info);
//              reco = raiz;
//              while (reco != null)
//              {
//                 anterior = reco;
//                 
//                  if (info < reco.info)
//                      reco = reco.izq;
//                  
//                  else
//                      reco = reco.der;
//              }
//              if (info < anterior.info)
//                  anterior.izq = nuevo;
//              
//              else
//                  anterior.der = nuevo;
//             // System.out.println(anterior.info);
//          }
      }

// public void evalua(){
// Nodo nuevo;
// nuevo = new Nodo();
//  nuevo.info = 5;
//          nuevo.izq = null;
//          nuevo.der = null;
//           Nodo nuevo2;
// nuevo2 = new Nodo();
//  nuevo2.info = 7;
//          nuevo2.izq = null;
//          nuevo2.der = null;
// Nodo reco;
// reco=raiz;
// raiz=nuevo;
// nuevo.izq=reco;
// raiz.der=nuevo2;
// 
//
//     System.out.println(raiz.der.info);
// 
// }
      private void imprimirPre (Nodo reco)
      {
          if (reco != null)
          {
              System.out.print(reco.info + " ");
              imprimirPre (reco.izq);
              imprimirPre (reco.der);
          }
      }

      public void imprimirPre ()
      {
          imprimirPre (raiz);
          System.out.println();
      }

      private void imprimirInorden (Nodo reco)
      {
          if (reco != null)
          {    
              imprimirInorden (reco.izq);
              System.out.print(reco.info + " ");
              imprimirInorden (reco.der);
          }
      }

    public void imprimirInorden ()
      {
         imprimirInorden (raiz);
         System.out.println();
      }


      private void imprimirPost (Nodo reco)
      {
          if (reco != null)
          {
              imprimirPost (reco.izq);
              imprimirPost (reco.der);
              System.out.print(reco.info + " ");
          }
      }


      public void imprimirPost ()
      {
          imprimirPost (raiz);
          System.out.println();
      }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
        
        
  ArbolesExpresiones abo = new ArbolesExpresiones ();
          abo.insertar("2");
          abo.insertar("+");
           abo.insertar("4");
           abo.insertar("-");
          
             abo.insertar("2");
          abo.insertar("+");
           abo.insertar("4");
      //     abo.insertar("-");
        //  abo.insertar("");
//          abo.insertar(50);
//           abo.insertar(110);
//        abo.insertar(115);
//      abo.insertar(170);
//          abo.evalua();
//            
//              abo.insertar(5);
//               abo.insertar(170);
//                abo.insertar(109);
//                 abo.insertar(168);
                    //      abo.insertar(175);;
          System.out.println ("Impresion preorden: ");
          abo.imprimirPre ();
          System.out.println ("Impresion inorden: ");
          abo.imprimirInorden ();
          System.out.println ("Impresion postorden: ");
          abo.imprimirPost ();   
        // TODO code application logic here
    }
    
}
