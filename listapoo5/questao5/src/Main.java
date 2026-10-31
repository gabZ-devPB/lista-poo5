import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Imprimivel> documentos = new ArrayList<>();

        documentos.add(new RelatorioFinanceiro());
        documentos.add(new Contrato());

        for (Imprimivel documento : documentos) {
            documento.imprimir();
        }

        List<EnviavelEmail> emails = new ArrayList<>();

        for (Imprimivel documento : documentos) {
            if (documento instanceof EnviavelEmail) {
                emails.add((EnviavelEmail) documento);
            }
        }

        for (EnviavelEmail documento : emails) {
            documento.enviar("exemplo@email.com");
        }
    }
}