package info.reflection;

import java.lang.reflect.Method;

public class CheckingParticularMethodAVailableOrNot {

	public static void main(String[] args) throws NoSuchMethodException, Exception 
	{
		Class[] param={};
		Class<Cone> cls= Cone.class;
Method method = cls.getDeclaredMethod("methodOne", param);
System.out.println(method.getName());
	}

}
