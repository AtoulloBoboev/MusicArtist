package com.codewithatoullo;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    //Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А переходят в группу B.

    public static void  transferMemebers (MusicBand a, MusicBand b){

        //Реализовать метод сияния групп, т.е. все участники группы А переходят в группу В
        for (MusicArtist member : a.getMembers())
            b.getMembers().add(member);

        a.getMembers().clear();
    }

    //Реализовать метод, выводящий список участников в консоль. Проверить состав групп после слияния.
    public void printMembers(){

        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
