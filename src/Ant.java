
/**
 * reprezentuje mravence
 */
public class Ant {

    private Color color;
    private char name;

    //konstruktor
    public Ant(Color color, char name) {
        this.color = color;
        this.name = name;
    }

    //definuje defaultni podobu println v pripade tisku objektu
    //pri vystiknuti Ant se zobrazi barevne pismeno,diky tomu se nevytiskne misto v pameti
    @Override
    public String toString() {
        return color + " " + name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
}
