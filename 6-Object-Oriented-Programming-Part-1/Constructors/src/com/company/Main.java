package com.company;

public class Main {

    public static void main(String[] args) {
//	    Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "bob12@gmail.com", "919219212223");

//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
//        Account timsAccont = new Account("Tim", "tim12@gmail.com", "123456");
//        System.out.println(timsAccont.getNumber() + " name " + timsAccont.getCustomerName());

        VipCustomer kiranpalsingh = new VipCustomer();
        kiranpalsingh.setEmail("kiranpalsingh1806@gmail.com");
        kiranpalsingh.setLimit(1000);
        kiranpalsingh.setName("Kiranpal Singh");

        System.out.println(kiranpalsingh.getEmail() + " Name : " +  kiranpalsingh.getName() + " has limit of " + kiranpalsingh.getLimit());


    }
}
