package main;

public class Cama {
    int id;
    int codigoCama;
    boolean ehBeliche;
    String posicao;
    String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigoCama() {
        return codigoCama;
    }

    public void setCodigoCama(int codigoCama) {
        this.codigoCama = codigoCama;
    }

    public boolean isEhBeliche() {
        return ehBeliche;
    }

    public void setEhBeliche(boolean ehBeliche) {
        this.ehBeliche = ehBeliche;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
