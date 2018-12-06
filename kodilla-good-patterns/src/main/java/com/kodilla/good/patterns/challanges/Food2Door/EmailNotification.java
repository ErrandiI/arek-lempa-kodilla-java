package com.kodilla.good.patterns.challanges.Food2Door;

public class EmailNotification implements InformationService {
    @Override
    public void inform(Producent producent) {
        System.out.println("Send email to producent" + producent);

    }
}
