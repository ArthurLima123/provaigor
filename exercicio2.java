package com.aula_1.provaigor;

public class exercicio2 {

    public static void main(String[] args) {
        System.out.println("O salário incial em 1995 era de: R$ 1000,00");
        int year;
        double salario, porcentagem;
        salario = 1000;
        porcentagem = 1.15;
        year = 1995;
        do {
            porcentagem = porcentagem * 2;
            salario = salario * porcentagem;
            year = year + 1;

        } while (year == 2022);
        System.out.println("O salário atual em 2022 é de: R$ " + salario);
    }

}
