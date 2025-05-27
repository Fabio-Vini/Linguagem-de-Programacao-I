import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import java.util.InputMismatchException;

public class Hora {
    private int hora;
    private int min;
    private int seg;
   
    public Hora(int h, int m, int s) {
        this.setHor(h);
        this.setMin(m);
        this.setSeg(s);
    }

    public void setHor(int h) {
   
    if (h >= 0 && h < 24) {
    this.hora = h;
    } else{
        throw new IllegalArgumentException("Hora inválida: " + h + ". Deve estar entre 0 e 23.");
    }
    }

    public void setMin(int m) {
     if (m >= 0 && m < 60) {
     this.min = m;  
     }else{
        throw new IllegalArgumentException("Minuto inválido: " + m + ". Deve estar entre 0 e 59.");
     }
    }

    public void setSeg(int s) {
    if (s >= 0  && s < 60) {
    this.seg = s;
    }else{
        throw new IllegalArgumentException("Segundo inválido: " + s + ". Deve estar entre 0 e 59");
    }
       
    }

    public int getHor() {
        return this.hora;
    }

   
    public int getMin() {
        return this.min;
    }

    public int getSeg() {
        return this.seg;
    }

    public String getHora1() {
        return String.format("%02d:%02d:%02d", this.hora, this.min, this.seg);
    }

    public String getHora2() {
        int hora12 = this.hora; 
        String sufixo;
    
        if (this.hora >= 0 && this.hora <= 11) { 
            sufixo = "AM";
            if (this.hora == 0) { 
                hora12 = 12;
            }
            
        } else { 
            sufixo = "PM";
            if (this.hora > 12) { 
                hora12 = this.hora - 12;
            }
            
        }
        return String.format("%02d:%02d:%02d %s", hora12, this.min, this.seg, sufixo);
    }

    public String getSegundos() {
        int totalSegundos = (this.hora * 3600) + (this.min * 60) + this.seg;
        return String.valueOf(totalSegundos); 
        
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Hora tempo = null;
    boolean dadosValidos = false;

    while (!dadosValidos) {
        try {
            System.out.print("Informe as Horas (0-23): ");
            int h = scanner.nextInt();

            System.out.print("Informe os Minutos (0-59): ");
            int m = scanner.nextInt();

            System.out.print("Informe os Segundos (0-59): ");
            int s = scanner.nextInt();

            
            tempo = new Hora(h, m, s);
            dadosValidos = true; 

            System.out.println("Hora formato 24h: " + tempo.getHora1());
            System.out.println("Hora formato AM/PM: " + tempo.getHora2());
            System.out.println("Total de segundos: " + tempo.getSegundos());

        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
            System.out.println("Por favor, tente inserir os valores novamente.\n");
        
        } catch (InputMismatchException e) {
            System.err.println("Erro: Você deve digitar um número inteiro.");
            System.out.println("Por favor, tente inserir os valores novamente.\n");
            scanner.nextLine(); 
        }
    }
   
    }
}