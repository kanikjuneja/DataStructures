package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree obj = new BinarySearchTree();
		int[] inp = {1,2,3,4,5,6,7};
		
		Node rootNode = obj.createBST(inp, 0, inp.length-1);
		int val = 2;
		obj.add(rootNode, val);
		int toFind = 5;
		System.out.println("Found:");
		Node resNode = obj.find(rootNode, toFind);
		System.out.println(resNode.data);
		System.out.println("Leaf Nodes:");
		obj.printLeafNodes(rootNode);
		System.out.println("PreOrder Traversal:");
		obj.preOrder(rootNode);
		System.out.println(" InOrder Traversal:");
		obj.inOrder(rootNode);
		System.out.println("PostOrder Traversal:");
		obj.postOrder(rootNode);
		System.out.println("Breadth First Search:");
		obj.breadthFirstSearch(rootNode);
	}
	public Node createBST(int inp[], int startIdx, int endIdx){
		if(endIdx<startIdx){
			return null;
			}
		int midIdx = (startIdx+endIdx)/2;
		Node newNode = new Node();
		newNode.data = inp[midIdx];
		newNode.left = createBST(inp, startIdx, midIdx-1);
		newNode.right = createBST(inp, midIdx+1, endIdx);
		return newNode;
	}
	public void add(Node rootNode, int val){
        if(rootNode == null || rootNode.data == val){
            return;
        }
        else{
            if(rootNode.data > val){
                if(rootNode.left == null){
                    rootNode.left = new Node();
                    rootNode.left.data = val;
                }
                else{
                    add(rootNode.left, val);
                }
               
            }
            else{
                if(rootNode.right == null){
                    rootNode.right = new Node();
                    rootNode.right.data = val;
                }
                else{
                    add(rootNode.right, val);
                }
            }
        }
    }
	public Node find(Node rootNode, int val){
		if(rootNode == null || rootNode.data == val){
			return rootNode;
		}
		else{
			if(rootNode.data>val){
				return find(rootNode.left, val);
			}
			else{
				return find(rootNode.right, val);
			}
		}
	}
	public void printLeafNodes(Node rootNode){
		if(rootNode == null)return;
		printLeafNodes(rootNode.right);
		printLeafNodes(rootNode.left);
		if(rootNode.left == null && rootNode.right == null){
			System.out.println(rootNode.data);
		}
	}
	public void preOrder(Node rootNode){
		if(rootNode==null){
			return;
		}
		else{
			System.out.println(rootNode.data);
			preOrder(rootNode.left);
			preOrder(rootNode.right);
		}
	}
	public void inOrder(Node rootNode){
		if(rootNode==null){
			return;
		}
		else{
		inOrder(rootNode.left);
		System.out.println(rootNode.data);
		inOrder(rootNode.right);
		}
	}
	public void postOrder(Node rootNode){
		if(rootNode==null){
			return;
		}
		else{
		inOrder(rootNode.left);
		inOrder(rootNode.right);
		System.out.println(rootNode.data);
		}
	}
	public void breadthFirstSearch(Node rootNode){
		if(rootNode==null){
			return;
		}
		Queue<Node> que = new LinkedList<>();
		que.add(rootNode);
		while(!que.isEmpty()){
			Node currNode = que.remove();
			System.out.println(currNode.data);
				if(currNode.left != null){
					que.add(currNode.left);
				}
				if(rootNode.right != null){
					que.add(currNode.right);
				}
		}
		
	}
		
	private static class Node{
		int data;
		Node left, right;
		
	}

}
