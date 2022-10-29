package ջ�Ͷ���;

import java.util.Stack;

// �����Ȳ�ʹ�������Լ���д��stack����࣬������java.util.Stack�����ṩ���ࣻ�����Լ�д�����ڽӿ��Ϻ�java.util.Stack�������һ�µ�

class Solution {

	public boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<>();
// ����һ��ջstack����ŵ�Ԫ����Character
		for(int i = 0 ; i < s.length() ; i++) {			
// ���忴s�ַ����еĵ�i���ַ���ʲô����		
			char c = s.charAt(i);
//	��i���ַ������ char c
			if(c == '(' || c == '[' || c == '{')
				stack.push(c);
// ��c push�����stack��
			else {
// ����Ļ�������ַ������������ţ�������Ҫ����ջ�����ַ�������������Ƿ�ƥ��
				if(stack.isEmpty())
					return false;
//	���ȿ������ջ�ǿյĻ�����ôƥ����ʧ�ܵ�	
				
				char topChar = stack.pop();
// ��ջ����Ԫ��pop��������ΪtopChar
				if(c == ')' && topChar !='(')
					return false;
				if(c == ']' && topChar !='[')
					return false;
				if(c == '}' && topChar !='{')
					return false;
			}
		}
//	return true;����
//	��ʱ���ǻ�Ҫ��һ�����ǵ�ջ���Ƿ����ַ������ջ�ﻹ���ַ�����Ϊ�յĻ�����ʱƥ�仹��ʧ�ܵġ�
//	��Ϊ����൱������ջ�����ַ�û�п�ƥ�䣬ֻ��ջ Ϊ��stack.isEmpty()Ϊtrue��ʱ�����ƥ��ɹ��� 
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {

		System.out.println((new Solution()).isValid("()[]{}"));
		System.out.println((new Solution()).isValid("([)]"));
	}
}

	
	
	