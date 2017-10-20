import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class A implements IJP, SJP{
	public A() {
//		Collections.synchronizedList(list)
		// TODO Auto-generated constructor stub
		System.out.println("Inside constructor"+IJP.testInt);
		ArrayList al =  new ArrayList();
		ListIterator lp= al.listIterator();
//		while//
		a(1);
	}
	public static void main(String[] args) {
		System.out.println("main 27::"+SJP.testInt);
	}
	Object  a(Integer i){
		System.out.println("A class");
		return new Long(9);
	}
	long  a(int i){
		System.out.println("L class");
		return 9;
	}
	static int test(){
		System.out.println("static A");
		return 0;
	}
	@Override
	public String java() {
		// TODO Auto-generated method stub
		return null;
	}
}
public class F extends A{
	static int test(){
		System.out.println("static F");
		return 0;
	}
	Integer  a(){
		System.out.println("D class");
		return 9;
	}
	static int g;
	int h;
	public F() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
	}
	{
		System.out.println("Init block");
	}
	/*static{
		System.out.println("static block");
	}*/
	void fun(){
		System.out.println(g+h);
	}
	static void fun1(){
		System.out.println(g+g);
	}
	public static void main(String[] args) {
		F f=new F();
		f.a();
		ExecutorService exsc= new ExecutorService() {
			
			@Override
			public void execute(Runnable command) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public <T> Future<T> submit(Runnable task, T result) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Future<?> submit(Runnable task) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> Future<T> submit(Callable<T> task) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Runnable> shutdownNow() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void shutdown() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isTerminated() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isShutdown() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
					throws InterruptedException, ExecutionException, TimeoutException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
					throws InterruptedException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
				// TODO Auto-generated method stub
				return false;
			}
		};
//		AbsTest absTest = new AbsTest() {
//		};
//		absTest.fub();
		/*String sub="Hello".substring(2, 3);
		System.out.println(sub);
		String s[][]=new String[2][2];
		System.out.println(s[1][1]);
		System.out.println(s[1][2]);
		
		String a,b,c,d;
		a="Hello1234";
		b="Hello"+String.valueOf(1234);*/
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*{
		System.out.println("Init block   222");
	}
	static{
		System.out.println("static block 222");
	}*/

}

abstract class AbsTest{
	public AbsTest() {
		// TODO Auto-generated constructor stub
		File file = new File("");
//		FileInputStream n= new FileInputStream(file);
		System.out.println("AbsTest constructor");
	}
	void fub(){
		System.out.println("abs fub");
	}
}


interface IJP{
	int testInt = 3;
	String java();
}
interface SJP{
	int testInt = 3;
	String java();
}