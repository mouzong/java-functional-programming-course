package functionalinterface;

import java.util.function.Predicate;

public class _Predicates {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000000"));

        // chaining predicates
        System.out.println(isPhoneNumberValidPredicate.and(contains3).test("09000000003"));

        System.out.println(isPhoneNumberValidPredicate.and(contains3).test("07000000030"));
    }


    static Predicate<String> contains3 = phoneNumber -> phoneNumber.contains("3");
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
