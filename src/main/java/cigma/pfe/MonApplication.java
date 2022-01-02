package cigma.pfe;
import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepositoryImpl;
import cigma.pfe.services.ClientServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication
{
    public static void main(String[] args) {
        //ClientController ctrl1 = new ClientController();
       //Client client =new Client(1,"ccc");
        //ctrl1.save(client);
       ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
       ClientController ctrl = (ClientController) context.getBean("controller1");
       ClientServiceImpl ctr = (ClientServiceImpl) context.getBean("cltservice");
       ClientRepositoryImpl cltrep =(ClientRepositoryImpl)context.getBean("cltrepi");

    }
}
