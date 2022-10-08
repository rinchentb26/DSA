class CircularQueue{
	int a[];
	int capacity;
	int front,rear;
	CircularQueue(int capacity){
		front =rear= -1;
		this.capacity = capacity;
		a=new int[capacity];
	}
	public void enqueue(int val)
	{
		if(isFull())
			System.out.println("Overflow,can't enqueue");
		else
		{
			if(front==-1)
				front = 0;
			rear = (rear+1)%capacity;
			a[rear] = val;
			System.out.println(val+" was added.");
		}
	}
	public void dequeue()
	{
		if(isEmpty())
			System.out.println("Underflow,can't dequeu");
		else
		{
			int item = a[front];
			front = (front+1) % capacity;
			System.out.println(item + " was popped.");
		}
		
	}
	public boolean isFull()
	{
		if((rear+1)%capacity == front)
			return true;
		else
			return false;
	}
	public boolean isEmpty()
	{
		return front == -1;
	}
	public void display()
	{
		if(isEmpty())
			System.out.println("Empty Queue");
		else
		{
			int i=front;
			while(i!=rear){
				System.out.print(a[i]+"\t");
				i = (i+1)%capacity;
			} System.out.print(a[i]);
		}
	}
	public void front()
	{
		if(!isEmpty())
			System.out.print("\n"+ a[front]);
	}
	public void rear()
	{
		if(!isEmpty())
			System.out.print("\n"+ a[rear]);
	}
}
class Main{
	public static void main(String args[]){
		CircularQueue q=new CircularQueue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println(q.isFull());
		q.enqueue(60);
		q.dequeue();
		q.dequeue();
		System.out.println(q.isFull());
		q.enqueue(70);
		q.enqueue(80);
		q.enqueue(90);
		System.out.println(q.isFull());
		q.display();
		q.front();
		q.rear();
	}
}