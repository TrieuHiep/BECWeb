package Builder;

public class HarryPotter extends ScienceFictionBook {
    @Override
    public String name() {
        return "HarryPotter";
    }

    @Override
    public float price() {
        return 123.5f;
    }
}
