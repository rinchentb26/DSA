class Queue
{
	int capacity;
	int front,rear;
	int a[];
	Queue(int capacity)
	{
		front = rear = -1;
		this.capacity = capacity;
		a = new int[capacity];
	}
	public void enqueue(int val)
	{
		if(isFull())
			System.out.println("Overflow, can't Enqueue");
		else
		{
			if(front == -1)
				front = 0;
			a[++rear] = val;
			System.out.println(a[rear]+" enqueued.");
		}
	}
	public void dequeue()
	{
		if(isEmpty())
			{
				System.out.println("Underflow, can't dequeue");
			}
		else
		{
			int deleted_item;
			deleted_item = a[front++];
			if(front>rear)
				front=rear=-1;
			System.out.println(deleted_item +" dequeued");
		}
	}
	
	public boolean isFull()
	{
		return rear == capacity -1;
	}
	public boolean isEmpty()
	{
		return front==-1;
	}
	// only to check implementation
	public void display()
	{
		System.out.println("");
		for(int i=front;i<=rear;i++)
		{
			System.out.print(a[i]+"\t");
		}System.out.println("");
	}
	public void front()
	{
		if(isEmpty())
			System.out.println("Underflow");
		System.out.println(a[front]);
	}
	public void rear()
	{
		if(isEmpty())
			System.out.println("Underflow");
		System.out.println(a[rear]);
	}

}
class Main{
	public static void main(String args[]){
		Queue q = new Queue(5);
		q.enqueue(5);
		q.enqueue(15);
		q.enqueue(25);
		q.enqueue(35);
		q.enqueue(45);
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();
		q.front();
		q.rear();
		
	}	
}