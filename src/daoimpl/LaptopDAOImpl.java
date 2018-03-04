package daoimpl;

import builder.LaptopBuilder;
import builder.LaptopBuilderImpl;
import dao.electronicsdaopkg.LaptopDAO;
import model.itemspkg.Product;
import model.itemspkg.electronicspkg.Electronic;
import model.itemspkg.electronicspkg.Laptop;
import utils.SQLServerConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LaptopDAOImpl implements LaptopDAO {
    private Connection connection;

    public LaptopDAOImpl() {
        try {
            this.connection = SQLServerConnector.getInstance().getSQLServerConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Laptop> getAll() throws SQLException {
        String sqlCommand = "SELECT * FROM product, electronic, laptop " +
                "WHERE laptop.idlaptop = electronic.idelectronic " +
                "AND laptop.idlaptop = product.idproduct";

        PreparedStatement statement = this.connection.prepareStatement(sqlCommand);
        ResultSet resultSet = statement.executeQuery();
        List<Laptop> laptopList = new ArrayList<>();

        while (resultSet.next()) {
            String idProduct = resultSet.getString("idproduct");
            String name = resultSet.getString("name");
            String color = resultSet.getString("color");
            double price = resultSet.getFloat("price");
            String power = resultSet.getString("power");
            String resolution = resultSet.getString("resolution");
            String ramCapacity = resultSet.getString("ramcapacity");
            String cpuType = resultSet.getString("cputype");
            String busSpeed = resultSet.getString("busspeed");
            String hddCapacity = resultSet.getString("hddcapacity");

            //Laptop laptop = new Laptop(idProduct, name, color, price, power, resolution, ramCapacity, cpuType, busSpeed, hddCapacity);
            LaptopBuilder laptopBuilder =
                    new LaptopBuilderImpl(idProduct, name, price);
            Laptop laptop = laptopBuilder
                    .buildColor(color)
                    .buildPower(power)
                    .buildBusSpeed(busSpeed)
                    .buildCpuType(cpuType)
                    .buildHddCapacity(hddCapacity)
                    .buildResolution(resolution)
                    .buildRamCapacity(ramCapacity)
                    .build();

            laptopList.add(laptop);
        }
        return laptopList;
    }

    @Override
    public Laptop[] getAllVersion2() throws SQLException {
        List<Laptop> laptopList = getAll();
        return laptopList.stream().toArray(Laptop[]::new);
    }
}
