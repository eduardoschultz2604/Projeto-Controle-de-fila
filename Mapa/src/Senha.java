import java.util.List;

public class Senha {
    public int numero;
    public String tipo;
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int senha) {
        this.numero = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Senha(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;       
    }

    public Senha() {
        this.tipo = "";
        this.numero = 0;
    }

    @Override
    public String toString() {
        return "senha{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }
}
