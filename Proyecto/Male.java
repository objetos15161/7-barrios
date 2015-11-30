import greenfoot.*;
import javax.swing.JOptionPane;

/**
 * Verifica que tecla se oprime para darle movimiento
 * 
 * @cesar4206 (Castro Pérez César) 
 * @version (10-11-15)
 */
public class Male extends Hombre
{   
  public int nivel=0;
  public int viene=0;
  private int pasos=0;
  /**
     * Dependiendo la tecla que se oprima es el movimiento que le da al personaje
     */
    public void act() 
    {                 
        int positionX=getX();
        int positionY=getY(); 
        
        if( Greenfoot.isKeyDown("left") )
        {
           setLocation(positionX-1,positionY);
           wait(5);
           walkLeft(pasos);            
        }
        if( Greenfoot.isKeyDown("right") )
        {
           setLocation(positionX+1,positionY);
           wait(5);
           walkRight(pasos);            
        }
         if( Greenfoot.isKeyDown("up") )
        {
           setLocation(positionX,positionY-1);
           wait(5);
           walkUp(pasos);
        }
        if( Greenfoot.isKeyDown("down") )
        {
            setLocation(positionX,positionY+1);
            wait(5);
            walkDown(pasos);
        }
        if(nivel==1){//limite para cuarto y sala
          if(positionY==3)
          {
            setLocation(positionX,positionY+1); 
          }
        }
        if(nivel==2){//Limites para la calle 
          if((positionY==14 && positionX<=9) || (positionY==14 && positionX>=14))
          {
            setLocation(positionX,positionY-1);  
          }
          if (positionY>=14 && positionX==14)
          {
            setLocation(positionX-1,positionY);  
          }
          if (positionY>=14 && positionX==9)
          {
            setLocation(positionX+1,positionY);   
          }
          if ((positionY==8 && positionX<=9) || (positionY==8 && positionX>=14))
          {
            setLocation(positionX,positionY+1);   
          }
        }
         if(nivel==3){//Limites para barrio san sebastian
          if((positionY==14 && positionX<=9))
          {
            setLocation(positionX,positionY-1);  
          }
          if (positionX==14)
          {
            setLocation(positionX-1,positionY);  
          }
          if (positionY>=14 && positionX==9)
          {
            setLocation(positionX+1,positionY);   
          }
          if (positionY==6)
          {
            setLocation(positionX,positionY+1);   
          }
        }
          if(nivel==4){ //Limites nivel Barrio Tlaxcala
          if (positionY>=19 && positionX==14)
          {
            setLocation(positionX-1,positionY);  
          }
          if (positionX==9)//izquierda
          {
            setLocation(positionX+1,positionY);   
          }
          if (positionY==8 && positionX>=14)//arriba
          {
            setLocation(positionX,positionY+1);   
          }
          if ((positionY>=8 && positionX==16)&& (positionY<=13 && positionX==16) )//izquierda
          {
            setLocation(positionX+1,positionY);   
          }
          if ((positionY>=13 && positionX==22)&& (positionY<=18 && positionX==22) )//derecha
          {
            setLocation(positionX-1,positionY);   
          }
          if ((positionY==19 && positionX>=14)&& (positionY==19 && positionX<=22) )//Abajo a la derecha
          {
            setLocation(positionX,positionY-1);   
          }
          if (positionY==13 && positionX<=16)//arriba
          {
            setLocation(positionX,positionY+1);   
          }
        }
        if(nivel==5){//Limites para barrio Montecillo
          if((positionY==14 && positionX<=9))
          {
            setLocation(positionX,positionY-1);  
          }
          if (positionX==14)
          {
            setLocation(positionX-1,positionY);  
          }
          if (positionY>=14 && positionX==9)
          {
            setLocation(positionX+1,positionY);   
          }
          if ((positionY==8 && positionX<=4) || (positionY==8 && positionX<=9))
          {
            setLocation(positionX,positionY+1);   
          }
           if ((positionY<=9 && positionX==10))
          {
            setLocation(positionX+1,positionY);   
          }
          if ((positionY==6 && positionX<=9))
          {
            setLocation(positionX,positionY+1);   
          }
        }
        if((isTouching(Num50D.class) || positionX==23) && nivel==2)
        {
            Greenfoot.setWorld(new San_Sebastian());            
        }
        if((isTouching(Num50I.class) || positionX==0) && nivel==2)
        {
            Greenfoot.setWorld(new TlaxcalaWorld());            
        }
        if((isTouching(Num40I.class) || positionX==0) && nivel==3)
        {
            Greenfoot.setWorld(new Calle());
        }
        if((isTouching(Num40Ab.class)|| positionY==23)&& nivel==3)
        {
            Greenfoot.setWorld(new Montecillo_World());            
        }
        if(nivel==4 && positionX==23)
        {
            Greenfoot.setWorld(new Calle());            
        }
        if(nivel==4 && positionY==23)
        {
            Greenfoot.setWorld(new Montecillo_World());            
        }
        if(nivel==2 && positionY==23)
        {
            Greenfoot.setWorld(new Montecillo_World());            
        }
        if(nivel==5 && positionY==0)
        {
            Greenfoot.setWorld(new Calle());            
        }
        if(nivel==5 && positionX==0)
        {
            Greenfoot.setWorld(new TlaxcalaWorld());            
        }
        if(isTouching(PuertaAbierta.class))
        {
            Greenfoot.setWorld(new Montecillo_World());            
        }
        if(isTouching(PuertaCerrada.class))
        {
            Greenfoot.setWorld(new TlaxcalaWorld());            
        }        
        if(isTouching(EscaleraAbajo.class))
        {
            Greenfoot.setWorld(new Sala());  
        }        
        if(isTouching(EscaleraArriba.class))
        {
            Greenfoot.setWorld(new Cuarto());  
        }        
        if(isTouching(Tapete2.class))
        {
            Greenfoot.setWorld(new Calle());            
        }
        if(isTouching(PuertaCasa.class))
        {
            Greenfoot.setWorld(new Sala()); 
        }  
        if(isTouching(Letrero3.class) && Greenfoot.isKeyDown("enter") )//Pregunta san sebastian
        {
            String inputValue = JOptionPane.showInputDialog("¿En que año se fundo el barrio de Tlaxcala?\n a) 1542 b) 1670 c) 1592");  
            if(inputValue.equals("c") || inputValue.equals("C"))
            {
                String input = JOptionPane.showInputDialog("¡Correcto!\n Presiona aceptar para continuar");
            }
            else
            {
                 String input = JOptionPane.showInputDialog("Incorrecto intenta de nuevo\n Presiona aceptar para continuar");
            }
        }  
        if(isTouching(Letrero2.class) && Greenfoot.isKeyDown("enter") )//Pregunta Montecillo
        {
            String inputValue = JOptionPane.showInputDialog("La actual iglesia, originalmente en forma de cruz latina y la fachada hacia el poniente, se empezo en ___ y se concluyo en __\n a) 1810 y 1827   b) 1730 y 1747   c) 1780 y 1790");   
            if(inputValue.equals("b")|| inputValue.equals("B"))
            {
                String input = JOptionPane.showInputDialog("¡Correcto!\n Presiona aceptar para continuar");
            }
            else
            {
                 String input = JOptionPane.showInputDialog("Incorrecto intenta de nuevo\n Presiona aceptar para continuar");
            }
        }  
        if(isTouching(Letrero1.class) && Greenfoot.isKeyDown("enter") )//Pregunta tlaxcala
        {
            String inputValue = JOptionPane.showInputDialog("El 28 de noviembre de 1906 en la calle Comonfort se encuentra la casa donde murio\n a) Manuel Jose Othon b) Fransisco Gonzales Bocanegra c) Emiliano Zapata ");
             if(inputValue.equals("a")|| inputValue.equals("A"))
            {
                String input = JOptionPane.showInputDialog("¡Correcto!\n Presiona aceptar para continuar");
            }
            else
            {
                 String input = JOptionPane.showInputDialog("Incorrecto intenta de nuevo\n Presiona aceptar para continuar");
            }
        }  
    }    
}
