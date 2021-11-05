open class CaloriesConsume {

            //variables
            var age: Int = 0
            var height =0
            var weight =0
            var gender = ""
            var BMR = 0
            var genderChar: Char = 'o'
            var male = false
            var exercise: String = ""
            var none = false;
            var light = false;
            var moderately = false;
            var intensely = false;
            var five = false
            var cal = 0.00

            open fun calories(): Double {

            //Male or Female
    
            println("What is your gender? M or F: ")
            gender = readLine()!!.toString()
    
            //Determining your BMR 
    
            println("What is your age: ");
            age = readLine()!!.toInt()
    
            println("What is your weight: ");
            weight = readLine()!!.toInt()
    
            println("What is your height: ");
            height = readLine()!!.toInt()
    
            genderChar = gender.get(0);
    
            male = genderChar == 'M';
    
            if (male)
            {
                BMR = ((66 + (6.23 * weight) + (12.7 * height) - (6.8 * age)).toInt());
            }
            else
            {
                BMR = ((665 + (4.35 * weight) + (4.7 * height) - (4.7 * age)).toInt())
            }
    
            //Show BMR
    
            if (male)
            {
                println("Your BMR is " + BMR);
            }
            else
                println("Your BMR is " + BMR);
    
            //Level of Exercises
    
            if (none)
            {
                cal =  (BMR * 1.2);
            }
            else if (light)
            {
                cal = (BMR * 1.375);
            }
            else if (moderately)
            {
                cal = (BMR * 1.55);
            }
            else if (intensely)
            {   
                cal = (BMR * 1.725);
            }
            else
            {
                cal = (BMR * 1.9);
            }
    
            println("What is your level of exercise? ");
            println("Type in none if you do not exercise. ");
            println("Type in 2 if you engage in light exercise one to three days a week.");
            println("Type in 3 if you do exercise moderately three to five times a week.");
            println("Type in 4 if you do intensely six to seven days a week.");
            println("Type in 5 if you do exercise intensely six to seven days a week and have a physically active job.");
    
            exercise = readLine().toString()
            none = readLine() != null;
    
            println("Your daily calorie needs is " + cal);

            return cal;

        }
  }