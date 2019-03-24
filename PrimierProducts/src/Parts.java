import java.util.ArrayList;

public class Parts {
    private String partName;
    private int partNum;
    private int partCount;
    private double partPrice;
    private  int[] wareHouse = new int []{1, 2, 3};
    private int wareHouseNumber;
    private ArrayList<String> pName;

    public String getPartName() {
        return partName;
    }

    public ArrayList<String> getpName() {
        return pName;
    }

    public Parts(String partName, int partNum, int partCount, double partPrice, int wareHouseNumber) {
        this.partName =partName;
        this.partNum = partNum;
        this.partCount = partCount;
        this.partPrice = partPrice;
        this.pName = new ArrayList<String>();
        pName.add(partName);

        if(wareHouseNum(wareHouseNumber) > 0 && (wareHouseNum(wareHouseNumber)< wareHouse.length)){
            this.wareHouseNumber = wareHouseNumber;
        }
        else{
            this.wareHouseNumber = 0;
        }
    }


    public int wareHouseNum(int num){
        for(int i = 0; i < wareHouse.length; i++) {
            int[] list = new int[wareHouse.length];
            list[i] = wareHouse[i];
            if(num == list[i]){
                return num;
            }

        }  return 0;
    }

    public void printParts(){ //we can call this method in another class using objName.printParts();
        System.out.println(" Part  Num: " + partNum + " PartName: " + partName  + "\n" +" Part OnHand: " + partCount + "\n" +" Price: "  + partPrice  + " Warehouse Num:  " + wareHouseNumber);
    }

    public void addParts(int count){
       if(this.partCount + count > 50){
           System.out.println("Accepted parts: " + (50 - this.partCount));
           this.partCount = 50;
       }
       else if(this.partCount + count <= 50){
           System.out.println("Received parts: " + count);
           this.partCount = this.partCount + count;
       }

    }

    public void sellParts(int num){
        if(this.partCount - num >= 0 ){
            System.out.println("Parts " + partName + " sold: " + num);
            this.partCount = this.partCount - num;
        }else {
            System.out.println("Parts " + partName + " sold: " +this.partCount);
            this.partCount = 0;
        }
    }


}
