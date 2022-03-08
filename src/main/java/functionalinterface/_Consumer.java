package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria PM", "697 332 174");
        // Greeting normal way
        greetCustomer(maria);
        greetCustomerV2(maria, false);

        //greeting Customer the Consumer way
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria, false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello "+customer.customerName+", Thanks for registering phone number "+customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> System.out.println("Hello "+customer.customerName+", Thanks for registering phone number "+(showPhoneNumber ? customer.customerPhoneNumber : "*********"));


    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.customerName+", Thanks for registering phone number "+customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, Boolean showPhoneNumber){
        System.out.println("Hello "+customer.customerName+", Thanks for registering phone number "+(showPhoneNumber ? customer.customerPhoneNumber : "*********"));
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
