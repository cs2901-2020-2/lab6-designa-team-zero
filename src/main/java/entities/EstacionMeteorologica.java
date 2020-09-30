package entities;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;
import Cliente;

public class  EstacionMetereologica {
    List<vector> clientes = new ArrayList<>();
    String Name;
    int size = 0, temperatura{} , humedad{}, viento{};
    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public EstacionMetereologica() {
        logger.info("Starting reading data...");
    }

    public ActualizarDatos(int temperatura, int humedad, int viento){
       this->temperatura = temperatura;
       this->humedad = humedad;
       this->viento = viento;

       for(Cliente client: clientes){
           client.update(temperatura,viento,humedad);
       }
    }

    public EstacionMetereologica(){}

    public EstacionMetereologica(String name){
        Name = name;
    }

    public SizeOfClients(List<Cliente> clientes){
        size = clientes.size();
    }

    public NuevoCliente(Cliente cliente){
        clientes.add(cliente());
        size++;
    }

}