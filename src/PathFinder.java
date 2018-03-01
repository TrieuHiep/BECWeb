import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathFinder {

    private static class Point {
        int x;
        int y;
        Point parent;

        public Point(int x, int y, Point parent) {
            this.x = x;
            this.y = y;
            this.parent = parent;
        }

        public Point getParent() {
            return this.parent;
        }

        public String toString() {
            return "cor x = " + x + " y = " + y;
        }
    }

    private static Queue<Point> q = new LinkedList<Point>();
    private static int[][] arr;

    private static Point getPathBFS(int[][] maze, int row, int colum, int startX, int startY, int endValue) {
		/*
		 maze: ma trận xử lý
		 row: số hàng, colum: số cột
		 startX, startY: tọa độ điểm bắt đầu
		 endValue: giá trị của điểm kết thúc
		 */
        arr = maze;
        int[][] chuaxet  = new int[row][colum];

        q.add(new Point(startX, startY, null));
        chuaxet[startX][startY]=1;

        while (!q.isEmpty()) {
            Point p = q.remove();
            System.out.println("pop " + p.x + " , " + p.y);
            if (arr[p.x][p.y] == endValue) {
                System.out.println("DONE!!!!!!!!");
                return p;
            }
            if (isOK(p.x, p.y - 1) && chuaxet[p.x][p.y-1]==0) {
                System.out.println("push " + p.x + " , " + (p.y - 1));
                arr[p.x][p.y] = -1;
                Point nextP = new Point(p.x, p.y - 1, p);
                q.add(nextP);
                chuaxet[p.x][p.y-1]=1;
            }

            if (isOK(p.x + 1, p.y) && chuaxet[p.x+1][p.y] == 0) {
                System.out.println("push " + (p.x + 1) + " , " + p.y);
                arr[p.x][p.y] = -1;
                Point nextP = new Point(p.x + 1, p.y, p);
                q.add(nextP);
                chuaxet[p.x+1][p.y] =1;
            }
            if (isOK(p.x, p.y + 1) && chuaxet[p.x][p.y+1] == 0) {
                System.out.println("push " + p.x + " , " + (p.y + 1));
                arr[p.x][p.y] = -1;
                Point nextP = new Point(p.x, p.y + 1, p);
                q.add(nextP);
                chuaxet[p.x][p.y+1] =1;
            }
            if (isOK(p.x - 1, p.y) && chuaxet[p.x-1][p.y] == 0) {
                System.out.println("push " + ((p.x) - 1) + " , " + p.y);
                arr[p.x][p.y] = -1;
                Point nextP = new Point(p.x - 1, p.y, p);
                q.add(nextP);
                chuaxet[p.x-1][p.y] = 1;
            }
        }
        return null;

    }

    private static boolean isOK(int x, int y) {
        if ((x >= 0 && x < arr.length) && (y >= 0 && y < arr[x].length) && (arr[x][y] != -1 && arr[x][y]!=1)) {
            return true;
        }
        return false;
    }

    public static List<Integer> BFS(int[][] maze, int row, int colum, int startX, int startY, int endValue){
        List<Integer> list = new ArrayList<>();
        //chứa tọa độ (x,y) của các điểm nằm trên đường đi tìm được
        Point p = getPathBFS(maze,row, colum,startX,startY,endValue);
        while (p.getParent() != null) {
            //System.out.println(p);
            list.add(p.x);
            list.add(p.y);
            p = p.getParent();
        }
        return list;
    }
}