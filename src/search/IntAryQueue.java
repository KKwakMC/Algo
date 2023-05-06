package search;

public class IntAryQueue {
		private int max;
		private int front;
		private int rear;
		private int num;
		private int[] que;
		
		//실행 시 예외 : 큐가 비어 있음
		public class EmptyIntQueueException extends RuntimeException{
			public EmptyIntQueueException() {};
		}
		
		//실행 시 예외 : 큐가 가득 참 
		public class OverflowIntQueueException extends RuntimeException {
			public OverflowIntQueueException() {};
		}
		
		//생성자
		public IntAryQueue(int capacity) {
			num = front = rear = 0;
			max = capacity;
			
			try {
				que = new int[max];
			} catch (OutOfMemoryError e) {
				max = 0;
			}
		}
		
		//큐에 데이테를 인큐
		public int enque(int x) throws OverflowIntQueueException{
			if(num >= max)
				throw new OverflowIntQueueException();
			que[rear++] = x;
			num++;
			if(rear == max)
				rear = 0;
			return x;
		}
		
		
		//큐에서 데이터를 디큐
		public int deque() throws EmptyIntQueueException {
			if(num <= 0)
				throw new EmptyIntQueueException();
			int x = que[front++];
			num--;
			if(front == max)
				front = 0;
			return x;
		}
		
		//큐를 비움
		public void clear() {
			num = front = rear = 0;
		}
		
		//큐의 용량을 반환
		public int capacity() {
			return max;
		}
		
		//큐에 쌓여 있는 데이터 수를 반환
		public int size() {
			return num;
		}
		
		//큐가 비어있나요?
		public boolean isEmpty() {
			return num <= 0;
		}
		
		//큐가 가득 찼나요?
		public boolean isFull() {
			return num >= num;
		}
		
		//큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
		public void dump() {
			if(num <= 0)
				System.out.println("큐가 비어 있습니다.");
			else {
				for(int i=0; i<num; i++)
					System.out.print(que[(i + front) % max] + "");
				System.out.println();
			}
		}
}
