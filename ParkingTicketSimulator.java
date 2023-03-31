
public class ParkingTicketSimulator {
	
	
	public class ParkedCar {
	    private String make;
	    private String model;
	    private String color;
	    private String licenseNum;
	    private int NumOfMinutesParked;

	    public ParkedCar(String make, String model, String color, String licenseNum, int NumOfMinutesParked) {
	        this.make = make;
	        this.model = model;
	        this.color = color;
	        this.licenseNum = licenseNum;
	        this.NumOfMinutesParked = NumOfMinutesParked;
	    }
	    
	    public String getMake() {
	        return this.make;
	        }
	    
	    public String getModel() {
	        return this.model;
	    }
	    
	    public String getColor() {
	        return this.color;
	    }
	    
	    public String getLicenseNum() {
	        return this.licenseNum;
	    }
	    
	    public int getNumOfMinutesParked() {
	        return this.NumOfMinutesParked;
	    }

	    public String toString() {
	        return "Car data - \n Make: " + make + "\n Model: " + model + "\n Color: " + color +
	                "\n License Number: " + licenseNum + "\n Minutes Parked: " + NumOfMinutesParked;
	    }
	    
	    public class ParkingMeter {
	        private int purchasedMinutes;

	        public ParkingMeter (int purchasedMinutes) {
	            this.purchasedMinutes = purchasedMinutes;
	        }
	        public int getPurchasedMinutes() {
	            return this.purchasedMinutes;
	        }

	        public String toString() {
	            return "\n Purchased Minutes: " + purchasedMinutes + " \n";
	        }

	    }
	    
	    public class ParkingTicket {
	        private PoliceOfficer officer;
	        private ParkedCar car;
	        private ParkingMeter minutes;

	        public ParkingTicket(PoliceOfficer anOfficer, ParkedCar aCar, ParkingMeter min) {
	            officer = anOfficer;
	            car = aCar;
	            minutes = min;
	        }

	        public String getReport() {
	            return car.toString() +  minutes.toString() + officer.toString();
	        }

	    }

	    public class PoliceOfficer {
	        private String policeName;
	        private String policeBadgeNum;
	        private ParkedCar car;
	        private ParkingMeter meter;

	        public PoliceOfficer(String policeName, String policeBadgeNum, ParkedCar aCar, ParkingMeter aMeter ) {
	            this.policeName = policeName;
	            this.policeBadgeNum = policeBadgeNum;
	            car = aCar;
	            meter = aMeter;
	        }

	        public boolean getExpired() {
	            //don't issue ticket
	            return (car.getNumOfMinutesParked() - meter.getPurchasedMinutes()) > 0; //issue ticket
	            // 60 minutes parked - 50 minutes bought = issue
	            // 50 minutes parked - 50 minutes bought = don't issue
	            //40 minutes parked - 50 minutes bought = don't issue
	        }
	        
	        public double getFine() {
	            double fine = 0;
	            if (getExpired()) {
	                int extraHours = (int)(car.getNumOfMinutesParked() - meter.getPurchasedMinutes()) / 60;
	                if (extraHours == 1) {
	                    fine = 25;
	                } else if(extraHours > 1) {
	                    fine = 25 + (extraHours -1)*10;
	                }
	            }
	            return fine;
	        }
	        
	        public String toString() {
	            return "Amount of the Fine - \n The fine amount is: $" + getFine() + "\n"  + "Officer Info - " + "\n Officer name: " +
	                    policeName + "\n Badge number: " + policeBadgeNum;
	        }

	    }

	}

}