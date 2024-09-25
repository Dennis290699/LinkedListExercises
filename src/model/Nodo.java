package model;

final class Node {
	char info;
	Node next;

	public Node(char letter, Node node) {
		info = letter;
		next = node;
	}
} // FINAL CLASS
