public class CB extends CA{
	private int z;
	public CB(){}
	public CB(int x,int y, int i){
		x=x;
		y=y;
		z=i;
		CB a = new CB();
		a.suma();
	}
	public int suma(){
		r=x+y+z;
		return r;
	}

}