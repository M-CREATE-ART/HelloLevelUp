package app.database;

public enum Airport {
    KYİV ("KBP"),
    ANKARA( "ESB"),
    SOFİA("SOF"),
    BAHRAİN("BAH"),
    GANDJA("KVD" );

    private String code;

    public String getCode() {
        return code;
    }

    Airport(String code) {
        this.code = code;
    }
}
