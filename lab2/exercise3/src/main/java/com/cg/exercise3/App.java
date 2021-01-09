package com.cg.exercise3;

/**
 * Hello world!
 *
 */
import java.util.Arrays;


    	public class App {

    		public static void main(String[] args) {
    			int array[] = { 10, 33, 32, 19, 25, 98, 75, 45 };
    	
    			
    		int[] array1 = getSorted(array);
			for (int i = 0; i <array1.length; i++) {
				System.out.println(array1[i]);
			}

    		}

    		public static int[] getSorted(int array[]) {
    			StringBuilder sb;
    			int array1[] = new int[array.length];
    			for (int i = 0; i < array.length; i++) {
    				String str = String.valueOf(array[i]);
    				// array[i].toString();
    				sb = new StringBuilder(str);

    				// System.out.println(" " + sb.reverse());
    				array1[i] = Integer.parseInt(sb.reverse().toString());

    				// System.out.println(" "+)
    			}
    			//Arrays.sort(arr, array1.reverseOrder());
        		Arrays.sort(array1);
    			return array1;    			
    			
    		}

    	}
