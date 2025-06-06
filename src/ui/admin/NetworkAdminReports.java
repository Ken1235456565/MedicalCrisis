/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.admin;

import Model.EcoSystem;
import Model.Network.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Role.Role;
import Model.User.UserAccount;
import Model.User.UserAccountDirectory;
import java.awt.CardLayout;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class NetworkAdminReports extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    Network network;
    Enterprise enterprise;
    Organization organization;
    UserAccountDirectory userAccountDirectory;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewDetailsNetwork = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExportAllToCSV = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        btnViewDetailsOrgnization = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRole = new javax.swing.JTable();
        btnViewDetailsEnterprise = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNetwork = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnSearchInNetworkTable = new javax.swing.JButton();
        btnSearchInEnterpriseTable = new javax.swing.JButton();
        btnSearchInOrganizationTable = new javax.swing.JButton();
        btnSearchInRolesTable = new javax.swing.JButton();
        txtSearchInNetwork = new javax.swing.JTextField();
        txtSearchInEnterprise = new javax.swing.JTextField();
        txtSearchInOrganization = new javax.swing.JTextField();
        txtSearchInRole = new javax.swing.JTextField();

        btnViewDetailsNetwork.setText("View Details");
        btnViewDetailsNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsNetworkActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setText("Network Personel Admin Reports");

        btnExportAllToCSV.setText("Export all to csv");
        btnExportAllToCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportAllToCSVActionPerformed(evt);
            }
        });

        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Enterprise ID", "Enterprise Name", "Type", "Description", "Manager"
            }
        ));
        jScrollPane1.setViewportView(tblEnterprise);

        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Organization ID", "Organization Name", "Type", "Description", "Manager"
            }
        ));
        jScrollPane2.setViewportView(tblOrganization);

        btnViewDetailsOrgnization.setText("View Details");
        btnViewDetailsOrgnization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsOrgnizationActionPerformed(evt);
            }
        });

        tblRole.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Roles ID", "Roles Name", "Type", "Description", "Manager"
            }
        ));
        jScrollPane3.setViewportView(tblRole);

        btnViewDetailsEnterprise.setText("View Details");
        btnViewDetailsEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsEnterpriseActionPerformed(evt);
            }
        });

        tblNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Network ID", "Network Name", "Type", "Description", "Manager"
            }
        ));
        jScrollPane4.setViewportView(tblNetwork);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel12.setText("Search:");

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel13.setText("Search:");

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel14.setText("Search:");

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel15.setText("Search:");

        btnSearchInNetworkTable.setText("Search");
        btnSearchInNetworkTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchInNetworkTableActionPerformed(evt);
            }
        });

        btnSearchInEnterpriseTable.setText("Search");
        btnSearchInEnterpriseTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchInEnterpriseTableActionPerformed(evt);
            }
        });

        btnSearchInOrganizationTable.setText("Search");
        btnSearchInOrganizationTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchInOrganizationTableActionPerformed(evt);
            }
        });

        btnSearchInRolesTable.setText("Search");
        btnSearchInRolesTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchInRolesTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchInEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnSearchInEnterpriseTable, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewDetailsEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchInNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnSearchInNetworkTable, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewDetailsNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchInOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnSearchInOrganizationTable, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewDetailsOrgnization, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 601, Short.MAX_VALUE)
                                .addComponent(btnExportAllToCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchInRole, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnSearchInRolesTable, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(310, 310, 310))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetailsNetwork)
                    .addComponent(jLabel12)
                    .addComponent(btnSearchInNetworkTable)
                    .addComponent(txtSearchInNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetailsEnterprise)
                    .addComponent(jLabel13)
                    .addComponent(btnSearchInEnterpriseTable)
                    .addComponent(txtSearchInEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetailsOrgnization)
                    .addComponent(jLabel14)
                    .addComponent(btnSearchInOrganizationTable)
                    .addComponent(txtSearchInOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(btnSearchInRolesTable)
                    .addComponent(txtSearchInRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExportAllToCSV)
                    .addComponent(btnBack))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.show(userProcessContainer, "AdminWorkAreaPanel");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExportAllToCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportAllToCSVActionPerformed

    }//GEN-LAST:event_btnExportAllToCSVActionPerformed

    private void btnViewDetailsNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsNetworkActionPerformed
    int row = tblNetwork.getSelectedRow();
    if (row < 0) {
        JOptionPane.showMessageDialog(this, "Please select a Network first.");
        return;
    }

    String networkId = tblNetwork.getValueAt(row, 0).toString();
    Network net = system.getNetworkDirectory().findNetworkById(networkId);
    if (net == null) {
        JOptionPane.showMessageDialog(this, "Selected Network not found.");
        return;
    }

    String msg = "Network ID: " + net.getId() +
                 "\nName: " + net.getName() +
                 "\nType: " + net.getType() +
                 "\nDescription: " + net.getDescription() +
                 "\nManager: " + net.getManager() +
                 "\nContact: " + (net.getContactInfo() != null ? net.getContactInfo().getContactNumber() : "N/A");
    
    JOptionPane.showMessageDialog(this, msg, "Network Details", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnViewDetailsNetworkActionPerformed

    private void btnViewDetailsEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsEnterpriseActionPerformed
    int row = tblEnterprise.getSelectedRow();
    if (row < 0) {
        JOptionPane.showMessageDialog(this, "Please select an Enterprise first.");
        return;
    }

    String entId = tblEnterprise.getValueAt(row, 0).toString();
    Enterprise ent = network.getEnterpriseDirectory().findEnterpriseById(entId);
    if (ent == null) {
        JOptionPane.showMessageDialog(this, "Selected Enterprise not found.");
        return;
    }

    String msg = "Enterprise ID: " + ent.getId() +
                 "\nName: " + ent.getName() +
                 "\nType: " + ent.getType() +
                 "\nDescription: " + ent.getDescription() +
                 "\nManager: " + ent.getManager() +
                 "\nContact Email: " + (ent.getContactInfo() != null ? ent.getContactInfo().getContactEmail() : "N/A");

    JOptionPane.showMessageDialog(this, msg, "Enterprise Details", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnViewDetailsEnterpriseActionPerformed

    private void btnViewDetailsOrgnizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsOrgnizationActionPerformed
    int row = tblOrganization.getSelectedRow();
    if (row < 0) {
        JOptionPane.showMessageDialog(this, "Please select an Organization first.");
        return;
    }

    String orgId = tblOrganization.getValueAt(row, 0).toString();
    Organization org = enterprise.getOrganizations().findOrganizationById(orgId);
    if (org == null) {
        JOptionPane.showMessageDialog(this, "Selected Organization not found.");
        return;
    }

    String msg = "Organization ID: " + org.getOrganizationId() +
                 "\nName: " + org.getOrganizationName() +
                 "\nType: " + org.getClass().getSimpleName() +
                 "\nManager: " + org.getAdmin() +
                 "\nLocation: " + (org.getContactInfo() != null ? org.getContactInfo().getLocation() : "N/A");

    JOptionPane.showMessageDialog(this, msg, "Organization Details", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnViewDetailsOrgnizationActionPerformed

    private void btnSearchInNetworkTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchInNetworkTableActionPerformed
    String keyword = txtSearchInNetwork.getText().trim().toLowerCase();

    List<Network> filtered = system.getNetworkDirectory()
        .getAllNetworks()
        .stream()
        .filter(net -> net.getName().toLowerCase().contains(keyword) || 
                       net.getDescription().toLowerCase().contains(keyword))
        .collect(Collectors.toList());

    populateNetworkTable(filtered);
    }//GEN-LAST:event_btnSearchInNetworkTableActionPerformed
private void populateNetworkTable(List<Network> networks) {
    DefaultTableModel model = (DefaultTableModel) tblNetwork.getModel();
    model.setRowCount(0);

    for (Network net : networks) {
        Object[] row = new Object[] {
            net.getId(),
            net.getName(),
            net.getType(),
            net.getDescription(),
            net.getManager()
        };
        model.addRow(row);
    }
}

    private void btnSearchInEnterpriseTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchInEnterpriseTableActionPerformed
    if (network == null) {
        JOptionPane.showMessageDialog(this, "Please select a Network first.");
        return;
    }

    String keyword = txtSearchInEnterprise.getText().trim().toLowerCase();

    List<Enterprise> filtered = network.getEnterpriseDirectory()
        .getEnterpriseList()
        .stream()
        .filter(ent -> ent.getName().toLowerCase().contains(keyword) || 
                       ent.getDescription().toLowerCase().contains(keyword))
        .collect(Collectors.toList());

    populateEnterpriseTable(filtered);
    }//GEN-LAST:event_btnSearchInEnterpriseTableActionPerformed
private void populateEnterpriseTable(List<Enterprise> enterprises) {
    DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();
    model.setRowCount(0);

    for (Enterprise ent : enterprises) {
        Object[] row = new Object[] {
            ent.getId(),
            ent.getName(),
            ent.getType(),
            ent.getDescription(),
            ent.getManager()
        };
        model.addRow(row);
    }
}

    private void btnSearchInOrganizationTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchInOrganizationTableActionPerformed
    if (enterprise == null) {
        JOptionPane.showMessageDialog(this, "Please select an Enterprise first.");
        return;
    }

    String keyword = txtSearchInOrganization.getText().trim().toLowerCase();

    List<Organization> filtered = enterprise.getOrganizations()
        .getOrganizationList()
        .stream()
        .filter(org -> org.getOrganizationName().toLowerCase().contains(keyword))
        .collect(Collectors.toList());

    populateOrganizationTable(filtered);
    }//GEN-LAST:event_btnSearchInOrganizationTableActionPerformed
