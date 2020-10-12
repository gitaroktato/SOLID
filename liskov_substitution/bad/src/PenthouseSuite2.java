/**
 * Created by mrk on 4/8/14.
 */
public class PenthouseSuite2 extends Apartment implements BedroomUpgradeable {
    public PenthouseSuite2() {
        this.numberOfBedrooms = 4;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }

    @Override
    public void addOneMoreBedroom() {
        this.numberOfBedrooms--;
    }
}
