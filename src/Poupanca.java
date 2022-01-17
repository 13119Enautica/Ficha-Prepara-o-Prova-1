public class Poupanca {
    private int anos;
    private double juros;
    private double deposito_mensal;
    public Poupanca(int a, double j, double dm) {
        anos = a;
        juros = j/100;
        deposito_mensal = dm; }
    public double calculaTotal() {
        int num_pagamentos = anos * 12;
        double total = 0;
        for (int i = 0; i < num_pagamentos; i++) {
            total = total + deposito_mensal;
            total = total + total * juros;
        }
        return total;
    }
}
