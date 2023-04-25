package DefangingAnIPAddress

import "strings"

func defangIPaddr(address string) string {
	return strings.Replace(address, ".", "[.]", -1)
}
