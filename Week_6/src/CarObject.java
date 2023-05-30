
public class CarObject {
	private String model;

	public CarObject(String model) {
		this.model = model;
	}
	
	
	public boolean equals(Object obj) {
		if(obj instanceof CarObject)
			return model.equals(((CarObject)obj).model);
		else
			return false;
	}
	
	
	
	
}
