package entities;
import java.util.List;
import java.util.ArrayList;
import java.security.SecureRandom;

public class  EstacionMeteorologica {
    List<Cliente> clients = new ArrayList<>();
    String Name;
    int size, temp , humidity, wind;

    public void ActualizarDatos(){
        SecureRandom random = new SecureRandom();
        this.temp = random.nextInt(40);
        this.humidity = random.nextInt(100);
        this.wind = random.nextInt(20);

        for(Cliente client: clients){
            client.update(temp,wind,humidity);
        }
    }

    public EstacionMeteorologica(){}

    public EstacionMeteorologica(String name){
        Name = name;
    }

    public int SizeOfClients(List<Cliente> clients){
        size = clients.size();
        return size;
    }

    public void NuevoCliente(Cliente client){
        clients.add(client);
        size++;
    }

}