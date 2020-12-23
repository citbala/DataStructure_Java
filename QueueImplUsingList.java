package com.learnds;
class Node{
	int data;
	Node next;
}

class Queue{
	Node front ;//front(or head or top)
	Node rear ;//rear(tail or last)
	int capacity;
	int currSize;
	
	Queue(int capacity){
		this.capacity = capacity;
		front=rear=null;
	}
	
	void print(){
		Node temp=front;
		System.out.print("Queue contains : ");
		while(temp!=null){
			System.out.print(temp.data+"->");temp=temp.next;
		}
		System.out.println("NULL");
	}
	
	int getCurrSize(){
		int count=0;
		
		if(rear==null){
			return count;
		}
		else{
			Node temp=front;//queue starts from FRONT dont put REAR which will always return 1 REAR is TAIL of QUEUE
			while(temp!=null){
				count++;temp=temp.next;
			}
			return count;
		}
	}
	
	boolean isQueueFull(){
		return (getCurrSize() >= this.capacity);
	}
	
	boolean isQueueEmpty(){
		return (getCurrSize() < 1 );
	}
	
	void peek() {
		System.out.println("The front of queue is: "+ front.data);
	}
	
	void enqueue(int num){//insert or add or push
		if(isQueueFull()){
			System.out.println("Queue is full");
			return;
		}

		if(rear == null){
			rear = new Node();
			rear.data = num;
			rear.next = null;
			front=rear;
		}
		else{
			Node temp=new Node();
			
			temp.data=num;
			temp.next=null;
			rear.next=temp;
			rear=temp;
		}
	}
	
	void dequeue(){//pop or remove or delete
		if(isQueueEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		
		Node temp=front;
		front=temp.next;
		System.out.println("Deleted "+temp.data);
		//delete temp;
	}
	
}

class QueueImplUsingList{
	public static void main(String ar[]){
		Queue q = new Queue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		
		q.peek();
		q.print();
		
		q.dequeue();
		q.peek();
		q.dequeue();
		q.peek();
		q.dequeue();
		q.enqueue(7);
		q.peek();
		q.print();
		
		
		
	}
}