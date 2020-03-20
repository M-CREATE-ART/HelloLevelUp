package app.database;

public enum Airport {
    KYIV ("KBP"),
    ANKARA( "ESB"),
    SOFIA("SOF"),
    BAHRAIN("BAH"),
    GANDJA("KVD" );

    private String code;


    Airport(String code) {
        this.code = code;
    }
}
