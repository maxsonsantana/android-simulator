package maxson.com.br.maxbegin.domain

data class Match (
    val description: String,
    val place: Place,
    val homeTeam: Team,
    val awayTeam: Team
)