package ValidPalindrome

import "unicode"

func isPalindrome(s string) bool {
	arr := []rune(s)

	l := 0
	r := len(arr) - 1

	for l < r {

		if !isAlphaNumeric(arr[l]) {
			l++
			continue
		} else if !isAlphaNumeric(arr[r]) {
			r--
			continue
		} else if unicode.ToLower(arr[l]) != unicode.ToLower(arr[r]) {
			return false
		}
		l++
		r--
	}
	return true
}

func isAlphaNumeric(s rune) bool {
	return unicode.IsLetter(s) || unicode.IsDigit(s)
}
