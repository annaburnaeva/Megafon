package ru.itpark.model;

public class Tariff {
    private long id;
    private String name;
    private int subscriptionFee;
    private boolean unlimitedInternet;
    private String territoryOfAction;
    private String servicesIncludedInTariff;
    private String features;
    private boolean downloadDetailedInformationAboutTariff;
    private boolean select;

    public Tariff(long id, String name, int subscriptionFee, boolean unlimitedInternet, String territoryOfAction, String servicesIncludedInTariff, String features, boolean downloadDetailedInformationAboutTariff, boolean select) {
        this.id = id;
        this.name = name;
        this.subscriptionFee = subscriptionFee;
        this.unlimitedInternet = unlimitedInternet;
        this.territoryOfAction = territoryOfAction;
        this.servicesIncludedInTariff = servicesIncludedInTariff;
        this.features = features;
        this.downloadDetailedInformationAboutTariff = downloadDetailedInformationAboutTariff;
        this.select = select;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(int subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public void setUnlimitedInternet(boolean unlimitedInternet) {
        this.unlimitedInternet = unlimitedInternet;
    }

    public String getTerritoryOfAction() {
        return territoryOfAction;
    }

    public void setTerritoryOfAction(String territoryOfAction) {
        this.territoryOfAction = territoryOfAction;
    }

    public String getServicesIncludedInTariff() {
        return servicesIncludedInTariff;
    }

    public void setServicesIncludedInTariff(String servicesIncludedInTariff) {
        this.servicesIncludedInTariff = servicesIncludedInTariff;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public boolean isDownloadDetailedInformationAboutTariff() {
        return downloadDetailedInformationAboutTariff;
    }

    public void setDownloadDetailedInformationAboutTariff(boolean downloadDetailedInformationAboutTariff) {
        this.downloadDetailedInformationAboutTariff = downloadDetailedInformationAboutTariff;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }
}
