public class Main {
    public static void main(String[] args) {

        Imovel im = new Imovel (1234, 300000, "Bernardindo de Campos, 799");
        System.out.println("Código do imovel: " + im.getCodigo());
        System.out.println("Endereço do imovel: " + im.getEndereco());
        System.out.println("Preço inicial do imovel: R$" + im.getPreco());
        System.out.println("Valor total:  R$"+im.valortotal());
        System.out.println();

        Usado us = new Usado (5678, 270000, "Alvaro Silveira Leite, 43");
        System.out.println("Código do imovel: " + us.getCodigo());
        System.out.println("Endereço do imovel: " + us.getEndereco());
        System.out.println("Preço inicial do imovel: R$" + us.getPreco());
        System.out.println("Valor total:  R$"+us.valortotal(8000));
        System.out.println();

        Novo nv = new Novo(9101, 330000, "Guilherme Fragosso Ferrao, 100");
        System.out.println("Código do imovel: " + nv.getCodigo());
        System.out.println("Endereço do imovel: " + nv.getEndereco());
        System.out.println("Preço inicial do imovel: " + nv.getPreco());
        System.out.println("Valor total:  R$"+nv.valortotal(10000));
    }


}