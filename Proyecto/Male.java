import greenfoot.*;

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
          if ((positionY==8 && positionX<=9) || (positionY==8 && positionX>=14))
          {
            setLocation(positionX,positionY+1);   
          }
        }
          if(nivel==4){ //Limites nivel Barrio Tlaxcala
          if (positionY>=19 && positionX==14)
          {
            setLocation(positionX-1,positionY);  
          }
          if (positionY>=15 && positionX==9)
          {
            setLocation(positionX+1,positionY);   
          }
          if (positionY==8 && positionX>=14)
          {
            setLocation(positionX,positionY+1);   
          }
          if ((positionY>=8 && positionX==16)&& (positionY<=13 && positionX==16) )
          {
            setLocation(positionX+1,positionY);   
          }
          if ((positionY>=13 && positionX==22)&& (positionY<=18 && positionX==22) )
          {
            setLocation(positionX-1,positionY);   
          }
          if ((positionY==19 && positionX>=14)&& (positionY==19 && positionX<=22) )
          {
            setLocation(positionX,positionY-1);   
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
    }    
}
