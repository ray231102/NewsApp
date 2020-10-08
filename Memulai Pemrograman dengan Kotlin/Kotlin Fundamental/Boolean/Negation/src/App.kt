// main function
fun main() {
    val officeOpen = 7
    val now = 1
    val isOpen = now > officeOpen

    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}