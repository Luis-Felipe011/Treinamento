import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;


public class apiCep {

    public static void main(String[] args) {
        String cep = "13186642";
        String urlString = "https://viacep.com.br/ws/" + cep + "/json/";

        try {
            // criando a conexão
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) { // sucesso
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Exibindo o resultado
                System.out.println("Resultado: " + response.toString());
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
