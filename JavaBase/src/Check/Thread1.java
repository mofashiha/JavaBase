package Check;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		Class<ChenFaBiao> clazz = ChenFaBiao.class;
		try {
			Object object = clazz.newInstance();
			Method method = clazz.getDeclaredMethod("Print");
			method.invoke(object);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
