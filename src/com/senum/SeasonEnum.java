package com.senum;

public enum SeasonEnum {
    SPRING(1,"春"),
    SUMMER(2,"夏"),
    AUTUMN(3,"秋"),
    WINTER(4,"东");

    private int key;
    private String value;

    SeasonEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        for (SeasonEnum s : SeasonEnum.values()) {
            System.out.println(s);

        }

        System.out.println(SeasonEnum.SPRING.getKey());
        System.out.println(SeasonEnum.SPRING.getValue());
    }
}
