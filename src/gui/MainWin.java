// Main GUI window for VSEGRAF project
// 
// @author Alois Seckar [ ellrohir@seznam.cz ]
// @version 0.1
//
// Last modified: 2015-02-02 0028 GMT by Alois Seckar

package gui;

import db.DBHandler;
import db.KBEntry;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ellrohir
 */
public class MainWin extends javax.swing.JFrame {
    
    private static final MainWin instance = new MainWin();

    /**
     * Creates new form MainWin
     */
    private MainWin() {
        initComponents();
        finalizeComponents();
    }
    
    public static MainWin getInstance() {
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JTabbedPane();
        canvasPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        kbPanel = new javax.swing.JPanel();
        kbIndexLabel = new javax.swing.JLabel();
        kbContentsTitle = new javax.swing.JLabel();
        kbContentsCategoryLabel = new javax.swing.JLabel();
        kbContentsCategory = new javax.swing.JLabel();
        kbContentsEditTitleButton = new javax.swing.JButton();
        kbIndexScrollPane = new javax.swing.JScrollPane();
        kbList = new javax.swing.JList();
        kbContentsScrollPane = new javax.swing.JScrollPane();
        kbContentsTextArea = new javax.swing.JTextArea();
        kbIndexRefreshButton = new javax.swing.JButton();
        kbContentsEditButton = new javax.swing.JButton();
        kbContentsSaveButton = new javax.swing.JButton();
        kbContentsNewButton = new javax.swing.JButton();
        kbContentsDeleteButton = new javax.swing.JButton();
        sidePanel = new javax.swing.JPanel();
        palettePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        paletteCategorySelect = new javax.swing.JComboBox();
        paletteElementsPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mainMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newGraphMenuItem = new javax.swing.JMenuItem();
        loadGraphMenuItem = new javax.swing.JMenuItem();
        saveGraphMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exportPNGMenuItem = new javax.swing.JMenuItem();
        exportPDFMenuItem = new javax.swing.JMenuItem();
        exportXMLMenuItem = new javax.swing.JMenuItem();
        exportTXTMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        metadataMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        kbEntryMenuItem = new javax.swing.JMenuItem();
        optionsMenu = new javax.swing.JMenu();
        preferencesMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VSEGraf");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel4);

        javax.swing.GroupLayout canvasPanelLayout = new javax.swing.GroupLayout(canvasPanel);
        canvasPanel.setLayout(canvasPanelLayout);
        canvasPanelLayout.setHorizontalGroup(
            canvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );
        canvasPanelLayout.setVerticalGroup(
            canvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        mainPanel.addTab("Graph Canvas", canvasPanel);

        kbIndexLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kbIndexLabel.setText("Index");

        kbContentsTitle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kbContentsTitle.setText("Page");

        kbContentsCategoryLabel.setText("Category:");

        kbContentsCategory.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kbContentsCategory.setText("Cat");

        kbContentsEditTitleButton.setText("Edit");
        kbContentsEditTitleButton.setEnabled(false);
        kbContentsEditTitleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbContentsEditTitleButtonActionPerformed(evt);
            }
        });

        kbList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Index" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        kbIndexScrollPane.setViewportView(kbList);

        kbContentsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        kbContentsScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        kbContentsScrollPane.setPreferredSize(null);

        kbContentsTextArea.setEditable(false);
        kbContentsTextArea.setColumns(20);
        kbContentsTextArea.setLineWrap(true);
        kbContentsTextArea.setRows(5);
        kbContentsTextArea.setWrapStyleWord(true);
        kbContentsScrollPane.setViewportView(kbContentsTextArea);

        kbIndexRefreshButton.setText("Refresh");
        kbIndexRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbIndexRefreshButtonActionPerformed(evt);
            }
        });

        kbContentsEditButton.setText("Edit");
        kbContentsEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbContentsEditButtonActionPerformed(evt);
            }
        });

        kbContentsSaveButton.setText("Save");
        kbContentsSaveButton.setEnabled(false);
        kbContentsSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbContentsSaveButtonActionPerformed(evt);
            }
        });

        kbContentsNewButton.setText("New");
        kbContentsNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbContentsNewButtonActionPerformed(evt);
            }
        });

        kbContentsDeleteButton.setText("Delete");
        kbContentsDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbContentsDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kbPanelLayout = new javax.swing.GroupLayout(kbPanel);
        kbPanel.setLayout(kbPanelLayout);
        kbPanelLayout.setHorizontalGroup(
            kbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kbPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kbIndexLabel)
                    .addComponent(kbIndexRefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kbIndexScrollPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kbContentsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kbPanelLayout.createSequentialGroup()
                        .addGroup(kbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kbPanelLayout.createSequentialGroup()
                                .addComponent(kbContentsTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kbContentsEditTitleButton)
                                .addGap(116, 116, 116)
                                .addComponent(kbContentsCategoryLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kbContentsCategory))
                            .addGroup(kbPanelLayout.createSequentialGroup()
                                .addComponent(kbContentsEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kbContentsSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kbContentsNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kbContentsDeleteButton)))
                        .addGap(0, 107, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kbPanelLayout.setVerticalGroup(
            kbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kbPanelLayout.createSequentialGroup()
                .addGroup(kbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kbIndexLabel)
                    .addComponent(kbContentsTitle)
                    .addComponent(kbContentsEditTitleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kbContentsCategoryLabel)
                    .addComponent(kbContentsCategory))
                .addGap(4, 4, 4)
                .addGroup(kbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kbContentsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kbIndexScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kbIndexRefreshButton)
                    .addComponent(kbContentsEditButton)
                    .addComponent(kbContentsSaveButton)
                    .addComponent(kbContentsNewButton)
                    .addComponent(kbContentsDeleteButton))
                .addContainerGap())
        );

        mainPanel.addTab("Knowledge Base", kbPanel);

        palettePanel.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Palette");

        paletteCategorySelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Graph type 1", "Graph type 2", "Graph type 3" }));
        paletteCategorySelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paletteCategorySelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paletteElementsPanelLayout = new javax.swing.GroupLayout(paletteElementsPanel);
        paletteElementsPanel.setLayout(paletteElementsPanelLayout);
        paletteElementsPanelLayout.setHorizontalGroup(
            paletteElementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paletteElementsPanelLayout.setVerticalGroup(
            paletteElementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout palettePanelLayout = new javax.swing.GroupLayout(palettePanel);
        palettePanel.setLayout(palettePanelLayout);
        palettePanelLayout.setHorizontalGroup(
            palettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palettePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(palettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paletteCategorySelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(palettePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(paletteElementsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        palettePanelLayout.setVerticalGroup(
            palettePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palettePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paletteCategorySelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paletteElementsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Metadata");

        jLabel3.setText("Graph name");

        jLabel4.setText("Graph type");

        jLabel5.setText("Graph author");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sidePanelLayout.createSequentialGroup()
                        .addComponent(palettePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(palettePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        fileMenu.setText("File");

        newGraphMenuItem.setText("New graph");
        newGraphMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGraphMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newGraphMenuItem);

        loadGraphMenuItem.setText("Load graph");
        loadGraphMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadGraphMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadGraphMenuItem);

        saveGraphMenuItem.setText("Save graph");
        saveGraphMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveGraphMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveGraphMenuItem);
        fileMenu.add(jSeparator1);

        exportPNGMenuItem.setText("Export graph to PNG");
        exportPNGMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPNGMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exportPNGMenuItem);

        exportPDFMenuItem.setText("Export graph to PDF");
        exportPDFMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDFMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exportPDFMenuItem);

        exportXMLMenuItem.setText("Export data to XML");
        exportXMLMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportXMLMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exportXMLMenuItem);

        exportTXTMenuItem.setText("Export data to TXT");
        exportTXTMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportTXTMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exportTXTMenuItem);
        fileMenu.add(jSeparator2);

        exitMenuItem.setText("Exit program");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        mainMenuBar.add(fileMenu);

        editMenu.setText("Edit");

        metadataMenuItem.setText("Graph metadata");
        metadataMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metadataMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(metadataMenuItem);
        editMenu.add(jSeparator3);

        kbEntryMenuItem.setText("New KB entry");
        kbEntryMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbEntryMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(kbEntryMenuItem);

        mainMenuBar.add(editMenu);

        optionsMenu.setText("Options");

        preferencesMenuItem.setText("Preferences");
        preferencesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preferencesMenuItemActionPerformed(evt);
            }
        });
        optionsMenu.add(preferencesMenuItem);

        mainMenuBar.add(optionsMenu);

        helpMenu.setText("Help");

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        mainMenuBar.add(helpMenu);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kbIndexRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbIndexRefreshButtonActionPerformed
        // GET ENTRIES FROM DB AND TURN THEM INTO LIST
        DefaultListModel listModel = new DefaultListModel();
        Iterator itr = DBHandler.getListOfObjects("from KBEntry");
        while (itr.hasNext()) {
            KBEntry current = (KBEntry)itr.next();
            // TODO implement listing by categories
            listModel.addElement(current.getEntryTitle());
        }
        kbList.setModel(listModel);
    }//GEN-LAST:event_kbIndexRefreshButtonActionPerformed

    private void kbContentsEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbContentsEditButtonActionPerformed
        kbContentsTextArea.setEditable(!kbContentsTextArea.isEditable());
        kbContentsSaveButton.setEnabled(!kbContentsSaveButton.isEnabled());
        kbContentsEditTitleButton.setEnabled(!kbContentsEditTitleButton.isEnabled());
    }//GEN-LAST:event_kbContentsEditButtonActionPerformed

    private void kbContentsSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbContentsSaveButtonActionPerformed
        notImplemeted();
    }//GEN-LAST:event_kbContentsSaveButtonActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        ClosingAdapter adapter = new ClosingAdapter();
        adapter.windowClosing(null);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void newGraphMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGraphMenuItemActionPerformed
        notImplemeted();
    }//GEN-LAST:event_newGraphMenuItemActionPerformed

    private void loadGraphMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadGraphMenuItemActionPerformed
        notImplemeted();
    }//GEN-LAST:event_loadGraphMenuItemActionPerformed

    private void saveGraphMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveGraphMenuItemActionPerformed
        notImplemeted();
    }//GEN-LAST:event_saveGraphMenuItemActionPerformed

    private void exportPNGMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPNGMenuItemActionPerformed
        notImplemeted();
    }//GEN-LAST:event_exportPNGMenuItemActionPerformed

    private void exportPDFMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDFMenuItemActionPerformed
        notImplemeted();
    }//GEN-LAST:event_exportPDFMenuItemActionPerformed

    private void exportXMLMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportXMLMenuItemActionPerformed
        notImplemeted();
    }//GEN-LAST:event_exportXMLMenuItemActionPerformed

    private void exportTXTMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportTXTMenuItemActionPerformed
        notImplemeted();
    }//GEN-LAST:event_exportTXTMenuItemActionPerformed

    private void metadataMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metadataMenuItemActionPerformed
        notImplemeted();
    }//GEN-LAST:event_metadataMenuItemActionPerformed

    private void kbEntryMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbEntryMenuItemActionPerformed
        notImplemeted();
    }//GEN-LAST:event_kbEntryMenuItemActionPerformed

    private void preferencesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preferencesMenuItemActionPerformed
        notImplemeted();
    }//GEN-LAST:event_preferencesMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        JOptionPane.showMessageDialog(instance, "VSEGraf\n"
                + "Simple java graph designing tool for educational purposes\n\n"
                + "Authors: Alois Seckar, Tomas Skalicky\n\n"
                + "© 2015", 
                "VSEGraf", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void paletteCategorySelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paletteCategorySelectActionPerformed
        paletteElementsPanel.removeAll();
        switch (paletteCategorySelect.getSelectedIndex()) {
            case 1:
                paletteElementsPanel.add(new JButton("Blue line"));
                paletteElementsPanel.add(new JButton("Blue dot"));
                paletteElementsPanel.add(new JButton("Blue rectangle"));
                break;
            case 2:
                paletteElementsPanel.add(new JButton("Red line"));
                paletteElementsPanel.add(new JButton("Red dot"));
                paletteElementsPanel.add(new JButton("Red rectangle"));
                break;
            default:
                paletteElementsPanel.add(new JButton("Black line"));
                paletteElementsPanel.add(new JButton("Black dot"));
                paletteElementsPanel.add(new JButton("Black rectangle"));
        }
        paletteElementsPanel.revalidate();
    }//GEN-LAST:event_paletteCategorySelectActionPerformed

    private void kbContentsEditTitleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbContentsEditTitleButtonActionPerformed
        // inspired by:
        // http://stackoverflow.com/a/790224
        JTextField entryTitle = new JTextField(kbContentsTitle.getText());
        final JComponent[] inputs = new JComponent[] {
            new JLabel("Set title:"),
            entryTitle
        };
        JOptionPane.showMessageDialog(null, inputs, "VSEGraf - editing", 
                JOptionPane.PLAIN_MESSAGE);
        //
        kbContentsTitle.setText(entryTitle.getText());
    }//GEN-LAST:event_kbContentsEditTitleButtonActionPerformed

    private void kbContentsNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbContentsNewButtonActionPerformed
        notImplemeted();
    }//GEN-LAST:event_kbContentsNewButtonActionPerformed

    private void kbContentsDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbContentsDeleteButtonActionPerformed
        notImplemeted();
    }//GEN-LAST:event_kbContentsDeleteButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JPanel canvasPanel;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem exportPDFMenuItem;
    private javax.swing.JMenuItem exportPNGMenuItem;
    private javax.swing.JMenuItem exportTXTMenuItem;
    private javax.swing.JMenuItem exportXMLMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel kbContentsCategory;
    private javax.swing.JLabel kbContentsCategoryLabel;
    private javax.swing.JButton kbContentsDeleteButton;
    private javax.swing.JButton kbContentsEditButton;
    private javax.swing.JButton kbContentsEditTitleButton;
    private javax.swing.JButton kbContentsNewButton;
    private javax.swing.JButton kbContentsSaveButton;
    private javax.swing.JScrollPane kbContentsScrollPane;
    private javax.swing.JTextArea kbContentsTextArea;
    private javax.swing.JLabel kbContentsTitle;
    private javax.swing.JMenuItem kbEntryMenuItem;
    private javax.swing.JLabel kbIndexLabel;
    private javax.swing.JButton kbIndexRefreshButton;
    private javax.swing.JScrollPane kbIndexScrollPane;
    private javax.swing.JList kbList;
    private javax.swing.JPanel kbPanel;
    private javax.swing.JMenuItem loadGraphMenuItem;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JTabbedPane mainPanel;
    private javax.swing.JMenuItem metadataMenuItem;
    private javax.swing.JMenuItem newGraphMenuItem;
    private javax.swing.JMenu optionsMenu;
    private javax.swing.JComboBox paletteCategorySelect;
    private javax.swing.JPanel paletteElementsPanel;
    private javax.swing.JPanel palettePanel;
    private javax.swing.JMenuItem preferencesMenuItem;
    private javax.swing.JMenuItem saveGraphMenuItem;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables

    private void finalizeComponents() {
        // maximize window
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        // add window listener for closing
        // http://stackoverflow.com/questions/15449022
        this.addWindowListener(new ClosingAdapter());
        // application icon
        // inspired by http://stackoverflow.com/a/15657672
        File url = new File("images/favicon.png");
        try {
            ImageIcon icon = new ImageIcon(ImageIO.read(url));
            this.setIconImage(icon.getImage()); 
        } catch (Exception e) { 
            // TODO log error
        }
        
        // refresh knowledge base list and select index
        kbIndexRefreshButtonActionPerformed(null);
        // validate palette contents
        paletteElementsPanel.setLayout(new BoxLayout(paletteElementsPanel, 
                BoxLayout.Y_AXIS));
        paletteCategorySelectActionPerformed(null);
        
        // http://stackoverflow.com/a/5609251
        MouseListener mouseListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount()>0) {
                   // get currently selected index entry
                   if (kbList.getSelectedIndex()<0) {
                       kbList.setSelectedIndex(0);
                   }
                   String selectedItem = (String) kbList.getSelectedValue();
                   // load entry data from db
                   KBEntry entry = (KBEntry)DBHandler
                           .getSingleObject("from KBEntry where entryTitle='" 
                                   + selectedItem + "'");
                   // fill gui elements with data
                   kbContentsTitle.setText(entry.getEntryTitle());
                   kbContentsCategory.setText(entry.getEntryCat());
                   kbContentsTextArea.setText(entry.getEntryBody());
                 }
            }
        };
        kbList.addMouseListener(mouseListener);       
    }
    
    private void notImplemeted() {
        JOptionPane.showMessageDialog(instance, "Not implemented yet...", 
                "VSEGraf", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static class ClosingAdapter extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent we) { 
            String ObjButtons[] = {"Yes", "No"};
            int PromptResult = JOptionPane.showOptionDialog(null,
                    "Exit program?", "VSEGraf",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
                    null, ObjButtons, ObjButtons[1]);
            if(PromptResult==0) {
                System.exit(0);
            }
        }
    }

}