/**
 * Created by mrk on 4/8/14.
 */
public class PenthouseSuite extends Apartment implements BedroomUpgradeable {
    public PenthouseSuite() {
        this.numberOfBedrooms = 4;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }

    @Override
    public void addOneMoreBedroom() {
        this.numberOfBedrooms++;
    }
}
