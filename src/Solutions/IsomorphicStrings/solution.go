package IsomorphicStrings

func isIsomorphic(s string, t string) bool {
	return ifIsomorphic(s, t) && ifIsomorphic(t, s)
}

func ifIsomorphic(s string, t string) bool {
	var charArr = [256]byte{}
	for i := 0; i < len(s); i++ {
		c := s[i]
		if charArr[c] != 0 && charArr[c] != t[i] {
			return false
		}
		charArr[c] = t[i]
	}
	return true
}
