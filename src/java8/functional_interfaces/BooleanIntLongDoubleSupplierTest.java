package java8.functional_interfaces;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class BooleanIntLongDoubleSupplierTest {
    public static void main(String[] args) {
        Item item = new Item(true, 1);

        // Boolean Supplier
        BooleanSupplier booleanSupplier = item::isStatus;
        System.out.println("Status: " + booleanSupplier.getAsBoolean());

        // Int Supplier
        IntSupplier intSupplier = item::getVal;
        System.out.println("Value: " + intSupplier.getAsInt());

        // Long Supplier
        LongSupplier longSupplier = item::getVal;
        System.out.println("Value: " + longSupplier.getAsLong());

        // Double Supplier
        DoubleSupplier doubleSupplier = item::getVal;
        System.out.println("Value: " + doubleSupplier.getAsDouble());
    }
}

class Item {
    private Boolean status;
    private Integer val;
    public Item(Boolean status, Integer val){
        this.status=status;
        this.val=val;
    }
    public Boolean isStatus() {
        return status;
    }
    public Integer getVal() {
        return val;
    }
}
