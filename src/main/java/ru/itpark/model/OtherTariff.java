package ru.itpark.model;

public class OtherTariff extends Tariff {
    private boolean unlimitedCallsWithinNetwork;

    public OtherTariff(long id, String name, int subscriptionFee, boolean unlimitedInternet, String territoryOfAction, String servicesIncludedInTariff, String features, boolean downloadDetailedInformationAboutTariff, boolean select, boolean unlimitedCallsWithinNetwork) {
        super(id, name, subscriptionFee, unlimitedInternet, territoryOfAction, servicesIncludedInTariff, features, downloadDetailedInformationAboutTariff, select);
        this.unlimitedCallsWithinNetwork = unlimitedCallsWithinNetwork;
    }

    public boolean isUnlimitedCallsWithinNetwork() {
        return unlimitedCallsWithinNetwork;
    }

    public void setUnlimitedCallsWithinNetwork(boolean unlimitedCallsWithinNetwork) {
        this.unlimitedCallsWithinNetwork = unlimitedCallsWithinNetwork;
    }
}
