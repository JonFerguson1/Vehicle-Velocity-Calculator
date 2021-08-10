package sample2;

import java.util.Scanner;

public class ProjectCPSC4360 extends DragCondition {
	
	//Default road menu
	public static void RoadMenu() {
		System.out.println("Select from the following: ");
		System.out.println("Cement: (1)New (2)Used (3)Revised");
		System.out.println("Asphalt: (4)New (5)Used (6)Revised (7) Tarred");
		System.out.println("Gravel: (8)Packed (9)Loose");
		System.out.println("(10)Cinders");
		System.out.println("(11)Rock");
		System.out.println("(12)Ice");
		System.out.println("Snow: (13)Packed (14)Loose");
	}
	
	public static void main(String[] args) {
		//constants
		final double gravity = 9.80665;
		final double radiusE = 6731009;
		
		//creating scanner
		Scanner input = new Scanner(System.in);
		
		//Get type of case from user
		System.out.println("Enter selection from the following: (1)Skid (2)Yaw (3)Airborne ");
		int NumOfCase = input.nextInt();
		
		//Get altitude from user
		System.out.println("Enter the altitude: ");
		double altitude = input.nextDouble();
		
		//Get speed from user
		System.out.println("Enter speed in MPH");
		int MPH = input.nextInt();
		
		//Get road condition from user
		System.out.println("Was the road dry or wet?");
		String dryOrWet = input.next();
		
		//set the final calculation
		double setFinal = gravity * Math.pow((radiusE / (radiusE + altitude)), 2);
		
		//Skid case
		if(NumOfCase == 1) {
			
			//Get road type from user
			RoadMenu();
			int road = input.nextInt();
			
			//Get final velocity from user
			System.out.println("Enter the final velocity: ");
			double finalVelocity = input.nextDouble();	
			
			//Get the skid distance from user
			System.out.println("Enter the skid distance in meters:");
			double skidDistance = input.nextDouble();
			
			//calculate velocity based on low speed/dry roads
			if(MPH < 30 && (dryOrWet.contains("dry"))) {
				switch(road) {
   		
				case 1:
					System.out.println("Drag condition: " + DryCementNewLess);
					System.out.println("Velocity: " +(Math.sqrt(2 * DryCementNewLess * setFinal * skidDistance + Math.pow(finalVelocity,2))));
                 break;
				case 2:
					System.out.println("Drag condition: " + DryCementUsedLess);
					System.out.println("Velocity: "+(Math.sqrt(2 * DryCementUsedLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
                 break;
				case 3:
					System.out.println("Drag condition: " + DryCementRevisedLess);
					System.out.println("Velocity: "+ (Math.sqrt(2 * DryCementRevisedLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
                 break;
				case 4:
					System.out.println("Drag condition: " + DryAsphaltNewLess);
					System.out.println("Velocity: "+ (Math.sqrt(2 * DryAsphaltNewLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
                 break;
				case 5:
					System.out.println("Drag condition: " + DryAsphaltUsedLess);
					System.out.println("Velocity: "+ (Math.sqrt(2 * DryAsphaltUsedLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
                 break;
				case 6:
					System.out.println("Drag condition: " + DryAsphaltRevisedLess);
					System.out.println("Velocity: "+ (Math.sqrt(2 * DryAsphaltRevisedLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
                 break;
				case 7:
					System.out.println("Drag condition: " + DryAsphaltTarredLess);
					System.out.println("Velocity: "+ (Math.sqrt(2 * DryAsphaltTarredLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
                 break;
				case 8:
					System.out.println("Drag condition: " + DryGravelPackedLess);
					System.out.println("Velocity: "+ (Math.sqrt(2 * DryGravelPackedLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
                 break;
				case 9:
					System.out.println("Drag condition: " + DryGravelLooseLess);
					System.out.println("Velocity: "+ (Math.sqrt(2 * DryGravelLooseLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
                 break;
				case 10:
					System.out.println("Drag condition: " + DryCindersLess);
					System.out.println("Velocity: "+ (Math.sqrt(2 * DryCindersLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
                 break;
				case 11:
					System.out.println("Drag condition: " + DryRockLess);
					System.out.println("Velocity: " + (Math.sqrt(2 * DryRockLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
                 break;
				case 12:
					System.out.println("Drag condition: " + DryIceLess);
					System.out.println("Velocity: " + (Math.sqrt(2 * DryIceLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
                 break;
				case 13:
					System.out.println("Drag condition: " + DrySnowPackedLess);
					System.out.println("Velocity: " + (Math.sqrt(2 * DrySnowPackedLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
                 break;
				case 14:
					System.out.println("Drag condition: " + DrySnowLooseLess);
					System.out.println("Velocity: " + (Math.sqrt(2 * DrySnowLooseLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
                 break;
				default:
					System.out.println("Reselect");
                 break;
				}
			}
			//calculate velocity based on low speed/wet roads
			else if(MPH < 30 && (dryOrWet.contains("wet"))) {
				switch(road) {
   		
				case 1:
					System.out.println("Drag condition: " + WetCementNewLess);
					System.out.println("Velocity: " +(Math.sqrt(2 * WetCementNewLess * setFinal * skidDistance + Math.pow(finalVelocity,2))));
					break;
				case 2:
					System.out.println("Drag condition: " + WetCementUsedLess);
					System.out.println("Velocity: "+(Math.sqrt(2 * WetCementUsedLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
		            break;
		   		case 3:
		            System.out.println("Drag condition: " + WetCementRevisedLess);
		            System.out.println("Velocity: "+ (Math.sqrt(2 * WetCementRevisedLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
		            break;
		   		case 4:
		            System.out.println("Drag condition: " + WetAsphaltNewLess);
		            System.out.println("Velocity: "+ (Math.sqrt(2 * WetAsphaltNewLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
		            break;
		   		case 5:
		            System.out.println("Drag condition: " + WetAsphaltUsedLess);
		            System.out.println("Velocity: "+ (Math.sqrt(2 * WetAsphaltUsedLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
		            break;
		   		case 6:
		            System.out.println("Drag condition: " + WetAsphaltRevisedLess);
		            System.out.println("Velocity: "+ (Math.sqrt(2 * WetAsphaltRevisedLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
		            break;
		   		case 7:
		            System.out.println("Drag condition: " + WetAsphaltTarredLess);
		            System.out.println("Velocity: "+ (Math.sqrt(2 * WetAsphaltTarredLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
		            break;
		   		case 8:
		            System.out.println("Drag condition: " + WetGravelPackedLess);
		            System.out.println("Velocity: "+ (Math.sqrt(2 * WetGravelPackedLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
		            break;
		   		case 9:
		            System.out.println("Drag condition: " + WetGravelLooseLess);
		            System.out.println("Velocity: "+ (Math.sqrt(2 * WetGravelLooseLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
		            break;
		   		case 10:
		            System.out.println("Drag condition: " + WetCindersLess);
		            System.out.println("Velocity: "+ (Math.sqrt(2 * WetCindersLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
		            break;
		   		case 11:
		            System.out.println("Drag condition: " + WetRockLess);
		            System.out.println("Velocity: " + (Math.sqrt(2 * WetRockLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
		            break;
		   		case 12:
		            System.out.println("Drag condition: " + WetIceLess);
		            System.out.println("Velocity: " + (Math.sqrt(2 * WetIceLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
		            break;
		   		case 13:
		            System.out.println("Drag condition: " + WetSnowPackedLess);
		            System.out.println("Velocity: " + (Math.sqrt(2 * WetSnowPackedLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
		            break;
		   		case 14:
		            System.out.println("Drag condition: " + WetSnowLooseLess);
		            System.out.println("Velocity: " + (Math.sqrt(2 * WetSnowLooseLess * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
		            break;
		        default:
		            System.out.println("Reselect");
		            break;
		   		}
		   	}
		//calculate velocity based on high speed/wet roads
	   	else if(MPH >= 30 && (dryOrWet.contains("wet"))) {
	   		switch(road) {
	   		
	   		case 1:
	                 System.out.println("Drag condition: " + WetCementNewMore);
	                 System.out.println("Velocity: " +(Math.sqrt(2 * WetCementNewMore * setFinal * skidDistance + Math.pow(finalVelocity,2))));
	                 break;
	   		case 2:
	                 System.out.println("Drag condition: " + WetCementUsedMore);
	                 System.out.println("Velocity: "+(Math.sqrt(2 * WetCementUsedMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 3:
	                 System.out.println("Drag condition: " + WetCementRevisedMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * WetCementRevisedMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 4:
	                 System.out.println("Drag condition: " + WetAsphaltNewMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * WetAsphaltNewMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 5:
	                 System.out.println("Drag condition: " + WetAsphaltUsedMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * WetAsphaltUsedMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 6:
	                 System.out.println("Drag condition: " + WetAsphaltRevisedMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * WetAsphaltRevisedMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 7:
	                 System.out.println("Drag condition: " + WetAsphaltTarredMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * WetAsphaltTarredMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 8:
	                 System.out.println("Drag condition: " + WetGravelPackedMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * WetGravelPackedMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 9:
	                 System.out.println("Drag condition: " + WetGravelLooseMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * WetGravelLooseMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 10:
	                 System.out.println("Drag condition: " + WetCindersMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * WetCindersMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 11:
	                 System.out.println("Drag condition: " + WetRockMore);
	                 System.out.println("Velocity: " + (Math.sqrt(2 * WetRockMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 12:
	                 System.out.println("Drag condition: " + WetIceMore);
	                 System.out.println("Velocity: " + (Math.sqrt(2 * WetIceMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 13:
	                 System.out.println("Drag condition: " + WetSnowPackedMore);
	                 System.out.println("Velocity: " + (Math.sqrt(2 * WetSnowPackedMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 14:
	                 System.out.println("Drag condition: " + WetSnowLooseMore);
	                 System.out.println("Velocity: " + (Math.sqrt(2 * WetSnowLooseMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	             default:
	                 System.out.println("Reselect");
	                 break;
	   		}
	   	}
	   	//calculate velocity based on high speed/dry roads
	   	else if(MPH >= 30 && (dryOrWet.contains("dry"))) {
	   		switch(road) {
	   		
	   		case 1:
	                 System.out.println("Drag condition: " + DryCementNewMore);
	                 System.out.println("Velocity: " +(Math.sqrt(2 * DryCementNewMore * setFinal * skidDistance + Math.pow(finalVelocity,2))));
	                 break;
	   		case 2:
	                 System.out.println("Drag condition: " + DryCementUsedMore);
	                 System.out.println("Velocity: "+(Math.sqrt(2 * DryCementUsedMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 3:
	                 System.out.println("Drag condition: " + DryCementRevisedMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * DryCementRevisedMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 4:
	                 System.out.println("Drag condition: " + DryAsphaltNewMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * DryAsphaltNewMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 5:
	                 System.out.println("Drag condition: " + DryAsphaltUsedMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * DryAsphaltUsedMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 6:
	                 System.out.println("Drag condition: " + DryAsphaltRevisedMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * DryAsphaltRevisedMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 7:
	                 System.out.println("Drag condition: " + DryAsphaltTarredMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * DryAsphaltTarredMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 8:
	                 System.out.println("Drag condition: " + DryGravelPackedMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * DryGravelPackedMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 9:
	                 System.out.println("Drag condition: " + DryGravelLooseMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * DryGravelLooseMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 10:
	                 System.out.println("Drag condition: " + DryCindersMore);
	                 System.out.println("Velocity: "+ (Math.sqrt(2 * DryCindersMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 11:
	                 System.out.println("Drag condition: " + DryRockMore);
	                 System.out.println("Velocity: " + (Math.sqrt(2 * DryRockMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 12:
	                 System.out.println("Drag condition: " + DryIceMore);
	                 System.out.println("Velocity: " + (Math.sqrt(2 * DryIceMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 13:
	                 System.out.println("Drag condition: " + DrySnowPackedMore);
	                 System.out.println("Velocity: " + (Math.sqrt(2 * DrySnowPackedMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	   		case 14:
	                 System.out.println("Drag condition: " + DrySnowLooseMore);
	                 System.out.println("Velocity: " + (Math.sqrt(2 * DrySnowLooseMore * setFinal * skidDistance + Math.pow(finalVelocity, 2))));
	                 break;
	             default:
	                 System.out.println("Reselect");
	                 break;
	   		}
	   	}
		}
		//Yaw case
		else if(NumOfCase == 2) {
			
			//Get road type from the user
			RoadMenu();
			int road = input.nextInt();
			
			//Get radius from the user
			System.out.println("Enter the radius:");
			double radius = input.nextDouble();
			
			//Get super elevation from the user
			System.out.println("Please enter super-elevation:");
			double e = input.nextDouble();
			
			//calculate velocity based on low speed/dry roads
			if(MPH < 30 && (dryOrWet.contains("dry"))) {
				switch(road) {
   		
				case 1:
					System.out.println("Drag condition: " + DryCementNewLess);
					System.out.println("Velocity: " +(Math.sqrt(radius * setFinal *  ((DryCementNewLess + e) / (1 - (DryCementNewLess * e))))));
					break;
				case 2:
					System.out.println("Drag condition: " + DryCementUsedLess);
					System.out.println("Velocity: "+(Math.sqrt(radius * setFinal *  ( DryCementUsedLess + e) / (1 - (DryCementUsedLess * e)))));
					break;
				case 3:
					System.out.println("Drag condition: " + DryCementRevisedLess);
					System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryCementRevisedLess + e) / (1 - (DryCementRevisedLess * e)))));
					break;
		   		case 4:
		                 System.out.println("Drag condition: " + DryAsphaltNewLess);
		                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryAsphaltNewLess + e) / (1 - (DryAsphaltNewLess * e)))));
		                 break;
		   		case 5:
		                 System.out.println("Drag condition: " + DryAsphaltUsedLess);
		                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryAsphaltUsedLess + e) / (1 - (DryAsphaltUsedLess * e)))));
		                 break;
		   		case 6:
		                 System.out.println("Drag condition: " + DryAsphaltRevisedLess);
		                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryAsphaltRevisedLess + e) / (1 - (DryAsphaltRevisedLess * e)))));
		                 break;
		   		case 7:
		                 System.out.println("Drag condition: " + DryAsphaltTarredLess);
		                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryAsphaltTarredLess + e) / (1 - (DryAsphaltTarredLess * e)))));
		                 break;
		   		case 8:
		                 System.out.println("Drag condition: " + DryGravelPackedLess);
		                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryGravelPackedLess + e) / (1 - (DryGravelPackedLess * e)))));
		                 break;
		   		case 9:
		                 System.out.println("Drag condition: " + DryGravelLooseLess);
		                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryGravelLooseLess + e) / (1 - (DryGravelLooseLess * e)))));
		                 break;
		   		case 10:
		                 System.out.println("Drag condition: " + DryCindersLess);
		                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryCindersLess + e) / (1 - (DryCindersLess * e)))));
		                 break;
		   		case 11:
		                 System.out.println("Drag condition: " + DryRockLess);
		                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( DryRockLess + e) / (1 - (DryRockLess * e)))));
		                 break;
		   		case 12:
		                 System.out.println("Drag condition: " + DryIceLess);
		                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( DryIceLess + e) / (1 - (DryIceLess * e)))));
		                 break;
		   		case 13:
		                 System.out.println("Drag condition: " + DrySnowPackedLess);
		                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( DrySnowPackedLess + e) / (1 - (DrySnowPackedLess * e)))));
		                 break;
		   		case 14:
		                 System.out.println("Drag condition: " + DrySnowLooseLess);
		                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( DrySnowLooseLess + e) / (1 - (DrySnowLooseLess * e)))));
		                 break;
		             default:
		                 System.out.println("Reselect");
		                 break;
		   		}
			}
			
	//calculate velocity based on low speed/wet roads
   	else if(MPH < 30 && (dryOrWet.contains("wet"))) {
   		switch(road) {
   		
   		case 1:
                 System.out.println("Drag condition: " + WetCementNewLess);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( WetCementNewLess + e) / (1 - (WetCementNewLess * e)))));
                 break;
   		case 2:
                 System.out.println("Drag condition: " + WetCementUsedLess);
                 System.out.println("Velocity: "+(Math.sqrt(radius * setFinal *  ( WetCementUsedLess + e) / (1 - (WetCementUsedLess * e)))));
                 break;
   		case 3:
                 System.out.println("Drag condition: " + WetCementRevisedLess);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetCementRevisedLess + e) / (1 - (WetCementRevisedLess * e)))));
                 break;
   		case 4:
                 System.out.println("Drag condition: " + WetAsphaltNewLess);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetAsphaltNewLess + e) / (1 - (WetAsphaltNewLess * e)))));
                 break;
   		case 5:
                 System.out.println("Drag condition: " + WetAsphaltUsedLess);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetAsphaltUsedLess + e) / (1 - (WetAsphaltUsedLess * e)))));
                 break;
   		case 6:
                 System.out.println("Drag condition: " + WetAsphaltRevisedLess);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetAsphaltRevisedLess + e) / (1 - (WetAsphaltRevisedLess * e)))));
                 break;
   		case 7:
                 System.out.println("Drag condition: " + WetAsphaltTarredLess);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetAsphaltTarredLess + e) / (1 - (WetAsphaltTarredLess * e)))));
                 break;
        case 8:
                 System.out.println("Drag condition: " + WetGravelPackedLess);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetGravelPackedLess + e) / (1 - (WetGravelPackedLess * e)))));
                 break;
        case 9:
                 System.out.println("Drag condition: " + WetGravelLooseLess);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetGravelLooseLess + e) / (1 - (WetGravelLooseLess * e)))));
                 break;
        case 10:
                 System.out.println("Drag condition: " + WetCindersLess);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetCindersLess + e) / (1 - (WetCindersLess * e)))));
                 break;
        case 11:
                 System.out.println("Drag condition: " + WetRockLess);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( WetRockLess + e) / (1 - (WetRockLess * e)))));
                 break;
        case 12:
                 System.out.println("Drag condition: " + WetIceLess);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( WetIceLess + e) / (1 - (WetIceLess * e)))));
                 break;
        case 13:
                 System.out.println("Drag condition: " + WetSnowPackedLess);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( WetSnowPackedLess + e) / (1 - (WetSnowPackedLess * e)))));
                 break;
        case 14:
                 System.out.println("Drag condition: " + WetSnowLooseLess);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( WetSnowLooseLess + e) / (1 - (WetSnowLooseLess * e)))));
                 break;
        default:
                 System.out.println("Reselect");
                 break;
   		}
   	}
			
	//calculate velocity based on high speed/wet roads
   	else if(MPH >= 30 && (dryOrWet.contains("wet"))) {
   		switch(road) {
   		
   		case 1:
                 System.out.println("Drag condition: " + WetCementNewMore);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( WetCementNewMore + e) / (1 - (WetCementNewMore * e)))));
                 break;
   		case 2:
                 System.out.println("Drag condition: " + WetCementUsedMore);
                 System.out.println("Velocity: "+(Math.sqrt(radius * setFinal *  ( WetCementUsedMore + e) / (1 - (WetCementUsedMore * e)))));
                 break;
   		case 3:
                 System.out.println("Drag condition: " + WetCementRevisedMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetCementRevisedMore + e) / (1 - (WetCementRevisedMore * e)))));
                 break;
   		case 4:
                 System.out.println("Drag condition: " + WetAsphaltNewMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetAsphaltNewMore + e) / (1 - (WetAsphaltNewMore * e)))));
                 break;
   		case 5:
                 System.out.println("Drag condition: " + WetAsphaltUsedMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetAsphaltUsedMore + e) / (1 - (WetAsphaltUsedMore * e)))));
                 break;
   		case 6:
                 System.out.println("Drag condition: " + WetAsphaltRevisedMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetAsphaltRevisedMore + e) / (1 - (WetAsphaltRevisedMore * e)))));
                 break;
   		case 7:
                 System.out.println("Drag condition: " + WetAsphaltTarredMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetAsphaltTarredMore + e) / (1 - (WetAsphaltTarredMore * e)))));
                 break;
   		case 8:
                 System.out.println("Drag condition: " + WetGravelPackedMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetGravelPackedMore + e) / (1 - (WetGravelPackedMore * e)))));
                 break;
   		case 9:
                 System.out.println("Drag condition: " + WetGravelLooseMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetGravelLooseMore + e) / (1 - (WetGravelLooseMore * e)))));
                 break;
   		case 10:
                 System.out.println("Drag condition: " + WetCindersMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( WetCindersMore + e) / (1 - (WetCindersMore * e)))));
                 break;
   		case 11:
                 System.out.println("Drag condition: " + WetRockMore);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( WetRockMore + e) / (1 - (WetRockMore * e)))));
                 break;
   		case 12:
                 System.out.println("Drag condition: " + WetIceMore);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( WetIceMore + e) / (1 - (WetIceMore * e)))));
                 break;
   		case 13:
                 System.out.println("Drag condition: " + WetSnowPackedMore);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( WetSnowPackedMore + e) / (1 - (WetSnowPackedMore * e)))));
                 break;
   		case 14:
                 System.out.println("Drag condition: " + WetSnowLooseMore);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( WetSnowLooseMore + e) / (1 - (WetSnowLooseMore * e)))));
                 break;
             default:
                 System.out.println("Reselect");
                 break;
   		}
   	}
   	
	//calculate velocity based on high speed/dry roads
   	else if(MPH >= 30 && (dryOrWet.contains("dry"))) {
   		switch(road) {
   		
   		case 1:
                 System.out.println("Drag condition: " + DryCementNewMore);
                 System.out.println("Velocity: "+(Math.sqrt(radius * setFinal *  ( DryCementNewMore + e) / (1 - (DryCementNewMore * e)))));
                 break;
   		case 2:
                 System.out.println("Drag condition: " + DryCementUsedMore);
                 System.out.println("Velocity: "+(Math.sqrt(radius * setFinal *  ( DryCementUsedMore + e) / (1 - (DryCementUsedMore * e)))));
                 break;
   		case 3:
                 System.out.println("Drag condition: " + DryCementRevisedMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryCementRevisedMore + e) / (1 - (DryCementRevisedMore * e)))));
                 break;
   		case 4:
                 System.out.println("Drag condition: " + DryAsphaltNewMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryAsphaltNewMore + e) / (1 - (DryAsphaltNewMore * e)))));
                 break;
   		case 5:
                 System.out.println("Drag condition: " + DryAsphaltUsedMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryAsphaltUsedMore + e) / (1 - (DryAsphaltUsedMore * e)))));
                 break;
   		case 6:
                 System.out.println("Drag condition: " + DryAsphaltRevisedMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryAsphaltRevisedMore + e) / (1 - (DryAsphaltRevisedMore * e)))));
                 break;
   		case 7:
                 System.out.println("Drag condition: " + DryAsphaltTarredMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryAsphaltTarredMore + e) / (1 - (DryAsphaltTarredMore * e)))));
                 break;
   		case 8:
                 System.out.println("Drag condition: " + DryGravelPackedMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryGravelPackedMore + e) / (1 - (DryGravelPackedMore * e)))));
                 break;
   		case 9:
                 System.out.println("Drag condition: " + DryGravelLooseMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryGravelLooseMore + e) / (1 - (DryGravelLooseMore * e)))));
                 break;
   		case 10:
                 System.out.println("Drag condition: " + DryCindersMore);
                 System.out.println("Velocity: "+ (Math.sqrt(radius * setFinal *  ( DryCindersMore + e) / (1 - (DryCindersMore * e)))));
                 break;
   		case 11:
                 System.out.println("Drag condition: " + DryRockMore);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( DryRockMore + e) / (1 - (DryRockMore * e)))));
                 break;
   		case 12:
                 System.out.println("Drag condition: " + DryIceMore);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( DryIceMore + e) / (1 - (DryIceMore * e)))));
                 break;
   		case 13:
                 System.out.println("Drag condition: " + DrySnowPackedMore);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( DrySnowPackedMore + e) / (1 - (DrySnowPackedMore * e)))));
                 break;
   		case 14:
                 System.out.println("Drag condition: " + DrySnowLooseMore);
                 System.out.println("Velocity: " + (Math.sqrt(radius * setFinal *  ( DrySnowLooseMore + e) / (1 - (DrySnowLooseMore * e)))));
                 break;
             default:
                 System.out.println("Reselect");
                 break;
   		}
   	}
		}
		//Airborne case
		else {
			System.out.println("Enter the distance horizontally: ");
   			double Horiz = input.nextDouble();
       
   			System.out.println("Enter the distance vertically: ");
   			double Vert = input.nextDouble();
       
   			System.out.println("Enter the Super Elevation:");
       		double SuperE = input.nextDouble();
       
       		System.out.println(Math.sqrt(setFinal * Math.pow( Horiz, 2 )) / ( 2 * ( Vert + ( Horiz * SuperE ))));
		}
		input.close();
	}
}
