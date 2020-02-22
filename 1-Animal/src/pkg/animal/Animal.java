package pkg.animal;

/**
 *
 * @author Rolaescobar
 */
public class Animal {

    private String ojos;
    private String boca;
    private String extremidades;
    private int edad;
    private String tipodeAnimal;

    public String getTipodeanimal() {
        return tipodeAnimal;
    }

    public void setTipodeanimal(String Tipodeanimal) {
        this.tipodeAnimal = Tipodeanimal;
    }

    public String getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(String extremidades) {
        this.extremidades = extremidades;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Animal(String ojos, String boca) {
        this.ojos = ojos;
        this.boca = boca;
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public String getBoca() {
        return boca;
    }

    public void setBoca(String boca) {
        this.boca = boca;
    }

}
