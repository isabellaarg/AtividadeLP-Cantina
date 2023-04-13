public class Massa {
    private String tipoDeMassa;
    private double valor;

    public Massa(String tipoDeMassa, double valor) {
        this.tipoDeMassa = tipoDeMassa;
        this.valor = valor;
    }

    public String getTipoDeMassa() {
        return tipoDeMassa;
    }

    public void setTipoDeMassa(String tipoDeMassa) {
        this.tipoDeMassa = tipoDeMassa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
