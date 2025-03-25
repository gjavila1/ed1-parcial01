package ed.lab;
import java.util.*;

public class E01FlattenBT {

    public void flatten(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        //Creamos nuestro stack Integer
        Stack<TreeNode<Integer>> stack = new Stack<>();
        //hacemos push a la raiz
        stack.push(root);
        TreeNode<Integer> antes = null;

        //Validar que el stack no este vacioo
        while (!stack.isEmpty()) {
            TreeNode<Integer> node = stack.pop();

            if (antes != null) {
                antes.right = node;
                antes.left = null;
            }
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            //se iguala el valor anterior al valor acutal del nodo
            antes = node;
        }
    }
}