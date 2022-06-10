

public class List {
    private LinkList head;
    private LinkList tail;
    public List(){
        tail=null;
        head=null;
    }

    public boolean isEmpty(){
        int i =0;
        LinkList current = head;
        while(current!=null){
            i++;
            current=current.next;
        }if(i>0)
            return false;
        else return true;
    }
    public void addFirst(int data){
        LinkList list = new LinkList(data);
        if(isEmpty()) tail = list;
        else head.prev=list;
        list.next=head;
        head=list;
    }
    public void addLast(int data){
        LinkList list = new LinkList(data);
        if(isEmpty()) head=list;
        else tail.next = list;
        list.prev = tail;
        tail=list;
    }
    public void addArrayLast(int [] array){
        if(tail!=null){
            for(int i =0;i<array.length;i++){
                LinkList list = new LinkList();
                list.data= array[i];
                list.prev=tail;
                tail.next = list;
                tail = list;
            }
        }else{
            for (int i = 0; i<array.length;i++){
                if(i==0){
                    tail= new LinkList();
                    head=tail;
                    tail.data=array[i];
                }
                else{
                    LinkList list = new LinkList();
                    list.data=array[i];
                    list.prev=tail;
                    tail.next=list;
                    tail=list;
                }
            }
        }
    }
   public void  addArrayFirst(int[] array){

        if(head!=null){
            for(int i =0;i<array.length;i++){
                LinkList list = new LinkList();
                list.data = array[i];
                list.next = head;
                head.prev = list;
                tail= list;
            }}
            else{ for(int i = 0;i<array.length;i++){
                if(i==0){
                    head = new LinkList();
                    tail=head;
                    head.data=array[i];
                }else{
                    LinkList list = new LinkList();
                    list.data = array[i];
                    list.next=head;
                    head.prev = list;
                    head=list;
                }

            }
        }
   }








    public void printAll(){
        String tmp = " ";
        LinkList list = head;

        while(list!=null){
            System.out.print(list.data+tmp);
            list=list.next;
        }
    }   public void printAllE(){
        String tmp = " ";
        LinkList list = tail;

        while(list!=null){
            System.out.print(list.data+tmp);
            list=list.prev;
        }
        System.out.println("\n");
    }

}


