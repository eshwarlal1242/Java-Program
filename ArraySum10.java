class ArraySum10
{
           public static void findpair(int[] arr,int num)
{
	    for (int i = 0 ; i<arr.length-1;i++)
	   {
		  for(int j = i; i< arr.length;j++)
		   {
		if(arr[i] + arr[j]==num){
			System.out.printf("Pair found (%d,%d)",arr[i],arr[j]);
		}
		}
	}
System.out.println("Pair are not find");
}

public static void main(String arg[]) {
	int[] array = {3,2,6,4,7,8};
	int target = 10;
	findpair(array,target);
}
}
		