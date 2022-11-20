package ��ָOfferIIר��ͻ����;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ��ָOfferIIר��ͻ����.OfferII056�����������������ڵ�֮��֮Map.TreeNode;

public class OfferII056�����������������ڵ�֮��֮DFS��ϣ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(){};
		TreeNode(int val){
			this.val = val;
		}
		TreeNode(int val,TreeNode left,TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
		}	
	}
    public boolean findTarget(TreeNode root, int k) {
    	// ����һ����ϣ������Ѿ��������Ľڵ�ֵ
    	Set<Integer> set= new HashSet<>();
    	// ����ջ�����������������
    	Deque<TreeNode> stack = new ArrayDeque<>();
    	// �������
    	while (root!=null || !stack.isEmpty()) {
    		while(root!=null) {
    			stack.push(root);
    			root = root.left;
    		}
    		TreeNode node = stack.pop();
        	// �жϹ�ϣ�����Ƿ���� `k - val`
        	if(set.contains(k-node.val)) {
        		return true;
        	}
        	set.add(node.val);
        	root = node.right;
    	}
    	return false;
    }
}
