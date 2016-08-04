
public class BubbleSort {
    
	//冒泡排序算法，通过flag变量判断排序是否提前结束。
	public static void BubbleSort(int arr[])
	{
		int n = arr.length;
		int i,j,temp,flag;
		flag = 1;//flag:1表示排序没有结束，0表示排序已经结束
		for(i=1;i<n&&flag==1;i++)
		{
		  for(j=0;j<n-i;j++)
		  {
			  flag = 0;//如果以后的循环不改变flag的值，说明没有发生数组元素的交换
			  //也就是说，这个数组已经排好序了。所有就可以提前退出循环。
			  if(arr[j]>arr[j+1])
			  {
				  flag = 1;
				  temp = arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
			  }
			  
		  }
		}
		
	}
	
   public static void main(String[] args)
   {
	   int arr[]={34,67,32,19,8,20,17,44,67,80,42,57,38};
	   BubbleSort.BubbleSort(arr);
	   System.out.println("-----排序结果------");
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.print(arr[i]+" ");
	   }
	   
   }

}
