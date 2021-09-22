package assignment_7sept;

 public class ReplaceJavaWithCpp{
    public static void main(String[] args) {
    	ReplaceJavaWithCpp replace = new ReplaceJavaWithCpp();
        String inputString = "Java is Object Oriented. Java is Programming Language.";
        System.out.println("Input String : "+inputString);
        System.out.println("Output String : "+replace.replaceAllWords("Java", "C++", inputString));
    }

    public StringBuilder replaceAllWords(String oldWord,String newWord,String inputString){
        String[] str = inputString.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String string : str) {
            if(string.equalsIgnoreCase(oldWord)){
                sb.append(newWord).append(" ");
            }
            else{
                sb.append(string).append(" ");
            }
        }
        return sb;
    }
}



