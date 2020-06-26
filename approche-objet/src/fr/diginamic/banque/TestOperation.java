package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation[] operations = new Operation[4];

		operations[0] = new Credit("25/06/2020", 3000.0);
		operations[1] = new Debit("25/06/2020", 3100.0);
		operations[2] = new Credit("25/06/2020", 4000.0);
		operations[3] = new Debit("25/06/2020", 2000.0);
		int solde = 0;
		

		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i].getType() + " : " + operations[i] + "\n");
			if(operations[i].getType().equals("CREDIT")) {
				solde += operations[i].getMontant();
			}else if (operations[i].getType().equals("DEBIT")){
				solde -= operations[i].getMontant();
			}

			
			System.out.println("Solde = " + solde);
			System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.- \n");
			}
			
		}

	}


