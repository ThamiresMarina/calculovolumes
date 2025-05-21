package testeunidade.volumes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.opencsv.CSVReader;
import com.testeunidade.volumes.CalculadoraVolume;

import java.io.FileReader;
import java.util.List;

public class CalculadoraVolumeTest {
    @Test

    public void testVolumeCubo() {
        assertEquals(27.0, CalculadoraVolume.volumeCubo(3));
        assertEquals(0.0, CalculadoraVolume.volumeCubo(0));
        assertEquals(1.0, CalculadoraVolume.volumeCubo(1));
    }

    @Test
    public void testVolumeParelelepipedoComLista() {
        double[][] dados = {
                { 2, 3, 4, 24 },
                { 1, 1, 1, 1 },
                { 5, 0, 2, 0 }
        };

        for (double[] dado : dados) {
            double largura = dado[0];
            double altura = dado[1];
            double comprimento = dado[2];
            double resultadoEsperado = dado[3];

            double resultado = CalculadoraVolume.volumeParelelepipedo(largura, altura, comprimento);
            assertEquals(resultadoEsperado, resultado);
        }

    }

    // Teste usando um arquivo CSV como massa de teste para a esfera
    @Test
    public void testVolumeEsferaComCSV() throws Exception {
        // Abre o arquivo CSV
        CSVReader reader = new CSVReader(new FileReader("massa_esfera.csv"));

        List<String[]> linhas = reader.readAll();
        linhas.remove(0);

        for (String[] linha : linhas) {
            double raio = Double.parseDouble(linha[0]);
            double esperado = Double.parseDouble(linha[1]);
            assertEquals(esperado, CalculadoraVolume.volumeEsfera(raio), 0.0001);
        }

        reader.close();
    }
}