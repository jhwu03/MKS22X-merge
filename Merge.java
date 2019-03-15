public class Merge{
  public static void mergesort(int[]data){
    int n = data.length;
    if(n == 1){
      return data[0];
    }
    mergesort(data,0,data.length-1);
  }
}
