package coffee;

public enum Drink {

    COFFEE("C"),
    TEA("T"),
    CHOCOLATE("H");

    private String code;

    Drink(String code) {
        this.code = code;
    }

    String getCode() {
        return code;
    }
}
