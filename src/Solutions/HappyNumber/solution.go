package HappyNumber

func isHappy(n int) bool {
	m := make(map[int]bool)
	for n != 1 {
		if m[n] {
			return false
		}
		m[n] = true
		n = get(n)
	}
	return true
}

func get(n int) int {
	var sum int
	for n > 0 {
		temp := n % 10
		sum = sum + (temp * temp)
		n = n / 10
	}
	return sum
}
