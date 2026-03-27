package oop_00000136177_KennyValentWinaldaSembiring.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Ketemu Monster Goblin")
        is BattleState.LootDropped -> {
            val item = event.item
            println("Mendapat loot: ${item.name} [${item.rarity}]")
        }
        is BattleState.GameOver -> println("Game Over")
        is BattleState.SafeZone -> println("Safe Zone")
    }
}

