import com.vehicle.Vehicle;
import com.vehicle.VehicleFactory;

public class VehicleFactoryMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OperatingSystemFactory osf = new OperatingSystemFactory();
		VehicleFactory vf = new VehicleFactory();
		
		Vehicle obj = vf.getInstance("Car");
		System.out.println("Car has "+	obj.set_num_of_wheels() + " wheels.");
		System.out.println("Car can accomodate "+	obj.set_num_of_passengers() + " passengers.\n");
		
		Vehicle obj2 = vf.getInstance("Plane");
		System.out.println("Plane has "+	obj.set_num_of_wheels() + " wheels.");
		System.out.println(	"Plane can accomodate "+	obj2.set_num_of_passengers() + " passengers.");
	
	}
}
