import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.text.DefaultEditorKit;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.*;
//import java.util.List; 
import java.awt.List;
import java.util.Scanner;
import javax.swing.event.MenuListener;
import javax.swing.event.*;
import javax.swing.KeyStroke;
import java.awt.Toolkit;


class Menu_Demo1 implements ActionListener, MenuListener{
    JFrame fr; JMenuBar mb; 
	JMenu file, edit, settings, games, italicFont, normalFont;
    	JMenuItem new1, open, save, saveAs, exit, cut, copy, paste, g1, g2, font, openFile, selectAll;
    	JTextArea ta;

	public Menu_Demo1()
{
	fr = new JFrame("Untitled");
	fr.setSize(500,500); fr.setTitle("SlutPad");    //fr.setDefaultCloseOperation(EXIT_ON_CLOSE); //Closes when you hit X button
	//fr.setLayout(null);
	ta = new JTextArea();        ta.setFont(new Font("Times New Roman", Font.BOLD, 50)); 
	mb = new JMenuBar();
	file = new JMenu("File");
	edit = new JMenu("Edit");
	settings = new JMenu("Settings");
	games = new JMenu("Games");
	
	italicFont = new JMenu("I");     italicFont.setFont(new Font("Default", Font.ITALIC, 13));
	normalFont = new JMenu("A");     normalFont.setFont(new Font("Default", Font.BOLD, 13));
	selectAll = new JMenuItem("Select All"); 


	new1 = new JMenuItem("New", 'N');
	openFile = new JMenuItem("Open", 'O');
	save = new JMenuItem("Save", 'S'); 
	saveAs = new JMenuItem("Save as..", 'V');           
	//openFile.setShortcut(new MenuShortcut(KeyEvent.VK_0, false));	
	exit = new JMenuItem("Exit", 'E');
	cut = new JMenuItem(new DefaultEditorKit.CutAction()); 
	copy = new JMenuItem(new DefaultEditorKit.CopyAction()); 
	paste = new JMenuItem(new DefaultEditorKit.PasteAction()); 
	font = new JMenuItem("Font");
	g1 = new JMenuItem("GG");
	g2 = new JMenuItem("GGG"); fr.add(ta, BorderLayout.CENTER);
	file.add(new1); file.addSeparator(); file.add(openFile); file.addSeparator(); file.add(save); file.addSeparator();file.add(saveAs);file.addSeparator(); file.add(exit);
	edit.add(cut); edit.addSeparator(); edit.add(copy); edit.addSeparator(); edit.add(paste);  
	settings.add(font); settings.addSeparator(); settings.add(games); games.add(g1); games.addSeparator(); games.add(g2);
	mb.add(file); mb.add(edit); mb.add(settings);mb.add(italicFont);mb.add(normalFont); mb.add(selectAll);
fr.add(ta);
	fr.setJMenuBar(mb); exit.addActionListener(this); fr.setVisible(true); cut.addActionListener(this);
	copy.addActionListener(this);paste.addActionListener(this); new1.addActionListener(this);
	saveAs.addActionListener(this);  openFile.addActionListener(this);        
	save.addActionListener(this);	selectAll.addActionListener(this);

	//italicFont.addActionListener(this); normalFont.addActionListener(this); 
	italicFont.addMenuListener(this);
	//normalFont.addMenuListener(new SampleMenuListener());
	normalFont.addMenuListener(this);

       //KEYBOARD SHORTCUTS
	KeyStroke ctrlS = KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());
	KeyStroke ctrlO = KeyStroke.getKeyStroke(KeyEvent.VK_O, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());
	KeyStroke ctrlN = KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
	KeyStroke ctrlV = KeyStroke.getKeyStroke(KeyEvent.VK_V, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
	KeyStroke ctrlE = KeyStroke.getKeyStroke(KeyEvent.VK_E, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());

	save.setAccelerator(ctrlS);
	openFile.setAccelerator(ctrlO);
	new1.setAccelerator(ctrlN);
	saveAs.setAccelerator(ctrlV);
	exit.setAccelerator(ctrlE);



	
	
	
        //setMenuBar(this.menuBar);
        //menuBar.add(this.file);
        //menuBar.add(this.fonts);
        //file.setLabel("File");
	//fonts.setLabel("Fonts");
        //italicFont.setLabel("Italic");
        //normalFont.setLabel("Normal");
        //fonts.add(this.italicFont);
        //openFile.setLabel("Open");
        //fonts.add(this.normalFont);
        //italicFont.addActionListener(this);
        //normalFont.addActionListener(this);
        //file.add(this.openFile);
        //saveFile.setLabel("Save");
        //saveFile.addActionListener(this);
        //save.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
        //file.add(this.saveFile);
        //close.setLabel("Close");
        //close.setShortcut(new MenuShortcut(KeyEvent.VK_F4, false));
        //close.addActionListener(this);
        //file.add(this.close);


    }
	
    /*public void actionPerformed (ActionEvent e) {*/

           /* if (e.getSource() == this.close)
                this.dispose(); */

            

