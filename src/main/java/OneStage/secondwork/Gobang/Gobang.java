package OneStage.secondwork.Gobang;

/**
 * @author : zhoumin
 * @data :  2020/5/14 12:31
 */
public class Gobang {
  // 地图的规模
  public int n = 17;
  // 确认是白方，还是黑方
  public String color;
  public String mark = "+";
  public String white = "○";
  public String black = "●";
  public String[][] map = new String[n][n];
  ;
  public String[] coordinate = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"
      };

  public Gobang() {
    // 初始化地图
    init();
  }

  // 初始化地图
  public void init() {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == n - 1) {
          map[i][j] = coordinate[j];
        } else if (j == n - 1) {
          map[i][j] = coordinate[i];
        } else {
          map[i][j] = mark;
        }
      }
    }
    printMap();
  }

  // 打印地图
  public void printMap() {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(map[i][j]+ "    ");
      }
      System.out.println();
    }

  }

  // 解析坐标
  public Point analysisPoint(String point) {
    String[] points = point.split(",");
    int x = Integer.parseInt(points[0]) - 1;
    int y = Integer.parseInt(points[1]) - 1;
    return new Point(x, y);
  }

  // 落子
  public boolean luoZi(Point point, Boolean color) {
    // 判断是否越界
    if (point.x < 0 || point.y > 17 || point.y < 0 || point.y > 17) {
      return false;
    }
    // 判断落子的地方有没有其他的子
    if (map[point.x][point.y] != mark) {
      return false;
    }
    map[point.x][point.y] = color ? white : black;
    return true;
  }

  // 判断是否输赢
  public boolean isWin(Point point, boolean color) {
    // 纵向
    // 纵向上
    int zxS = 0;
    for (int i = 0; i < 5; i++) {
      if (point.x - i < 0) {
        break;
      }
      if (map[point.x - i][point.y].equals(color ? white : black)) {
        zxS++;
      } else {
        break;
      }
    }
    // 纵向下
    int zxX = 0;
    for (int i = 1; i < 5; i++) {
      if (point.x + i > 18) {
        break;
      }
      if (map[point.x + i][point.y].equals(color ? white : black)) {
        zxX++;
      } else {
        break;
      }
    }
    // 横向
    // 横向左
    int hxZ = 0;
    for (int i = 0; i < 5; i++) {
      if (point.y - i < 0) {
        break;
      }
      if (map[point.x][point.y - i].equals(color ? white : black)) {
        hxZ++;
      } else {
        break;
      }
    }
    // 横向右
    int hxY = 0;
    for (int i = 1; i < 5; i++) {
      if (point.y + i > 18) {
        break;
      }
      if (map[point.x][point.y + i].equals(color ? white : black)) {
        hxY++;
      } else {
        break;
      }
    }
    // 正斜
    // 正斜上
    int zxxS = 0;
    for (int i = 0; i < 5; i++) {
      if (point.y + i > 18 || point.x - i < 0) {
        break;
      }
      if (map[point.x - i][point.y + i].equals(color ? white : black)) {
        zxxS++;
      } else {
        break;
      }
    }
    // 正斜下
    int zxxX = 0;
    for (int i = 1; i < 5; i++) {
      if (point.y - i < 0 || point.x + i > 18) {
        break;
      }
      if (map[point.x + i][point.y - i].equals(color ? white : black)) {
        zxxX++;
      } else {
        break;
      }
    }
    // 反斜
    // 反斜上
    int fxxS = 0;
    for (int i = 0; i < 5; i++) {
      if (point.y - i < 0 || point.x - i < 0) {
        break;
      }
      if (map[point.x - i][point.y - i].equals(color ? white : black)) {
        fxxS++;
      } else {
        break;
      }
    }
    // 反斜下
    int fxxX = 0;

    for (int i = 1; i < 5; i++) {
      if (point.y + i > 18 || point.x + i > 18) {
        break;
      }
      if (map[point.x + i][point.y + i].equals(color ? white : black)) {
        fxxX++;
      } else {
        break;
      }
    }
    System.out.println();
//    System.out.print("反斜上↖:" + fxxS + "\t");
//    System.out.print("纵向上↑:" + zxS + "\t");
//    System.out.print("正斜上↗:" + zxxS);
//    System.out.println();
//    System.out.print("横向左←:" + hxZ + "\t\t\t");
//    System.out.print("横向右→:" + hxY);
//    System.out.println();
//    System.out.print("正斜下↙:" + zxxX + "\t");
//    System.out.print("纵向下↓:" + zxX + "\t");
//    System.out.print("反斜下↘:" + fxxX);
    System.out.println();
    if (zxS + zxX > 4 || hxY + hxZ > 4 || zxxS + zxxX > 4 || fxxS + fxxX > 4) {
      return true;
    }
    return false;
  }
}
