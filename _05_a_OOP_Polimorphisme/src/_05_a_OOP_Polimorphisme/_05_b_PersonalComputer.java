package _05_a_OOP_Polimorphisme;

public class _05_b_PersonalComputer extends _05_b_Product {
//masukan object dari class2 sbgai field 
	private ComputerCase computerCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	//constructor 
	public _05_b_PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor,
			Motherboard motherboard) {
		super(model, manufacturer);
		this.computerCase = computerCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
    //method  yg diambil dari object monitor
	private void drawLogo() {
		monitor.drawPixelAt(1200, 50, "Yellow");
	}
	
	//method yg gunakan object computerCase 
	public void powerUp() {
		computerCase.pressButtonPower();
		drawLogo();
	}
    //method yg gunakan object MotherBoard 
	public void motherBoardLoad() {
		motherboard.loadProgram("windows os 64 as default!");
	}
	
	
	//NAH DIPERSONAL COMPUTER UTK ACCESS OBJECT2 CLASS LAIN KITA BISA GUNAKAN GETTER SEPRTI TADI DIATAS SBB 
	//MRKA SUDAH JADI FIELD DARI PERSONAL COMPUTER CLASS 
	
	public ComputerCase getComputerCase() {
		return computerCase;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}
}
