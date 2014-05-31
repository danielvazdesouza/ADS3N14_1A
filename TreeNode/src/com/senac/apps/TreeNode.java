package com.senac.apps;
public class TreeNode<T extends Comparable<T>> {
	public TreeNode<T> leftNode;// nó esquerdo
	public T data;// valor do nó
	public TreeNode<T> rightNode;// nó direito

	public TreeNode(T nodeData) {
		data = nodeData;
		leftNode = rightNode = null;
	}

	public void insert(T insertValue) {
		// insere sub-árvore esquerda
		if (insertValue.compareTo(data) < 0) {
			if (leftNode == null) {
				leftNode = new TreeNode<T>(insertValue);
			} else {
				leftNode.insert(insertValue);
			}
			// insere na sub-árvore direita
		} else if (insertValue.compareTo(data) > 0) {
			if (rightNode == null) {
				rightNode = new TreeNode<T>(insertValue);
			} else {
				rightNode.insert(insertValue);
			}
		}
	}
}
