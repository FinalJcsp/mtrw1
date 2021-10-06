package stack;

/**
 * creat by FinalJ on 2021 10 6.
 **/
/**
 * @author 86186
 */

public class Stack {
    public static void main(String[] args){
        MyStack<Integer> stack=new MyStack<>();
        stack.push(5);
        System.out.println(stack.top());
        stack.push(6);
        stack.pop();
        stack.pop();
        System.out.println(stack.top());
    }
}

class MyStack<T>{

    class Node<T>{
        private T data;
        private Node<T> next=null;
    }

    private Node<T> head;

    public MyStack(){
        head=null;
    }

    public void isEmpty() throws Exception{
        if(head==null){
            throw new Exception("栈为空");
        }
    }

    public void push(T t){
        if(head==null){
            head=new Node<T>();
            head.data=t;
            head.next=null;
        }

        else{
            Node<T> temp=null;
            temp=head;
            head=new Node<T>();
            head.next=temp;
            head.data=t;
        }
    }

    public void pop(){
        try{
            isEmpty();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        head=head.next;
        System.out.println("删除成功");
    }

    public T top(){
        try{
            isEmpty();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        T t=head.data;
        return t;
    }
}