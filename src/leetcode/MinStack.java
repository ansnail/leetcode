package leetcode;

class MinStack {

	int index = 0;
	int minIndex = 0;
	int[] nums;
	int[] mins;

	public MinStack() {
		nums = new int[32];
		mins = new int[32];
	}

	public void push(int x) {
		nums[index] = x;
		if (x <= nums[mins[minIndex]]) {
			if (index != 0) {
				minIndex++;
			}
			mins[minIndex] = index;
		}else {
			int tmp = mins[minIndex];
			minIndex++;
			mins[minIndex] = tmp;
		}
		index++;
	}

	public void pop() {
		index--;
		minIndex--;
	}

	public int top() {
		return nums[index];
	}

	public int getMin() {
		return nums[mins[minIndex--]];
	}

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.getMin();
		minStack.pop();
		minStack.top();
		minStack.getMin();
	}
}