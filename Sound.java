import java.util.Arrays;

public class Sound {
  private int [] samples;


  public int limitAmplitude (int limit) {
    int numChanges = 0;
    // Write code for Part A here
    for (int i=0; i < samples.length; i++) {
      if (samples[i] < -limit) {
        samples[i] = -limit;
        numChanges++;
      } else if (samples[i] > limit) {
        samples[i] = limit;
        numChanges++;
      }

    }

    // Don't forget to change your return value
      return numChanges;
  }
  public void trimSilenceFromBeginning () {
      // Write code for Part B here
      int counter = 0;
      while (counter < samples.length && samples[counter++]==0);

      counter--;
      int[] new_samples = new int[samples.length-counter];
      
      for (int i=counter; i < samples.length; i++)
        new_samples[i-counter] = samples[i];
      
      samples = new_samples;
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