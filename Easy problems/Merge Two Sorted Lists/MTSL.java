
class MTSL {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(-6);
        ListNode list2 = new ListNode(0);

        list1.next = new ListNode(-5);
        list1.next.next = new ListNode(6);

        list1.next.next.next = new ListNode(6);
        list1.next.next.next.next = new ListNode(7);
        ListNode head = mergeTwoLists(list1, list2);
        printList(head);
    }

    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list2 == null && list1 == null) return null;
        if(list1 != null && list2 == null){
            return list1;
        }
        if(list2 !=null && list1 == null){
            return list2;
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