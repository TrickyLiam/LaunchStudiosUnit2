package org.launchcode;

public class Disc {

   private boolean isLoaded;
   private double storageCapacity;
   private double rpm;
   private String title;
   private String year;
   private double runtime;
   private double addedStorage;

    public Disc(boolean isLoaded, double storageCapacity, double addedStorage, double rpm, String title, String year, double runtime) {
        this.isLoaded = isLoaded;
        this.storageCapacity = storageCapacity;
        this.addedStorage = addedStorage;
        this.rpm = rpm;
        this.title = title;
        this.year = year;
        this.runtime = runtime;
    }
    public Disc(boolean isLoaded, double storageCapacity) {
        this.isLoaded = isLoaded;
        this.storageCapacity = storageCapacity;
    }

    public boolean getIsLoaded() {
        return isLoaded;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public double getAddedStorage() {
        return addedStorage;
    }

    public double getRpm() {
        return rpm;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setIsLoaded(boolean loaded) {
        isLoaded = loaded;
    }
}
