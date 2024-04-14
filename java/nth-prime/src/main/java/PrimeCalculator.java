class PrimeCalculator {

    int nth(int nth) {
     if (nth <= 0) {
            throw new IllegalArgumentException("Input must be greater than 0");
        }
        int count = 0;
        int num = 2;
        while(count < nth){
            if(checkPrime(num)){
                count++;
                if(count == nth){
                    return num;
                }
            }

            num++;
        }
        return 0;
    }

   static boolean checkPrime(int n) 
    { 
  
        if (n == 1) 
            return false; 
  
        else if (n == 2) 
            return true; 
  
        else if (n % 2 == 0) 
            return false; 
  
        for (int i = 3; i <= Math.sqrt(n); i += 2) { 
            if (n % i == 0) 
                return false; 
        } 
        return true; 
    } 
}
