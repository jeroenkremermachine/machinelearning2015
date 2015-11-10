package KeyTypes;

import Blocks.Block;
import Blocks.DoubleBlock;
import Blocks.StringBlock;
import Blocks.UnitMeasureBlock;
import Models.BlockSet;

public class KeyTypeRecognizer {
	
	public KeyTypeRecognizer(){
		
	}
	
	public Type createType(BlockSet bSet){

		if(this.recognizeString(bSet)){
			return new StringType(bSet.getKey());
		} else {
			return new Double1Type(bSet.getKey());
		}

		
	}
	
	public boolean recognizeString(BlockSet bSet){
		if(bSet.getNrDoubles() + bSet.getNrUnitMeasures() <= bSet.getNrStrings()){
			return true;
		} else {
			return false;
		}
	}

}
