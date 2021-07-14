package model;

public enum UnitType {

    KOLLOKVIUM("K"),
    GYAKORLAT("GY"),
    VIZSGA("V"),
    EGYENI_FELKESZULES("EF"),
    DEFAULT("N/A");

    String code;

    UnitType() {
    }

    UnitType(String code) {
        this.code = code;
    }
}
