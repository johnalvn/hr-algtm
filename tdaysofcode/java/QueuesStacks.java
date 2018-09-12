import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuesStacks {

	Queue<Character> queue;
	Stack<Character> stack;
	
	public QueuesStacks() {
		// TODO Auto-generated constructor stub
		this.queue = new LinkedList<Character>();
		this.stack = new Stack<Character>();
	}
	
	void enqueueCharacter(char c) {
		this.queue.add(c);
	}
	char dequeueCharacter() {
		return this.queue.remove();
	}
			
	void pushCharacter(char c) {
		this.stack.push(c);
	}
	char popCharacter() {
		return this.stack.pop();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "racecar";
		char[] wordA = word.toCharArray();
		
		QueuesStacks qs = new QueuesStacks();
		
		for(char c : wordA) {
			qs.enqueueCharacter(c);
			qs.pushCharacter(c);
		}
		
		Boolean isPalindrome = true;
		for	(int i = 0; i < wordA.length/2; i++) {
			if(qs.dequeueCharacter() != qs.popCharacter()) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.print("the word "+word+" is " + (isPalindrome? "a palindrome" : "is not a palindrome"));
	}
	
	
	
	
	

}
