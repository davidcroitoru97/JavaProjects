package Evaluation_2;

public class Comanda  implements Interface{

    @Override
    public float calculPretComanda(float pretProdus, int cantitateCumparata) {
        return pretProdus* cantitateCumparata;
    }

    @Override
    public String generateInfoComanda() {
        return null;
    }
}
