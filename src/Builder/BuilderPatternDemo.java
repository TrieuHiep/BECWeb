package Builder;

public class BuilderPatternDemo  {
    public static void main(String[] args) {
        BuildStore buildStore = new BuildStore();
        Store techniqueStore = buildStore.BuildTechniqueBook();
        System.out.println("\nTechnique Book  ");
        techniqueStore.showItem();

        Store sfStore = buildStore.BuildScienceFictionBook();
        System.out.println("\nScience Fiction Book  ");
        sfStore.showItem();

        Store frigdeStore = buildStore.BuildFridge();
        System.out.println("\nRefrigerator  ");
        frigdeStore.showItem();


    }
}
