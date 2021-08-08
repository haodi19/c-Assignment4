import jdk.nashorn.internal.ir.CallNode;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchFieldException, IOException {
   /*     ChingChing c=new ChingChing("算法帮我",335);
        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("sf.txt"));
        o.writeObject(c);*/
        /*ObjectInputStream i=new ObjectInputStream(new FileInputStream("sf.txt"));
        Object obj = i.readObject();
        ChingChing2 ss=(ChingChing2)obj;
        System.out.println(ss);*/
        BufferedInputStream bf=new BufferedInputStream(Test.class.getClassLoader().getResourceAsStream("demo2.xml"));
        String content;
        int i;
        byte[]b=new byte[1024];
        while ((i=bf.read())!=-1){
            System.out.print((char)i);
        }


    }

}
