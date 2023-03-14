package com.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;


public class Main {

	public static void main(String[] args) {
		Queue<Integer> que=new LinkedList();
		que.add(56);
		que.add(30);
		que.add(70);
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}
	}

