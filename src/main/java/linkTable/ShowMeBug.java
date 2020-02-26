package linkTable;

public class ShowMeBug {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
        public String toString() {
            if(next==null){
                return val+"";
            }
            return val + "->" + next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 请在此编辑你的代码
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode list = null;
        if (l1.val < l2.val) {
            list = l1;
            list.next = mergeTwoLists(l1.next, l2);
        } else {
            list = l2;
            list.next = mergeTwoLists(l1, l2.next);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("开始测试");
        // 请在此编辑你的测试代码
        ListNode link1= new ListNode(1);
        link1.next=new ListNode(2);
        link1.next.next=new ListNode(4);
        ListNode link2 = new ListNode(1);
        link2.next=new ListNode(3);
        link2.next.next = new ListNode(4);
        ListNode listNode = mergeTwoLists(link1, link2);
        System.out.println(listNode.toString());
    }
}
