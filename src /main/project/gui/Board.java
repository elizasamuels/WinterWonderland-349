package gui;

import javax.swing.JTextArea;

public class Board extends JTextArea implements Observer
{
  public Board()
  {
    super();
  }

  /**
   * Handle a new/changed WeatherDatum object (required by WeatherObserver).
   *
   * @param datum
   *          The new/changed WeatherDatum object
   */
  @Override
  public void handleDatum(final Datum datum)
  {
    append(datum.toString(true) + "\n");
  }

  /**
   * Reset this WeatherObserver.
   */
  @Override
  public void reset()
  {
    setText("");
  }
}
