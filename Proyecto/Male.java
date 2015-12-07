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
  /**
     * Dependiendo la tecla que se oprima es el movimiento que le da al personaje.
     * Se checan los limites de cada escenario para que no se mueva libremente.
     * Se checa cuando debe cambiar de escenario
     */
  public void act() 
  {                     
      mueve();
      checaLimites();
      checaCambioEscenario();
  }
  /**
   * Movimiento del jugador.
   */
  public void mueve()
  {
     int positionX=getX();
     int positionY=getY(); 
      if( Greenfoot.isKeyDown("left") )//Izquierda
     {
        setLocation(positionX-1,positionY);
        wait(5);
        walkLeft(pasos);            
     }
     if( Greenfoot.isKeyDown("right") )//Derecha
     {
        setLocation(positionX+1,positionY);
        wait(5);
        walkRight(pasos);            
     }
     if( Greenfoot.isKeyDown("up") )//Arriba
     {
        setLocation(positionX,positionY-1);
        wait(5);
        walkUp(pasos);
     }
     if( Greenfoot.isKeyDown("down") )//Abajo
     {
        setLocation(positionX,positionY+1);
        wait(5);
        walkDown(pasos);
     }    
  }
  /**
   * Se checan los limites segun el escenario donde se encuentre.
   */
  public void checaLimites() 
  {
      int positionX=getX();
      int positionY=getY(); 
      if(escenario==10)
      {//limite para cuarto y sala
          if(positionY==3)
          {
            setLocation(positionX,positionY+1); 
          }
      }
      
      if(escenario==0)
      {//Limites para la calle 
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
      
      if(escenario==1)
      {//Limites para barrio san sebastian
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
      
      if(escenario==2)
      {//Limites para barrio Montecillo
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
      
      if(escenario==7)
      { //Limites nivel Barrio Tlaxcala
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
       if(escenario==3)
      { //Limites nivel Barrio SanMiguelito
        if (positionY==8 && positionX==1)
        {
          setLocation(positionX,positionY+1);  
        }
        if (positionX==14)//izquierda
        {
          setLocation(positionX-1,positionY);   
        }
        if (positionY==9&& positionX>=7)//arriba
        {
          setLocation(positionX,positionY-1);   
        }
        if (positionY>=9 && positionX==7 )//izquierda
        {
          setLocation(positionX-1,positionY);   
        }
        if ((positionY>=3 && positionX==1)&& (positionY<=9 && positionX==2) )//derecha
        {
          setLocation(positionX+1,positionY);   
        }
        if ((positionY==3 && positionX>=2)&& (positionY==3 && positionX<=9) )//Abajo a la derecha
        {
          setLocation(positionX,positionY+1);   
        }
        if  (positionY<=3 && positionX==9) 
        {
          setLocation(positionX+1,positionY);   
        }
        if (positionY==14)
        {
          setLocation(positionX,positionY-1);   
        }
      }
      if(escenario==4)//Santiago
      {
        if (positionY==14)
        {
          setLocation(positionX,positionY-1);   
        }
        if(positionY<=8 && positionX==9)
        {
           setLocation(positionX+1,positionY);
        }
        if(positionY<=8 && positionX==14)
        {
           setLocation(positionX-1,positionY);
        }
        if(positionY==8 && positionX<=9)
        {
           setLocation(positionX,positionY+1);
        }
        if(positionY==8 && positionX>=14)
        {
           setLocation(positionX,positionY+1);
        }
      }
      if(escenario==5)//Tequisquiapan
      {
        if(positionY<=8 && positionX==14)
        {
           setLocation(positionX-1,positionY);
        }
        if(positionY==8 && positionX>=14)
        {
           setLocation(positionX,positionY+1);
        }
        if (positionY==14)
        {
          setLocation(positionX,positionY-1);   
        }
        if (positionX==9)
        {
          setLocation(positionX+1,positionY);   
        }
      }
      if(escenario==8)//Centro
      {
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
        if ((positionY==6&& positionX<=9) || (positionY==6 && positionX>=14))
        {
          setLocation(positionX,positionY+1);   
        }
        if(positionY<=8 && positionX==14)
        {
           setLocation(positionX-1,positionY);
        }
        if(positionY<=8 && positionX==9)
        {
           setLocation(positionX+1,positionY);
        }
      }
      if(escenario==6)//San juan
      {
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
        if ((positionY==6&& positionX<=9) || (positionY==6 && positionX>=14))
        {
          setLocation(positionX,positionY+1);   
        }
        if(positionY<=8 && positionX==14)
        {
           setLocation(positionX-1,positionY);
        }
        if(positionY<=8 && positionX==9)
        {
           setLocation(positionX+1,positionY);
        }
        if(positionY>=14 && positionX==14)
        {
           setLocation(positionX-1,positionY);
        }
        if(positionX==4)
        {
           setLocation(positionX+1,positionY);
        }
      }
    }
  /**
   * Se checa cuando se debe cambiar el escenario.
   */
  public void checaCambioEscenario()
  {
      int positionX=getX();
      int positionY=getY(); 
      //Checa el cambio en calle
      if(positionX==23 && escenario==0)
      {
         Greenfoot.setWorld(new San_Sebastian());            
      }
      if( positionX==0 && escenario==0)
      {
          Greenfoot.setWorld(new TlaxcalaWorld());            
      }
      if(escenario==0 && positionY==23)
      {
          Greenfoot.setWorld(new Centro());            
      }
      //Checa el cambio en  San Sebastian
      if(positionX==0 && escenario==1)
      {
         Greenfoot.setWorld(new Calle());            
      }
      if( positionY==23 && escenario==1)
      {
          Greenfoot.setWorld(new Montecillo_World());            
      }
      //Checa cambio en Montecillo
      if(positionY==0 && escenario==2)
      {
          Greenfoot.setWorld(new San_Sebastian());
      }
      if( positionY==23 && escenario==2)
      {
          Greenfoot.setWorld(new SanMiguelito());            
      }
      if( positionX==0 && escenario==2)
      {
          Greenfoot.setWorld(new Centro());            
      }
      //Checa cambio en San Miguelito
      if(positionY==0 && escenario==3)
      {
          Greenfoot.setWorld(new Montecillo_World());
      }
      if( positionX==0 && escenario==3)
      {
          Greenfoot.setWorld(new Santiago());            
      }
      //Checa cambio en Santiago      
      if(positionX==0 && escenario==4)
      {
          Greenfoot.setWorld(new Tequisquiapan());            
      }
      if(positionX==23 && escenario==4)
      {
          Greenfoot.setWorld(new SanMiguelito());            
      }
      if(positionY==0 && escenario==4)
      {
          Greenfoot.setWorld(new Centro());            
      }
      //Checa cambio en Tequisquiapan
      if(positionX==23 && escenario==5)
      {
          Greenfoot.setWorld(new Santiago());            
      }
      if(positionY==0 && escenario==5)
      {
          Greenfoot.setWorld(new SanJuan());            
      }
      //Checa cambio en San Juan
      if( positionX==23&& escenario==6)
      {
          Greenfoot.setWorld(new Centro());            
      }      
      if(positionY==0 && escenario==6)
      {
          Greenfoot.setWorld(new TlaxcalaWorld());
      }
      if( positionY==23&& escenario==6)
      {
          Greenfoot.setWorld(new Tequisquiapan());            
      }
      //Checa cambio en Tlaxcala
       if( positionY==23&& escenario==7)
      {
          Greenfoot.setWorld(new SanJuan());            
      }      
      if(positionX==23 && escenario==7)
      {
          Greenfoot.setWorld(new Calle());
      }
      //Checa cambio en Centro
      if(positionX==0 && escenario==8)
      {
          Greenfoot.setWorld(new SanJuan());
      }
      if( positionX==23&& escenario==8)
      {
          Greenfoot.setWorld(new Montecillo_World());            
      }      
      if(positionY==0 && escenario==8)
      {
          Greenfoot.setWorld(new Calle());
      }
      if( positionY==23&& escenario==8)
      {
          Greenfoot.setWorld(new Santiago());            
      }      
      //Checa cambio en Tequisquiapan
      if(escenario==5 && positionY==0)
      {
          Greenfoot.setWorld(new SanJuan());            
      }
      if(escenario==5 && positionX==0)
      {
          Greenfoot.setWorld(new TlaxcalaWorld());            
      }
      //Checa los cambios en cuarto, sala y para regresar de la calle a sala
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
}
