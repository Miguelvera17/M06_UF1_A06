import java.util.ArrayList;

public class Article {

    private String name;
    private String quantity;
    private String unit;
    
    public Article(){}
    
    public Article(String name, String quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return String.format("\n%-10s %-10s %-15s", this.quantity, this.unit, this.name);}

    public static String toCSV(ArrayList<Article> articles) {
        String a = "";
        int count = 0;
        while (count < articles.size()) {
            a = a + ";" + articles.get(count).getName() + ";" + articles.get(count).getQuantity() + ";" + articles.get(count).getUnit();
            count++;
        }
        return "System.";
    }
}
