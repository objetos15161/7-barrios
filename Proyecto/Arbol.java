import greenfoot.*;

/**
 * Write a description of class Arbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arbol extends Escenario
{
    //Metodo que verifica segun la variable que imagen se selecciona para el objeto
    public void creaArbol(int numArbol)
    {
      if(numArbol==6)
      {
          setImage("Exterior/Arbolote.png");
      }
      if(numArbol==5)
      {     
         setImage("Exterior/Arbol.png");
      }
      if(numArbol==4)
      {
         setImage("Exterior/Arbol4.png");
      }  
      if(numArbol==3)
      {
        setImage("Exterior/Arbol3.png");
      }    
      if(numArbol==2)
      {
        setImage("Exterior/Arbol2.png");
      }
      if(numArbol==1)
      {
          setImage("Exterior/Arbol1.png");
       }
    }
}
