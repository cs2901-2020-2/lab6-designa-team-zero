package entities;
import java.util.List;
import java.util.ArrayList;
import java.security.SecureRandom;
import Cliente;

public class  EstacionMetereologica {
    List<vector> clients = new ArrayList<>();
    String Name;
    int size = 0, temp{} , humidity{}, wind{};

    public void ActualizarDatos(){
        SecureRandom random = new SecureRandom();
        this->temp = random.nextInt(40);
        this->humidity = random.nextInt(100);
        this->wind = random.nextInt(20);

        for(Cliente client: clientes){
            client.update(temp,wind,humidity);
        }
    }

    public EstacionMetereologica(){}

    public EstacionMetereologica(String name){
        Name = name;
    }

    public SizeOfClients(List<Cliente> clients){
        size = clients.size();
    }

    public NuevoCliente(Cliente client){
        clients.add(client);
        size++;
    }

}