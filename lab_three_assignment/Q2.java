package lab_three.lab_three_exercises.src.lab_three_assignment;
public class Q2 {
   public int size_not_as_instance(){
       Node<E>n=head;
       int size=0;
        if (head==null)return size;
        while (n!=null){
           n=n.getNext();
            size++;
       }
       return size;
 }
}
