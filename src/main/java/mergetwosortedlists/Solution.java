package mergetwosortedlists;

public class Solution {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resalt = new ListNode();
        ListNode temporary = resalt;
        while (true) {
            if (list1 == null) {
                temporary.next = list2;
                break;
            }
            if (list2 == null) {
                temporary.next = list1;
                break;
            } else {
                temporary.next = new ListNode();
                if (list1.val <= list2.val) {
                    temporary.next.val = list1.val;
                    list1 = list1.next;
                } else {
                    temporary.next.val = list2.val;
                    list2 = list2.next;
                }
                temporary = temporary.next;
            }
        }
        return resalt.next;
    }

    public static void main (String[]args){
            ListNode first4 = new ListNode(4);
            ListNode first2 = new ListNode(2, first4);
            ListNode first1 = new ListNode(1, first2);

            ListNode next3 = new ListNode(3);
            ListNode next2 = new ListNode(2, next3);
            ListNode next1 = new ListNode(1, next2);

        Solution test = new Solution();
        System.out.println(test.mergeTwoLists(first1,next1).val);
        }

    }