import java.util.Arrays;

public class Sound {
  private int [] samples;


  public int limitAmplitude (int limit) {
    // Write code for Part A here


    // Don't forget to change your return value
      return 0;
  }
  public void trimSilenceFromBeginning () {
      // Write code for Part B here


  }


  public Sound(int[] samples) {
    if (samples==null) {
      this.samples = new int[1];
      this.samples[0]=0;
    } else 
      this.samples = samples;
  }
  public String toString () {
    return Arrays.toString(samples);
  }
}