package javaCourse.generics;

class Sample<T> {
	public T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}

public class GenericsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample<Integer> s2 = new Sample<Integer>();
		s2.setValue(10);
		System.out.println(s2.getValue());

		Sample<Double> s3 = new Sample<Double>();
		s3.setValue(10.2);
		System.out.println(s2.getValue());

		Sample<String> s1 = new Sample<String>();
		s1.setValue("xyz");
//		Integer a = (Integer) s1.getValue();
		System.out.println(s1.getValue());
	}

}
