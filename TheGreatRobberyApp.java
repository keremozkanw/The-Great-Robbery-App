package com.endsection;

public class TheGreatRobberyApp {
    public static void main(String[] args) {
        City city = new City();
        Gang theGang = new Gang();
        Police police = new Police();
        theGang.printGangInfo();
        theGang.letsRob(city.getBuildings());
        police.catchCriminals(theGang);
    }
}
