import java.util.*;
public class word_length {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Map<Integer,Integer>word_length=new TreeMap<>();

        System.out.println("Enter English text(type END to stop):");

        while(true){
            String line=sc.nextLine();
            if(line.equalsIgnoreCase("END")){
                break;
            }

            line=line.replaceAll("[^\\p{L} ]","");
            String[] words=line.split("\\s+");

            for(String word : words){
                if(!word.isEmpty()){
                    int len=word.length();
                    word_length.put(len,word_length.getOrDefault(len,0)+1);
                }
            }
        }
        System.out.println("\nWord Length Counts:");
        for(Map.Entry<Integer,Integer>entry : word_length.entrySet()){
            System.out.println("Length "+entry.getKey()+"->"+entry.getValue()+" words");
        }
    }    
}
