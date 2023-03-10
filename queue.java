import java.util.*;
class Node{
	int data;
	Node next;
	public Node(){}
	public Node(int d){
		this.data = d;
			}
}

//@author:Santhosh Pandi 

class qu extends Node{
	Node front,rear;
	void enqueue(int d)
	{
		Node newnode;
		if(rear==null&&front==null)
		{
			newnode = new Node(d);
			rear = newnode;
			front = rear; 
		}
		else{
			newnode = new Node(d);
			rear.next=newnode;
			rear=rear.next;
		}

	}
	int size()
	{
		Node t = front;
		int count=0;
		if(t==null)
		{
			return count;
		}
		else{
				do{
				count+=1;
				t=t.next;
			}while(t!=null);
			return count;
		}
	}

	int dequeue()
	{
		int value=0;
		if(front==null)
		{
			System.out.println("Empty queue");
			
		}
		else{
			value=front.data;
			front=front.next;
		}
		return value;

	}
	void display()
	{
		Node t = front;
		if(t==null)
		{
			System.out.println("Empty queue");
			return;
		}
		else{
			System.out.println("\n===========================");
			do{
				System.out.print(" | "+t.data);
				t=t.next;
			}while(t!=null);
			System.out.print(" |\n");
			System.out.println("===========================");
		}

	}
	boolean isEmpty()
	{
		Node t = front;
		if(t==null)
			return true;
		else
			return false;
	}

}

public class queue{
	public static void main(String[] args)
	{
		qu q = new qu();
		Scanner c = new Scanner(System.in);
		while(true)
		{
			System.out.println("\n-------------------------------------------------------------------------------");
			System.out.println("Queue: \n== 1.Enqueue == 2.Dequeue == 3.display == 4.isEmpty == 5.size == 6.exit ==");
			System.out.println("-------------------------------------------------------------------------------");
			int choice = c.nextInt();
			switch(choice)
			{
			case 1:
				{
					System.out.println("enter the value to be enqueue");
					q.enqueue(c.nextInt());
					break;
				}
			case 2:
				{
					System.out.println(q.dequeue() +" dequeued successfully");
					break;
				}
			case 3:
				{
					q.display();
					break;
				}
			case 4:
				{
					System.out.println("The Queue is empty : "+q.isEmpty());
					break;
				}
			case 5:
				{
					System.out.println("\nThe size of the Queue is : "+q.size());
					break;
				}
			case 6:
				{
					return;
				}
			default:
				{
					System.out.println("Warning: Enter the correct choice !");
				}

			}
		}
	}
}