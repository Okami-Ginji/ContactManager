/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;


import DataAcess.ContactDAO;

/**
 *
 * @author Xuan Vinh
 */
public class ContactRepository implements IContactRepository{

    @Override
    public void createContact() {
        ContactDAO.Instance().createContact();
    }

    @Override
    public void printAllContact() {
        ContactDAO.Instance().printAllContact();
    }

    @Override
    public void deleteContactd() {
        ContactDAO.Instance().deleteContactd();
    }
}