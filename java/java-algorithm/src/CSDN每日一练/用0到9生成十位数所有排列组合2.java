package CSDNÿ��һ��;

import java.util.ArrayList;
import java.util.List;

/**
 * �����
 * */
public class ��0��9����ʮλ�������������2 {
	public static void main(String[] args){
        String[] nums={"0","1","2","3","4","5","6","7","8","9"};
        List<String> res=new ArrayList<>();
        backDemo(nums,res,new StringBuffer(),new StringBuffer());
        System.out.println(res.size());
    }
	
	static void backDemo(String[] nums,List<String> res,StringBuffer re,StringBuffer used){
        if(re.length()==10){
            res.add(new String(re));
            return;
        }
        
        for (String num : nums) {
            if (used.indexOf(num) >= 0) {
                continue;
            }
            if(num=="0"&&re.toString()=="") {
            	continue;
            }
            used.append(num);
            re.append(num);
            backDemo(nums, res, re, used);
            used.deleteCharAt(used.length() - 1);
            re.deleteCharAt(re.length() - 1);
        }
    }	
}

