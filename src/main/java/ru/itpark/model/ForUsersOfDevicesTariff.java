package ru.itpark.model;

public class ForUsersOfDevicesTariff extends Tariff {
    private int costOfTransition;
    private int costOfReChanging;

    public ForUsersOfDevicesTariff(long id, String name, int subscriptionFee, boolean unlimitedInternet, String territoryOfAction, String servicesIncludedInTariff, String features, boolean downloadDetailedInformationAboutTariff, boolean select, int costOfTransition, int costOfReChanging) {
        super(id, name, subscriptionFee, unlimitedInternet, territoryOfAction, servicesIncludedInTariff, features, downloadDetailedInformationAboutTariff, select);
        this.costOfTransition = costOfTransition;
        this.costOfReChanging = costOfReChanging;
    }

    public int getCostOfTransition() {
        return costOfTransition;
    }

    public void setCostOfTransition(int costOfTransition) {
        this.costOfTransition = costOfTransition;
    }

    public int getCostOfReChanging() {
        return costOfReChanging;
    }

    public void setCostOfReChanging(int costOfReChanging) {
        this.costOfReChanging = costOfReChanging;
    }
}
