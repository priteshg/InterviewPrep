package builder;

/**
 * Created by Pritesh on 09/05/2017.
 */
public class Recipe {


    //Required
    private final String meatType;
    private final String veg;
    private final String onions;
    private final String egg;

    //This takes a builder object
    private Recipe(Builder b) {
        this.meatType = b.meatType;
        this.veg = b.veg;
        this.onions = b.onions;
        this.egg = b.egg;
    }

    //inner class - can be static so you don't have to instantiate it
    //Recipe.Builder then access all the methods
    public static class Builder {
        private String meatType;
        private String veg;
        private String onions;
        private String egg;

        public Builder meatType(String meatType) {
            this.meatType = meatType;
            return this;
        }

        public Builder veg(String veg) {
            this.veg = veg;
            return this;
        }

        public Builder onions(String onions) {
            this.onions = onions;
            return this;
        }

        public Builder egg(String egg) {
            this.egg = egg;
            return this;
        }

        public Recipe build(){
            return new Recipe(this);
        }


        public static void main(String[] args) {
            Recipe myRecipe = new Recipe.Builder().egg("yes").meatType("").onions("").veg("").build();
        }
    }



}



