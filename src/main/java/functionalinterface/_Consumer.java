package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria PM", "697 332 174");
        // Greeting normal way
        greetCustomer(maria);

        //greeting Customer the Consumer way
        greetCustomerConsumer.accept(maria);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello "+customer.customerName+", Thanks for registering phone number "+customer.customerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.customerName+", Thanks for registering phone number "+customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
