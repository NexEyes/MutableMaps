fun Main(){
    val stateCapitals = mutableMapOf(
        "Indiana" to "Indianapolis",
        "Ohio" to "Columbus",
        "Illinois" to "Springfield"
    );

    stateCapitals["Kentucky"] = " Frankfurt";
    stateCapitals["Illinois"] = "Chicago";
    stateCapitals.remove("Ohio")
    println(stateCapitals["Kentucky"])
    println(stateCapitals);

