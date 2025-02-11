package com.company.controller;

import com.company.commons.constants.FileConstants;
import com.company.model.People;
import com.company.service.JsonParser;
import com.company.service.impl.JsonParserGson;

import java.util.LinkedList;
import java.util.List;

public class PeopleController {
    List<People> peopleList = new LinkedList<>();

    public void generateData() {
        People people = new People(
                "Karen",
                "Darbinyan",
                "+374 98 156 247",
                "kar31100@gmail.com",
                "YSU",
                "alam asxarh",
                "RELQ", FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);


        people = new People(
                "Alexandr",
                "Hambardzumyan",
                "+374 98 156 247",
                "kar31100@gmail.com",
                "YSU",
                "alam asxarh",
                "RELQ", FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Hasmik",
                "Gevorgyan",
                "+374 98 156 247",
                "kar31100@gmail.com",
                "YSU",
                "alam asxarh",
                "RELQ", FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Lusine",
                "Yeremyan",
                "+374 98 156 247",
                "kar31100@gmail.com",
                "YSU",
                "alam asxarh",
                "RELQ", FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Anahit",
                "Khechumyan",
                "+374 98 156 247",
                "kar31100@gmail.com",
                "YSU",
                "alam asxarh",
                "RELQ", FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Ani",
                "Antonyan",
                "",
                "notDefined",
                "notDefined",
                "notDefined",
                "RELQ", FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Anna",
                "Hayriyan",
                "+374 98 14 44 50",
                "annhayriyan@gmail.com",
                "ASUE",
                "Scott logistics",
                "RELQ",
                "");
        peopleList.add(people);

        people=new People(
                "Armenak",
                "Qocharyan",
                "+374 94 90 21 71",
                "qocharyanarmenak@gmail.com",
                "Բարձրագույն զինվորական",
                "ՀՀ ՊՆ",
                "Relq School",FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Arusyak",
                "Aghajanyan",
                "+374 55 90 01 55",
                "aghajanyanarusyak@gmail.com",
                "YSUGU",
                "InecoBank CJSC, Risk meneger",
                "BasicItCenter," +
                        "UNDP Armenia Accelerator5," +
                        "HTI Armenia C++ basic, " +
                        "SmartCode,Relq Technology",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);
        people=new People(
                "Afina",
                "Panyan",
                "notDefined",
                "notDefined",
                "notDefined",
                "notDefined",
                "Relq",
                "");
        peopleList.add(people);

        people=new People(
                "Babken",
                "Tadevosyan",
                "+374 93 28 55 95",
                "notDefined",
                "notDefined",
                "notDefined",
                "Relq",
                "");
        peopleList.add(people);

        people=new People(
                "Hermine",
                "Melkumyan",
                "notDefined",
                "notDefined",
                "notDefined",
                "notDefined",
                "Relq",FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Hermine",
                "Sahakyan",
                "notDefined",
                "notDefined",
                "notDefined",
                "notDefined",
                "Relq",
                "");
        peopleList.add(people);

        people=new People(
                "Larine",
                "Danielyan",
                "+374 97 75 95 99",
                "danielyanlari@gmail.com",
                "Economics and Menegment",
                "Martuninsky district Medical Association",
                "Relq",FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Liana",
                "Dashyan",
                "+374 91 55 53 74",
                "dashyanlian@gmail.com",
                "YSU",
                "GYU NGO",
                "Relq",
                "");
        peopleList.add(people);

        people=new People(
                "Lusine",
                "Petrosyan",
                "+374 93 32 29 02",
                "plusine99@gmail.com",
                "Armenian State University faculty of Radiophysics",
                "notDefined",
                "Relq", FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);
        people=new People(
                "Marat",
                "Harutyunyan",
                "+374 44 05 51 50",
                "maratharutyunyan.mh.mh@gmail.com",
                "ASIPCS",
                "EL Market",
                "Relq School",FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);
        people=new People(
                "Narek",
                "Tovmasyan",
                "+374 94 27 67 00",
                "Narektom333@gmail.com",
                "ASUE",
                "Ameria Bank",
                "Relq School",FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);
        people=new People(
                "Seda",
                "Shahnazaryan",
                "+374 98 31 38 71",
                "shahnazaryan.seda@mail.ru",
                "Higher Education:Historian",
                "notDefined",
                "TechBoost4Women," +
                        "RELQ technology school",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Seryozha",
                "Asatryan",
                "+374 94 24 68 80",
                "seryozha.asatryan02@gmail.com",
                "Economics",
                "notDefined",
                "Relq School",FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Sevak",
                "Stepanyan",
                "+374 77 12 16 96",
                "stepanyansevak9@gamil.com",
                "Economics and Menegment",
                "notDefined",
                "Relq School",
                "");
        peopleList.add(people);

        people=new People(
                "Silva",
                "Ohanyan",
                "notDefined",
                "notDefined",
                "notDefined",
                "notDefined",
                "Relq School",
                "");
        peopleList.add(people);

        people=new People(
                "Suren",
                "Galstyan",
                "notDefined",
                "notDefined",
                "notDefined",
                "notDefined",
                "Relq School",
                "");
        peopleList.add(people);

        people=new People(
                "Tigran",
                "Martirosyan",
                "+374 77 15 18 68",
                "martirosyant01@mail.ru",
                "notDefined",
                "notDefined",
                "Relq School",FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

           }

    public void writeInFileWithJson() {
        JsonParser jp = new JsonParserGson();
        jp.parseToJsonAndWriteInFile(peopleList.toArray(new People[0]));
        System.out.println("everything is OKAY");

    }
}
