class Node {
		Node left;
		Node right;
		Node parent;
		int value;

		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
			this.parent=null;
		}
	}