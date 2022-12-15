package commonlib.ui;

import java.awt.Font;
import java.time.LocalDateTime;
import java.util.List;
import commonlib.domain.Appointment;
import commonlib.domain.City;
import commonlib.domain.Dog;
import commonlib.domain.Person;
import commonlib.domain.Salon;
import commonlib.domain.User;
import commonlib.domain.TreatmentType;
import commonlib.repository.DatabaseRepository;
import commonlib.ui.components.table.model.AppointmentTableModel;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class MainForm extends javax.swing.JFrame {

    
    public MainForm(User currentUser) {

        for (Salon s : new DatabaseRepository().getSalons()) {
            System.out.println(s.toString());
        }

        initComponents();
        System.out.println("Logged in as: " + currentUser.getUsername());
        populateTable();
        populateComboSalonFilter();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbSalonFilter = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppointments = new javax.swing.JTable();
        btnAddAppointment = new javax.swing.JButton();
        btnRemoveAppointment = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        brtViewAll = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniEditPersons = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniEditDogs = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(850, 700));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Future appointments");

        cmbSalonFilter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbSalonFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSalonFilterActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Choose a salon:");

        tblAppointments.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAppointments.setRowHeight(30);
        jScrollPane1.setViewportView(tblAppointments);

        btnAddAppointment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddAppointment.setText("Add new appointment");
        btnAddAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAppointmentActionPerformed(evt);
            }
        });

        btnRemoveAppointment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemoveAppointment.setText("Cancel appointment");
        btnRemoveAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAppointmentActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setMaximumSize(new java.awt.Dimension(164, 27));
        btnEdit.setMinimumSize(new java.awt.Dimension(164, 27));

        brtViewAll.setText("View All");
        brtViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brtViewAllActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setMaximumSize(new java.awt.Dimension(164, 27));
        btnSave.setMinimumSize(new java.awt.Dimension(164, 27));

        jMenuBar1.setBorder(null);
        jMenuBar1.setAlignmentX(1.0F);

        jMenu1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenu1.setText("Persons");

        mniEditPersons.setText(" Edit persons");
        mniEditPersons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEditPersonsActionPerformed(evt);
            }
        });
        jMenu1.add(mniEditPersons);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Dogs");

        mniEditDogs.setText(" Edit dogs");
        mniEditDogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEditDogsActionPerformed(evt);
            }
        });
        jMenu2.add(mniEditDogs);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Salons");
        jMenuBar1.add(jMenu4);

        jMenu3.setText("Price Rates Information");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbSalonFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(brtViewAll))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRemoveAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbSalonFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brtViewAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnAddAppointment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoveAppointment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSalonFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSalonFilterActionPerformed
        Salon selectedSalon = (Salon) cmbSalonFilter.getSelectedItem();
        populateForm(selectedSalon);
    }//GEN-LAST:event_cmbSalonFilterActionPerformed

    private void brtViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brtViewAllActionPerformed
        Salon selectedSalon = (Salon) cmbSalonFilter.getSelectedItem();
        if (selectedSalon == null) {
            return;
        }
        populateTable();
    }//GEN-LAST:event_brtViewAllActionPerformed

    private void btnRemoveAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAppointmentActionPerformed
        if(tblAppointments.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(this, "First select an appointment!");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel this appointment?") == 0) {
            AppointmentTableModel appointmentTableModel = (AppointmentTableModel) tblAppointments.getModel();
            int selectedAppointment = tblAppointments.getRowSorter().convertRowIndexToModel(tblAppointments.getSelectedRow());
            appointmentTableModel.remove(selectedAppointment);
        }


    }//GEN-LAST:event_btnRemoveAppointmentActionPerformed

    private void btnAddAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAppointmentActionPerformed
//        AppointmentTableModel appointmentTableModel = (AppointmentTableModel) tblAppointments.getModel();
//        Dog dog = new Dog(Long.MIN_VALUE, new Person(Long.MIN_VALUE, "", "", "", 0), "", "");
//        Salon salon = new Salon(Long.MAX_VALUE, "", new City("", ""));
//        LocalDateTime dateTime = LocalDateTime.now();
//        TreatmentType treatmentType = TreatmentType.AESTHETIC;
//        Appointment appointment = new Appointment();
//        appointment.setDog(dog);
//        appointment.setSalon(salon);
//        appointment.setDateTime(dateTime);
//        appointment.setTreatmentType(treatmentType);
//        appointmentTableModel.add(appointment);
        AddForm af = new AddForm();
        af.setVisible(true);
        af.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnAddAppointmentActionPerformed

    private void mniEditDogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEditDogsActionPerformed
        DogForm dogForm = new DogForm();
        dogForm.setVisible(true);
        dogForm.setLocationRelativeTo(this);
        dogForm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_mniEditDogsActionPerformed

    private void mniEditPersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEditPersonsActionPerformed
        PersonForm personForm = new PersonForm();
        personForm.setVisible(true);
        personForm.setLocationRelativeTo(this);
        personForm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_mniEditPersonsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brtViewAll;
    private javax.swing.JButton btnAddAppointment;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRemoveAppointment;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbSalonFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mniEditDogs;
    private javax.swing.JMenuItem mniEditPersons;
    private javax.swing.JTable tblAppointments;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        try {
            List<Appointment> appointments = new DatabaseRepository().getAppointments();
            tblAppointments.setModel(new AppointmentTableModel(appointments));
            tblAppointments.setAutoCreateRowSorter(true);
            tblAppointments.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            fillComboDog();
            fillComboSalon();
            fillComboTreatmentType();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void populateForm(Salon salonFilter) {
        try {
            List<Appointment> appointments = new DatabaseRepository().getAppointments(salonFilter);
            tblAppointments.setModel(new AppointmentTableModel(appointments));
            tblAppointments.setAutoCreateRowSorter(true);

            fillComboDog();
            fillComboSalon();
            fillComboTreatmentType();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void populateComboSalonFilter() {
        cmbSalonFilter.setModel(new DefaultComboBoxModel(new DatabaseRepository().getSalons().toArray()));
        cmbSalonFilter.setSelectedItem(null);
    }

    private void fillComboDog() {
        TableColumnModel tcm = tblAppointments.getColumnModel();
        TableColumn columnDog = tcm.getColumn(1);

        JComboBox comboDog = new JComboBox(new DefaultComboBoxModel(new DatabaseRepository().getDogs().toArray()));
        columnDog.setCellEditor(new DefaultCellEditor(comboDog));
        comboDog.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));

    }

    private void fillComboSalon() {
        TableColumnModel tcm = tblAppointments.getColumnModel();
        TableColumn columnDog = tcm.getColumn(2);

        JComboBox comboSalon = new JComboBox(new DefaultComboBoxModel(new DatabaseRepository().getSalons().toArray()));
        columnDog.setCellEditor(new DefaultCellEditor(comboSalon));
        comboSalon.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
    }

    private void fillComboTreatmentType() {
        TableColumnModel tcm = tblAppointments.getColumnModel();
        TableColumn columnDog = tcm.getColumn(5);

        JComboBox comboTreatmentType = new JComboBox(new DefaultComboBoxModel(TreatmentType.values()));
        columnDog.setCellEditor(new DefaultCellEditor(comboTreatmentType));
        comboTreatmentType.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
    }
}
