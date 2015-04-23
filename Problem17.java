public class HelloWorld{

     public static void main(String []args){
         
         NumbersToString num = new NumbersToString(999);
        System.out.println("Answer: " + SumOfLength(1, 1000));
     }
     
     public static long SumOfLength(int start, int end) {
         NumbersToString num;
         long length = 0l;
         
         for (int i = start; i <= end; i++) {
             num = new NumbersToString(i);
             System.out.println(num.GetResult());
             length += num.GetLength();
         }
         return length;
     }
     
     
}


public class NumbersToString {
    
    private enum Ones {
        zero("Zero"),
        one("One"), 
        two("Two"), 
        three("Three"), 
        four("Four"), 
        five("Five"), 
        six("Six"), 
        seven("Seven"), 
        eight("Eight"),
        nine("Nine");
        
        private String word;
        private Ones(String s) {
            word = s;
        }
        
        public String toString() {
            return word;
        }
    }
    private enum Teens {
        ten("Ten"), 
        eleven("Eleven"), 
        twelve("Twelve"), 
        thirteen("Thirteen"), 
        fourteen("Fourteen"), 
        fifteen("Fifteen"), 
        sixteen("Sixteen"), 
        seventeen("Seventeen"), 
        eighteen("Eighteen"),
        nineteen("Nineteen");
        
        private String word;
        private Teens(String s) {
            word = s;
        }
        
        public String toString() {
            return word;
        }
    }
    private enum  Tens {
        twenty("Twenty"), 
        thirty("Thirty"), 
        forty("Forty"), 
        fifty("Fifty"), 
        sixty("Sixty"), 
        seventy("Seventy"),
        eighty("Eighty"), 
        ninety("Ninety");
        
        private String word;
        private Tens(String s) {
            word = s;
        }
        
        public String toString() {
            return word;
        }
    }
    private String hundred = "hundred";
    private String and = "and";
    private String thousand = "thousand";
    
    private String result;
    
    
    
    public NumbersToString(int number) {
        
        result = Integer.toString(number);
        
        ConvertToString();
        
        
        
    }
    public String GetResult() {
        return result;
    }
    public int GetLength() {
        return result.length();
    }
    private void ConvertToString() {
        int index;
        int characterLeft;
        StringBuffer tmp = new StringBuffer();
        boolean isTeen = false;
        boolean noTens = false;
        
    
        for (int i = 0; i < result.length(); i++) {
            index = Character.getNumericValue(result.charAt(i));
            characterLeft = result.length() - i;
            if (characterLeft == 4) {
                tmp.append((Ones.values()[index]).toString());
                tmp.append(thousand);
                
                
            }
            if (characterLeft == 3) {
                if (index != 0) {
                    tmp.append((Ones.values()[index]).toString());
                    tmp.append(hundred);
                    
                }
                
                
            }
            else if (characterLeft == 2) {
                
                
                if (index == 1) {
                    if (result.length() > 2)
                        tmp.append(and);
                    isTeen = true;
                }
                else if (index >= 2) {
                    if (result.length() > 2)
                        tmp.append(and);
                    tmp.append((Tens.values()[index - 2]).toString());
                }
                else
                    noTens = true;
            }
            else if (characterLeft == 1) {
                if (isTeen) {
                    
                    tmp.append((Teens.values()[index]).toString());
                }
                else {
                    if (index != 0) {
                        if (result.length() > 2 && noTens)
                            tmp.append(and);
                        tmp.append((Ones.values()[index]).toString());
                    }
                }
            }
        }
        
        result = tmp.toString();
            
         
        
    }
}