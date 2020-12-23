package com.learnds;
//Circular Queue NOT IMPLEMENTED
class QueuecirAr{//Name as Queue But inside package name conflicts occurs
	int arr[];
	int capacity;
	int front,rear; 
	
	public QueuecirAr(int capacity) {
		this.capacity =capacity;
		arr = new int[capacity];
		front=0;
		rear=-1;
	}
	
	public void print() {
		if(isQueueEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		
		System.out.println("The contents of queue are: ");
		for(int i = front; i <=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private boolean isQueueEmpty() {
		if(front>rear) {
			return true;
		}
		return false;
	}
	
	private boolean isQueueFull() {
		if(( (rear + 1)% capacity) == front)
			return true;
		return false;
	}

	void enqueue(int num) {
		if(isQueueFull()) {
			System.out.println("Queue is Full");
			return;
		}
	}
	
	void dequeue() {
		if(isQueueEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
	}
	
	
}

public class CircularQueueImplUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueuecirAr cirQueArr = new QueuecirAr(5);
		//cirQueArr.;
	}

}
