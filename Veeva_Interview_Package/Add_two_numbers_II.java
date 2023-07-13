package Veeva_Interview_Package;

// BU SORUYU SORARSA ONUN BEN AMK

/*
public class Add_two_numbers_II {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reversedL1 = reverseList(l1);
        ListNode reversedL2 = reverseList(l2);

        ListNode result = null;
        ListNode current = null;
        int carry = 0;

        while (reversedL1 != null || reversedL2 != null || carry > 0) {
            int sum = carry;

            if (reversedL1 != null) {
                sum += reversedL1.val;
                reversedL1 = reversedL1.next;
            }

            if (reversedL2 != null) {
                sum += reversedL2.val;
                reversedL2 = reversedL2.next;
            }

            ListNode newNode = new ListNode(sum % 10);

            if (result == null) {
                result = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = current.next;
            }

            carry = sum / 10;
        }

        return reverseList(result);
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}

*/