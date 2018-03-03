package Builder;

public class BuildStore {

    public Store BuildTechniqueBook(){
        Store store = new Store();
        store.addItem(new CplusplusBook());
        return  store;
    }
    public Store BuildScienceFictionBook(){
        Store store = new Store();
        store.addItem(new HarryPotter());
        return store;
    }
    public Store BuildFridge(){
        Store store = new Store();
        store.addItem(new Fridge());
        return store;
    }
}
