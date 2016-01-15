/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lc.project.src;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import lc.project.grammar.ETLexer;
import lc.project.grammar.ETParser;

import org.antlr.runtime.RecognitionException;

/**
 *
 * @author Hiraishin
 */
public class MainFrame extends javax.swing.JFrame {

    private Vector<Exam> exams;
    private String[] columns;
    private Object[][] data;
    private LocalDateTime[] days;
    private int weekIndex;    
    private Vector<Exam> list;
    private Vector<Integer> rows;
    private Vector<Integer> cols;
    private Vector<Color> colors;
    private String actualYear;
           
    /**
     * Creates new form MainFrame
     * @param data
     * @param days
     */
    public MainFrame() { 
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/logo.png")));
        weekIndex = 1;
        //setDataForTable();            
        initComponents();
        rows = new Vector<>();
        cols = new Vector<>();
        colors = new Vector<>();
    }

    private Vector<String> getTimes()
    {
        Vector<String> times = new Vector<>();
        
        for (int i = 8; i < 19; i++)
            if(i <  10)
                times.add("0" + i + ".00");
            else
                times.add(i + ".00");
        
        return times;
    }
    
    private Exam getFirstExam()
    {
        Exam e;
        e = exams.get(0);
        for (int i = 0; i < exams.size(); i++)
            if(e.getTime().isAfter(exams.get(i).getTime()))
                e = exams.get(i);        
        return e;        
    }
    
    private Exam getLastExam()
    {
        Exam e;
        e = exams.get(0);
        for (int i = 0; i < exams.size();i++)
            if(e.getTime().isBefore(exams.get(i).getTime()))
                e = exams.get(i);
        
        return e;
        
    }
        
    private boolean getActualColumns()
    {
        columns = null;
        days = null;
        Exam firstExam = getFirstExam();
        Exam lastExam = getLastExam();
        LocalDateTime dt;
        
      
        dt = firstExam.getTime().plusDays((weekIndex*7));
        
        if (dt.isBefore(lastExam.getTime()) || lastExam.getTime().plusDays(7).isAfter(dt) || firstExam.getTime().isEqual(lastExam.getTime()))
        {
           
                columns = new String[8];
                days = new LocalDateTime[7];
                columns[0] = "Orario";

                actualYear = ""+ dt.minusDays(7).getYear(); //+ "/" + (dt.minusDays(7).getYear() + 1);
                LocalDateTime now;

                for(int i = 1; i < 8; i++)
                {
                  now = dt.minusDays(8 - i);
                  days[i-1] = now;
                  String actualDay =  now.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ITALIAN)+ " " + now.getDayOfMonth() + "/" + now.getMonth().getValue();
                  columns[i] = actualDay;
                }
            return true;
        }  
        
