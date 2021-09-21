import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.imageio.*;


public class TopFiveDestinationList {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	// Created a new JFrame with a Grid Layout called TopDestinationGridLayoutFrame
            	TopDestinationGridLayoutFrame topDestinationListFrame = new TopDestinationGridLayoutFrame();
            	topDestinationListFrame.setTitle("SNHU Travel's Top 5 Destination List");
                topDestinationListFrame.setVisible(true);
                
                // Added an icon image to resources package and set it as Frame icon
                ImageIcon snhuTravelIcon = new ImageIcon(getClass().getResource("/resources/SNHU_Icon_50_50.png"));
                topDestinationListFrame.setIconImage(snhuTravelIcon.getImage());
                
                // Created a buffer variable and a new Grid Layout for the parentPanel JPanel
                // Created the parentPanel JPanel capable of holding three internal JPanels in one column
                final int theJLabelBuffer = 20;
                GridLayout destinationsGridLayout = new GridLayout(3, 1);
                JPanel parentPanel = new JPanel(destinationsGridLayout);
                parentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                destinationsGridLayout.setHgap(theJLabelBuffer);
                destinationsGridLayout.setVgap(theJLabelBuffer);
                topDestinationListFrame.getContentPane().add(parentPanel);
                
                // Created a new Grid Layout for the namePanel JPanel
                // Created the namePanel JPanel
                // Layout row count increased to 7 in order to move internal JLabels up
                GridLayout nameGridLayout = new GridLayout(7, 1);
                destinationsGridLayout.setHgap(theJLabelBuffer);
                destinationsGridLayout.setVgap(theJLabelBuffer);
                JPanel namePanel = new JPanel(nameGridLayout);
                namePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                namePanel.setBackground(new Color(242, 121, 230, 30));
                
                // Created JLabels for namePanel header
                JLabel nameLabel = new JLabel("Amanda Purnhagen");
                JLabel professorLabel = new JLabel("Professor Tammy Morrison");
                JLabel courseLabel = new JLabel("CS 250: Software Development Life Cycle");
                JLabel dateLabel = new JLabel("19 September 2021");
                
                // Changed the Font family and size of above JLabels
                nameLabel.setFont(new Font("Georgia", Font.PLAIN, 18));
                professorLabel.setFont(new Font("Georgia", Font.PLAIN, 18));
                courseLabel.setFont(new Font("Georgia", Font.PLAIN, 18));
                dateLabel.setFont(new Font("Georgia", Font.PLAIN, 18));
                
                // Added above JLabels to the namePanel JPanel
                namePanel.add(nameLabel);
                namePanel.add(professorLabel);
                namePanel.add(courseLabel);
                namePanel.add(dateLabel);
                
                // Added the namePanel JPanel to the parentPanel JPanel
                parentPanel.add(namePanel);
                
                // Created a new Grid Layout for the topDestinationPanel JPanel
                // Created the topDestinationPanel JPanel
                JPanel topDestinationPanel = new JPanel(new GridLayout(0, 2));
                topDestinationPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                topDestinationPanel.setBackground(Color.PINK);
                topDestinationPanel.setOpaque(false);
                
                // Created JLabels for the Top Destination image and text and added it to the topDestinationPanel JPanel
                JLabel destImgOneLabel = new JLabel(new ImageIcon(getClass().getResource("/resources/Australia_347_260.jpg")));
                
                JEditorPane destOneText;
				destOneText = new JEditorPane("text/html", "<p style = \"font-family:Georgia; font-size:18px\">1. Top Destination: <b>Australia</b></p><br><br><p style = \"font-family:Georgia; font-size:12px\">Photo: Misaochan2, https://commons.wikimedia.org/wiki/<br>File:Surfers_Paradise_Beach.jpg</p>");
                destOneText.setBackground(new Color(242, 121, 230, 30));
                
                topDestinationPanel.add(destImgOneLabel);
                topDestinationPanel.add(destOneText);
                
                // Added the topDestinationPanel JPanel to the parentPanel JPanel
                parentPanel.add(topDestinationPanel);
                
                // Created the destinationsPanel JPanel with the capacity to hold 4 JLabels
                JPanel destinationsPanel = new JPanel();
                destinationsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            	GridLayout theGridLayout = new GridLayout(0, 4);
            	destinationsPanel.setLayout(theGridLayout);
                destinationsPanel.setOpaque(false);
                theGridLayout.setHgap(theJLabelBuffer);
                theGridLayout.setVgap(theJLabelBuffer);
                
