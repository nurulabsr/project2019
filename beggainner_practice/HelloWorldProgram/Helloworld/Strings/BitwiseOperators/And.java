class And {
 public static void main(String[] args) {
 char ch;
 char h = 'a';
 h =  ( 90 & 65503);
System.out.println(h);

for(int i=0; i <= 25; i++) {
 ch = (char) ('a' + i);    
    // This statement turns off the 6th bit.
    ch = (char) ((int) ch & 65503); // ch is now uppercase
    System.out.print(ch + " ");
 }
 }
}