public enum Season {
    SPRING("Весна"),
    SUMMER("Лето"),
    AUTUMN("Осень"),
    WINTER("Зима");

    private String title;

     Season(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
