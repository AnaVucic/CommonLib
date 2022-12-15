package commonlib.ui.components.table.model;

import java.time.format.DateTimeFormatter;
import java.util.List;
import commonlib.domain.Appointment;
import commonlib.domain.Person;
import commonlib.domain.Preferential;
import javax.swing.table.AbstractTableModel;
import org.apache.commons.lang3.StringUtils;

public class PersonTableModel extends AbstractTableModel {

    List<Person> persons;

    public PersonTableModel() {
    }

    public PersonTableModel(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public int getRowCount() {
        if (persons != null) {
            return persons.size();
        } else {
            return 0;
        }
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Person person = persons.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return person.getPersonID();
            case 1:
                return person.getFirstname();
            case 2:
                return person.getLastname();
            case 3:
                return person.getContactNumber();
            case 4:
                return person.getAppointment_number();
            case 5:
                person.getClass().isInstance(new Preferential());
            default:
                return "n/a";

        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            persons.get(rowIndex).setPersonID((Long) aValue);
        } else if (columnIndex == 1) {
            persons.get(rowIndex).setFisrtname((String) aValue);
        } else if (columnIndex == 2) {
            persons.get(rowIndex).setLastname((String) aValue);
        } else if (columnIndex == 3) {
            persons.get(rowIndex).setContactNumber((String) aValue);
        } else if (columnIndex == 4) {
            persons.get(rowIndex).setAppointment_number((int) aValue);
        } else if (columnIndex == 5) {
            persons.get(rowIndex).getClass().isInstance(new Preferential());
        }
    }
    
    @Override
    public String getColumnName(int column) {
        String[] columns = {"ID", "Firstname", "Lastname", "Contact Number", "Appointment Number", "Preferential Customer"};
        return columns[column];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex == 4)
            return int.class;
        else if (columnIndex == 5)
            return boolean.class;
        else return Object.class;
    }
    
     @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 0 || columnIndex == 4 || columnIndex == 5)
            return false;
        else return true;
    }

}
