package milosz.pakiet;

public class Test {
    public static void main(String[] args) {
        DataPresenter dataPresenter = new DataPresenter();
        DataProvider dataProvider = new FileDataProvider();

        DataProvider[] dataProviders = new DataProvider[10];
        dataProviders[0] = new FileDataProvider();
        dataProviders[1] = new FileDataProvider();
        dataProviders[2] = new MyDateProvider();
        dataProviders[3] = new FileDataProvider();
        dataProviders[4] = new SimpleDateProvider();
        dataProviders[5] = new MyDateProvider();
        dataProviders[6] = new FileDataProvider();
        dataProviders[7] = new SimpleDateProvider();
        dataProviders[8] = new FileDataProvider();
        dataProviders[9] = new FileDataProvider();

        for (DataProvider dp : dataProviders) {
            dataPresenter.showDate(dp);
        }
    }
}
