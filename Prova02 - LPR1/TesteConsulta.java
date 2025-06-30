import java.io.FileWriter;
import java.io.IOException;

public class TesteConsulta {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("resultado.txt");

            // 1. Instanciar p1
            ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 1, 7, 2025, "João Silva", "Dr. Pedro");
            String p1Dados = "\n--- Propriedades de p1 ---\n" +
                    "Data: " + p1.getData() + "\n" +
                    "Hora: " + p1.getHora() + "\n" +
                    "Paciente: " + p1.getNomePaciente() + "\n" +
                    "Médico: " + p1.getNomeMedico() + "\n";
            System.out.println(p1Dados);
            writer.write(p1Dados);

            // 2. Instanciar p2
            ConsultaAgendada p2 = new ConsultaAgendada();
            String p2Dados = "\n--- Propriedades de p2 ---\n" +
                    "Data: " + p2.getData() + "\n" +
                    "Hora: " + p2.getHora() + "\n" +
                    "Paciente: " + p2.getNomePaciente() + "\n" +
                    "Médico: " + p2.getNomeMedico() + "\n";
            System.out.println(p2Dados);
            writer.write(p2Dados);

            // 3. Alterar p1
            p1.setData();
            p1.setHora();
            p1.setNomePaciente();
            p1.setNomeMedico();

            String p1Alterado = "\n--- Propriedades de p1 após alterações ---\n" +
                    "Data: " + p1.getData() + "\n" +
                    "Hora: " + p1.getHora() + "\n" +
                    "Paciente: " + p1.getNomePaciente() + "\n" +
                    "Médico: " + p1.getNomeMedico() + "\n";
            System.out.println(p1Alterado);
            writer.write(p1Alterado);

            // 4. Quantidade final
            String total = "\nQuantidade total de consultas agendadas: " + ConsultaAgendada.getAmostra() + "\n";
            System.out.println(total);
            writer.write(total);

            writer.close();
            System.out.println("Resultado gravado no arquivo 'resultado.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }
    }
}
