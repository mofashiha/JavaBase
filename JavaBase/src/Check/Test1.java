package Check;

import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class Test1{

	public static void main(String[] args) throws Exception {
		Class<Person>  clazz=Person.class;
		Object object=clazz.newInstance();
		Field field=clazz.getDeclaredField("age");
		field.setAccessible(true);
        field.set(object,18);
        System.out.println(object);
        Method method=clazz.getDeclaredMethod("print");
       
        method.invoke(object);
	}

}

