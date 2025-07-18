// Create Binary tree  
import java.util.*;
public class BinaryTreeStructure {
    static class Node {
        int data;
        Node left; 
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;

        // Building the Binary Tre
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Preorder Traversal
        public static void preOrder(Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // Inorder Traversal
        public static void inOrder(Node root) {
            if(root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // Postorder Traversal
        public static void postOrder(Node root) {
            if(root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // Level Order Traversal
        public static void levelOrder(Node root) {
            if(root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        // Count Number of Nodes
        public static int countOfNodes(Node root) {
            if(root == null) {
                return 0;
            }
            int leftNodes = countOfNodes(root.left);
            int rightNodes = countOfNodes(root.right);

            return leftNodes + rightNodes + 1;
        }

        // Sum of Nodes
        public static int sumOfNodes(Node root) {
            if(root == null) {
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }


        // Height of tree
        public static int height(Node root) {
            if(root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }

        // Diameter of the tree (O(n^2))
        public static int diameter(Node root) {
            if(root == null) {
                return 0;
            }
            int dia1 = diameter(root.left);
            int dia2 = diameter(root.right);
            int dia3 = height(root.left) + height(root.right) + 1;

            return Math.max(dia3, Math.max(dia1, dia2));
        }

        // Diameter of the tree (O(n))
        static class TreeInfo {
            int ht; //height
            int diam; //diameter

            TreeInfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;
            }
        }
        public static TreeInfo diameter2(Node root) {
            if(root == null) {
                return new TreeInfo(0,0);
            }

            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);

            int myht = Math.max(left.ht, right.ht) + 1;

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;

            int myDiam = Math.max(Math.max(diam1, diam2), diam3);

            TreeInfo myInfo = new TreeInfo(myht, myDiam);
            return myInfo;
        }
    }
    public static void main(String args[]) {
        int nodes [] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);

        System.out.println();
        tree.levelOrder(root);

        System.out.println();
        System.out.println(tree.countOfNodes(root));

        System.out.println();
        System.out.println(tree.sumOfNodes(root));

        System.out.println();
        System.out.println(tree.height(root));

        System.out.println();
        System.out.println(tree.diameter(root));

        System.out.println();
        System.out.println(tree.diameter2(root).diam);
    }
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public boolean isIdentical(TreeNode root, TreeNode subRoot) {
//         if(root == null && subRoot == null) {
//             return true;
//         }
//         if(root == null || subRoot == null) {
//             return false;
//         }
//         if(root.val == subRoot.val) {
//             return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
//         }
//         return false;
//     }
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//         if(subRoot == null) {
//             return true;
//         }

//         if(root == null) {
//             return false;
//         }

//         if(root.val == subRoot.val) {
//             if(isIdentical(root, subRoot)) {
//                 return true;
//             }
//         }

//         return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//     }
// }