                // Created the JLabels containing the images of the other top destinations
                JLabel destImgTwoLabel = new JLabel(new ImageIcon(getClass().getResource("/resources/Mount_Rainier_320_213.jpg")));
                JEditorPane destTwoText;
                destTwoText = new JEditorPane("text/html", "<p style = \"font-family:Georgia; font-size:14px\">2. <b>Mount Rainier</b></p><p style = \"font-family:Georgia; font-size:10px\">Photo: Chris Light, https://commons.wikimedia<br>.org/wiki/File:Paradise_2015<br>-06_406.jpg</p>");
                destTwoText.setBackground(new Color(242, 121, 230, 30));
                
                destinationsPanel.add(destImgTwoLabel);
                destinationsPanel.add(destTwoText);
                
                // Created the JLabels containing the images of the other top destinations
                JLabel destImgThreeLabel = new JLabel(new ImageIcon(getClass().getResource("/resources/California_320_213.jpg")));
                JEditorPane destThreeText;
                destThreeText = new JEditorPane("text/html", "<p style = \"font-family:Georgia; font-size:14px\">2. <b>California</b></p><p style = \"font-family:Georgia; font-size:10px\">Photo: Frank Schulenburg, https://commons.wikimedia<br>.org/wiki/File:Paradise_Cay,_<br>Marin_County.jpg</p>");
                destThreeText.setBackground(new Color(242, 121, 230, 30));
                
                destinationsPanel.add(destImgThreeLabel);
                destinationsPanel.add(destThreeText);
                
                // Created the JLabels containing the images of the other top destinations
                JLabel destImgFourLabel = new JLabel(new ImageIcon(getClass().getResource("/resources/Japan_320_213.jpg")));
                JEditorPane destFourText;
                destFourText = new JEditorPane("text/html", "<p style = \"font-family:Georgia; font-size:14px\">2. <b>Japan</b></p><p style = \"font-family:Georgia; font-size:10px\">Photo: NTooru, https://commons.wikimedia<br>.org/wiki/File:Tang_Paradise_<br>3.jpg</p>");
                destFourText.setBackground(new Color(242, 121, 230, 30));
                
                destinationsPanel.add(destImgFourLabel);
                destinationsPanel.add(destFourText);
                
                // Created the JLabels containing the images of the other top destinations
                JLabel destImgFiveLabel = new JLabel(new ImageIcon(getClass().getResource("/resources/Stockholm_320_213.jpg")));
                JEditorPane destFiveText;
                destFiveText = new JEditorPane("text/html", "<p style = \"font-family:Georgia; font-size:14px\">2. <b>Stockholm</b></p><p style = \"font-family:Georgia; font-size:10px\">Photo: Mywood, https://commons.wikimedia<br>.org/wiki/File:Birka_Paradise_<br>Stockholm.jpg</p>");
                destFiveText.setBackground(new Color(242, 121, 230, 30));
                
                destinationsPanel.add(destImgFiveLabel);
                destinationsPanel.add(destFiveText);
                
                //JLabel destImgThreeLabel = new JLabel(new ImageIcon(getClass().getResource("/resources/California_320_213.jpg")));
                //JLabel destImgFourLabel = new JLabel(new ImageIcon(getClass().getResource("/resources/Japan_320_213.jpg")));
                //JLabel destImgFiveLabel = new JLabel(new ImageIcon(getClass().getResource("/resources/Stockholm_320_213.jpg")));
                
                // Created the JLabels containing the text of the other top destinations
                /*
                JLabel destTxtThreeLabel = new JLabel("<html>" + "3. <b>California</b>; Photo: Frank Schulenburg, https://commons.wikimedia.org/wiki/File:Paradise_Cay,_Marin_County.jpg" + "</html>");
                JLabel destTxtFourLabel = new JLabel("<html>" + "4. <b>Japan</b>; Photo: NTooru, https://commons.wikimedia.org/wiki/File:Tang_Paradise_3.jpg" + "</html>");
                JLabel destTxtFiveLabel = new JLabel("<html>" + "5. <b>Swedish Cruise</b>; Photo: Mywood, https://commons.wikimedia.org/wiki/File:Birka_Paradise_Stockholm.jpg" + "</html>");
                */
                
                // Added the above JLabels to the destinationsPanel JPanel
                /*
                destinationsPanel.add(destImgFourLabel);
                destinationsPanel.add(destTxtFourLabel);
                destinationsPanel.add(destImgFiveLabel);
                destinationsPanel.add(destTxtFiveLabel);
                */
                
                // Added the destinationsPanel JPanel to the parentPanel JPanel
                parentPanel.add(destinationsPanel);
            }
        });
    }
}

// Extended the JFrame class in order to adjust size for TopDestinationGridLayoutFrame
class TopDestinationGridLayoutFrame extends JFrame {
    public TopDestinationGridLayoutFrame() {
        super("SNHU Travel's Top 5 Destinations");
        setResizable(false);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Changed the size of the TopDestinationListFrame to 515 x 1140 pixels.
        setSize(900, 950);
    }
}