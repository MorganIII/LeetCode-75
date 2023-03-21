class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int replcaedColor = image[sr][sc];
       int[][] floodFilledMatrix = floodFillHelper(image,sr,sc,color,replcaedColor);
       return floodFilledMatrix;
    }

    public int[][] floodFillHelper(int[][] image, int sr, int sc, int color, int replcaedColor ) {
            if(sr >= image.length || sc >= image[0].length || sr < 0 || sc < 0 || image[sr][sc] != replcaedColor || image[sr][sc] == color) {
                return image;
            }
            image[sr][sc] = color;

            image = floodFillHelper(image,sr+1,sc,color,replcaedColor);
            image = floodFillHelper(image,sr-1,sc,color,replcaedColor);
            image = floodFillHelper(image,sr,sc+1,color,replcaedColor);
            image = floodFillHelper(image,sr,sc-1,color,replcaedColor);
            return image;

            

                
    } 
}