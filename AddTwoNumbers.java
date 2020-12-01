/*
public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String ints = "";

        do{
            int tmp1 = (l1 != null) ? l1.val:0;
            int tmp2 = (l2 != null) ? l2.val:0;
            if(tmp1 + tmp2 >9){
                if(l1 != null && l1.next != null){
                    l1.next.val += 1;
                    ints = ints + ((tmp1+tmp2) % 10);
                }else if(l2 != null && l2.next != null){
                    l2.next.val += 1;
                    ints = ints + ((tmp1+tmp2) % 10);
                }else{
                    ints = ints + ((tmp1+tmp2) % 10);
                    ints = ints + "1";
                }
            }else{
                ints = ints + (tmp1+tmp2);
            }
            l2 = (l2 != null) ? l2.next : l2;
            l1 = (l1 != null) ? l1.next : l1;
        }while((l2 != null) || (l1!= null));

        String intString = new StringBuilder(ints).reverse().toString();

        ListNode node = new ListNode();

        for(int i = 0; i < intString.length(); i++){
            if(i > 0){
                node = new ListNode(Integer.parseInt(intString.substring(i, i+1)),node);
            }else{
                node = new ListNode(Integer.parseInt(intString.substring(i, i+1)));
            }
        }

        return node;
    }
    public static void testAddTwoNumbers(){
        System.out.println("Begin Test for Add Two Numbers.");
    }

}

