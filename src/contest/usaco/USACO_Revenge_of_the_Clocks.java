package contest.usaco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class USACO_Revenge_of_the_Clocks {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    int a = readInt() % 12;
    int b = readInt() % 12;
    int c = readInt() % 12;
    int d = readInt() % 12;
    int e = readInt() % 12;
    int f = readInt() % 12;
    int g = readInt() % 12;
    int h = readInt() % 12;
    int i = readInt() % 12;
    byte[][] moves = new byte[][] {{1, 1, 0, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 1, 1, 0, 1, 1, 0, 0, 0}, {1, 0, 0, 1, 0, 0, 1, 0, 0}, {0, 1, 0, 1, 1, 1, 0, 1, 0}, {0, 0, 1, 0, 0, 1, 0, 0, 1}, {0, 0, 0, 1, 1, 0, 1, 1, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 0, 1, 1}};
  main:
    for (int x1 = 0; x1 < 12; x1++) {
      for (int x2 = 0; x2 < 12; x2++) {
        for (int x3 = 0; x3 < 12; x3++) {
          for (int x4 = 0; x4 < 12; x4++) {
            for (int x5 = 0; x5 < 12; x5++) {
              for (int x6 = 0; x6 < 12; x6++) {
                for (int x7 = 0; x7 < 12; x7++) {
                  for (int x8 = 0; x8 < 12; x8++) {
                    for (int x9 = 0; x9 < 12; x9++) {
                      int a1 = a + moves[0][0] * x1 + moves[1][0] * x2 + moves[2][0] * x3 + moves[3][0] * x4 + moves[4][0] * x5 + moves[5][0] * x6 + moves[6][0] * x7 + moves[7][0] * x8 + moves[8][0] * x9;
                      int b1 = b + moves[0][1] * x1 + moves[1][1] * x2 + moves[2][1] * x3 + moves[3][1] * x4 + moves[4][1] * x5 + moves[5][1] * x6 + moves[6][1] * x7 + moves[7][1] * x8 + moves[8][1] * x9;
                      int c1 = c + moves[0][2] * x1 + moves[1][2] * x2 + moves[2][2] * x3 + moves[3][2] * x4 + moves[4][2] * x5 + moves[5][2] * x6 + moves[6][2] * x7 + moves[7][2] * x8 + moves[8][2] * x9;
                      int d1 = d + moves[0][3] * x1 + moves[1][3] * x2 + moves[2][3] * x3 + moves[3][3] * x4 + moves[4][3] * x5 + moves[5][3] * x6 + moves[6][3] * x7 + moves[7][3] * x8 + moves[8][3] * x9;
                      int e1 = e + moves[0][4] * x1 + moves[1][4] * x2 + moves[2][4] * x3 + moves[3][4] * x4 + moves[4][4] * x5 + moves[5][4] * x6 + moves[6][4] * x7 + moves[7][4] * x8 + moves[8][4] * x9;
                      int f1 = f + moves[0][5] * x1 + moves[1][5] * x2 + moves[2][5] * x3 + moves[3][5] * x4 + moves[4][5] * x5 + moves[5][5] * x6 + moves[6][5] * x7 + moves[7][5] * x8 + moves[8][5] * x9;
                      int g1 = g + moves[0][6] * x1 + moves[1][6] * x2 + moves[2][6] * x3 + moves[3][6] * x4 + moves[4][6] * x5 + moves[5][6] * x6 + moves[6][6] * x7 + moves[7][6] * x8 + moves[8][6] * x9;
                      int h1 = h + moves[0][7] * x1 + moves[1][7] * x2 + moves[2][7] * x3 + moves[3][7] * x4 + moves[4][7] * x5 + moves[5][7] * x6 + moves[6][7] * x7 + moves[7][7] * x8 + moves[8][7] * x9;
                      int i1 = i + moves[0][8] * x1 + moves[1][8] * x2 + moves[2][8] * x3 + moves[3][8] * x4 + moves[4][8] * x5 + moves[5][8] * x6 + moves[6][8] * x7 + moves[7][8] * x8 + moves[8][8] * x9;
                      if (a1 % 12 + b1 % 12 + c1 % 12 + d1 % 12 + e1 % 12 + f1 % 12 + g1 % 12 + h1 % 12 + i1 % 12 == 0) {
                        System.out.printf("%d %d %d %d %d %d %d %d %d%n", x1, x2, x3, x4, x5, x6, x7, x8, x9);
                        break main;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  static String next() throws IOException {
    while (st == null || !st.hasMoreTokens())
      st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
  }

  static long readLong() throws IOException {
    return Long.parseLong(next());
  }

  static int readInt() throws IOException {
    return Integer.parseInt(next());
  }

  static double readDouble() throws IOException {
    return Double.parseDouble(next());
  }

  static String readLine() throws IOException {
    return br.readLine().trim();
  }
}
