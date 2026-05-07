package oop_00000136177_KennyValentWinaldaSembiring.week10

data class coin(override val name: String, val balance: Double) : HasName

data class transaction(override val name: String, val amount: Double) : HasName