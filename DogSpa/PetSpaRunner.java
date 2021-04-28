import java.util.Scanner;
import java.util.*;
public class PetSpaRunner
{
    public static void main( String args[] ){
        int entry = 0;
        int newCustomerEntry = 0;
        Owner newCustomer;
        Owner customer;
        ArrayList<Owner> owners = new ArrayList<>();
        ArrayList<Dog> guests = new ArrayList<>();
        Dog dog;
        Scanner kb = new Scanner(System.in);
        System.out.println("Dog Spa Software v0.1");
        
        // create owners and pets
        owners.add(new Owner());
        owners.get(0).setName("Meredith Grey");
        owners.get(0).addDog(new Dog("Ellis", owners.get(0)));
        owners.get(0).addDog(new Dog("Zola", owners.get(0)));
        owners.add(new Owner());
        owners.get(1).setName("Amelia Shepherd");
        owners.get(1).addDog(new Dog("Chris", owners.get(1)));
        owners.get(1).addDog(new Dog("Scout", owners.get(1)));
        
        while (entry != 8){
            System.out.println();
            System.out.println("enter 1 to check-in dog");
            System.out.println("enter 2 to check-out dog");
            System.out.println("enter 3 to wash dog");
            System.out.println("enter 4 to trim dog");
            System.out.println("enter 5 for a status report on checked-in dogs");
            System.out.println("enter 6 to print customer bills");
            System.out.println("enter 7 to add a customer");
            System.out.println("enter 8 to end");
            System.out.print("entry: ");
            entry = kb.nextInt();
            
            if (entry == 1){
                System.out.println("");
                for (int i = 0; i < owners.size(); i++){
                    System.out.println(i + " " + owners.get(i));
                }
                System.out.print("\nWhich customer is checking in a pet: ");
                customer = owners.get(kb.nextInt());
                System.out.println(customer.getName() + " dogs:");
                for (int i = 0; i < customer.getDogs().size(); i++){
                    System.out.println(i + "  " + customer.getDogs().get(i).getName());
                }
                System.out.print("\nWhich dog is checking in: ");
                guests.add(customer.getDogs().get(kb.nextInt()));
                System.out.println("\nPet Spa Guests");
                for (int i = 0; i < guests.size(); i++){
                    System.out.println(i + "  " + guests.get(i));
                }
                System.out.println("");
            }
            else if (entry == 2){
                System.out.println("");
                for (int i = 0; i < guests.size(); i++){
                    System.out.println(i + "  " + guests.get(i));
                }
                System.out.print("Which dog is checking out: ");
                int index = kb.nextInt();
                System.out.print("\nHow much did the owner pay: ");
                guests.get(index).getOwnerName().setBill(-kb.nextInt());
                guests.remove(index);
                System.out.println();
                for (int i = 0; i < owners.size(); i++){
                    System.out.println(i + " " + owners.get(i));
                }
                System.out.println("\nPet Spa Guests");
                for (int i = 0; i < guests.size(); i++){
                    System.out.println(i + "  " + guests.get(i));
                }
            }
            else if (entry == 3){
                System.out.println("\nPet Spa Guests");
                for (int i = 0; i < guests.size(); i++){
                    System.out.println(i + "  " + guests.get(i));
                }
                System.out.print("\nWhich dog is getting washed: ");
                int index = kb.nextInt();
                guests.get(index).setCorD("clean");
                guests.get(index).getOwnerName().setBill(30.00);
                System.out.println("\nPet Spa Guests");
                for (int i = 0; i < guests.size(); i++){
                    System.out.println(i + "  " + guests.get(i));
                }
            }
            else if (entry == 4){
                System.out.println("\nPet Spa Guests");
                for (int i = 0; i < guests.size(); i++){
                    System.out.println(i + "  " + guests.get(i));
                }
                System.out.print("\nWhich dog is getting a trim: ");
                int index = kb.nextInt();
                guests.get(index).setTorS("trimmed");
                guests.get(index).getOwnerName().setBill(40.00);
                System.out.println("\nPet Spa Guests");
                for (int i = 0; i < guests.size(); i++){
                    System.out.println(i + "  " + guests.get(i));
                }
            }
            else if (entry == 5){
                System.out.println("\nPet Spa Guests");
                for (int i = 0; i < guests.size(); i++){
                    System.out.println(i + "  " + guests.get(i));
                }
            }
            else if (entry == 6){
                for (int i = 0; i < owners.size(); i++){
                    System.out.println(i + " " + owners.get(i));
                }
            }
            else if (entry == 7){
                System.out.print("\nWhat is the first name of the new customer: ");
                String firstName = kb.next();
                System.out.print("What is the last name of the new customer: ");
                String lastName = kb.next();
                owners.add(new Owner());
                String fullName = firstName + " " + lastName;
                System.out.println("full name: " + fullName);
                owners.get(owners.size()-1).setName(fullName);
                newCustomer = owners.get(owners.size()-1);
                while (newCustomerEntry != 5){
                    System.out.println("\nenter 1 to add a dog to " + newCustomer.getName());
                    System.out.println("enter 2 to remove a dog from " + newCustomer.getName());
                    System.out.println("enter 3 to add phone number to " + newCustomer.getName());
                    System.out.println("enter 4 to get information about " + newCustomer.getName());
                    System.out.println("enter 5 to return to main program");
                    System.out.print("entry: ");
                    newCustomerEntry = kb.nextInt();
                    if (newCustomerEntry == 1){
                        System.out.print("\nWhat is the name of the dog: ");
                        newCustomer.addDog( new Dog(kb.next(), newCustomer));
                    }
                    else if (newCustomerEntry == 2){
                        System.out.println();
                        for (int i = 0; i < newCustomer.getDogs().size(); i++){
                            System.out.println(i + " " + newCustomer.getDogs().get(i).getName());
                        }
                        System.out.print("Which dog do you want to remove: ");
                        newCustomer.removeDog(kb.nextInt());
                        System.out.println("");
                        for (int i = 0; i < newCustomer.getDogs().size(); i++){
                            System.out.println(i + " " + newCustomer.getDogs().get(i).getName());
                        }
                    }
                    else if (newCustomerEntry == 3){
                        System.out.print("What is the phone number of " + newCustomer.getName() + ": ");
                        newCustomer.setPhone(kb.next());
                    }
                    else if (newCustomerEntry == 4){
                        System.out.println("Name: " + newCustomer.getName());
                        System.out.println("Dogs:");
                        for (int i = 0; i < newCustomer.getDogs().size(); i++){
                            System.out.println(i + " " + newCustomer.getDogs().get(i));
                        }
                        System.out.println("Phone number: " + newCustomer.getPhone());
                        System.out.println("Bill: " + newCustomer.getBill());
                    }
                }
            }
        }
        System.out.println("Thank you for using Dog Spa Software v0.1");
    }
}
