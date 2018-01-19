package lichen000.designpatten.proxy;

/**
 * Created by chen.li200 on 2018-01-19
 */
public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName){
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	/**
	 *
	 * @param fileName
	 */
	private void loadFromDisk(String fileName){
		System.out.println("Loading " + fileName);
	}

	/**
	 *
	 */
	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}
}
