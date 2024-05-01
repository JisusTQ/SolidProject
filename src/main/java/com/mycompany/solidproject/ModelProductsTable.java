package com.mycompany.solidproject;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelProductsTable extends AbstractTableModel {

    List<Product> products;
    String[] columnNames = {"Product Id", "Product name", "Price", "Stock"};

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public ModelProductsTable(List<Product> products) {
        this.products = products;
    }

    public void AddProduct(Product product) {
        this.products.add(product);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return this.products.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var product = this.products.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                product.getId();
            case 1 ->
                product.getName();
            case 2 ->
                product.getPrice();
            case 3 ->
                product.getStock();
            default ->
                product;
        };
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

}
