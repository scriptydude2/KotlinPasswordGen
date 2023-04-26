import kotlin.random.*

class Password(symbols: String) {
    private val symbols = symbols.toCharArray()
    var latest : String = ""
    fun generateNew(charCount: Int): String{
        var newPass = ""

        for(i in 1..charCount){
            var newSymbol = symbols[Random.nextInt(0,symbols.size)]
            newPass += newSymbol
        }
        latest = newPass
        return newPass
    }
}