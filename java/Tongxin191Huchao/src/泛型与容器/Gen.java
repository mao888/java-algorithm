package ����������;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Gen<H> {
	
	H value;
	void putValue(H value){
		this.value = value;
	}
	
    static <E> void add(E[] a) {
        System.out.println(a[0]);
    }

    <E> void notStaticAdd(E[] a) {
        System.out.println(a[0]);
    }
    
    <E> void notStaticAdd(E a) {
        System.out.println(a);
    }

    static <E> void addObj(Object[] a) {
        System.out.println(a[0]);
    }

    <E> void notStaticAddObj(Object[] a) {
        System.out.println(a[0]);
    }

    // T ���Դ����κ�����
    
    // java ����ʵ�� Object�����ڱ���׶ζԳ���һ��Լ��
    // Object = 2 1 3
    
    // 1.int�ǲ���Object,Integer�ǲ���Object
    // 2.Ϊʲô��java���ͻ���� ���Ͳ��������뷴ʡ�涨֮������ݣ�
    
    
    
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    	/*
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add("asdas");
    	*/
    	
        Gen<Object> genO = new Gen();
        Gen<Integer> genS = new Gen();
        genO.putValue(1);
        genS.putValue(1);
        //Integer temp = genO.value;
        int o =(Integer) genO.value+1;
      
        /*
        int[] a = {1};
        Integer[] b = {1};
        Gen.add(a);
        Gen.add(b);
        gen.notStaticAdd(a);

        Gen.add(b);
        gen.notStaticAdd(b);

        Gen.addObj(a);
        gen.notStaticAddObj(a);
        */
        ArrayList<Integer> list = new ArrayList<Integer>();
        Class cl = list.getClass();
        list.add(1);
        Method m = cl.getMethod("add", Object.class);
        m.invoke(list, "asd");
        System.out.println(list);
        
    }
    
    /*
         public enum State {
            NEW,
            RUNNABLE,
            BLOCKED,
            WAITING,
            TIMED_WAITING,
            TERMINATED;
        }
     */
}
