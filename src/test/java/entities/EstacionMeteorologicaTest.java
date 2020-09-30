import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.InputStream;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.security.SecureRandom;

@Test
public class EstacionMeteorologicaTest {

    public void testCase0() throws Exception {
        generic(0);
    }

    private void generic(int i) throws Exception {
        List<String> input = readInput(i);
        List<String> output = readOutput(i);

        Cliente clientes = new Cliente();

        List<String> c = clientes.getClientes();

        Assert.assertEquals(c, output);
    }

    private List<String> readInput(int testNumber){
        List<String> lines = readFile(testNumber, "input");
        List<String> station = new ArrayList<>();
        station.add(lines.get(0)); //-Temperatura
        station.add(lines.get(1)); //-Humedad
        station.add(lines.get(2)); //-Viento
        return station;
    }

    private List<String> readOutput(int testNumber){
        List<String> lines = readFile(testNumber, "output");
        return lines;
    }

    public List<String> readFile(int testNumber, String type){
        String fileName = "test_case<testNumber>_<type>";
        fileName = fileName.replace("<testNumber>", Integer.toString(testNumber));
        fileName = fileName.replace("<type>", type);
        InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
        Scanner scan = new Scanner(is);
        List<String> lines = new ArrayList<String>();
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            lines.add(line);
        }
        return lines;
    }
}