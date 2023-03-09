
class Result {

    /*
     * Complete the 'sumXor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long sumXor(long n) {
    // Write your code here
    long count = 0;
    String nb=  Long.toBinaryString(n);
        for(long i =0;i<n+1;i++){
            long add = n+i;
            
            String calc = "";
          
          String ib = Long.toBinaryString(i);
          
          
          if(ib.length()<nb.length()){
              int asd=nb.length()-ib.length();
              for(int is=0;is<asd;is++){
               ib = '0'+ib;   
              }
          }
                    
          for(int ass=0;ass<nb.length();ass++){
              if(nb.charAt(ass)==ib.charAt(ass)){
                  calc= calc +'0';
              }else{
                  calc= calc + '1';
          }
          }
            
          long xor = Long.parseLong(calc,2);
          
          
          
            if(add==xor){
                count++;
            }
            
            
        }
        return count;
    }

}
