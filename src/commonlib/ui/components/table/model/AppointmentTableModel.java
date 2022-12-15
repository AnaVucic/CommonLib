package commonlib.ui.components.table.model;

import java.time.format.DateTimeFormatter;
import java.util.List;
import commonlib.domain.Appointment;
import commonlib.domain.Dog;
import commonlib.domain.Salon;
import commonlib.domain.TreatmentType;
import javax.swing.table.AbstractTableModel;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Lenovo
 */
public class AppointmentTableModel extends AbstractTableModel {

    List<Appointment> appointments;

    public AppointmentTableModel(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    @Override
    public int getRowCount() {
        if (appointments != null) {
            return appointments.size();
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
        Appointment appointment = appointments.get(rowIndex);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");

        switch (columnIndex) {
            case 0:
                return appointment.getDateTime().format(formatter);
            case 1:
                return appointment.getDog().getName() + ", " + appointment.getDog().getBreed();
            case 2:
                return appointment.getSalon().getAddress() + ", " + appointment.getSalon().getCity().getName();
            case 3:
                return appointment.getFee(); // + RSD
            case 4: 
                return appointment.getDuration(); // + min
            case 5:
                return StringUtils.capitalize(appointment.getTreatmentType().toString().toLowerCase());
            default:
                return "n/a";

        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            //Date Time Picker
        } else if (columnIndex == 1) {
            appointments.get(rowIndex).setDog((Dog) aValue);
        } else if (columnIndex == 2) {
            appointments.get(rowIndex).setSalon((Salon) aValue);
        } else if (columnIndex == 3) {
            appointments.get(rowIndex).setFee(Double.parseDouble((String) aValue));
        } else if (columnIndex == 4) {
            appointments.get(rowIndex).setDuration((Integer.parseInt((String) aValue)));
        } else if (columnIndex == 5) {
            appointments.get(rowIndex).setTreatmentType((TreatmentType) aValue);
        }
    }

    @Override
    public String getColumnName(int column) {
        String[] columns = {"Date, Time", "Dog", "Salon", "Fee", "Duration", "Treatment Type"};
        return columns[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Object.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public List<Appointment> getPersons() {
        return appointments;
    }

    public void add(Appointment appointment) {
        appointments.add(appointment);
        fireTableDataChanged();
    }

    public void remove(int index) {
        appointments.remove(index);
        fireTableDataChanged();
    }
    
     public void remove(Appointment appointment) {
        appointments.remove(appointment);
        fireTableDataChanged();
    }

    public Appointment getPerson(int row) {
        return appointments.get(row);
    }

}
