fun main()
        {
            val calo = CaloriesConsume()
            val calories = calo.calories()
    
            println("Would you like to know where you at for today: Y or N: ")
            val answer = readLine().toString()

            if (answer == "Y" || answer == "Yes" || answer == "y" || answer == "yes") {
                val recommend = CaloriesRecommend()
                val caloRecom = recommend.recommend()

                println("You have consumed " + caloRecom + " calories today")

                if (caloRecom < calories) {
                    val lowCalo = calories - caloRecom
                    println("You are almost there, you have " + lowCalo + "calories to go")
                }

                else if (caloRecom > calories) {
                    val highCalo = caloRecom - calories
                    println("Congratulations, You have exceded your recommended calories by $highCalo")
                }
            }

            else {
                println("Thank you for using our app")
            }
        }