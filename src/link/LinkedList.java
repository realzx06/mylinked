package link;

public class LinkedList<T> {
    //保存第一个节点
    private LinkedListNode<T> head;

    public LinkedList() {
    }

    public LinkedList(LinkedListNode<T> head) {
        this.head = head;
    }

    public LinkedList(T t){
        head=new LinkedListNode<T>(t);
    }


    /*
        get 传入指定下标,返回该下标指定的节点
     */
    public LinkedListNode get(int index){

        if(index==0){
            return head;
        }else if(index >0 && index<size()){
            LinkedListNode<T> temp=head;
            for(int i=0 ;i<index;i++){
                temp=temp.getNext();
            }
            return temp;
        }else{//返回最后一个节点
            LinkedListNode<T> temp=head;
            for(int i=0;i<size()-1;i++){
                temp=temp.getNext();
            }
            return temp;
        }
    }
    /*
            add添加节点
     */
    public void add(LinkedListNode<T> node,int index){
        if(index==0){
            LinkedListNode temp=head;
            head =node;
            head.setNext(temp);
        }else if(index >0 &&index <size()){
            System.out.println(1);
            LinkedListNode temp = get(index-1);
            node.setNext(temp.getNext());
            temp.setNext(node);
        }else{
            if(isEmpty()){
                add(node,0);
            }
            LinkedListNode temp = get(size());
            temp.setNext(node);

        }
    }

    /*
        对外提供的add方法
      */
    public void add(T data ,int index){
        add(new LinkedListNode(data),index);
    }

    /**
     * 删除节点
     */
    public void delete(int index){
        if(index==0){
            if(head !=null){
                head=head.getNext();
            }
        }else if(index >0 && index<size()){

            LinkedListNode temp= get(index -1);

            temp.setNext(temp.getNext().getNext());
        }else {
            get(size()-2).setNext(null);
        }
    }

    /*
          size 返回链表的长度
     */
    public int size(){
        int ret=0;
        LinkedListNode<T> temp = head;
        while(temp !=null){
            ret++;
            temp=temp.getNext();
        }
        return ret;
    }
    /*
        isEmpty 判断链表是否为空
     */
    public boolean isEmpty(){
        return head==null;
    }

    @Override
    public String toString() {
        String ret = "";
        if (head != null) {
            LinkedListNode<T> temp = head;
            while (temp.getNext() != null){
                ret = ret + temp.toString() + " --> ";
                temp = temp.getNext();
            }
            ret = ret + temp.toString();
        }
        return ret;
    }

    public static void main(String[] args) {
        LinkedList<String> link =new LinkedList<>();

        link.add("a",0);
        link.add("b",1);
        link.add("c",2);
        link.add("f",3);
        System.out.println(link.get(5));
        System.out.println(link.size());
        System.out.println(link.toString());
        link.delete(2);
        System.out.println(link.toString());


    }
}
