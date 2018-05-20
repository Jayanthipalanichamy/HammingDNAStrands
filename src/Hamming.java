public class Hamming {
    String leftStrand;
    String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }
    public int getHammingDistance() throws IllegalArgumentException {
        if(leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException();
        }
        int hammingDistance = 0;
        for(int i = 0 ; i <leftStrand.length();i++) {
            if(leftStrand.charAt(i) != rightStrand.charAt(i)) {
                hammingDistance++;
            }
        }
        return hammingDistance;
    }
}