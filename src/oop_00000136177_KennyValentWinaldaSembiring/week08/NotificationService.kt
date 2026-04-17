package oop_00000136177_KennyValentWinaldaSembiring.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        if (user.email != null) {
            sendEmail(emailAddress = user.email)
        } else {
            println("User ${user.name} tidak memilki email.")
        }
    }
}