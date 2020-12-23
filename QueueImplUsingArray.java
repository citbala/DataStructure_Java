package com.learnds;
//Queue implementation using Arrays

/*
* Whenever we dequeue or remove elements from queue, we shift remaining elements towards front by 1.
*/
class QueueAr{/*Remember we should name the class as Queue 
				BUT inside package name conflicts occurs*/
	int arr[];
	int rear, front;//always people in front of queue gets popped. And people gets added at end of queue based on capacity
	int capacity;
	//int size; NOT NEEDED
	
	QueueAr(int capacity){
		this.capacity = capacity;
		front=0;
		rear=-1;
		arr= new int[capacity];
		
	}
	
	void insert(int num){//add , enqueue or whatever term
		if(isFull()){
			System.out.println("Queue is full");
			return;
		}
		
		rear++;
		arr[rear]=num;
	}
	
	void peek(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		//System.out.println("Value of front: "+front); It will be 0 since we shift elements by 1
		System.out.println("Front element : "+arr[front]);
	}
	
	void pop(){//remove, dequeue or whatever term
		int num=-1;
		int i = front;
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		
		num=arr[front];
		for(i = front; i < rear; i++){
			arr[i]=arr[i+1];
		}
		arr[i]=0;
		rear--; 
		//rear--; or adjust by moving all rear by 1
		System.out.println("Popped : "+num);
	}
	
	boolean isFull(){
		if(rear+1 == capacity){
			return true;
		}
		return false;
	}
	
	boolean isEmpty(){
		if(rear<front){//or front > rear
			return true;
		}
		return false;
	}
	
	void print(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		int i =0;
		for(i = front; i <=rear;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}

class QueueImplUsingArray{
	public static void main(String args[]){
		QueueAr q = new QueueAr(5);
		System.out.println("Inside main");
		q.insert(203);
		q.insert(201);
		q.insert(211);
		q.insert(206);
		q.insert(205);
		
		q.peek();
		q.print();
		System.out.println("Added : ");
		
		q.pop();
		q.pop();
		q.pop();
		
		q.peek();
		
		q.pop();
		q.pop();
		q.pop();
		q.insert(1);
		q.insert(11);
		//System.out.println(q.peek());
		
		q.print();
		
		q.insert(2503);
		q.insert(1503);
		q.insert(503);
		
		q.print();
		
		q.pop();
		q.insert(1509);
		
		q.print();
		
		q.insert(1511);
		q.insert(9999);  //should fail
	}
}
