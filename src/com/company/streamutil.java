package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class streamutil {

    ArrayList<Films> filmList = new ArrayList<>();

    public void makeList(){


        Films lotr1 = new Films(200, 9, "The Fellowship Of The Ring");
        Films lotr2 = new Films(155, 5, "LOTR 2");
        Films lotr3 = new Films(220, 8, "LOTR 3");
        Films HarryPotter1 = new Films(90, 5, "HP1");
        Films HarryPotter2 = new Films(134, 9, "HP2");

        filmList.add(lotr1);
        filmList.add(lotr2);
        filmList.add(lotr3);
        filmList.add(HarryPotter1);
        filmList.add(HarryPotter2);


    }



    public void filterList(){


            twoparam twoparam1 = (num1, num2) -> num1+num2;
        List<Films> filteredList = filmList.stream()
                .filter(new Predicate<Films>() {
                    @Override
                    public boolean test(Films films) {
                        return films.getMinuts() > 130 && films.getRating() > 3;
                    }
                })
                .filter(new removeShortFilms(){
                    @Override
                    public void removeShortOnes(Films films) {
                        if(films.getMinuts() > 150){
                            filteredList.remove(films);
                        }
                    }
                })


                .filter(new combinedRatingMinutes(){
                    @Override
                    public void sayhey(Films film1, int minnutes) {
                        minnutes = film1.getMinuts();
                        if(minnutes > 140){
                            System.out.println("Hey hey");
                        }
                    }


                })

                .filter((combinedRatingMinutes) (film1, minnutes) -> {
                    minnutes = film1.getMinuts();
                    if(minnutes > 140){
                        System.out.println("Hey hey");
                    }
                })

                //.filter( films -> films.getMinuts() > 140)
                .collect(Collectors.toList());

                filteredList.forEach(System.out::println);

    }

}
