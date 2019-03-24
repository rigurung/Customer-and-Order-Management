import java.util.ArrayList;

public class OrderLine {
    private int orderNum;
    private String partName;
    private int numOrdered;
    private int numShipped;
    private double quotedPrice;
    private Parts parts;




    public OrderLine(int orderNum, String partName, int numOrdered, int numShipped, double quotedPrice) {

        parts = new Parts(partName);
        ArrayList<String> pNames = parts.getpName();
        boolean run = true;

        while(run){
        for(int i = 0; i < pNames.size();i++) {
            if (pNames.get(i).equals(partName)) {
                this.orderNum = orderNum;
                this.partName = partName;
                this.numOrdered = numOrdered;
                this.numShipped = numShipped;
                this.quotedPrice = quotedPrice;
                run = false;
            } else {
                System.out.println("We don't sell the item you have entered!");
            }
        }

        }

    }
    }


