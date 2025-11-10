package maps;

//Java libraries
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

//Multimedia libraries
import app.*;
import gui.Board;
import io.*;
import visual.VisualizationView;
import visual.dynamic.sampled.Screen;
import wonderland.Observer;

public class Application extends WonderlandApplication
{
  private ResourceFinder finder = ResourceFinder
      .createInstance(new resources.Marker());
  private Board board;
  private VisualizationView view;
  private Screen screen;

  /**
   * Explicit value constructor.
   * 
   * @param args The command line arguments
   */
  public Application(final String[] args)
  {
    super(args);
    board = new Board();
  }

  /**
   * Get the GUI component that will be used to display the weather information.
   * 
   * @return The WeatherObserverPanel
   */
  @Override
  protected JComponent getGUIComponent()
  {
    return board;
  }

  /**
   * Get the WeatherObserver to inform of changes.
   * 
   * @return The WeatherObserverPanel
   */
  @Override
  protected Observer getWeatherObserver()
  {
    return board;
  }

  /**
   * Construct and invoke (in the event dispatch thread) an instance of this
   * JApplication.
   * 
   * @param args The command line arguments
   */
  public static void main(final String[] args)
  {
    JApplication app = new Application(args);
    invokeInEventDispatchThread(app);
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException(
        "Unimplemented method 'actionPerformed'");
  }
}