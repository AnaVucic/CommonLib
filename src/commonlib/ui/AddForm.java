
package commonlib.ui;

import commonlib.domain.Person;
import commonlib.domain.Preferential;
import commonlib.domain.TreatmentType;
import commonlib.repository.DatabaseRepository;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class AddForm extends javax.swing.JFrame {

    public AddForm() {
        initComponents();
        populateComboPerson();
        populateComboTreatmentType();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        cmbPerson = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        cmbDog = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        cmbTreatmentType = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        txtFee = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        txtDuration = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Appointment");
        setMinimumSize(new java.awt.Dimension(350, 82));
        getContentPane().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 10, 10));

        jPanel31.setBackground(new java.awt.Color(204, 204, 204));
        jPanel31.setLayout(new java.awt.GridLayout(1, 2));

        jPanel32.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel10.setText("Date");
        jPanel32.add(jLabel10);

        jPanel31.add(jPanel32);

        jPanel33.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        jTextField9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextField9.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel33.add(jTextField9);

        jPanel31.add(jPanel33);

        jPanel30.add(jPanel31);

        getContentPane().add(jPanel30);

        jPanel27.setBackground(new java.awt.Color(204, 204, 204));
        jPanel27.setLayout(new java.awt.GridLayout(1, 2));

        jPanel28.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setText("Time");
        jPanel28.add(jLabel9);

        jPanel27.add(jPanel28);

        jPanel29.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        jTextField8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextField8.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel29.add(jTextField8);

        jPanel27.add(jPanel29);

        jPanel26.add(jPanel27);

        getContentPane().add(jPanel26);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        jPanel8.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Person");
        jPanel8.add(jLabel4);

        jPanel7.add(jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        cmbPerson.setPreferredSize(new java.awt.Dimension(100, 26));
        cmbPerson.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPersonItemStateChanged(evt);
            }
        });
        cmbPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPersonActionPerformed(evt);
            }
        });
        jPanel9.add(cmbPerson);

        jPanel7.add(jPanel9);

        jPanel6.add(jPanel7);

        getContentPane().add(jPanel6);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setLayout(new java.awt.GridLayout(1, 2));

        jPanel12.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Dog");
        jPanel12.add(jLabel5);

        jPanel11.add(jPanel12);

        jPanel13.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        cmbDog.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel13.add(cmbDog);

        jPanel11.add(jPanel13);

        jPanel10.add(jPanel11);

        getContentPane().add(jPanel10);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new java.awt.GridLayout(1, 2));

        jPanel16.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setText("Treatment Type");
        jPanel16.add(jLabel6);

        jPanel15.add(jPanel16);

        jPanel17.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        cmbTreatmentType.setPreferredSize(new java.awt.Dimension(100, 26));
        cmbTreatmentType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTreatmentTypeItemStateChanged(evt);
            }
        });
        jPanel17.add(cmbTreatmentType);

        jPanel15.add(jPanel17);

        jPanel14.add(jPanel15);

        getContentPane().add(jPanel14);

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setLayout(new java.awt.GridLayout(1, 2));

        jPanel20.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setText("Fee");
        jPanel20.add(jLabel7);

        jPanel19.add(jPanel20);

        jPanel21.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        txtFee.setEditable(false);
        txtFee.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtFee.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel21.add(txtFee);

        jPanel19.add(jPanel21);

        jPanel18.add(jPanel19);

        getContentPane().add(jPanel18);

        jPanel23.setBackground(new java.awt.Color(204, 204, 204));
        jPanel23.setLayout(new java.awt.GridLayout(1, 2));

        jPanel24.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setText("Duration");
        jPanel24.add(jLabel8);

        jPanel23.add(jPanel24);

        jPanel25.setLayout(new java.awt.GridLayout(1, 1, 10, 10));

        txtDuration.setEditable(false);
        txtDuration.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtDuration.setPreferredSize(new java.awt.Dimension(100, 26));
        jPanel25.add(txtDuration);

        jPanel23.add(jPanel25);

        jPanel22.add(jPanel23);

        getContentPane().add(jPanel22);

        jButton1.setText("Save");
        jButton1.setPreferredSize(new java.awt.Dimension(72, 26));
        getContentPane().add(jButton1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPersonActionPerformed

    }//GEN-LAST:event_cmbPersonActionPerformed

    private void cmbPersonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPersonItemStateChanged
        if (cmbPerson.getSelectedItem() == null) {
        } else
            populateComboDog();
    }//GEN-LAST:event_cmbPersonItemStateChanged

    private void cmbTreatmentTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTreatmentTypeItemStateChanged
        if (cmbDog.getSelectedItem() != null && cmbPerson.getSelectedItem() != null && cmbTreatmentType.getSelectedItem() != null) {
            Double fee = calculateFee((Person) cmbPerson.getSelectedItem(), (TreatmentType) cmbTreatmentType.getSelectedItem());
            int duration = calculateDuration((TreatmentType) cmbTreatmentType.getSelectedItem());
            txtFee.setText(fee.toString());
            txtDuration.setText(Integer.toString(duration));
        }
    }//GEN-LAST:event_cmbTreatmentTypeItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbDog;
    private javax.swing.JComboBox<String> cmbPerson;
    private javax.swing.JComboBox<String> cmbTreatmentType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFee;
    // End of variables declaration//GEN-END:variables

    private void populateComboPerson() {

        cmbPerson.setModel(new DefaultComboBoxModel(new DatabaseRepository().getPersons().toArray()));
        cmbPerson.setSelectedItem(null);
    }

    private void populateComboDog() {
        Person person = (Person) cmbPerson.getSelectedItem();
        cmbDog.setModel(new DefaultComboBoxModel(new DatabaseRepository().getDogsByPerson(person).toArray()));
    }

    private void populateComboTreatmentType() {
        cmbTreatmentType.setModel(new DefaultComboBoxModel(TreatmentType.values()));
        cmbTreatmentType.setSelectedItem(null);
    }

    private Double calculateFee(Person person, TreatmentType treatmentType) {
        Double fee = 2000d;
        if (treatmentType == TreatmentType.AESTHETIC) {
            fee = 4500d;
        }
        if (person.getClass().isInstance(new Preferential())) {
            fee = 0.8 * fee;
        }
        return fee;
    }

    private int calculateDuration(TreatmentType treatmentType) {
        int duration = 0;
        switch (treatmentType) {
            case AESTHETIC:
                duration = 120;
                break;
            case HYGENIC:
                duration = 60;
                break;
            default:
                throw new AssertionError();
        }
        return duration;
    }

}
