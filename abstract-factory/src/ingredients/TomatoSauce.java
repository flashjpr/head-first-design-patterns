package ingredients;

public class TomatoSauce implements Sauce {

    public TomatoSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing the tomato sauce");
    }
}
