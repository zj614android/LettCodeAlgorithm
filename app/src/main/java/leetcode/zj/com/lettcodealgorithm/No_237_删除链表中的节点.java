package leetcode.zj.com.lettcodealgorithm;

/*
* 删除链表中的节点
* */
public class No_237_删除链表中的节点 {

    private static ListNode n1;
    private static ListNode n2;
    private static ListNode n3;
    private static ListNode n4;

    public static void main(String[] args) {

        n1 = new ListNode("1");
        n2 = new ListNode("2");
        n3 = new ListNode("3");
        n4 = new ListNode("4");

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        print();

        n1.next = n3;

        print();

    }

    private static void print() {
        System.out.println("=======================");
        System.out.println("n1.next.value ="+n1.next.value);
        System.out.println("n2.next.value ="+n2.next.value);
        System.out.println("n3.next.value ="+n3.next.value);
    }

}
