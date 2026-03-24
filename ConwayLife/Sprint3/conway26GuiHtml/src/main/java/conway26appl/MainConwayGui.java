package conway26appl;
import conway.io.IoJavalin;
import main.java.conway.domain.*;
import unibo.basicomm23.utils.CommUtils;

public class MainConwayGui  {

    public static void main(String[] args) {
           System.out.println("MainConway | INIZIA " );  

               var resource = MainConwayGui.class.getResource("/page");
               CommUtils.outgreen("DEBUG: La cartella /page si trova in: " + resource);

           Life life = new Life(20, 20);
           IoJavalin server = new IoJavalin();
           LifeController controller = new LifeController(life, server);
           server.setup(life, controller);

           System.out.println("MainConway | TERMINA " );  
    }
}