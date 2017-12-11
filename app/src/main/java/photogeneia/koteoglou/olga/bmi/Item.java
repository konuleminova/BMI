package photogeneia.koteoglou.olga.bmi;

/**
 * Created by Asus on 11/29/2017.
 */

public class Item {
    String text;
    int image;

    public Item(String text, int image) {
        this.text = text;
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }
}
