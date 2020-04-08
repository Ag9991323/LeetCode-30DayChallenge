 class Node {
         int val;
         Node next;
         Node(int x) { val = x; }
     }
    
   class Solution {
       Node head;
       public Node middleNode(Node head) {
           Node first =head;
           //  ListNode second =head;
           // while(second!=null&&second.next!=null){
           //     second=second.next.next;
           //     first=first.next;
           // }
           int count=0;
           while(first!=null){
               first=first.next;
               count++;
           }
           first = head;
           count/=2;
           for(int i=0;i<count;i++){
               first =first.next;
           }
           
           return first;
           
       }
       void insertAtTheBegining(int x){
           Node temp=new Node(x);
           temp.next=head;
           head=temp;
       }
      void insertAtTheEnd(int x){
          Node temp= new Node(x);
          if(head==null){
              head=temp;
              return;
          }
          Node curr= head;
          while(curr.next!=null){
              curr=curr.next;
          }
          curr.next=temp;
         }

         void print(){
             Node curr = head;
             while(curr!=null){
                 System.out.print(curr.val+ "->");
                 curr=curr.next;
             }
             System.out.println();
         }
   }

   class Test{
       public static void main(String[] args){
           Solution s = new Solution();
           s.insertAtTheBegining(60);
           s.insertAtTheEnd(10);
           s.insertAtTheEnd(20);
           s.insertAtTheEnd(30);
           s.insertAtTheEnd(40);
           s.insertAtTheEnd(52);
           
           s.print();
           s.head=s.middleNode(s.head);
           s.print();

       }
   }