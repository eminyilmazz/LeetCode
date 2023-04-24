package main

import (
	"./MergeTwoSortedLists"
	"fmt"
)

func main() {
	l1 := &MergeTwoSortedLists.ListNode{Val: 1, Next: &MergeTwoSortedLists.ListNode{Val: 2, Next: &MergeTwoSortedLists.ListNode{Val: 4, Next: &MergeTwoSortedLists.ListNode{Val: 8}}}}
	l2 := &MergeTwoSortedLists.ListNode{Val: 1, Next: &MergeTwoSortedLists.ListNode{Val: 3, Next: &MergeTwoSortedLists.ListNode{Val: 4}}}

	merged := MergeTwoSortedLists.MergeTwoLists(l1, l2)
	for merged != nil {
		fmt.Printf("%d ", merged.Val)
		merged = merged.Next
	}
}
