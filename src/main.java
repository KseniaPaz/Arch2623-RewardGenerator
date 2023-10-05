import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.ArtifactGenerator;
import Fabric.BronzeGenerator;
import Fabric.CopperGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.HerbGenerator;
import Fabric.ItemGenerator;
import Fabric.PotionGenerator;
import Fabric.SilverGenerator;

public class main {
     private static Object itemGeneratorList;


    public static void main(String[] args) {
        
         Random random = ThreadLocalRandom.current();
         List<ItemGenerator> fabrics = initFabrics();
 
         for (int i = 0; i < 200; i++) {
             int index = random.nextInt(fabrics.size());
             fabrics.get(index).openReward();
         }
     }
 

     public static List<ItemGenerator> initFabrics() {
         List<ItemGenerator> fabrics = new ArrayList<>();
 
         fabrics.add(new GemGenerator());
 
         for (int i = 0; i < 3; i++) {
             fabrics.add(new GoldGenerator());
         }
 
         for (int i = 0; i < 10; i++) {
             fabrics.add(new SilverGenerator());
             fabrics.add(new ArtifactGenerator());
             fabrics.add(new CopperGenerator());
             fabrics.add(new HerbGenerator());
             fabrics.add(new BronzeGenerator());
             fabrics.add(new PotionGenerator());
         }
 
         return fabrics;

    }
}
