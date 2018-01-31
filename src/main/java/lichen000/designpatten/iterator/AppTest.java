package lichen000.designpatten.iterator;

public class AppTest {

    public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();

		for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
			String name = (String)iter.next();
			System.out.println("Name : " + name);
		}
	}
}