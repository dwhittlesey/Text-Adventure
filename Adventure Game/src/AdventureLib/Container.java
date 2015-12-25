package AdventureLib;

public class Container {
	float weight;
	int capacity;
	private Container parentContainer;
	
	
	public void AddItem(Item item){
		'item.setParentContainer(this);
	}


	public Container getParentContainer() {
		return parentContainer;
	}


	public void setParentContainer(Container parentContainer) {
		this.parentContainer = parentContainer;
	}
}
