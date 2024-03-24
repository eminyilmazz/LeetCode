package TwoSumIIInputArrayIsSorted

import "math"

func twoSum(numbers []int, t int) []int {
	l := 0
	r := len(numbers) - 1
	s := math.MinInt
	for l < r {
		s = numbers[l] + numbers[r]
		if s == t {
			return []int{l + 1, r + 1}
		}

		if s < t {
			l++
		}

		if s > t {
			r--
		}
	}

	return []int{}
}
