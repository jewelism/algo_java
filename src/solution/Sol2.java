/*
 * 

A non-empty zero-indexed array A consisting of N integers is given.
The array contains an odd number of elements, 
and each element of the array can be paired with another element that has the same value, 
except for one element that is left unpaired.
N 개의 정수로 이루어진 비어 있지 않은 제로 인덱스 배열 A가 주어진 있습니다.
배열 요소의 홀수를 포함하고
배열의 각 요소는 같은 값을 가지는 다른 요소와 결합 할 수 있습니다
짝 남아있는 하나의 요소를 제외하고.
For example, in array A such that:
  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9 
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.

Write a function:
class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers fulfilling the above conditions, 
returns the value of the unpaired element.
또한, 상기 조건을 만족하는 N 개의 정수의 배열을 지정해,
짝지어지지 않은 요소의 값을 반환합니다.
For example, given array A such that:
  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9 
the function should return 7, as explained in the example above.
Assume that:
N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
N은 [1..1,000,000]의 범위의 홀수의 정수입니다.
배열 A의 각 요소는 [1..1,000,000,000] 범위의 정수입니다.
모두가 A의 값 중 하나가 짝수 번 발생합니다
Complexity:
expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), 
beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
 *
 */

package solution;

import java.util.HashMap;
import java.util.Random;

public class Sol2 {
	public int solution(int[] A) {

		return 0;
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int i = 0;
		Loop: {
			System.out.println(i+"번째Loop");
			double rand = Math.random() * 10+1;// 0 6개
			int index = (int) rand;
			
			System.out.println("초기값 / i:0 / index:" + index);

			if (i == index) {
				while (i == index) {
					System.out.println("if문 / i:" + i + " / index:" + index);
					rand = Math.random() * 10+1;// 0 6개
					index = (int) rand;
					System.out.println("수정후 / i:" + i + " / index:" + index);
				}
			}
			while (i < index) {
				double range = Math.random() * 100+1;// 0 9개
				if (map.get(i) == null) {
					if (map.get(index) == null) {
						map.put(i, (int) range);
						map.put(index, (int) range);
						System.out.println("A[" + i + "] : " + (int) range);
						System.out.println("A[" + index + "] : " + (int) range);

					} else {

						continue;
					}
				} else {
					continue;
				}
				i++;
			}
		}
	}
}
