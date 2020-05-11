class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor)
            return image;
        change(image,sr,sc,image[sr][sc],newColor);
            return image;
        
    }
    public void change(int[][] image, int sr, int sc,int oldcolor, int newColor){
        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length || image[sr][sc]!=oldcolor){
            return;
        }
        image[sr][sc]=newColor;
        change(image,sr-1,sc,oldcolor,newColor);
        change(image,sr+1,sc,oldcolor,newColor);
        change(image,sr,sc-1,oldcolor,newColor);
        change(image,sr,sc+1,oldcolor,newColor);
    }
}
 
