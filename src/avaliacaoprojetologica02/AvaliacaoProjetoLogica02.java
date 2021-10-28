/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoprojetologica02;

import java.util.Scanner;

/**
 *
 * @author odavi
 */
public class AvaliacaoProjetoLogica02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int numConta;
        double saldo, debito, credito, saldoAtual;
        
        System.out.println("Informe o número da conta do cliente:");
        numConta = teclado.nextInt();
        System.out.println("Informe seu saldo:");
        saldo = teclado.nextDouble();
        System.out.println("Informe seu débito:");
        debito = teclado.nextDouble();
        System.out.println("Informe seu crédito:");
        credito = teclado.nextDouble();
        
        saldoAtual = saldo - debito + credito;
        
        if(saldoAtual >= 0){
            System.out.println("Saldo positivo!");
        }else{
            System.out.println("Saldo negativo!");
        }
    }
    
}
