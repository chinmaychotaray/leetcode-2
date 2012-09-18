/*
    judge small :passed 520ms
    judge large :passed 750ms 


*/



import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function    
        Arrays.sort(num);
        return find_combinationSum2(num,target,num.length-1);
    }
    
    public ArrayList<ArrayList<Integer>> find_combinationSum2(int[] num, int target, int pointer){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(target==0)
            result.add(new ArrayList<Integer>());
        else if(target>0)  
            for(int i=pointer;i>=0;i--)
                for(ArrayList<Integer> combo:find_combinationSum2(num,target-num[i],i-1)){
                    combo.add(num[i]);
                    if(!result.contains(combo))
                        result.add(combo);
                }     
        return result;
    
    }
}