        return false;
    } 
    
    private boolean setDataForTable()
    {
        if(!getActualColumns())
        //if(columns == null && days == null)
           return false;
        
        Object[] times = getTimes().toArray();     
        
        Object[] line = new Object[columns.length];
       
        data = new Object[times.length][columns.length];
        
        for(int i = 0; i < times.length; i++)
             for(int j = 0; j < columns.length; j++)
                 data[i][j] = "";                 
        
        rows = new Vector<Integer>();
        cols = new Vector<Integer>();
        colors = new Vector<Color>();
        
      for(int k=0; k < exams.size(); k++)
      {
        Exam t = exams.get(k);
          for(int i = 0; i < times.length; i++)
             for(int j = 0; j < columns.length; j++){
                // data[i][j] = new Object();
                if(j == 0) data[i][j] = times[i];
                else{
                    
                    String year = (""+days[j-1].getYear());
                    int day = days[j-1].getDayOfMonth();
                    int month =  days[j-1].getMonth().getValue();                   
                    String ggmmyy = (day < 10? ("0" + day):day)  + "/" + (month < 10? ("0" + month):month) + "/" + year.substring(year.length() - 2);
                    //System.out.println("ggmmyy = " + ggmmyy);
                    
                    if(t.getHour().substring(0,2).equals(data[i][0].toString().substring(0,2)) && t.getDay().equals(ggmmyy)){
                                data[i][j] = t.getName();
                                rows.add(i);
                                cols.add(j);
                                colors.add(t.getColor());
                    }           
                    
                }                
            }
        }      
      return true;
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doneLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        nextLabel = new javax.swing.JLabel();
        picLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examsTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        textExams = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ExamTable");
        setMinimumSize(new java.awt.Dimension(590, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        doneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bottonenonpre1.png"))); // NOI18N
        doneLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                doneLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                doneLabelMouseReleased(evt);
            }
        });
        getContentPane().add(doneLabel);
        doneLabel.setBounds(390, 50, 134, 80);

        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bottonesxnonpre.png"))); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backLabelMouseReleased(evt);
            }
        });
        getContentPane().add(backLabel);
        backLabel.setBounds(200, 390, 50, 20);

        nextLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bottonedxnonpre.png"))); // NOI18N
        nextLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nextLabelMouseReleased(evt);
            }
        });
        getContentPane().add(nextLabel);
        nextLabel.setBounds(350, 390, 50, 20);

        picLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/picnonpre.png"))); // NOI18N
        picLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                picLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                picLabelMouseReleased(evt);
            }
        });
        getContentPane().add(picLabel);
        picLabel.setBounds(360, 150, 190, 20);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/baseprova.png"))); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 610, 420);

        examsTable.setEnabled(false);
        jScrollPane1.setViewportView(examsTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 550, 200);

        textExams.setColumns(20);
        textExams.setRows(5);
        textExams.setBorder(null);
        jScrollPane2.setViewportView(textExams);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 30, 310, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMousePressed
        // TODO add your handling code here:
        
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/bottonepre1.png"));
        doneLabel.setIcon(image);
        
        String[] lines = textExams.getText().split("\\n");
        ETParser parser = new ETParser();
        ETLexer lexer = new ETLexer();
        int i = 0;
        while (i < lines.length)
        {
            try { 
                parser.process(lines[i]);
                
            } catch (RecognitionException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                //JOptionPane.showMessageDialog(this,"Errore!");
                return;
            }
            i++;
        }
        
        // Check if there are errors in input
        
        System.out.println("Parser: " + parser.getErrors().toString());
  
        
        if(parser.getErrors().toString().equals("[]")){
            exams = parser.getExams();
            list = exams;
            setDataForTable();
            setTable();  
        }
        else
        {
            JOptionPane.showMessageDialog(textExams,
                     "There are errors! Remember, the syntax is:\n "
                    + "add exam_name on date(DD/MM/YY) at time(hh.mm) color green/red/yellow/...", "Warning", JOptionPane.ERROR_MESSAGE);
           
        }
             
    }//GEN-LAST:event_doneLabelMousePressed

    private void doneLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseReleased
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/bottonenonpre1.png"));
        doneLabel.setIcon(image);
    }//GEN-LAST:event_doneLabelMouseReleased

    private void backLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMousePressed
        // TODO add your handling code here:
         ImageIcon image = new ImageIcon(getClass().getResource("/Images/bottonesxpre.png"));
        backLabel.setIcon(image);
        
        if (weekIndex > 1 && !getFirstExam().getTime().isEqual(getLastExam().getTime()))
        {
          weekIndex--;
          setDataForTable();
          setTable();            
        }        
    }//GEN-LAST:event_backLabelMousePressed

    private void backLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseReleased
        // TODO add your handling code here:
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/bottonesxnonpre.png"));
        backLabel.setIcon(image);
    }//GEN-LAST:event_backLabelMouseReleased

    private void nextLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextLabelMousePressed
        // TODO add your handling code here:
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/bottonedxpre.png"));
        nextLabel.setIcon(image);
        
        if(!getFirstExam().getTime().isEqual(getLastExam().getTime()))
        {
             weekIndex++;
             if(setDataForTable())
             {
              setTable();
             }else
               weekIndex--;
        }
    }//GEN-LAST:event_nextLabelMousePressed

    private void nextLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextLabelMouseReleased
        // TODO add your handling code here:
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/bottonedxnonpre.png"));
        nextLabel.setIcon(image);
    }//GEN-LAST:event_nextLabelMouseReleased

    private void picLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picLabelMousePressed
        // TODO add your handling code here:
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/picpre.png"));
        picLabel.setIcon(image);
        
        BufferedImage bi = new BufferedImage(585, 420, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = bi.createGraphics();
                g2.translate(0, -24);
                this.paint(g2);  
                g2.translate(25, 57);
                textExams.paint(g2);
                g2.translate(-10, 150);
                jScrollPane1.paint(g2);               
                
                try {
                    ImageIO.write(bi, "png", new File("tableImage.png"));
		} catch (IOException ioe) {
			System.out.println("write: " + ioe.getMessage());
		}                
    }//GEN-LAST:event_picLabelMousePressed

    private void picLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picLabelMouseReleased
        // TODO add your handling code here:
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon image = new ImageIcon(getClass().getResource("/Images/picnonpre.png"));
        picLabel.setIcon(image);
    }//GEN-LAST:event_picLabelMouseReleased
        
    private void setTable()
    {
        examsTable = new JTable(data,columns){

            @Override
            public Component prepareRenderer(TableCellRenderer renderer,
                int row, int column) {
                JLabel label = (JLabel) super.prepareRenderer(renderer, row, column);
                int k = 0;
                
                //System.out.println("ROW = " + row);
                //System.out.println("COLUMN = " + column);
                
                while(k < rows.size())
                {
                    if(row == rows.get(k) && column == cols.get(k))
                    {
                        label.setBackground(colors.get(k));
                        //System.out.println(""+ data[row][column].toString());
                        label.setText(data[row][column].toString());
                        return label;
                    }
                       
                 k++;
                }
                
               
                label.setBackground(Color.white);   
                label.setText(data[row][column].toString());
                

                return label;
            }

        };

        examsTable.setEnabled(false);
        jScrollPane1.setViewportView(examsTable);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel doneLabel;
    private javax.swing.JTable examsTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nextLabel;
    private javax.swing.JLabel picLabel;
    private javax.swing.JTextArea textExams;
    // End of variables declaration//GEN-END:variables
}