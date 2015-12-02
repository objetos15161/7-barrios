import greenfoot.*;
import javax.swing.JOptionPane;

/**
 * Verifica que tecla se oprime para darle movimiento
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany)
 * @version (10-11-15)
 */
public class Male extends Hombre
{   
  public int escenario=0;
  private int pasos=0;
  public int vidas=3;
  /**
     * Dependiendo la tecla que se oprima es el movimiento que le da al personaje
     */
  public void act() 
  {                     
      mueve();
      checaLimites();
      checaCambioEscenario();
  }
  
  public void mueve()//movimiento del jugador
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
  }
  
  public void checaLimites() //Metodo que checa los limites del mapa
  {
      int positionX=getX();
      int positionY=getY(); 
      if(escenario==1){//limite para cuarto y sala
          if(positionY==3)
          {
            setLocation(positionX,positionY+1); 
          }
        }
      if(escenario==2){//Limites para la calle 
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
        if ((positionY==6&& positionX<=11) || (positionY==6 && positionX>=13))
        {
          setLocation(positionX,positionY+1);   
        }
      }
      if(escenario==3){//Limites para barrio san sebastian
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
      if(escenario==4){ //Limites nivel Barrio Tlaxcala
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
      if(escenario==5){//Limites para barrio Montecillo
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
    }
  public void checaCambioEscenario()
  {
      int positionX=getX();
      int positionY=getY(); 
      if(positionX==23 && escenario==2)
      {
         Greenfoot.setWorld(new San_Sebastian());            
      }
      if( positionX==0 && escenario==2)
      {
          Greenfoot.setWorld(new TlaxcalaWorld());            
      }
      if(positionX==0 && escenario==3)
      {
          Greenfoot.setWorld(new Calle());
      }
      if( positionY==23&& escenario==3)
      {
          Greenfoot.setWorld(new Montecillo_World());            
      }
      if(escenario==4 && positionX==23)
      {
          Greenfoot.setWorld(new Calle());            
      }
      if(escenario==4 && positionY==23)
      {
          Greenfoot.setWorld(new Montecillo_World());            
      }
      if(escenario==2 && positionY==23)
      {
          Greenfoot.setWorld(new Montecillo_World());            
      }
      if(escenario==5 && positionY==0)
      {
          Greenfoot.setWorld(new Calle());            
      }
      if(escenario==5 && positionX==0)
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
  }
  public void disminuyeVidas()
  {
      vidas--;
  }
}
