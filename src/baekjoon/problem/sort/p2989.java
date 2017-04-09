package baekjoon.problem.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kusob on 2017. 4. 8..
 *
 * 개구리 왕눈이는 N개의 연꽃잎이 있는 연못에 살고 있다. 연꽃잎은 1부터 N까지 차례대로 번호가 매겨져 있다.
 * 연못을 위에서 봤을 때 2차원 평면에 연꽃잎이 (x,y) 좌표에 떠 있는 것 처럼 보인다.
 * 왕눈이는 대각선으로 뛰는 것과 음의 방향으로 뛰는 것을 무서워 한다.
 * 좀 더 자세히 말하자면 (x 1,y1)에서 (x2,y2)로 뛰기 위해서는 아래 두 조건 중 하나를 만족해야한다.

 x2 > x1 이고 y2 = y1
 y2 > y1 이고 x2 = x1
 각 연꽃잎 마다 일정 수의 파리가 있고, 왕눈이는 파리를 먹으며 힘을 회복한다.

 왕눈이가 한 번 연꽃잎을 이동하기 위해서는 K 만큼 힘이 든다.
 왕눈이는 처음 1번 연꽃잎에서 시작하여 N번 연꽃잎으로 이동하려고 한다.
 다만, 도착하고 난 뒤 힘의 최대이고 싶어한다.
 처음 왕눈이가 가진 힘은 0 이다. 힘은 항상 0 이상 이어야 한다.

 **왕눈이를 도와 연꽃잎 사이를 이동하는 경로를 출력하는 프로그램을 작성하시오.

 **입력
 첫 줄에 연꽃잎의 수 N과 한 번 이동하는데 필요한 힘 K가 주어진다. (2 ≤ N ≤ 300 000, 1 ≤ K ≤ 1000)

 다음 N개의 줄에 걸쳐 각 연꽃잎의 좌표 X, Y와 파리의 양 F가 차례대로 주어진다.
 i+1번째 줄에 주어지는 좌표와 파리의 양은 i번 연꽃잎에 관한 정보이다.
 연꽃잎의 좌표는 서로 다르다. (0 ≤ X, Y ≤ 100 000, 0 ≤ F ≤ 1000)

 입력은 항상 답이 존재하도록 주어진다.

 **출력
 첫 줄에 N번 연꽃잎에 도착 한 뒤 최대 힘의 양을 출력한다.

 두 번째 줄에는 1번 연꽃잎과 N번 연꽃잎을 포함하여 방문한 연꽃잎의 수 L을 출력한다.

 다음 L개의 줄에 방문한 연꽃잎의 좌표들을 차례대로 출력한다.

 만약, 가능한 답이 여러 가지인 경우 그 중 아무거나 하나 출력한다.


 입력
 6 5
 1 1 5
 2 1 5
 1 2 4
 2 3 5
 3 2 30
 3 3 5

 출력
 5
 4
 1 1
 2 1
 2 3
 3 3
 */
public class p2989 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 2; //연꽃잎 갯수
        int K = 5; //한번 이동하는데 필요한 힘
        List[] list = new List[N];
        for(int i=0; i<N; i++){
            list[i] = new List();
            list[i].info = new int[3];
            list[i].info[0] = scanner.nextInt();
            list[i].info[1] = scanner.nextInt();
            list[i].info[2] = scanner.nextInt();
        }
//        for(int i=0; i<N; i++){
//            System.out.println(Arrays.toString(list[i].info)); //입력받은거 확인
//        }

    }


}

class List {
    public int[] info;
}
