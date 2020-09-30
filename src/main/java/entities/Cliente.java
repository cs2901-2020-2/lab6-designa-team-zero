import java.util.logging.Logger;

public class Cliente {
    String name;
    int temp, wind, humidity;

    public Cliente(String _name){
        name = _name;
    }

    public void update(int _temp, int _wind, int _humidity){
        temp = _temp;
        wind = _wind;
        humidity = _humidity;

        System.out.println("Cliente: " + name + "\tTemperatura: " + temp + "\tViento: " + wind + "\tHumedad: " + humidity);
    }

}