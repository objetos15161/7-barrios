import greenfoot.*;

/**
 * Write a description of class Arbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arbol extends Escenario
{
    /**
     * Act - do whatever the Arbol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }  
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
