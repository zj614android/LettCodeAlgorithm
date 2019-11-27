package leetcode.zj.com.lettcodealgorithm;

public class ListNode {

    public String value;
    public ListNode next;

    public ListNode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "value='" + value + '\'' +
                ", next=" + next +
                '}';
    }
}
