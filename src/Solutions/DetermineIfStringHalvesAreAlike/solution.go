package DetermineIfStringHalvesAreAlike

import (
	"strings"
	"unicode"
)

func HalvesAreAlike(s string) bool {
	vowels := "aeiouAEIOU"
	s = strings.ToLower(s)
	var vowelCount [26]int8
	for i := 0; i < len(s)/2; i++ {
		if strings.ContainsRune(vowels, rune(s[i])) {
			idx := unicode.ToLower(rune(s[i])) - 'a'
			vowelCount[idx]++
		}
		if strings.ContainsRune(vowels, rune(s[len(s)-i-1])) {
			idx := unicode.ToLower(rune(s[len(s)-i-1])) - 'a'
			vowelCount[idx]--
		}
	}
	var sum int
	for _, count := range vowelCount {
		sum += int(count)
	}
	return sum == 0
}
