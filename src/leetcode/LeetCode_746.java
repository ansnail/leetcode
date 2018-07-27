package leetcode;

public class LeetCode_746 {

	public static void main(String[] args) {
		int[] cost = { 1, 2 };
		System.out.println(minCostClimbingStairs(cost));

	}

	public static int minCostClimbingStairs(int[] cost) {
		if (cost.length == 0 || cost.length == 1) {
			return 0;
		}
		if (cost.length == 2) {
			return cost[0] < cost[1] ? cost[0] : cost[1];
		}
		int[] newcost = new int[cost.length + 1];
		newcost[0] = 0;
		newcost[1] = 0;
		for (int i = 2; i < newcost.length; i++) {
			newcost[i] = Math.min(cost[i - 1] + newcost[i - 1], cost[i - 2] + newcost[i - 2]);
		}

		return newcost[newcost.length - 1];
	}

}
