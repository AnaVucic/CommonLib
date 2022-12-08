
package javadoggroomingapp.ui.components.table.model;

import java.util.List;
import javadoggroomingapp.domain.Appointment;
import javax.swing.table.AbstractTableModel;

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
        if(appointments != null)
            return appointments.size();
        else
            return 0;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Appointment appointment = appointments.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return appointment.getDateTime();
            case 1:
                return appointment.getDog().getName() + ", " + appointment.getDog().getBreed();
            case 2:
                return appointment.getSalon().getAddress() + ", "+ appointment.getSalon().getCity().getName();
            case 3:
                return appointment.getFee() + " RSD";
            case 4:
                return appointment.getDuration() + " min";
            case 5:
                return appointment.getTreatmentType();
            default:
                return "n/a";
            
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
        return true;
    }
    
    public List<Appointment> getPersons() {
        return appointments;
    }
    
    public void add(Appointment appointment){
        appointments.add(appointment);
        fireTableDataChanged();
    }
    
    public void remove(int index){
        appointments.remove(index);
        fireTableDataChanged();
    }
    public Appointment getPerson(int row){
        return appointments.get(row);
    }
    
}
