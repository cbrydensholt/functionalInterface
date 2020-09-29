package com.company;

public class Films {

    int minuts;
    int rating;
    String name;

    public Films(int minuts, int rating, String name) {
        this.minuts = minuts;
        this.rating = rating;
        this.name = name;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Films{" +
                "minuts=" + minuts +
                ", rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }
}
