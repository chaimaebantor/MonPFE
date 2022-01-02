package cigma.pfe.services;
import cigma.pfe.repositories.ClientRepositoryImpl;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.services.ClientService;
import cigma.pfe.models.Client;

public class ClientServiceImpl implements ClientService
{
    ClientRepository clientRepository;
    @Override
    public Client save(Client clt)
    {
        System.out.println(" Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(clt);


    }
    public ClientServiceImpl()
    {
        System.out.println("Call ClientServiceImpl ....");
    }
    }