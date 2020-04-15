package link;

/*
    链表节点
 */
public class LinkedListNode<T>{
    //节点数据
    private T data;
    //下一个节点的地址
    private LinkedListNode<T> next;
    /*
        无参构造
     */
    public LinkedListNode() {
    }

    public LinkedListNode(T data) {
        this.data = data;
    }

    public LinkedListNode(T data, LinkedListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return ""+data;
    }
}
