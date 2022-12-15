/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commonlib.ui.components.table.model;

import java.util.List;
import commonlib.domain.Dog;
import commonlib.domain.Person;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class DogTableModel extends AbstractTableModel {

    List<Dog> dogs;

    public DogTableModel() {
    }

    public DogTableModel(List<Dog> dogs) {
        this.dogs = dogs;
    }

    @Override
    public int getRowCount() {
        if (dogs != null) {
            return dogs.size();
        } else {
            return 0;
        }
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dog dog = dogs.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return dog.getDogID();
            case 1:
                return dog.getName();
            case 2:
                return dog.getBreed();
            case 3:
                return dog.getPerson().getFirstname() + " " + dog.getPerson().getLastname();
            default:
                return "n/a";

        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            dogs.get(rowIndex).setDogID((Long) aValue);
        } else if (columnIndex == 1) {
            dogs.get(rowIndex).setName((String) aValue);
        } else if (columnIndex == 2) {
            dogs.get(rowIndex).setBreed((String) aValue);
        } else if (columnIndex == 3) {
            dogs.get(rowIndex).setPerson((Person) aValue);
        }
    }
    
    @Override
    public String getColumnName(int column) {
        String[] columns = {"ID", "Name", "Breed", "Owner"};
        return columns[column];
    }

     @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Object.class;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    public List<Dog> getPersons() {
        return dogs;
    }

    public void add(Dog dog) {
        dogs.add(dog);
        fireTableDataChanged();
    }

    public void remove(int index) {
        dogs.remove(index);
        fireTableDataChanged();
    }
    
     public void remove(Dog dog) {
        dogs.remove(dog);
        fireTableDataChanged();
    }

    public Dog getPerson(int row) {
        return dogs.get(row);
    }
}
