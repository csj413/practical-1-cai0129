package practical1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class WordList {
    private ArrayList<String> theWordList = new ArrayList<>();

    public void addWord(String s) {
        theWordList.add(s);
    }

    /**
     * Gets the first word of theWordList,
     *
     * return the first word of the list, or "-" if the list is empty
     */
    public String getFirst() {
        if (theWordList.size()==0){
            return "-";
        }else{
            return theWordList.get(0);
        }
        //return "junk";
    }

    /**
     * Gets the last word of theWordList,
     *
     * return the last word of the list, or "-" if the list is empty
     */
    public String getLast() {
        if (theWordList.size()==0){
            return "-";
        }else{
            return theWordList.get(theWordList.size()-1);
        }
        //return "junk";
    }

    public String toString() {
        return theWordList.toString();
    }
    public void sortAlpha(){
        Collections.sort(theWordList);
    }
    public int getAvgLength(){
        double a = 0;
        double b = 0;
        double size = theWordList.size();
        DecimalFormat decimalFormat = new DecimalFormat(".##");
        for(int i = 0;i<size;i++){
            b += theWordList.get(i).length();
        }
        a = Double.parseDouble(decimalFormat.format(b/size));
        return (int) a;


    }
    public void sortByLength(){
        theWordList.sort(new SortTest());

    }
    static class SortTest implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();

        }
    }





}
