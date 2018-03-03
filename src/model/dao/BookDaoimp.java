package model.dao;

import model.itemspkg.bookpkg.Book;
import observerpkg.Observer;
import observerpkg.Subject;

import java.util.ArrayList;
import java.util.List;

public class BookDaoimp extends Subject implements BookDao{
    private List<Observer> listOb;

    public List<Observer> getListOb() {
        return listOb;
    }

    public void setListOb(List<Observer> listOb) {
        this.listOb = listOb;
    }

    public BookDaoimp() {
        listOb = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        System.out.println(this.listOb.size());
        System.out.println("Them sach");
        Notify();
    }

    @Override
    public void Register(Observer ob) {
        listOb.add(ob);
        System.out.println("Dang ky doi tuong thanh cong!");
    }

    @Override
    public void Unregister(Observer ob) {
        if (this.listOb.contains(ob)) {
            this.listOb.remove(ob);
            System.out.println("Huy dang ky thanh cong!");
        }
        else{
            System.out.println("K tim thay!");
        }
    }

    @Override
    public void Notify() {
        for(Observer x:this.listOb){
            x.Update();
        }
    }

}
