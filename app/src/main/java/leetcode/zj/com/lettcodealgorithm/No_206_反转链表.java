package leetcode.zj.com.lettcodealgorithm;

public class No_206_反转链表 {


    public static void main(String[] args) {

        //构建链表 init
        ListNode listNode1 = new ListNode("1");
        ListNode listNode2 = new ListNode("2");
        ListNode listNode3 = new ListNode("3");
        ListNode listNode4 = new ListNode("4");
        ListNode listNode5 = new ListNode("5");
        ListNode listNodeNull = new ListNode("");

        listNode1.next = listNode2;
        listNode1.next.value = listNode2.value;

        listNode2.next = listNode3;
        listNode2.next.value = listNode3.value;

        listNode3.next = listNode4;
        listNode3.next.value = listNode4.value;

        listNode4.next = listNode5;
        listNode4.next.value = listNode5.value;

        listNode5.next = null;

        ListNode listNodeNewHead = reverse(listNode1);

        printStrings(listNodeNewHead);

    }

    /**
     * 输出链表
     */
    private static void printStrings(ListNode head) {

        System.out.println("res _________________");
        System.out.println(head.value + "");
        System.out.println(head.next.value + "");
        System.out.println(head.next.next.value + "");
        System.out.println(head.next.next.next.value + "");
        System.out.println(head.next.next.next.next.value + "");
        System.out.println(head.next.next.next.next.next + "");

    }

    /**
     * Definition for singly-linked list.
     *
     *      public class ListNode {
     *          int val;
     *          ListNode next;
     *
     *          ListNode(int x) {
     *              val = x;
     *          }
     *      }
     *
     */

    /**
     * @param currHead
     * @return
     */
    public static ListNode reverseList(ListNode currHead) {

        if (currHead == null || currHead.next == null) {// if -> [ 5.next == null ]
            return currHead;
        } else {
            ListNode nextNode = currHead.next;  // nextNode == null
            ListNode newHead = reverseList(nextNode);// newHead = null
            newHead.next = currHead;//反向指
            currHead.next = null;//断老链接
            return newHead;//返回新head
        }
    }


    //———————————————— 标准答案 ————————————————
    // 版权声明：本文为CSDN博主「小胖FWC」的原创文章，遵循 CC 4.0 BY-SA
    // 版权协议，转载请附上原文出处链接及本声明。
    // 原文链接：https://blog.csdn.net/u010651249/article/details/90247595
    private static ListNode reverse(ListNode currhead) {

        //退出条件: < 1 - 2 - 3 - 4 - 5 - null >
        if (currhead == null || currhead.next == null) {
            return currhead;
        }

        //12345
        ListNode nextNode = currhead.next;//保存下一个节点 4
        ListNode newHead = reverse(nextNode);//递归 5
        nextNode.next = currhead;//连上头与递归部分
        currhead.next = null;//调整尾部
        return newHead;//返回头节点
    }



    /**
     * 迭代法
     *
     * @param  currentNode
     * @return
     */
    public static ListNode reverseList2(ListNode currentNode) {
//        if (null == currentNode) {
//            return currentNode;
//        } else {
//            ListNode rNode = reverseList(currentNode.next);
//
//            if(null != rNode && rNode.next != null) {
//                rNode.next.value = currentNode.value;
//                rNode.next = currentNode;
//            }
//
//            return currentNode;
//        }

        return null;
    }


}
