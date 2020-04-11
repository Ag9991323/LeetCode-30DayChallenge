import java.util.Scanner;

class Nodes {
    char data;
    Nodes next;
    Nodes prev;
    Nodes(char data){
        this.data=data;
    }

}
class LinkList{
    Nodes head;
    Nodes tail;
    public void insertAtEnd(char x){
        Nodes temp = new Nodes(x);
       
        Nodes curr = head;
        if(head==null){
            head=temp;
            tail= head;

             return;
        }
        else{
           
            Nodes prevnode =tail;
           
            tail=temp;

            tail.prev=prevnode;
          
         }
        return;
    }
    void print(Nodes tail){
        Nodes curr = tail;
        while(curr!=null){
            System.out.print(curr.data+" ->");
            curr =curr.prev;
        }
        System.out.println();
    }
    public void deleteAtEnd(){
        if(tail==null){
            return;
        }
       
        tail=tail.prev;
       
        return;
        
    }
    
}
 class StringComparison {
     public static void main(String[] args){
         LinkList l1 = new LinkList();
         LinkList l2 = new LinkList();
         Scanner scan = new Scanner(System.in);
         String s = scan.next();
         String t = scan.next();
         for(int i=0;i<s.length();i++){
             char x =s.charAt(i);
             if(x!='#'){
                 l1.insertAtEnd(x);
             }
             else{
                 l1.deleteAtEnd();
             }
         }
         
       // l1.print(l1.tail);
         for(int i=0;i<t.length();i++){
            char x =t.charAt(i);
            if(x!='#'){
                l2.insertAtEnd(x);
            }
            else{
                l2.deleteAtEnd();
            }
        }
        StringBuilder str = new StringBuilder();
        Nodes head1= l1.tail;
        while(head1!=null){
            str.append(head1.data);
            head1=head1.prev;
          
        }
        StringBuilder st = new StringBuilder();
        Nodes head2= l2.tail;
        while(head2!=null){
        
          st.append(head2.data);
              
            head2=head2.prev;
        }
       
        System.out.println(st.toString().equals(str.toString()));


     }

}