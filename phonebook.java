import javax.swing.*;
import java.util.*;

class PersonInfo{
	String name;
	String address;
	String phoneNumber;

   PersonInfo(String n,String a,String p){
	name = n;
	address = a;
	phoneNumber = p ;
	}
 
void display()
	{
	JOptionPane.showMessageDialog(null, "Name: " + name  + "\nAddress: " + address + "\nPhone no.: " + phoneNumber);
	}

}
class AddressBook{
	ArrayList persons;
		AddressBook(){
	persons = new ArrayList();
	}
	void addperson(){
		String name = JOptionPane.showInputDialog("Enter name: ");
		String add = JOptionPane.showInputDialog("Enter address: ");
		String pNum = JOptionPane.showInputDialog("Enter phoneno: ");
		PersonInfo p=new PersonInfo(name, add, pNum);
		persons.add(p);
		}

	void searchPerson(String n){
		for (int i=0; i< persons.size(); i++){
	PersonInfo p=(PersonInfo) persons.get(i);
		if(n.equals(p.name)){
			p.display();
			}
		}
	}


	void deletePerson(String n){
		for (int i=0; i< persons.size(); i++){
	PersonInfo p=(PersonInfo) persons.get(i);
		if(n.equals(p.name)){
			persons.remove(i);
			}
		}
	}

}

public class phonebook {
	public static void main(String []args) 
	{
	AddressBook ab = new AddressBook();
	String input,s;
	int ch;

    while(true) {
	input = JOptionPane.showInputDialog("Enter 1 to Add\nEnter 2 to Search\nEnter 3 to Delete\nEnter 4 to Exit"  );
	ch = Integer.parseInt(input);

		switch (ch) {
	case 1:
		ab.addperson();
		break;
	case 2:
		s = JOptionPane.showInputDialog("Enter name to search: ");
		ab.searchPerson(s);
		break;
	case 3: 
		s = JOptionPane.showInputDialog("Enter name to delete: ");
		ab.deletePerson(s);
		break;
	case 4:
		System.exit(0);

	        	}
        	}
	}
}










