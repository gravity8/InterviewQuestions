package com.backendthethird.RestapipostgresqlandJWT.services;

import java.util.Stack;

public class BinaryTree {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        int temp;
        Stack<Integer> Stacknode = new Stack<>();
        for(int i=0; i<tokens.length; i++){
                switch(tokens[i]) {
                    case "+":
                        temp = Stacknode.pop() + Stacknode.pop();
                        Stacknode.push(temp);
                        break;
                    case "-":
                        temp =Stacknode.pop() - Stacknode.pop();
                        Stacknode.push(temp);
                        break;
                    case "*":
                        temp = Stacknode.pop() * Stacknode.pop();
                        Stacknode.push(temp);
                        break;
                    case "/":
                        int right = Stacknode.pop();
                        int left = Stacknode.pop();
                        temp= (int) Math.floor(left/right);
                        Stacknode.push(temp);
                        break;
                    default:
                        Stacknode.push(Integer.valueOf(tokens[i]));
                }
        }
        System.out.println(Stacknode.pop());
    }

}