                        /* FOR SAVE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
	
	
	
	
	
	
	
	
	
	
public void actionPerformed(ActionEvent e) 
{
    if(e.getSource() == exit)
	{
	    System.exit(0);
	}
    else if(e.getSource() == cut)
	{
		Action cutAction = new DefaultEditorKit.CutAction();
		cutAction.putValue(Action.NAME, "Cut");  
	}
	else if(e.getSource() == copy)
	{
		Action copyAction = new DefaultEditorKit.CopyAction();
		copyAction.putValue(Action.NAME, "Copy");  
	}
	else if(e.getSource() == paste)
	{
		Action pasteAction = new DefaultEditorKit.PasteAction();
		pasteAction.putValue(Action.NAME, "");  
	}
	else if(e.getSource() == selectAll)
	{
		//Action selectAllAction = new DefaultEditorKit.SelectAllAction();
		//selectAllAction.putValue
	}
	else if(e.getSource() == new1)
    	{
		JFrame fr2 = new JFrame();
		fr2.setSize(500,500);
		fr2.setLayout(null);
		fr2.setVisible(true);
		//Object a = "Do you want to open a new Frame?";
		//int i = JOptionPane.showOptionDialog(JFrame fr, a, );
		//if(i==1)
		//{

		//	 JInternalFrame jif = new JInternalFrame("Untitled"+(fr.getTitle+1));
		//}
    	}
	else if(e.getSource() == saveAs)
	{
		String filename = JOptionPane.showInputDialog("Name this file");
        	JFileChooser savefile = new JFileChooser();
        	savefile.setSelectedFile(new File(filename));
        	BufferedWriter writer;
        	int sf = savefile.showSaveDialog(null);
        	if(sf == JFileChooser.APPROVE_OPTION){
            		try {
                		writer = new BufferedWriter(new FileWriter(savefile.getSelectedFile()));
                		//text.write(writer);
                		writer.close();
                JOptionPane.showMessageDialog(null, "File has been saved","File Saved",JOptionPane.INFORMATION_MESSAGE);
                		// true for rewrite, false for override

            			} catch (IOException er) { er.printStackTrace();}
        	}
		else if(sf == JFileChooser.CANCEL_OPTION){
            		JOptionPane.showMessageDialog(null, "File save has been canceled");
		}
	
		/*List lst = new List();
		JFileChooser jfc = new JFileChooser();
		File f = jfc.getSelectedFile();
		jfc.setSelectedFile(f);
		if ( jfc.showSaveDialog(jfc)==
                   JFileChooser.APPROVE_OPTION){
               //File f = jfc.getSelectedFile();
               int size = (int) f.length();
               char ch[] = new char [size];

               try{
               FileWriter fw = new FileWriter(f);
               fw.write(ch,0,size);
               fw.close();
               } catch (FileNotFoundException ex){
                   System.err.println("File unable to save");
               }catch (IOException excp){
                   System.err.println("IO");
               }

              String s = new String (ch);
              lst.getData(s);
              repaint();*/
	}
	else if (e.getSource() == this.openFile) {
                JFileChooser open = new JFileChooser(); 
                int option = open.showOpenDialog(null); 

                if (option == JFileChooser.APPROVE_OPTION) {
                    this.ta.setText(""); 
                    try {
			Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));
                        while (scan.hasNext()) 
                            this.ta.append(scan.nextLine() + "\n"); 
                                } catch (Exception ex) { 

                                System.out.println(ex.getMessage());
                                }   
                            }
                        }
	/*else if (e.getSource() == this.italicFont) {
		this.ta.setFont(new Font("Times New Roman", Font.ITALIC, 12));
         }
    else if (e.getSource() == this.normalFont) {
		this.ta.setFont(new Font("Century Gothic", Font.BOLD, 12));
         }*/
		 
	else if (e.getSource() == this.save) {
                            JFileChooser save = new JFileChooser(); 
                            int option = save.showSaveDialog(null); 

                            if (option == JFileChooser.APPROVE_OPTION) {
                                try {

                                    BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
                                    out.write(this.ta.getText()); 
                                    out.close(); 
                                } catch (Exception ex) { 
                                    System.out.println(ex.getMessage());
                                }
                            }
                        }
	}
	
	
	public void menuSelected(MenuEvent ef) {
		if (ef.getSource() == this.italicFont) {
                       // String b = ta.getText(); b.setFont(new Font("Times New Roman", Font.ITALIC,12));
			this.ta.setFont(new Font("Times New Roman", Font.ITALIC, 12));
                         }
         
		else if (ef.getSource() == this.normalFont) {
		        //String a = ta.getText(); a.setFont(new Font("Timesa New Roman", Font.ITALIC,12));
			this.ta.setFont(new Font("Times New Roman", Font.BOLD, 12));
                         }


    }
	public void menuDeselected(MenuEvent eff) {
			ta.setFont(new Font("Times New Roman", Font.BOLD, 50)); 
	    
		//ta.setFont(new Font("Century Gothic", Font.BOLD, 12));
        //System.out.println("menuDeselected");
    } 
    public void menuCanceled(MenuEvent e) {
        //System.out.println("menuCanceled");
    }
	
	
	
	public static void main(String[] args)
	{
		new Menu_Demo1();
	}
}
  
