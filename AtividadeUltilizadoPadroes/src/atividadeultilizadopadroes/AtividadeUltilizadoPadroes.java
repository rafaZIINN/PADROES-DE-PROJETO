/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeultilizadopadroes;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class AtividadeUltilizadoPadroes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      
      
      
       Scanner teclado = new Scanner(System.in);

        int operacao;
        int operacao1;
        

        System.out.println("Digite a operação que deseja efetuar:");
        operacao = teclado.nextInt();
       
        switch(operacao){
            case 1:
                System.out.println("Digite: 1 Bolo Cenoura \n 2 Bolo Chocolate \n 3 Bolo Laranja \n 4 Bolo Prestigio");
                operacao1 = teclado.nextInt();
                switch(operacao1){
                    case 1 :
                        FabricaBolo bolo = new Boloss();
                        BoloCenoura bolocenoura = bolo.criarBoloCenoura();
                        bolocenoura.exibirInfoBoloCenoura();
                        
                        break;
                    case 2 :
                        FabricaBolo bolo1 = new Boloss();
                        BoloChocolate bolochocolate = bolo1.criarBoloChocolate();
                        bolochocolate.exibirInfoBoloChocolate();
                        
                        break;
                        
                    case 3 :
                        FabricaBolo bolo2 = new Boloss();
                        BoloLaranja boloLaranja = bolo2.criarBoloLaranja();
                        boloLaranja.exibirInfoBoloLaranja();
                        
                        break;
                        
                    case 4 :
                        FabricaBolo bolo3 = new Boloss();
                        BoloPrestigio boloprestigio = bolo3.criarBoloPrestigio();
                        boloprestigio.exibirInfoBoloPrestigio();
                        
                        break;
                }
        switch(operacao){
            case 1:
                System.out.println("Digite: 1 Doce de leite \n 2 Casadim \n 3 Maria Mole \n 4 Pudim");
                operacao1 = teclado.nextInt();
            switch(operacao1){
                case 1 :
                    DoceLeiteProtatype doceLeiteprotatype = new DoceLeiteProtatype();
                    DocesProtatype doceLeite = doceLeiteprotatype.clonar();
                    doceLeite.setValorCompra(20.00);
                    
                    System.out.println(doceLeite.exibirInfo());
                    break;
                case 2:
                    CadasadimProtatype cassadim1 = new CadasadimProtatype();
                    DocesProtatype docecassadim = cassadim1.clonar();
                    docecassadim.setValorCompra(30.00);
                    
                    System.out.println(docecassadim.exibirInfo());
                    break;
                case 3:
                    MariaMoleProtatype mariamole = new MariaMoleProtatype();
                    DocesProtatype mariamole1 = mariamole.clonar();
                    mariamole1.setValorCompra(10.00);
                    
                    System.out.println(mariamole1.exibirInfo());
                    break;
                case 4:
                    PudimpProtatype pudim1 = new PudimpProtatype();
                    DocesProtatype pudim2 = pudim1.clonar();
                    pudim2.setValorCompra(10.00);
                    
                    System.out.println(pudim2.exibirInfo());
                    break;
            }
        switch(operacao){
            case 1:
                System.out.println("Digite: 1 Biscoito ao leite \n 2 Biscoito de Chocolate \n 3 Biscoitos Cookes \n 4 Biscoito Polvilhos");
                operacao1 = teclado.nextInt();
        switch(operacao1){
            case 1:
                
        }
        }
        
                
        }
                
        }
     
        
       
      

    }

       
      
      
    }
    

