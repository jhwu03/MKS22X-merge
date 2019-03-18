public class Merge{
  public static void mergesort(int[]data){
    if (data.length <= 1)
     return;
    mergesortH(data,0,data.length-1);
  }

  public static void mergesortH(int[] data,int lo,int hi){
    if (lo < hi){
      int middle = (hi + lo)/2;
      mergesortH(data,lo,middle);
      mergesortH(data,middle + 1,hi);
      merge(data,lo,middle,hi);
    }
  }
  
}
