package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarHandler implements InvocationHandler {

	private Star s1;
	
	public StarHandler(Star s1) {
		super();
		this.s1 = s1;
	}
	
	
	public Object getProxy()
	{
		//newProxyInstance返回接口类型
		return Proxy.newProxyInstance(
				this.s1.getClass().getClassLoader(),
				this.s1.getClass().getInterfaces(),
				this);
	}
	
	

	@Override
	public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("sing"))
		{
			this.beforeSing();
			method.invoke(s1, args);
			this.afterSing();
		}
		return null;
	}
	private void beforeSing()
	{
		System.out.println("安排场地...");
	}
	private void afterSing()
	{
		System.out.println("收拾场地...");
	}
}
