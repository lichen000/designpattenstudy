package lichen000.designpatten.proxy;

/**
 * Created by chen.li200 on 2018-01-19
 */
public class ProxyImage implements Image {

	private RealImage realImage;

	private String fileName;

	public ProxyImage(String fileName){
		this.fileName = fileName;
	}

	/**
	 *
	 */
	@Override
	public void display() {
		if (realImage == null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
