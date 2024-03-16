public class Plane{

    int weight;
    String name;
    String company;
    public Plane(int weight, String name, String company){
	this.weight = weight;
	this.name = name;
	this.company = company;
    }

    private boolean determineEligibility(){
	if(company.equals("Coke")){
	    return true;
	}
	return false;
    }

    public boolean getbool(){
	return determineEligibility();
    }

    

}
