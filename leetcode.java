
        class leetcode {
            public static void main(String[] args) {
                
                ListNode head = new ListNode(1);
                head.next = new ListNode(2);
                head.next.next = new ListNode(3);
                head.next.next.next = new ListNode(4);
                head.next.next.next.next = new ListNode(5);

                int n = 2; 
                int length = 0;
                ListNode current = head;
                while (current != null) {
                    length++;
                    current = current.next;
                }
                int position = length - n;
                if (position == 0) {
                    head = head.next;
                } else {
                    ListNode prev = head;
                    for (int i = 0; i < position - 1; i++) {
                        prev = prev.next;
                    }
                    prev.next = prev.next.next;
                }
                current = head;
                while (current != null) {
                    System.out.print(current.val + " ");
                    current = current.next;
                }
            }
        }

        class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
            }
        
    }