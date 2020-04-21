class Main {
  public static void main(String[] args) {
    System.out.println("Testing Sound Class:");
    
    int s1[] = {40,2532,17,-2300,-17,-4000,2000,1048,-420,33,15,-32,2030,3223};
    int s2[] = {0,0,0,0,-14,0,-35,-39,0,-7,16,32,37,29,0,0}; 

    Sound sound1 = new Sound (s1);
    Sound sound2 = new Sound (s2);

    System.out.println ("Limit Amplitude (2000):");
    System.out.println ("Before: " + sound1);
    int numChanges = sound1.limitAmplitude(2000);
    System.out.println ("After: " + sound1);
    System.out.println ("numChanges: " + numChanges);

    System.out.println ("trimSilenceFromBeginning:");
    System.out.println ("Before: " + sound2);
    sound2.trimSilenceFromBeginning();
    System.out.println ("After: " + sound2);
  }
}