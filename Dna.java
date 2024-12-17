
public class Dna {

    private static String findProtein(String dna){

      String proteinCounter = new String();
      String protein = new String();

      int length = dna.length();
      System.out.println("length: "+length);
      
      int startPoint = dna.indexOf("ATG");
      System.out.println("start: "+startPoint);
      
      int endPoint = dna.indexOf("TGA");
      System.out.println("end: "+endPoint);
      
      if (startPoint != -1 && endPoint != -1 && (endPoint - startPoint) % 3 == 0) {
        System.out.println("Condition 1 and 2 and 3 are satisfied.");
        protein = dna.substring(startPoint, endPoint+3);
      }else{
        System.out.println("No protein.");
        return "NAN";
      }

      for(int i=1; i<=(protein.length()/3); i++){
        if(i == (protein.length()/3)){
          proteinCounter += protein.substring((i*3)-3, i*3);
        }else if(i == 1){
          proteinCounter += protein.substring(0, i*3)+"-";  
        }else{
          proteinCounter += protein.substring((i*3)-3, i*3)+"-";
        }
      }
      System.out.println("DNA protein strand: "+proteinCounter);
      
      return proteinCounter;
    }
  
    private static String RNA2amino(String RNA){
      int j =3;
      String aminoStrand = new String();

      for(int i=0; i<((RNA.length()+1)/4); i++){

        if (RNA.substring(i*4, (i*4)+j).equals("UUU") || RNA.substring(i*4, (i*4)+j).equals("UUC")){
          aminoStrand += "Phe";
        }else if(RNA.substring(i*4, (i*4)+j).equals("UUA") || RNA.substring(i*4, (i*4)+j).equals("UUG") || RNA.substring(i*4, (i*4)+j).equals("CUU") || RNA.substring(i*4, (i*4)+j).equals("CUC") || RNA.substring(i*4, (i*4)+j).equals("CUA") || RNA.substring(i*4, (i*4)+j).equals("CUG")){
          aminoStrand += "Leu";
        }else if(RNA.substring(i*4, (i*4)+j).equals("AUU") || RNA.substring(i*4, (i*4)+j).equals("AUC") || RNA.substring(i*4, (i*4)+j).equals("AUA")){
          aminoStrand += "Ile";
        }else if(RNA.substring(i*4, (i*4)+j).equals("GUU") || RNA.substring(i*4, (i*4)+j).equals("GUC") || RNA.substring(i*4, (i*4)+j).equals("GUA") || RNA.substring(i*4, (i*4)+j).equals("GUG")){
          aminoStrand += "Val";
        }else if(RNA.substring(i*4, (i*4)+j).equals("UCU") || RNA.substring(i*4, (i*4)+j).equals("UCC") || RNA.substring(i*4, (i*4)+j).equals("UCA") || RNA.substring(i*4, (i*4)+j).equals("UCG")){
          aminoStrand += "Ser";
        }else if(RNA.substring(i*4, (i*4)+j).equals("CCU") || RNA.substring(i*4, (i*4)+j).equals("CCC") || RNA.substring(i*4, (i*4)+j).equals("CCA") || RNA.substring(i*4, (i*4)+j).equals("CCG")){
          aminoStrand += "Pro";
        }else if(RNA.substring(i*4, (i*4)+j).equals("ACU") || RNA.substring(i*4, (i*4)+j).equals("ACC") || RNA.substring(i*4, (i*4)+j).equals("ACA") || RNA.substring(i*4, (i*4)+j).equals("ACG")){
          aminoStrand += "Thr";
        }else if(RNA.substring(i*4, (i*4)+j).equals("GCU") || RNA.substring(i*4, (i*4)+j).equals("GCC") || RNA.substring(i*4, (i*4)+j).equals("GCA") || RNA.substring(i*4, (i*4)+j).equals("GCG")){
          aminoStrand += "Ala";
        }else if(RNA.substring(i*4, (i*4)+j).equals("UAU") || RNA.substring(i*4, (i*4)+j).equals("UAC")){
          aminoStrand += "Tyr";
        }else if(RNA.substring(i*4, (i*4)+j).equals("CAU") || RNA.substring(i*4, (i*4)+j).equals("CAC")){
          aminoStrand += "His";
        }else if(RNA.substring(i*4, (i*4)+j).equals("CAA") || RNA.substring(i*4, (i*4)+j).equals("CAG")){
          aminoStrand += "Gin";
        }else if(RNA.substring(i*4, (i*4)+j).equals("AAU") || RNA.substring(i*4, (i*4)+j).equals("AAC")){
          aminoStrand += "Asn";
        }else if(RNA.substring(i*4, (i*4)+j).equals("AAA") || RNA.substring(i*4, (i*4)+j).equals("AAG")){
          aminoStrand += "Lys";
        }else if(RNA.substring(i*4, (i*4)+j).equals("GAU") || RNA.substring(i*4, (i*4)+j).equals("GAC")){
          aminoStrand += "Asp";
        }else if(RNA.substring(i*4, (i*4)+j).equals("GAA") || RNA.substring(i*4, (i*4)+j).equals("GAG")){
          aminoStrand += "Glu";
        }else if(RNA.substring(i*4, (i*4)+j).equals("UGU") || RNA.substring(i*4, (i*4)+j).equals("UGC")){
          aminoStrand += "Cys";
        }else if(RNA.substring(i*4, (i*4)+j).equals("UGG")){
          aminoStrand += "Trp";
        }else if(RNA.substring(i*4, (i*4)+j).equals("CGU") || RNA.substring(i*4, (i*4)+j).equals("CGC") || RNA.substring(i*4, (i*4)+j).equals("CGA") || RNA.substring(i*4, (i*4)+j).equals("CGG") || RNA.substring(i*4, (i*4)+j).equals("AGA") || RNA.substring(i*4, (i*4)+j).equals("AGG")){
          aminoStrand += "Arg";
        }else if(RNA.substring(i*4, (i*4)+j).equals("AGU") || RNA.substring(i*4, (i*4)+j).equals("AGC")){
          aminoStrand += "Ser";
        }else if(RNA.substring(i*4, (i*4)+j).equals("GGU") || RNA.substring(i*4, (i*4)+j).equals("GGC") || RNA.substring(i*4, (i*4)+j).equals("GGA") || RNA.substring(i*4, (i*4)+j).equals("GGG")){
          aminoStrand += "Gly";
        }else if (RNA.substring(i*4, (i*4)+j).equals("AUG")) {
          aminoStrand += "Met";
        }
        if(i+1 < ((RNA.length()+1)/4)){
          aminoStrand += "-";
        }
      }
      if (aminoStrand.equals("")) {
        return "NAN";
      }
      
      return aminoStrand;
    }

    private static String DNA2RNA(String DNA){
      String Rna = new String();

      for(int i=0; i<DNA.length(); i++){
        switch (DNA.charAt(i)) {
          case 'A':
            Rna = Rna + 'U';
            break;
          case 'T':
            Rna += 'A';
            break;
          case 'G':
            Rna += 'C';
            break;
          case 'C':
            Rna += 'G';
            break;
          case '-':
            Rna += '-';
            break;
          default:
            System.out.println("Something's wrong with DNA!");
            return "NAN";
        }
      }
      return Rna;
    }
    
    public static void main(String[] args) {
      
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";
      //  -. .-.   .-. .-.   .
      //    \   \ /   \   \ / 
      //   / \   \   / \   \  
      //  ~   `-~ `-`   `-~ `-
      String dna = dna1;
      System.out.println("DNA sample: "+dna);

      String pDnaSample = findProtein(dna);

      String RNAsample = DNA2RNA(pDnaSample);
      System.out.println("RNA strand is: "+RNAsample);

      System.out.println("Amino strand is: "+RNA2amino(RNAsample));

    }
}
