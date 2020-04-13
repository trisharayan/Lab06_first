package com.example.lab06.lab06_quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.Random;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button btn_one, btn_two, btn_three, btn_four;
    TextView tv_question;

    private Questions question = new Questions();

    private String answer;
    private int questionLength = question.questions.length;

    public static SharedPreferences sharedpreferences ;

    Random random;
    int score=0;
    int highscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        sharedpreferences = getSharedPreferences("mypre",Context.MODE_PRIVATE);




        highscore =sharedpreferences.getInt("highscore",0);
        Gson gson = new Gson();
        String json = gson.toJson(highscore);

        TextView high = (TextView) findViewById(R.id.textView);
        high.setText("Highscore: "+json);

        TextView cscore = (TextView) findViewById(R.id.textView2);
        cscore.setText("Current score: "+score);


        random = new Random();



        btn_one = (Button)findViewById(R.id.btn_one);
        btn_one.setOnClickListener(this);
        btn_two = (Button)findViewById(R.id.btn_two);
        btn_two.setOnClickListener(this);
        btn_three = (Button)findViewById(R.id.btn_three);
        btn_three.setOnClickListener(this);
        btn_four = (Button)findViewById(R.id.btn_four);
        btn_four.setOnClickListener(this);

        tv_question = (TextView)findViewById(R.id.tv_question);

        NextQuestion(random.nextInt(questionLength));
    }

    @Override
    public void onClick(View v) {



        switch (v.getId()){
            case R.id.btn_one:
                if(btn_one.getText() == answer){
                    Toast.makeText(Main2Activity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionLength));
                    score+=1;

                    TextView cscore = (TextView) findViewById(R.id.textView2);
                    cscore.setText("Current score: "+score);

                    updateHighScore();
                }else{
                    GameOver();
                }

                break;

            case R.id.btn_two:
                if(btn_two.getText() == answer){
                    Toast.makeText(Main2Activity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionLength));
                    score+=1;

                    TextView cscore = (TextView) findViewById(R.id.textView2);
                    cscore.setText("Current score: "+score);

                    updateHighScore();
                }else{
                    GameOver();
                }

                break;

            case R.id.btn_three:
                if(btn_three.getText() == answer){
                    Toast.makeText(Main2Activity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionLength));
                    score+=1;

                    TextView cscore = (TextView) findViewById(R.id.textView2);
                    cscore.setText("Current score: "+score);

                    updateHighScore();
                }else{
                    GameOver();
                }

                break;

            case R.id.btn_four:
                if(btn_four.getText() == answer){
                    Toast.makeText(Main2Activity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionLength));
                    score+=1;

                    TextView cscore = (TextView) findViewById(R.id.textView2);
                    cscore.setText("Current score: "+score);

                    updateHighScore();
                }else{
                    GameOver();
                }

                break;
        }
    }

    private void GameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Main2Activity.this);
        alertDialogBuilder
                .setMessage("Game Over")
                .setCancelable(false)
                .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
        alertDialogBuilder.show();

    }

    private void NextQuestion(int num){
        tv_question.setText(question.getQuestion(num));
        btn_one.setText(question.getchoice1(num));
        btn_two.setText(question.getchoice2(num));
        btn_three.setText(question.getchoice3(num));
        btn_four.setText(question.getchoice4(num));

        answer = question.getCorrectAnswer(num);
    }


    private void updateHighScore(){
        SharedPreferences.Editor editor = sharedpreferences.edit();
        if(score>highscore){
            highscore=score;
            TextView high = (TextView) findViewById(R.id.textView);
            high.setText("Highscore: "+highscore);
            editor.putInt("highscore",highscore);
            editor.apply();
        }

    }

}

