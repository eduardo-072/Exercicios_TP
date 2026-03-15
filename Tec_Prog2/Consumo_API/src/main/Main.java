import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o CNPJ: ");
            String cnpj = scanner.nextLine();

            cnpj = cnpj.replaceAll("[^0-9]", "");

            BrasilApiClient api = new BrasilApiClient();

            Empresa empresa = api.buscarEmpresa(cnpj);

            EmpresaDAO empresaDAO = new EmpresaDAO();
            empresaDAO.salvar(empresa);

            SocioDAO socioDAO = new SocioDAO();
            socioDAO.salvarSocios(empresa.getCnpj(), empresa.getQsa());

            System.out.println("Empresa salva com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}