package daoimpl;

import dao.electronicsdaopkg.ElectronicsDAO;
import model.itemspkg.electronicspkg.Electronic;

public class ElectronicsDAOImpl implements ElectronicsDAO { // for SQL Server
    @Override
    public boolean addElectronics(Electronic electronic) {
        System.out.println("save electronic to sql server dbms");
        return false;
    }
}
