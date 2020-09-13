import java.awt.*;
import java.applet.*;

public class H5 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {

        g.drawLine(10, 330, 210, 330);
        g.drawString("Lijn", 100, 360);

        g.drawRect(10, 20, breedte, hoogte);
        g.drawString("Rechthoek", 75, 145);

        g.setColor(opvulkleur);
        g.fillRect(230, 20, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawArc(230, 20, breedte, hoogte, 0, 360);
        g.drawString("gevulde rechthoek met ovaal", 250, 145);

        g.drawArc(450, 20, breedte, hoogte, 0, 360);
        g.setColor(opvulkleur);
        g.fillArc(450, 20, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 470, 145);

        g.drawRoundRect(10, 190, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde rechthoek", 55, 315);

        g.setColor(opvulkleur);
        g.fillArc(230, 190, breedte, hoogte, 0, 360);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 295, 315);

        g.drawArc(500, 190, 100, hoogte, 0, 360);
        g.drawString("Cirkel", 535, 315);

    }
}