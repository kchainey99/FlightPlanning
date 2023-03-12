package flightPlanning;

public class City{
	String name;
	protected Boolean isVisited;
	
	// City is simply a node where we can track whether or not that node has been visited
	public City(String city) {
		name = city;
		isVisited = false;
	}

	void markVisited() {
		isVisited = true;
	}
	
	@Override
	//override default equals method & return a comparison of two city objects
	public boolean equals(Object o) {
		if (o instanceof City){
			City c = (City)o;
			return equals(c);
		}
		else
			return false;
	}
	
	public Boolean equals(City other) {
		return this.name.equals(other.name) ? true : false; 
	}
}
