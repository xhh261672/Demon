package test;

import java.util.Date;

/**
 * Created by Administrator on 2015/3/16.
 */
public class SuperTest extends Date{
    private static final long serialVersionUID = 1L;
    private void test(){
        System.out.println(this.getClass().getName());
        System.out.println(super.getClass().getSuperclass().getName());
    }

    public static void main(String[]args){
        new SuperTest().test();
    }
}
