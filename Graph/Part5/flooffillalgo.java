class Solution {
  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    boolean vis[][] = new boolean[image.length][image[0].length];
    int orgcol = image[sr][sc];

    // If original color is same as new color, no need to fill
    if (orgcol == color)
      return image;

    helper(image, sr, sc, color, vis, orgcol);
    return image;
  }

  public void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgcol) {
    // boundary conditions
    if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) {
      return;
    }

    // if already visited or not same color
    if (vis[sr][sc] || image[sr][sc] != orgcol) {
      return;
    }

    // mark visited and change color
    vis[sr][sc] = true;
    image[sr][sc] = color;

    // recursive calls in 4 directions
    helper(image, sr, sc - 1, color, vis, orgcol); // left
    helper(image, sr, sc + 1, color, vis, orgcol); // right
    helper(image, sr - 1, sc, color, vis, orgcol); // up
    helper(image, sr + 1, sc, color, vis, orgcol); // down
  }
}
