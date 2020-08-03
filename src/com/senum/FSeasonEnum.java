package com.senum;

public enum FSeasonEnum {
    SPRING("春"),
    SUMMER("夏"),
    AUTUMN("秋"),
    WINTER("东");

    private String value;

    FSeasonEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        for (FSeasonEnum s : FSeasonEnum.values()) {
            System.out.println(s);

        }
        System.out.println(FSeasonEnum.SPRING.getValue());
    }
}
