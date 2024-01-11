public class DubLinkedList {
    public Node head;
    public Node tail;

    public DubLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToHead(String data){

    }

    public String printList() {
        Node currentNode = this.head;
        String output = "<head> ";
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }

    public static void main(String[] args) {

    }
}
