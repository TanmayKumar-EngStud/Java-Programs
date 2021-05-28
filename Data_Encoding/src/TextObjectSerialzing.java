import java.lang.String;
import java.util.*;
import java.io.Serializable;
import java.math.*;

interface Countable{

    char[] detected = new char[256];
    int[] amount = new int[256];
    static void initialize(){
        for(int i = 0; i<256; i++){
            detected[i]= ' ';
        }
    }
    default void count(String input){//counting total number of times a word or a character has occur in the input set.
        int i = input.length();
        for(int j = 0; j<i;j++){
            int index = new String(detected).indexOf(input.charAt(i));
            if( index== -1){
                int place = findLast();
                if(place == -1){
                    break;
                }
                else{
                    detected[place]=input.charAt(i);
                    amount[place] = 1;
                }
            }
            else{
                amount[index]+=1;
            }
        }
    }
    private int findLast(){
        int i;
        for(i=0;i<256;i++){
            if(Countable.detected[i]== Countable.detected[' ']){
                break;
            }
        }
        if(i ==255 && Countable.detected[255] != Countable.detected[' ']){
            String eMessage = "There is no space left in the Character array to hold new character";
            System.out.println("Error:\t"+eMessage);
            i = -1;
        }
        return i;
    }
}

class Arrange implements Countable{
    String input;
    HashMap<Integer,Character> map = new HashMap<>(); //mapping character and it's total number of counts
    HashMap<Character, Integer> map2 = new HashMap<>();
    public void a_Feed(String s){
        input = s;
    }
    public HashMap b_getStortedMap(){
        count(input);

        for(int i = 0; i<256; i++){
            map.put(amount[i],detected[i]);
        }
        TreeMap<Integer,Character> tm=new  TreeMap<Integer, Character> (map);
        for (Integer integer : tm.keySet()) {
            int key = integer;
            map2.put(map.get(key), key);
        }
        return map2;
    }
}

class Table{
    HashMap<Character,Integer> map = new HashMap<>();
    public void a_getMap(HashMap<Character, Integer> map){
        this.map = map;
    }
    public HashMap<Character,BitSet> b_create(){
        HashMap<Character, BitSet> newMap = new HashMap<>();

        for(Character key : map.keySet()) {
            int index = 0;
            for(Character temp : map.keySet()){
                index++;
                if(temp == key){
                    break;
                }
            }
            int size = (int)Math.floor(Math.log(256 - index))+1;
            BitSet value= new BitSet(size);
            String binaryStr = Integer.toBinaryString(256- index);
            for(int i=0; i< binaryStr.length(); i++){
                char temp = binaryStr.charAt(i);
                if(temp == '1'){
                    value.set(i);
                }
            }

            newMap.put(key,value);

        }
        return newMap;
    }
}

class Convert{
    HashMap <Character, BitSet> map;
    String input;
    void a_getMap_and_String(HashMap<Character, BitSet> map, String input){
        this.map = map;
        this.input = input;
    }
    // I will do this conversion Later
}


public class TextObjectSerialzing {
    public static void main(String[] args){
        
    }
}
