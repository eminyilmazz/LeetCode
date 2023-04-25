package BuildArrayfromPermutation

// O(n) space solution
func buildArray(nums []int) []int {
	var r = make([]int, len(nums))
	for i, num := range nums {
		r[i] = nums[num]
	}
	return r
}
