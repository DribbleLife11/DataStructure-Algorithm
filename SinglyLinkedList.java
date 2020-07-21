public class SinglyLinkedList<T> {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        list.deleteByValue(2);

        System.out.println(list.size);
        list.get(4);

        print(list);

    }

    private Node head = null;

    private int size = 0;

    public SinglyLinkedList() {
    }

    /**
     * 插入(尾插法)
     */
    public void insert(int data) {
        Node newNode = new Node(data, null);

        if (head == null) {
            head = newNode;
        } else {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = newNode;
        }

        size++;
    }

    /**
     * 删除（通过值）
     * @param value
     */
    public void deleteByValue(int value) {
        if (head == null) return;

        Node p = head;
        Node prev = null;

        while (p != null && p.data != value ) {
            prev = p;
            p = p.next;
        }

        if (p == null) throw new NullPointerException("未找到数据为" + value + "的结点");

        if (p != null) {
            prev.next = p.next;
            size--;
        }


    }


    /**
     * 查询（通过索引）
     *
     * @param index
     * @return
     */
    public void get(int index) {
        Node p = head;
        int position = 0;

        while (p != null && position != index) {
            p = p.next;
            ++position;
        }

        System.out.println("索引" + index + "处的值为：" + p.data);
    }


    /**
     * 打印单链表
     * @param list
     */
    public static void print(SinglyLinkedList list) {
        Node curNode = list.head;

        System.out.print("SinglyLinkedList: ");

        while (curNode != null){
            System.out.print(curNode.data + " ");

            curNode = curNode.next;
        }
    }

    public int size() {
        return size;
    }

    //静态内部类：单链表的结点
    public static class Node {

        private final int data;             //结点的数据域

        private Node next;          //存储下一个结点的内存地址的指针

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }
}
