package observerpkg;

public abstract class Subject{
    public abstract void Register(Observer ob);
    public abstract  void Unregister(Observer ob);
    public abstract  void Notify();
}
