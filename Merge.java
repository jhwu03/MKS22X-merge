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

  public static void merge(int[] data, int lo, int middle, int hi){
    int half1 = middle - lo + 1;
    int half2 = hi - middle;
    int[] R = new int[half1];
    int[] C = new int[half2];

    for(int i = 0; i < half1; i++){
      R[i] = data[lo + i];
    }
    for(int i = 0;i < half2; i++){
      C[i] = data[(middle + 1)+ i];
    }

    int i, j;
    i = 0;
    j = 0;

  }

}
