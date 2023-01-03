package Plan;

public class AssistanceRisk extends Risk{

    @Override
    public float getPremium() {
        return 0;
    }

    @Override
    public float getCoverage() {
        return 0;
    }

    @Override
    public float getCeiling() {
        return 0;
    }

    public String[] assistanceRisksCovered = {
            "Fire",
            "Robbery",
            "Transport",
            "Car Replacement"
    };
}
