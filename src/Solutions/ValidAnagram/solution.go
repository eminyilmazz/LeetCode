package ValidAnagram

func IsAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}

	m := make(map[rune]int)

	for _, char := range s {
		m[char]++
	}

	for _, char := range t {
		m[char]--
	}

	for _, freq := range m {
		if freq != 0 {
			return false
		}
	}

	return true
}
