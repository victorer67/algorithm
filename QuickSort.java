package uest.sort;


public class QuickSort {
	 public static void quickSort(int[] data, int start, int end) {  
	        // 设置关键数据key为要排序数组的第一个元素，  
	        // 即第一趟排序后，key右边的数全部比key大，key左边的数全部比key小  
	        int key = data[start];  
	        // 设置数组左边的索引，往右移动比key大的数  
	        int i = start;  
	        // 设置数组右边的索引，往左移动比key小的数  
	        int j = end;  
	        // 如果左边索引比右边索引小，则还有数据没有排序  
	        while (i < j) {  
	            while (data[j] > key && j > i) {  
	                j--;  
	                
	                
	            }  
	            data[i] = data[j];  
	  
	            while (data[i] < key && i < j) {  
	                i++;  
	            }  
	            data[j] = data[i];  
	        }  
	        // 此时 i==j  
	        data[i] = key;  
	  
	        // 递归调用  
	        if (i - 1 > start) {  
	            // 递归调用，把key前面的完成排序  
	            quickSort(data, start, i - 1);  
	        }  
	        if (i + 1 < end) {  
	            // 递归调用，把key后面的完成排序  
	            quickSort(data, i + 1, end);  
	        }   
	    }  
	 public static void main(String[] args) {  
	        int[] p = { 34, 21, 54, 18, 23, 76, 38, 98, 45, 33, 27, 51, 11, 20, 79,  
	                30, 89, 41 };  
	  
	        long start = System.currentTimeMillis();  
	  
//	      Sort.bubbleSort(p);// 冒泡排序  
//	      Sort.selectSort(p);// 选择排序  
//	      Sort.selectSort2(p);// 选择排序2  
	        QuickSort.quickSort(p, 0, p.length - 1);// 快速排序  
	  
	        System.out.println("所用时间：" + (System.currentTimeMillis() - start));  
	        for (int i = 0; i < p.length; i++) {  
	            System.out.print(p[i] + " ");  
	        }  
	    }  

}
