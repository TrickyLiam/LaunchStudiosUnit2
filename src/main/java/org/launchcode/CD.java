package org.launchcode;

public class CD extends Disc implements OpticalDisc {

    public CD(boolean isLoaded, double addedStorage, double storageCapacity, double rpm, String title, String year, double runtime) {
        super(isLoaded, addedStorage, storageCapacity, rpm, title, year, runtime);
    }

    @Override
    public void spin(){
        System.out.println( this.getTitle() + " spins at a rate of " + this.getRpm() + " rpm");
    }

    @Override
    public void storeData() {
        System.out.println("This CD has " + getAddedStorage() + " bytes amount of extra data");
    }

    @Override
    public void writeData() {

    }

    @Override
    public void readData() {

    }

    @Override
    public void reportData() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
