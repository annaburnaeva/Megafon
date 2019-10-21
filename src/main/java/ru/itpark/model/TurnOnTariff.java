package ru.itpark.model;

public class TurnOnTariff extends Tariff{
    private boolean unlimitedInternetForMessengers;
    private boolean cashback;

    public TurnOnTariff(long id, String name, int subscriptionFee, boolean unlimitedInternet, String territoryOfAction, String servicesIncludedInTariff, String features, boolean downloadDetailedInformationAboutTariff, boolean select, boolean unlimitedInternetForMessengers, boolean cashback) {
        super(id, name, subscriptionFee, unlimitedInternet, territoryOfAction, servicesIncludedInTariff, features, downloadDetailedInformationAboutTariff, select);
        this.unlimitedInternetForMessengers = unlimitedInternetForMessengers;
        this.cashback = cashback;
    }

    public boolean isUnlimitedInternetForMessengers() {
        return unlimitedInternetForMessengers;
    }

    public void setUnlimitedInternetForMessengers(boolean unlimitedInternetForMessengers) {
        this.unlimitedInternetForMessengers = unlimitedInternetForMessengers;
    }

    public boolean isCashback() {
        return cashback;
    }

    public void setCashback(boolean cashback) {
        this.cashback = cashback;
    }
}
