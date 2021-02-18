package com.codewithatoullo;

import java.util.ArrayList;
import java.util.List;

/**
 * Скопировать MusicBand из прошлого задания и доработать
 * теперь у участника музыкальной группы есть не только имя, но и возраст.
 * Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
 * Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом,
 * чтобы участники были - объекты класса MusicArtist.
 *
 * После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы
 * и проверить состав групп после слияния.
 * Методы для слияния и для вывода участников в консоль необходимо тоже переработать,
 * чтобы они работали с объектами класса MusicArtist.
 */

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Freddie Mercury", 45));
        members1.add(new MusicArtist("Brian May", 73));
        members1.add(new MusicArtist("John Deacon", 69));
        members1.add(new MusicArtist("Roger Taylor", 71));

        MusicBand band1 = new MusicBand("Queen", 1970, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("John Lennon", 32));
        members2.add(new MusicArtist("Paul McCartney", 54));
        members2.add(new MusicArtist("George Harrison", 61));
        members2.add(new MusicArtist("Ringo Starr", 45));


        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        band1.printMembers();
        band2.printMembers();

        System.out.println();

        MusicBand.transferMemebers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
