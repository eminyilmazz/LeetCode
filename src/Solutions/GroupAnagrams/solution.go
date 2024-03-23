package GroupAnagrams

func groupAnagrams(strs []string) [][]string {
	grouped := make(map[[26]int][]string)
	for _, s := range strs {
		var count [26]int
		for _, c := range s {
			count[c-'a']++
		}
		grouped[count] = append(grouped[count], s)
	}
	result := make([][]string, len(grouped))
	idx := 0
	for _, v := range grouped {
		result[idx] = v
		idx++
	}
	return result
}
