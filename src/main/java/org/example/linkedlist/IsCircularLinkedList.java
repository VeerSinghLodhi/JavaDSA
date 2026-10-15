package org.example.linkedlist;

public class IsCircularLinkedList {
    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void addNewNode(){
        System.out.print("Enter data to add : ");
        int data=sc.nextInt();
        if(head==null){
            head=new ListNode(data);
        }else{
            ListNode temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=new ListNode(data);
        }
        System.out.println("New Node Added");
    }
    public static void traverse(){
        if(head==null){
            System.out.println("Linked List is empty!");
            return;
        }
        ListNode temp;
        for(temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data+" -> ");
        }
    }
    public static boolean isCircular(ListNode start){
        ListNode slow=start,fast=start;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }

    public static java.util.Scanner sc=new java.util.Scanner(System.in);
    public static ListNode head;
    public static void main(String [] args){
        int ch;
        head=null;
        do{
            System.out.println("1. Add new Node");
            System.out.println("2. Traverse");
            System.out.println("3. Is Circular");
            System.out.println("4. Exit");
            System.out.print("Select a choice : ");
            ch=sc.nextInt();
            if(ch==1){
                addNewNode();
            }else if(ch==2){
                traverse();
            }else if(ch==3){
                boolean result = isCircular(head);
                if(result)
                    System.out.println("Circular");
                else
                    System.out.println("Not Circular");
            }else if(ch==4){
                System.out.println("Exited");
            }else{
                System.out.println("Invalid Choice!");
            }
        }while(ch!=4);
    }
}