private void populateOrganizationTable(List<Organization> organizations) {
    DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();
    model.setRowCount(0);

    for (Organization org : organizations) {
        Object[] row = new Object[] {
            org.getOrganizationId(),     // 假设你有这个字段
            org.getOrganizationName(),
            org.getClass().getSimpleName(),  // 类型
            org.getDescription(),        // 可选
            org.getAdmin()             // 可选
        };
        model.addRow(row);
    }
}

    private void btnSearchInRolesTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchInRolesTableActionPerformed
    if (organization == null) {
        JOptionPane.showMessageDialog(this, "Please select an Organization first.");
        return;
    }

    String keyword = txtSearchInRole.getText().trim().toLowerCase();

    List<Role> filtered = organization.getRoleDirectory().getRoleList()
        .stream()
        .filter(role -> role.getClass().getSimpleName().toLowerCase().contains(keyword))
        .collect(Collectors.toList());

    populateRoleTable(filtered);
    }//GEN-LAST:event_btnSearchInRolesTableActionPerformed
private void populateRoleTable(List<Role> roles) {
    DefaultTableModel model = (DefaultTableModel) tblRole.getModel();
    model.setRowCount(0);

    for (Role role : roles) {
        Object[] row = new Object[] {
            role.getId(),  // 如果你有 roleId
            role.getClass().getSimpleName(), // 类名代表角色类型
            role.getDescription()  // 如果有描述
        };
        model.addRow(row);
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExportAllToCSV;
    private javax.swing.JButton btnSearchInEnterpriseTable;
    private javax.swing.JButton btnSearchInNetworkTable;
    private javax.swing.JButton btnSearchInOrganizationTable;
    private javax.swing.JButton btnSearchInRolesTable;
    private javax.swing.JButton btnViewDetailsEnterprise;
    private javax.swing.JButton btnViewDetailsNetwork;
    private javax.swing.JButton btnViewDetailsOrgnization;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTable tblNetwork;
    private javax.swing.JTable tblOrganization;
    private javax.swing.JTable tblRole;
    private javax.swing.JTextField txtSearchInEnterprise;
    private javax.swing.JTextField txtSearchInNetwork;
    private javax.swing.JTextField txtSearchInOrganization;
    private javax.swing.JTextField txtSearchInRole;
    // End of variables declaration//GEN-END:variables
}
