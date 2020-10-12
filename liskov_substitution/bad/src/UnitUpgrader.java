/**
 * Created by mrk on 4/8/14.
 */
public class UnitUpgrader {
    public void upgrade(Apartment apartment) {
        apartment.squareFootage += 40;
    }

    public void upgradeBedrooms(BedroomUpgradeable type) {
        type.addOneMoreBedroom();
    }
}
