import java.awt.EventQueue;
import java.util.Hashtable;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class main {

	private JFrame frame;
	private JTextField a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
		// table number one rady
		 Map<String, Float> type_room = new Hashtable<>(); 
		 type_room.put("room with no windows or exterior doors",(float)  0.5); 
		 type_room.put("room with no windows or exterior doors on one side only", (float) 1.0); 
		 type_room.put("room with no windows or exterior doors on two side ", (float)1.5); 
		 type_room.put("room with no windows or exterior doors on three sides",(float) 2.0);
		 type_room.put("entrance halls",(float) 2.5);	 
		 type_room.put("Factories machine shops",(float) 1.25);	 
		 type_room.put("recreation rooms assembly room gymanasium",(float) 1.5);	
		 type_room.put("homes apartents offices",(float) 1.5);
		 type_room.put("classrooms dining room lounges hospital rooms kitchens laundries ballrooms bathrooms",(float) 2.0);	
		 type_room.put("stores public buidings",(float) 2.5);	
		 type_room.put("toilets auditorium",(float) 3.0);	
		 
		 //table number 2
		 Map<String, Integer> MC_table2 = new Hashtable<>();
		 MC_table2.put("maximum occupany per 100m^2", 0);
		 MC_table2.put("L/s/person", 1);
		 MC_table2.put("L/s/m^2", 2);
		 
		 
		 Map<String, Integer> MR_table2 = new Hashtable<>(); 
		 MR_table2.put("office space", 0);
		 MR_table2.put("reception areas", 1);
		 MR_table2.put("telecomm centers", 2);
		 MR_table2.put("conference roomse", 3);
		 MR_table2.put("corridors", 4);
		 MR_table2.put("public restrooms", 5);
		 MR_table2.put("locker and dressing rooms", 6);
		 MR_table2.put("smoking lounge", 7);
		 MR_table2.put("elevators", 8);
		 MR_table2.put("commercial laundry", 9);
		 MR_table2.put("commercial dry cleaner", 10);
		 MR_table2.put("coin-operated laundries", 11);
		 MR_table2.put("coin-operated dry cleaner", 12);
		 MR_table2.put("dining rooms", 13);
		 MR_table2.put("cafeteria", 14);
		 MR_table2.put("bars", 15);
		 MR_table2.put("kitchens", 16);
		 MR_table2.put("enclosed parking garage", 17);
		 MR_table2.put("auto repair", 18);
		 MR_table2.put("factories", 19);
		 MR_table2.put("basement and street stores", 20);
		 MR_table2.put("upper floors", 21);
		 MR_table2.put("storage rooms", 22);
		 MR_table2.put("dressing roos", 23);
		 MR_table2.put("malls", 24);
		 MR_table2.put("warehouses", 25);
		 MR_table2.put("smoking lounge", 26);
		 MR_table2.put("barbers", 27);
		 MR_table2.put("beauty saloons", 28);
		 MR_table2.put("reducing saloons", 29);
		 MR_table2.put("florist", 30);
		 MR_table2.put("supermarkets", 31);
		 MR_table2.put("hardware drugs fabrics", 32);
		 MR_table2.put("pet shops", 33);
		 MR_table2.put("furmiture", 34);
		 MR_table2.put("spectator areas", 35);
		
		 // page number 3
		 MR_table2.put("game roome", 36);
		 MR_table2.put("lce arenas", 37);
		 MR_table2.put("swimming pools", 38);
		 MR_table2.put("gymnanum floors", 39);
		 MR_table2.put("ballrooms and discos", 40);
		 MR_table2.put("bowling alleys", 41);
		 MR_table2.put("ticket booths", 42);
		 MR_table2.put("lobbies", 43);
		 MR_table2.put("auditorium", 44);
		 MR_table2.put("stages studios", 45);
		 MR_table2.put("waiting rooms", 46);
		 MR_table2.put("platforms", 47);
		 MR_table2.put("vehicles", 48);
		 MR_table2.put("meat processing", 49);
		 MR_table2.put("photo studios", 50);
		 MR_table2.put("darkrooms", 51);
		 MR_table2.put("pharmacy", 52);
		 MR_table2.put("bank vaults", 53);
		 MR_table2.put("printing duplicating rooms", 54);
		// MR_table2.put("correctional facilities", 55);
		 MR_table2.put("cells", 55);
		 MR_table2.put("dinig halls", 56);
		 MR_table2.put("guard stations", 57);
		 MR_table2.put("classrooms", 58);
		 MR_table2.put("laboratones", 59);
		 MR_table2.put("training shops", 60);
		 MR_table2.put("music rooms", 61);
		 MR_table2.put("libraries", 62);
		 MR_table2.put("locker rooms",63);
		 MR_table2.put("comdors", 64);
		 MR_table2.put("audioeium", 65);
		 MR_table2.put("smoking areas", 66);
		 MR_table2.put("parient rooms", 67);
		 MR_table2.put("medical procedurs areas", 68);
		 MR_table2.put("operating and delivery  room", 69);
		 MR_table2.put("recovery and icu", 70);
		 MR_table2.put("autopsy rooms", 71);
		 MR_table2.put("physical therapy",72);
		 MR_table2.put("living areas and rooms", 73);
		 MR_table2.put("kitchens", 74);
		 //----
		 double array_tabe2[][]= {
				 {7 , 10 , 7},
				 {60 , 8.0 , 5},
				 {60 , 10 , 0},
				 {50, 10 , 0 },
				 //---
				 {0 , 0 , 0.25 },
				 {100 , 13 , 0 },
				 {50 , 15 , 0 },
				 {70 , 8.0 , 0},
				 {0 , 7.5 , 5},
				 //------
				 {10 , 13 , 0},
			     {30 , 15 , 0},
				 {20 , 8 , 0},
				 {20 , 8 , 0},
				 //---
				 {70 , 10 , 0},
				 {100 , 10 , 0},
				 {100 , 15 , 0},
				 {20 , 8 , 0},
				 //---
				 {0 , 5 , 7.50},
				 {0 , 0 , 7.50},
				 {0 , 0 , 0.80},
				 //---
				 {30 , 7 , 1.50},
				 {20 , 7 , 1},
				 {15 , 7 , 0.75},
				 {20 , 3.5 , 1},
				 {0 , 7 , 1.50 },
				 {5 , 7 , 1},
				 {70 , 30 , 0},
				 //-----
				 {25 , 8 , 0},
				 {25 , 13 , 0},
				 {20 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {0 , 0 , 5},
				 {0 , 0 , 1.50},
				 {100 , 10 , 0},
				 ///page number 3
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
				 {8 , 8 , 0},
			
		 };
		 System.out.println(array_tabe2[MR_table2.get("supermarkets")][MC_table2.get("maximum occupany per 100m^2")]);
		 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(-8, 0, 1500, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		a = new JTextField();
		a.setBounds(10, 11, 96, 20);
		frame.getContentPane().add(a);
		a.setColumns(10);
		a.setText("sss");
		System.out.print("");
	}
}
