package hR_2017;

import java.util.Scanner;

public class FindTheBug {
	static int[] findTheBug(String[] grid){
        // Complete this function
		for(int i=0;i<grid.length;i++){
			if(grid[i].contains("X")){
				return new int[]{i,grid[i].indexOf('X')};
			}
		}
		return new int[]{0,0};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        // Return an array containing [r, c]
        int[] result = findTheBug(grid);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "," : ""));
        }
        System.out.println("");
        

    }

}
