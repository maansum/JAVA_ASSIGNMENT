   

   import java.applet.*;
   import java.awt.*;

   class Helloapplets
   {
   	public void init(){
   		System.out.println("init");
   	}
   	public void start(){
   		
   		System.out.println("start");
   	}
   	public void stop()
   	{
   		System.out.println("stop");

   	}
   	public void paint(Graphics g){
   		System.out.println("paints");

   	}
   	/*
   	<Applets code="applets.java" width="100" height="100"
   	alt="this is applets"> </Applets> 
   	*/
   }