package stack;

/**
 * creat by FinalJ on 2021 9 25.
 *  描述：构建一个泛型堆栈MyStack<T>，要求实现以下功能
 *  入栈（方法名：push）
 *  出栈（方法名：pop）
 *  返回栈顶元素（方法名：top）
 *  要求：
 *  必须是泛型
 *  不能使用Java内部提供的堆栈(Stack)类
 *
 * @author 86186*/
public class Stack {
    public static void main(String[] args){
    MyStack<Integer> stack=new MyStack<>(10);
    stack.push(5);
    stack.getTop();
    stack.pop();
    }
}

class MyStack<T>{
    private int size;
    private int top=-1;
    private Object[] stack;

    /**
    * 为栈初始化容量
    * */
    public MyStack(int n){
        stack=new Object[n];
        size=n;
    }

    /**
     * 判断栈是否满了
    **/
    public boolean isFull(){
        return top==size-1;
    }

    /**
     * 判断栈是否为空
     **/
    public boolean isEmpty(){
        return top==-1;
    }

    /**
     * 入栈
     * */
    public void push(int x){
        if(isFull()){
           System.out.println("栈满了");
        }
        else{
            stack[++top]=x;
        }
    }

    /**
     * 出栈
     * */
    public void pop(){
        if(isEmpty()){
            System.out.println("栈空了");
        }
        else{
            System.out.println(stack[top]+"  删除成功  ");
            top--;
        }
    }

    /**
     * 返回栈顶元素
    **/
    public void getTop(){
        if(isEmpty()){
            System.out.println("栈空了");
        }
        else{
            System.out.println(stack[top]);
        }
    }

}