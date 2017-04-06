/*

1) 객체 배열 (Exercise1.java)

다음 일을 하는 코드를 구현하라.

static memeber variable로 Object[] 배열을 만들어라.

static void addData(int count) 메소드를 구현하라.
배열에 0 부터 count-1 까지 정수를 넣어라.
정수 하나를 배열에 넣을 때, Integer 객체 하나와 String 객체 하나를 넣어라.
   ( 예: new Integer(3), String.valueOf(3) )
즉 정수 하나에 객체 두 개를 배열에 넣는다.
따라서 배열의 크기는 count * 2 이어야 한다.

static int findIndex(int value) 메소드를 구현하라.
파라미터로 전달된 value 값에 해당하는 Integer 객체를 배열에서 찾아서 
그 위치(index)를 리턴하라.

static int findIndex(String value) 메소드를 구현하라.
파라미터로 전달된 String 객체와 내용이 같은 String 객체를 배열에서 찾아서
그 위치(index)를 리턴하라.

 */

package kusob;

public class Exercise01 {
	static Object[] arr;

	static void addData(int count) {
		for (int i = 0; i < count; i += 2) {
			arr[i] = (Object) (new Integer(i));
			arr[i + 1] = (Object) (new String(String.valueOf(i + 1)));
		}
	}

//	static int findIndex(int value) {
//		
//		return;
//	}
//
//	static String findIndex(String value) {
//		
//		return;
//	}

	public static void main(String[] args) {
		int count = 10;
		addData(count);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
