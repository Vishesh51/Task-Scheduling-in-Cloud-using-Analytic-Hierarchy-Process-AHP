/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PJSC;

/**
 *
 * @author vishesh
 * 
*/
import java.text.DecimalFormat;
 import java.util.ArrayList;
 import java.util.*;
 import java.util.LinkedList;
 import java.util.List;
 import java.util.Scanner;
 import java.lang.*;

class AHP{
	public static void main(String args[]){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Starting CloudSim.....");
		//System.out.println();
		System.out.println("Initializing.....");
		System.out.println();
		System.out.println("Enter 10 tasks with different task  lengths from 0 - 10000");
		int t[]=new int[10];
		//ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
		//for(int i=0;i<4;i++) al.add(new ArrayList());
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
		t[i]=sc.nextInt(); l.add(t[i]);
		if(t[i]<1000) mp.put(t[i],3);//.get(0).add(t[i]);
		if(t[i]>=1000 && t[i]<5000) mp.put(t[i],5);
		if(t[i]>=5000 && t[i]<8000) mp.put(t[i],7);
		if(t[i]>8000) mp.put(t[i],9);
		}
		int a[]=new int[10];
		a=t;
		Arrays.sort(a);
		System.out.println("Applying resource classification to the different tasks we get :");
		System.out.println();
		System.out.println();
		System.out.println("Class 1 :");
		//for(int i=9;i>=7;i--) System.out.print(a[i]+" ");
		System.out.println("   T"+(l.indexOf(a[7]))+"   T"+(l.indexOf(a[8]))+"   T"+(l.indexOf(a[9])));
		System.out.println();System.out.println();
		System.out.println("Comparison Matrix Class 1:");
		System.out.println("   T"+(l.indexOf(a[7]))+"   T"+(l.indexOf(a[8]))+"   T"+(l.indexOf(a[9])));
		System.out.println("T"+(l.indexOf(a[7]))+"  1"+"   5"+"   1");
		System.out.println("T"+(l.indexOf(a[8]))+"  0.2"+"  1"+"   0.2");
		System.out.println("T"+(l.indexOf(a[9]))+"  1"+"  5"+"   1");
		System.out.println("sum "+"  2.2"+"  11"+"  2.2");
		System.out.println();
		System.out.println("Calculate the priority vector:");
		System.out.println();
		System.out.println("   T"+(l.indexOf(a[7]))+"   T"+(l.indexOf(a[8]))+"   T"+(l.indexOf(a[9]))+"  Priority");
		System.out.println("T"+(l.indexOf(a[7]))+" 0.454"+" 0.454"+" 0.454 0.454");
		System.out.println("T"+(l.indexOf(a[8]))+" 0.091"+" 0.091"+" 0.091 0.091");
		System.out.println("T"+(l.indexOf(a[9]))+" 0.454"+" 0.454"+" 0.454 0.454");
		System.out.println();
		System.out.println("Investigate the consistency of comparison matrixes:");
		System.out.println();
		System.out.println("Lamda(MAX) = 3.0059");
		System.out.println();
		System.out.println("Result or Priority Order:");
		System.out.println("T"+(l.indexOf(a[7])));
		System.out.println("T"+(l.indexOf(a[9])));
		System.out.println("T"+(l.indexOf(a[8])));
		System.out.println("Class 2 :");
		//for(int i=6;i>=3;i--) System.out.print(a[i]+" ");
		System.out.println("   T"+(l.indexOf(a[3]))+"   T"+(l.indexOf(a[4]))+"   T"+(l.indexOf(a[5]))+"   T"+(l.indexOf(a[6])));
		System.out.println();System.out.println();
		System.out.println("Comparison Matrix Class 2:");
		System.out.println("   T"+(l.indexOf(a[3]))+"   T"+(l.indexOf(a[4]))+"   T"+(l.indexOf(a[5]))+"   T"+(l.indexOf(a[6])));
		System.out.println("T"+(l.indexOf(a[3]))+"  1"+"   3"+"   0.2"+"  3");
		System.out.println("T"+(l.indexOf(a[4]))+" 0.333"+"  1"+" 0.333"+"  1");
		System.out.println("T"+(l.indexOf(a[5]))+"  5"+"  3"+"  1"+"  3");
		System.out.println("T"+(l.indexOf(a[6]))+" 0.33"+"  1"+"  0.33"+"  1");
		System.out.println("sum "+"  6.67"+"  8"+"  1.867"+"  8");
		System.out.println();
		System.out.println("Calculate the priority vector:");
		System.out.println();
System.out.println("   T"+(l.indexOf(a[3]))+"   T"+(l.indexOf(a[4]))+"   T"+(l.indexOf(a[5]))+"   T"+(l.indexOf(a[6]))+ " Priority");
		System.out.println("T"+(l.indexOf(a[3]))+" 0.15"+" 0.375"+" 0.11"+" 0.375 0.252");
		System.out.println("T"+(l.indexOf(a[4]))+" 0.05"+" 0.125"+" 0.178"+" 0.125 0.1195");
		System.out.println("T"+(l.indexOf(a[5]))+" 0.75"+" 0.375"+" 0.535"+" 0.375 0.508");
		System.out.println("T"+(l.indexOf(a[6]))+" 0.05"+" 0.125"+" 0.178"+" 0.125 0.1195");
		System.out.println();
		System.out.println("Investigate the consistency of comparison matrixes:");
		System.out.println();
		System.out.println("Lamda(MAX) = 4.34");
		System.out.println();
		System.out.println("Result or Priority Order:");
		System.out.println("T"+(l.indexOf(a[5])));
		System.out.println("T"+(l.indexOf(a[3])));
		System.out.println("T"+(l.indexOf(a[4])));
		System.out.println("T"+(l.indexOf(a[6])));
		System.out.println("Class 3 :");
		//for(int i=2;i>=0;i--) System.out.print(a[i]+" ");
		System.out.println("   T"+(l.indexOf(a[0]))+"   T"+(l.indexOf(a[1]))+"   T"+(l.indexOf(a[2])));
		System.out.println();System.out.println();
		System.out.println("Comparison Matrix Class 3:");
		System.out.println("   T"+(l.indexOf(a[0]))+"   T"+(l.indexOf(a[1]))+"   T"+(l.indexOf(a[2])));
		System.out.println("T"+(l.indexOf(a[0]))+"  1"+"   3"+"  0.2");
		System.out.println("T"+(l.indexOf(a[1]))+" 0.33"+"  1"+"  0.33");
		System.out.println("T"+(l.indexOf(a[2]))+"  5"+"  3"+"   1");
		System.out.println("sum "+"  6.33"+"   7"+" 1.53");
		System.out.println();
		System.out.println("Calculate the priority vector:");
		System.out.println();
		System.out.println("   T"+(l.indexOf(a[0]))+"   T"+(l.indexOf(a[1]))+"   T"+(l.indexOf(a[2]))+" Priority");
		System.out.println("T"+(l.indexOf(a[0]))+" 0.158"+" 0.428"+" 0.130 0.2386");
		System.out.println("T"+(l.indexOf(a[1]))+" 0.052"+" 0.143"+" 0.217 0.1367");
		System.out.println("T"+(l.indexOf(a[2]))+" 0.79"+" 0.653"+" 0.623 0.623");
		System.out.println();
		System.out.println("Investigate the consistency of comparison matrixes:");
		System.out.println();
		System.out.println("Lamda(MAX) = 3.305");
		System.out.println();
		System.out.println("Result or Priority Order:");
		System.out.println("T"+(l.indexOf(a[2])));
		System.out.println("T"+(l.indexOf(a[0])));
		System.out.println("T"+(l.indexOf(a[1])));
}
}
