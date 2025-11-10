package maps;

//Java libraries
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

//Multimedia libraries
import app.*;
import io.*;
import wonderland.Observer;

public abstract class WonderlandApplication extends JApplication
    implements ActionListener
{
  public static final int WIDTH = 600;
  public static final int HEIGHT = 800;

  protected static final String ABOUT = "About";
  protected static final String LOAD = "Load";

  protected JButton aboutButton;
  protected String aboutText;

  private JButton loadButton;
  private JTextField fileField;

  public WonderlandApplication(final String[] args)
  {
    super(args, WIDTH, HEIGHT);
  }

  @Override
  public void init()
  {
    // Setup the content pane
    JPanel contentPane = (JPanel) getContentPane();
    contentPane.setLayout(null);

    JLabel label = new JLabel("File: ");
    label.setBounds(30, 30, 40, 30);
    contentPane.add(label);

    fileField = new JTextField();
    fileField.setBounds(80, 30, 200, 30);
    contentPane.add(fileField);

    loadButton = new JButton(LOAD);
    loadButton.setBounds(320, 30, 70, 30);
    loadButton.addActionListener(this);
    contentPane.add(loadButton);

    aboutButton = new JButton(ABOUT);
    aboutButton.setBounds(400, 30, 70, 30);
    aboutButton.addActionListener(this);
    contentPane.add(aboutButton);

    JComponent weatherObserverComponent = getGUIComponent();
    weatherObserverComponent.setBounds(0, 60, WIDTH, HEIGHT - 60);
    contentPane.add(weatherObserverComponent);
  }

  /**
   * Get the GUI components to use to display the weather information.
   * 
   * @return The WeatherObserverPanel
   */
  protected abstract JComponent getGUIComponent();

  /**
   * Get the WeatherObserver to inform of changes.
   * 
   * @return The WeatherObserverPanel
   */
  protected abstract Observer getWeatherObserver();

}