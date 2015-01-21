import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/1/21.
 */
public class Solution {
    List<Integer> nodeList = new ArrayList<Integer>();
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        createMaxHeap(head);
        return heapSort(nodeList);
    }

    public void createMaxHeap(ListNode head){
        ListNode cur = head;
        while (cur!=null){
            nodeList.add(cur.val);
            cur = cur.next;
        }
        int n = nodeList.size();
        for (int i = n/2; i >= 0; i--)
            adjustHeap(nodeList, i, n);
    }

    public void adjustHeap(List<Integer> heap, int root, int n){
        int k = heap.get(root);
        int j = root*2;
        for (; j < n; j*=2){
            if (j < n-1){
                if (heap.get(j) < heap.get(j+1)){
                    j++;
                }
            }
            if (k > heap.get(j))
                break;
            heap.set(j/2, heap.get(j));
        }
        heap.set(j/2, k);
    }

    public ListNode heapSort(List<Integer> nodeList){
        ListNode head = new ListNode(0);
        ListNode cur = new ListNode(0);
        cur = head;
        int n = nodeList.size();
        for (int i = n -1; i >= 0; i--){
            int temp = nodeList.get(0);
            nodeList.set(0, nodeList.get(i));
            nodeList.set(i,temp);
            adjustHeap(nodeList, 1, i);
        }

        for (int i = 0; i < nodeList.size(); i++){
            cur.next = new ListNode(nodeList.get(i));
            cur = cur.next;
        }
        return head.next;
    }

    public static void main(String []args){
        ListNode list = new ListNode(0);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);

        Solution solution = new Solution();
        solution.sortList(list);
    }
}
