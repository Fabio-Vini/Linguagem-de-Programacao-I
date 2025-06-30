import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;

    private static Scanner input = new Scanner(System.in);

    public ConsultaAgendada(){
        System.out.println("Digite o dia, mês e ano da consulta");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int ano = input.nextInt();
        this.data = new Data (dia,mes,ano);

        System.out.println("Digite a hora, minuto e segundo da consulta:");
        int h = input.nextInt();
        int m = input.nextInt();
        int s = input.nextInt();
        this.hora = new Hora(h, m, s);

        input.nextLine();
        System.out.println("Digite o nome do paciente:");
        this.nomePaciente = input.nextLine();

        System.out.println("Digite o nome do médico:");
        this.nomeMedico = input.nextLine();

        quantidade++;
    }

    public ConsultaAgendada (int h, int mi, int s, int d, int m, int a, String p,String nM)
    {
     this.data = new Data(d, m, a);
     this.hora = new Hora(h, mi, s);
     this.nomePaciente = p;
     this.nomeMedico = nM;
     quantidade++;


}

 public ConsultaAgendada (Data d, Hora h, String p, String m){
    this.data = d;
    this.hora = h;
    this.nomePaciente = p;
    this. nomeMedico = m;
    quantidade++;
 }
 public void setData() {
        System.out.println("Digite o novo dia, mês e ano:");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int ano = input.nextInt();
        this.data = new Data(dia, mes, ano);
    }

    public void setHora() {
        System.out.println("Digite a nova hora, minuto e segundo:");
        int h = input.nextInt();
        int m = input.nextInt();
        int s = input.nextInt();
        this.hora = new Hora(h, m, s);
    }

    public void setNomePaciente() {
        input.nextLine(); // Limpar o buffer
        System.out.println("Digite o novo nome do paciente:");
        this.nomePaciente = input.nextLine();
    }

    public void setNomeMedico() {
        System.out.println("Digite o novo nome do médico:");
        this.nomeMedico = input.nextLine();
    }

    // Métodos set com parâmetros
    public void setData(int dia, int mes, int ano) {
        this.data = new Data(dia, mes, ano);
    }

    public void setHora(int h, int m, int s) {
        this.hora = new Hora(h, m, s);
    }

    public void setNomePaciente(String paciente) {
        this.nomePaciente = paciente;
    }

    public void setNomeMedico(String medico) {
        this.nomeMedico = medico;
    }

    // Métodos get
    public String getData() {
        return String.format("%02d/%02d/%02d", data.getDia(), data.getMes(), data.getAno() % 100);
    }

    public String getHora() {
        return String.format("%02d:%02d:%02d", hora.getHora(), hora.getMinuto(), hora.getSegundo());
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public static int getAmostra() {
        return quantidade;
    }
}


