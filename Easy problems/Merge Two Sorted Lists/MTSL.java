
class MTSL {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1);

        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode head = mergeTwoLists(list1, list2);
        printList(head);
        
    }

    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1.val == 0 && list2.val == 0) {
            return null;
        }else if(list1.val == 0){
            return list2;
        }else if(list2.val == 0){
            return list1;
            
        }
        ListNode newHead = new ListNode();
        ListNode temp = newHead;
        do {
            if(list1 == null){
                temp.next = list2;
                break;
            }
            else if(list2 == null){
                temp.next = list1;
                break;
            }

            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;

        } while (true);
        return newHead.next;
        
    }

    static void printList(ListNode head){
        ListNode temp = head;
        while (temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } 
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}