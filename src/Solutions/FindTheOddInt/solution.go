package FindTheOddInt

func FindOdd(seq []int) int {
	// your code here
	m := make(map[int]bool)
	for _, num := range seq {
		if m[num] {
			delete(m, num)
		} else {
			m[num] = true
		}
	}
	for r := range m {
		return r
	}
	return 0
}
