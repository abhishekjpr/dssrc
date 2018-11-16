package com.abhishek.questions.arrays;

public class ConnectedTeamAndMaxSize {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,1,1,0,0},{0,1,0,0,1},{1,0,0,1,1},{0,0,0,0,0},{1,1,1,0,1}};
        System.out.println(new ConnectedTeamAndMaxSize().countNumberOfTeams(arr));
    }

    int[] countNumberOfTeams(int [][]arr){

        int[] resultArray = new int[2];
        int row = arr.length-1;
        int col = arr[0].length-1;
        int count = 0;
        boolean[][] isVisited = new boolean[row][col];
        Integer maxSize = 0;
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < col; ++j){
                if(!isVisited[row][col] && arr[row][col] == 1){
                    Integer maxSizeReceived = depthFirstSearch(arr, i, j, isVisited, maxSize);
                    ++count;
                    if(maxSizeReceived > maxSize){
                        maxSize = maxSizeReceived;
                    }
                }
            }
        }
        resultArray[0] = count;
        resultArray[1] = maxSize;
        return resultArray;
    }

    Integer depthFirstSearch(int[][] arr, int row, int col, boolean[][] isVisited, Integer maxSize){

        int[] allColumnIndex = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};
        int[] allRowIndex = new int[]{-1, -1, -1, 0, 1, 1, 1, 0};

        isVisited[row][col] = true;
        for(int index = 0; index < allColumnIndex.length; ++index){
            int rowIndex = row+allRowIndex[index];
            int colIndex = col + allColumnIndex[index];
            if(isValidIndex(arr, rowIndex, colIndex, isVisited)){
                depthFirstSearch(arr, rowIndex, colIndex, isVisited, ++maxSize);
            }
        }
        return maxSize;
    }

    boolean isValidIndex(int[][] arr, int row, int col, boolean[][] isVisited){

        boolean isValid = (row >= 0) && (row < arr.length) &&
                (col >= 0) && (col < arr[0].length) &&
                (arr[row][col] == 1 && !isVisited[row][col]);

        return isValid;
    }
}
