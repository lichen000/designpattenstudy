package lichen000.designpatten.compositeentity;

/**
 * Created by chen.li200 on 2018-02-07
 */
public class CompositeEntity {
	private CoarseGrainedObject cgo = new CoarseGrainedObject();

	public void setData(String data1, String data2){
		cgo.setData(data1, data2);
	}

	public String[] getData(){
		return cgo.getData();
	}
}
