class CircularQueue {
    
    private int[] data;
    private int head;
    private int tail;
    private int size;

    /**
     * 初始化循环队列
     */
    public CircularQueue(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }
    
    /**
     * 入队操作
     */
    public boolean enQueue(int value) {
        if (isFull() == true) {
            return false;
        }
        if (isEmpty() == true) {
            head = 0;
        }
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }
    
    /**
     * 出队操作 返回true则出对成功
     */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }
    
    /**
     * 获取队头
     */
    public int Front() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[head];
    }
    
    /**
     * 获取队尾
     */
    public int Rear() {
        if (isEmpty() == true) {
            return -1;
        }
        return data[tail];
    }
    
    /**
     * 判断队列是否为空
     */
    public boolean isEmpty() {
        return head == -1;
    }
    
    /**
     * 判断队列是否满
     */
    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }
}

