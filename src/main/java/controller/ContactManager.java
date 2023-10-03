package controller;

import Repository.ContactRepository;
import Repository.IContactRepository;
import view.Menu;



public class ContactManager extends Menu<String>{
    
    static String[] mc = {"Add a contact", "Display all contact", "Delete a Contact", "Exit"};
    private IContactRepository contactRepository;
    
    public ContactManager() {
        super("      Contact program ", mc);
        contactRepository = new ContactRepository();
    }
    
    @Override
    public void execute(int n) {
       switch (n) {
            case 1:
                contactRepository.createContact();
                break;
            case 2:
                contactRepository.printAllContact();
                break;
            case 3:
                contactRepository.deleteContactd();
                break;
            case 4:
                System.exit(0);
        }
    }
}