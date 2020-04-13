package com.example.lab06.lab06_quiz;

public class Questions {

    public String questions[] = {
            "Who was the sixteenth president?",
            "Which of the following is the most common pet?",
            "Where is the Happiest Place On Earth?",
            "Who won the first Super Bowl?",
            "Who was the second man to walk on the Moon?",
            "What is the capital of Morocco?",
            "Which country were the 1992 Winter Olympic Games held in?",
            "How many dots are there on a pair of dice?",
            "Who is the Greek equivalent of the Roman goddess Venus?",
            "What kind of animal is called a heffalump, in Winnie the Pooh?",
            "What powers Iron Man's suit?",
            "WHat is a person with acrophobia afraid of?"
    };

    public String choices[][] = {
            {"Johnson", "Lincoln", "Buchanan", "Grant"},
            {"Cat","Dog","Turtle","Fish"},
            {"Niagara Falls", "Six Flags", "Los Angeles", "Disney World"},
            {"The Green Bay Packers", "The 49ers", "The Seahawks", "The Patriots"},
            {"Neil Armstrong", "John Glenn", "Alan Shepard", "Buzz Aldrin"},
            {"Rabat", "Brazil", "Fes", "Meknes"},
            {"France", "Spain", "China", "Japan"},
            {"63", "36", "44", "42"},
            {"Athena", "Demeter", "Aphrodite", "Hera"},
            {"Tiger", "Elephant", "Pig", "Kangaroo"},
            {"Arc reactor", "Gasoline", "Nuclear Waste", "Thor"},
            {"Heights", "Spiders", "Gatherings of People", "Spoons"}
    };

    public String correctAnswer[] = {
            "Lincoln",
            "Fish",
            "Disney World",
            "The Green Bay Packers",
            "Buzz Aldrin",
            "Rabat",
            "France",
            "42",
            "Aphrodite",
            "Elephant",
            "Arc reactor",
            "Heights"

    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
