public class Meal {
    private String starter;
    private String drinks;
    private String mainCourse;
    private String desert;

    public Meal(String starter, String drinks, String mainCourse, String desert) {
        this.starter = starter;
        this.drinks = drinks;
        this.mainCourse = mainCourse;
        this.desert = desert;
    }

    @Override
    public String toString() {
        return String.format("Starter:%s Drinks:%s MainCourse:%s Desert:%s", starter, drinks, mainCourse, desert);
    }

    public boolean isMainCourseNonVeg(){
        return mainCourse.equals("Chicken");
    }

    public static class Builder {
        private String starter;
        private String drinks;
        private String mainCourse;
        private String desert;

        public Builder() {
        }

        public Builder withMainCourse(String mainCourse) {
            this.mainCourse = mainCourse;
            return this;
        }

        public Builder withStarter(String starter) {
            this.starter = starter;
            return this;
        }

        public Builder withDrinks(String drinks) {
            this.drinks = drinks;
            return this;
        }

        public Builder withDeserts(String desert) {
            this.desert = desert;
            return this;
        }

        public Meal Build() {
            return new Meal(starter, drinks, mainCourse, desert);
        }
    }

}

