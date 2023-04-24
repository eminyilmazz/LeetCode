package LinkedListCycle

func hasCycleSlow(head *ListNode) bool {
	tmp := head
	m := make(map[*ListNode]bool)

	if tmp == nil {
		return false
	}

	for tmp.Next != nil {
		if _, ok := m[tmp]; ok {
			return true
		}
		m[tmp] = true
		tmp = tmp.Next
	}
	return false
}
