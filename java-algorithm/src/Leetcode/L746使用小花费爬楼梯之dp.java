package Leetcode;

public class L746ʹ��С������¥��֮dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost[] = {1,100,1,1,1,100,1,1,100,1};
//		System.out.println(new L746浣跨敤锟�??灏忚姳璐圭埇妤兼涔媎p().minCostClimbingStairs(cost));
	}
	
    public int minCostClimbingStairs(int[] cost) {
    	int dp[] = new int[cost.length];
    	dp[0] = cost[0];
    	dp[1] = cost[1];
    	for (int i = 2;i<cost.length;i++) {
			dp[i] = Math.min(dp[i-1], dp[i-2])+cost[i];
		}
    	// 娉ㄦ剰锟�??鍚庘紑姝ュ彲浠ョ悊瑙ｄ负涓嶁饯鑺辫垂锛屾墍浠ュ彇鍊掓暟绗紑姝ワ紝绗紗姝ョ殑锟�??灏戯�???
    	return Math.min(dp[cost.length-1], dp[cost.length-2]);
    }

}
