package com.mini_project_on_List.Client;

import java.util.Scanner;

import com.mini_project_on_List.Servise.ServisePlayers;

public class ClientTestIPLPlayers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ServisePlayers servise = new ServisePlayers();

//		System.out.println("Choose a team (CSK, MI, RCB): ");
//		String team = sc.nextLine();
//
//		System.out.println("Choose a role (batsman, bowler, all-rounder): ");
//		String role = sc.nextLine();
//
//		servise.getPlayersByRole(team, role);

		while(true) {
			System.out.println("SELECT TEAM:-\n1.CSK\n2.MI\n3.RCB\nEnteGr Choise: ");
		

		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			System.out.println("SELECT ROLE:-\n1.Batsman\n2.Bowler\n3.all-Rounder\nEnter Choise:- ");

			int chh = sc.nextInt();
			switch (chh) {

			case 1:
				servise.getPlayersByRole("CSK", "Batsman");
				break;
			case 2:

				servise.getPlayersByRole("CSK", "Bowler");
				break;
			case 3:
				servise.getPlayersByRole("CSK", "all-rounder");
				break;
			default:
				System.out.println("Please Inter Valid Choise");

			}
			break;

		case 2:
			System.out.println("1.Batsman\n2.Bowler\n3.all-Rounder");
			System.out.println("Enter Choise: ");
			int chh1 = sc.nextInt();
			switch (chh1) {

			case 1:
				servise.getPlayersByRole("MI", "Batsman");
				break;
			case 2:

				servise.getPlayersByRole("MI", "Bowler");
				break;
			case 3:
				servise.getPlayersByRole("MI", "all-rounder");
				break;
			default:
				System.out.println("Please Inter Valid Choise");

			}
			break;

		case 3:
			System.out.println("1.Batsman\n2.Bowler\n3.all-Rounder");
			System.out.println("Enter Choise: ");
			int chh2 = sc.nextInt();
			switch (chh2) {

			case 1:
				servise.getPlayersByRole("RCB", "Batsman");
				break;
			case 2:

				servise.getPlayersByRole("RCB", "Bowler");
				break;
			case 3:
				servise.getPlayersByRole("RCB", "all-rounder");
				break;
			default:
				System.out.println("Please Inter Valid Choise");

			}
			break;

		}

		sc.close();
		}
	}

}
//1201