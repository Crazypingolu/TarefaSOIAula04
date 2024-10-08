package controller;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
public class ClasseThreads extends Thread{
    private int indx;
    public ClasseThreads(int indx){
        this.indx = indx;
    }
    // Método: chamada de sistema operacional
    private String os(){
        String os = System.getProperty("os.name");
        return os;
    }
    // Método: chamada de ping
    public void chamadaPing(int indx){
        if (os().contains("Linux")){
            if(indx == 0){
                try{ // tenta executar o comando de ver o IP
                    Process proc = Runtime.getRuntime().exec("ping -4 -c 10 www.uol.com.br");
                    // lê os processos:
                    InputStream flux = proc.getInputStream();
                    InputStreamReader leit = new InputStreamReader(flux);
                    BufferedReader buff = new BufferedReader(leit);
                    String linha = buff.readLine();
                    // tratamento de dados:
                    int cto = 0;
                    while (linha != null){
                        if (linha.contains("seq")){
                            ++cto;
                            String[] array = linha.split("=");
                            System.out.println("uol " + cto +": "+ array[3]);
                        } if (linha.contains("transmitted")) {
                            String[] array2 = linha.split(",");
                            System.out.println("Média de tempo de resposta da uol: "+ array2[3]);
                        }
                        linha = buff.readLine();
                    }
                    // fechamento:
                    buff.close();
                    leit.close();
                    flux.close();
                } catch (Exception e){ // não conseguiu
                    System.err.println(e.getMessage());
                }
            } else if(indx == 1){
                try{ // tenta executar o comando de ver o IP
                    Process proc = Runtime.getRuntime().exec("ping -4 -c 10 www.google.com.br");
                    // lê os processos:
                    InputStream flux = proc.getInputStream();
                    InputStreamReader leit = new InputStreamReader(flux);
                    BufferedReader buff = new BufferedReader(leit);
                    String linha = buff.readLine();
                    // tratamento de dados:
                    int cto = 0;
                    while (linha != null){
                        if (linha.contains("seq")){
                            ++cto;
                            String[] array = linha.split("=");
                            System.out.println("google " + cto +": "+ array[3]);
                        } if (linha.contains("transmitted")) {
                            String[] array2 = linha.split(",");
                            System.out.println("Média de tempo de resposta da google: "+ array2[3]);
                        }
                        linha = buff.readLine();
                    }
                    // fechamento:
                    buff.close();
                    leit.close();
                    flux.close();
                } catch (Exception e){ // não conseguiu
                    System.err.println(e.getMessage());
                }
            }  else if(indx == 2){
                try{ // tenta executar o comando de ver o IP
                    Process proc = Runtime.getRuntime().exec("ping -4 -c 10 www.terra.com.br");
                    // lê os processos:
                    InputStream flux = proc.getInputStream();
                    InputStreamReader leit = new InputStreamReader(flux);
                    BufferedReader buff = new BufferedReader(leit);
                    String linha = buff.readLine();
                    // tratamento de dados:
                    int cto = 0;
                    while (linha != null){
                        if (linha.contains("seq")){
                            ++cto;
                            String[] array = linha.split("=");
                            System.out.println("terra " + cto +": "+ array[3]);
                        } if (linha.contains("transmitted")) {
                            String[] array2 = linha.split(",");
                            System.out.println("Média de tempo de resposta da terra: "+ array2[3]);
                        }
                        linha = buff.readLine();
                    }
                    // fechamento:
                    buff.close();
                    leit.close();
                    flux.close();
                } catch (Exception e){ // não conseguiu
                    System.err.println(e.getMessage());
                }
            }
        } else {
                System.out.println("Sistema não é linux.");
        }
    }
    // Método: run()
    @Override
    public void run() {
        chamadaPing(indx);
    }
}
