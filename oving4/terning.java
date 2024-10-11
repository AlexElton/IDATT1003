import java.util.Random;
class spiller {
    int id;
    int poengSum;
    

    public spiller(int nummer) {
        id = nummer;
    }

    public void kastTerning() {
        Random random = new Random();
        int randomKast = random.nextInt(6) + 1;


        System.out.println("Spiller " + id + ":");

        if (randomKast == 1) {
            poengSum = 0;
        }

        poengSum += randomKast;
        System.out.println(poengSum);
        
    
    }

    public boolean erFerdig() {
        if (poengSum > 99) {
            System.out.println("-----------Spiller " + id + " vant-----------");
            return true;
        } else {
            return false;
        }


    }

    public boolean getPoengSum() {
        if (poengSum > 99) {
            return true;
        } 
        return false;
    }
}

public class terning {
    public static void main(String[] args) {
        spiller spiller1 = new spiller(1);
        spiller spiller2 = new spiller(2);
        
        while (!spiller1.getPoengSum() || !spiller2.getPoengSum() ) {
            if (spiller1.erFerdig() || spiller2.erFerdig()) {
                break;
            }
            
            spiller1.kastTerning();
            spiller2.kastTerning();
        }
        
       
        
    }
}

