class NoChange {
 public static void main(String[] args) {
int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    for(int x : nums) {
    System.out.print(x + " " + " ");
    x = x * x; // no effect on nums because x take value inside of block and nums is outside of the block.
    System.out.print(x + " ");
    }
    System.out.println();
    for(int x : nums)
    System.out.print(x + " ");
    System.out.println();

 }
}