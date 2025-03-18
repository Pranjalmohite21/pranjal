import java.util.Arrays;
public class MergeSortedArrays{
public static void main(String[]args){
int[] arr1={1,4,7,10,15};
int[] arr2={2,5,8,12,18};
int[] mergedArray=mergeArrays(arr1,arr2);
System.out.println("merged sorted array:"+Arrays.toString(mergedArray));
}
public static int[]
mergeArrays(int[] arr1,int [] arr2) {
int n1=arr1.length,n2=arr2.length;
int[] merged=new int[n1+n2];
int i=0,j=0,k=0;
while(i<n1 && j<n2){
if(arr1[i] < arr2[j]) {
merged[k++]=arr1[i++];
}else {
merged[k++]=arr2[j++];
}
}
while(i<n1){
merged[k++]=arr1[i++];
}
while(j<n2){
merged[k++]=arr2[j++];
}
return merged;
}
}