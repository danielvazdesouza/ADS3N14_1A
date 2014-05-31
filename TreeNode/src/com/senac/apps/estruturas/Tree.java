package com.senac.apps.estruturas;

import com.senac.apps.TreeNode;

public class Tree<T extends Comparable<T>> {
	private TreeNode<T> root;

	public Tree() {
		root = null;
	}

	public void insertNode(T insertValue) {
		if (root == null) {
			root = new TreeNode<T>(insertValue);// Cria nó raiz
		} else {
			root.insert(insertValue);
		}
	}

	public void preorderTraversal() {
		preorderHelper(root);
	}

	public void preorderHelper(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		System.out.printf("%s ", node.data); // gera saida de dados do nó
		preorderHelper(node.leftNode); // percorre subárvore esquerda
		preorderHelper(node.rightNode); // percorre subárvore direita
	}

	public void inorderTraversal() {
		inorderHelper(root);
	}

	public void inorderHelper(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		inorderHelper(node.leftNode);
		System.out.printf("%s ", node.data);
		inorderHelper(node.rightNode);
	}

	public void postorderTraversal() {
		postorderHelper(root);
	}

	public void postorderHelper(TreeNode<T> node) {
		if (node == null) {
			return;
		}
		postorderHelper(node.leftNode);
		postorderHelper(node.rightNode);
		System.out.printf("%s ", node.data);
	}
}
