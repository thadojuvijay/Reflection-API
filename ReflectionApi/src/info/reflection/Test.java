package info.reflection;

import java.lang.reflect.Method;

public class Test {

	

	public static void main(String[] args) {
Class cls=Class.class;
Method[] methods = cls.getMethods();
for (Method method : methods) {
System.out.println(method.getName());	
}
	}

}
