package Fabric;

import Interface.iGameItem;
import Product.ArtifactReward;

public class ArtifactGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new ArtifactReward();
    }
    
}
