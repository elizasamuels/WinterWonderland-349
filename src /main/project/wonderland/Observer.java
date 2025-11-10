package wonderland;

//Java libraries
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

//Multimedia libraries
import app.*;
import io.*;

/**
 * Requirements of an object that is informed of new/changed WeatherDatum
 * objects.
 *
 * @author Bella Miller, Eliza Samuels, James Madison University
 * @version 1.0
 */
public interface Observer
{
  /**
   * Reset this Observer.
   */
  public abstract void reset();

  /**
   * Handle a new/changed WonderlandDatum object.
   *
   * @param datum The new/changed WonderlandDatum object
   */
  public abstract void handleDatum(final Datum datum);
}
