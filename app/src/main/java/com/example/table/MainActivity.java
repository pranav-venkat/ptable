package com.example.table;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;

import static com.example.table.random_pair.random_pair;

public  class MainActivity extends AppCompatActivity {
    RadioButton radiobutton1;
    RadioButton radiobutton2;
    RadioButton radiobutton3;
    Boolean bool = false;
    RadioButton radiobutton4;
    RadioButton radiobutton5;
    RadioButton radiobutton6;
    RadioButton radiobutton7;
    RadioButton radiobutton8;
    RadioGroup radio1;
    RadioGroup radio2;
    RadioGroup radio3;
    Button score;
    int[] rand = random_pair(23,0);
    int a = rand[0];
    int c = rand[1];
    int d = rand[2];


    int i;




    Button qbutton;
    Button qbutton2;
    RadioButton radiobutton9;
    RadioButton radiobutton10;
    RadioButton radiobutton11;
    Boolean sco;
    RadioButton radiobutton12;
int[]options = new int[10];

    RadioButton[] q1Options;
    RadioButton[] q2Options;
    RadioButton[] q3Options;
    Button qbutton3;
    int maxquestion  = 10;
    question[] questions = new question[maxquestion];
    Button submit;

    int startQuestion = 0;
    Button next;
    TextView scores;
int scor;
    RadioButton[] selected = new RadioButton[maxquestion];
    String[] selected_string = new String[maxquestion];
    Boolean easy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        Log.v("table", "Main Started");
        score = findViewById(R.id.score);
        radiobutton1 = findViewById(R.id.radio_1);
        radiobutton2 = findViewById(R.id.radio_2);
        radiobutton3 = findViewById(R.id.radio_3);
        radiobutton4 = findViewById(R.id.radio_4);
        qbutton = findViewById(R.id.button1);
        radiobutton5 = findViewById(R.id.radio_5);
        radiobutton6 = findViewById(R.id.radio_6);
        radiobutton7 = findViewById(R.id.radio_7);
        radiobutton8 = findViewById(R.id.radio_8);
        scores = findViewById(R.id.scores);
        qbutton2 = findViewById(R.id.button2);
        radiobutton9 = findViewById(R.id.radio_9);
        radiobutton10 = findViewById(R.id.radio_10);
        radiobutton11 = findViewById(R.id.radio_11);
        radiobutton12 = findViewById(R.id.radio_12);
        qbutton3 = findViewById(R.id.button3);
        radio1 = findViewById(R.id.check1);
        radio2 = findViewById(R.id.check2);
        radio3 = findViewById(R.id.check3);
        submit  = findViewById(R.id.buttn);
        next = findViewById(R.id.button);
        startQuestion = 0;

        Intent igt = getIntent();
        Bundle bnd = igt.getExtras();
        int e = bnd.getInt("easy");
        HashSet<Integer> check = new HashSet<Integer>();

        if(e==4) {
            for (int i = 0; i < 10; i++) {
                questions[i] = new question(3);

                while(check.contains(questions[i].prop_id)) {
                    questions[i] = new question(3);
                }
                check.add(questions[i].prop_id);
                selected_string[i] = "no answer selected";
            }
        }
        else{
            for (int i = 0; i < 10; i++) {
                questions[i] = new question(16);

                while(check.contains(questions[i].prop_id)) {
                    questions[i] = new question(16);
                }
                check.add(questions[i].prop_id);
                selected_string[i] = "no answer selected";
            }
        }
        Log.v("table", "Questions Created");
        
        for(i =0; i<maxquestion;i++){
            int[] rnd = random_pair.random_pair(23,0);
            c = rnd[0];
            options[i] = c;
        }
        DisplayQuestions();
        Log.v("table", "Questions Displayed");
score.setVisibility(View.INVISIBLE);

        if(startQuestion==0)
            submit.setVisibility(View.INVISIBLE);
        else
            submit.setVisibility(View.VISIBLE);
scores.setVisibility(View.INVISIBLE);
        View.OnClickListener buttons = new View.OnClickListener() {
            public void onClick(View v) {


                if(next.getText() != "Submit") {
                    if("back to start".equalsIgnoreCase((String)next.getText())){
                        Intent intent = new Intent(MainActivity.this, opening.class);
                        startActivity(intent);
                        finish();
                    }

                    captureAnswers();

                    startQuestion += 3;
                    if(startQuestion==0)
                        submit.setVisibility(View.INVISIBLE);
                    else
                        submit.setVisibility(View.VISIBLE);



                    radio1.clearCheck();
                    radio2.clearCheck();
                    radio3.clearCheck();
                    DisplayQuestions();

                    if (startQuestion >= maxquestion - 1) {
                        next.setText("Submit");
                        if(bool==true)
                            next.setText("back to start");
                    } else
                        next.setText("Next");

                    if(bool==true)
                        submit();


                }
                else{
                    if (startQuestion >= maxquestion - 1) {
                        next.setText("Submit");
                    } else
                        next.setText("Next");

                    bool = true;
                    sco = true;
                    if(bool==true){
                        startQuestion=0;
                        score();
                        scored();
                        submit.setVisibility(View.INVISIBLE);
                        next.setText("Next");
                        if(scor>0&&scor<10)
                        scores.setText(String.format("your score is:%s", scor+1));
                        else
                            scores.setText(String.format("your score is:%s", scor));
                        submit();
                        disable();
                        sco = true;
                        submit.setVisibility(View.INVISIBLE);
                    }



                        submit.setVisibility(View.INVISIBLE);

                    captureAnswers();

                    radio1.clearCheck();
                    radio2.clearCheck();
                    radio3.clearCheck();
                    submit();


                }



            }};

        View.OnClickListener button = new View.OnClickListener() {
            public void onClick(View v) {
                next.setText("Next");


                captureAnswers();
                startQuestion = startQuestion - 3;
                if(startQuestion==0)
                    submit.setVisibility(View.INVISIBLE);
                else
                    submit.setVisibility(View.VISIBLE);

                radio1.clearCheck();
                radio2.clearCheck();
                radio3.clearCheck();
                DisplayQuestions();
                if(bool==true){
                    submit();
                    next.setText("Next");
                }

            }};

        View.OnClickListener core = new View.OnClickListener() {
            public void onClick(View v) {
              startQuestion=0;
              erocs();
              next.setText("Next");
                submit.setVisibility(View.INVISIBLE);
              scores.setText(String.format("your score is:%s", scor));
              DisplayQuestions();
              submit();
             disable();
                submit.setVisibility(View.INVISIBLE);


            }};
        score.setOnClickListener(core);

        next.setOnClickListener(buttons);
        submit.setOnClickListener(button);
    }
    public void scored(){

        for(startQuestion=0;startQuestion<maxquestion;startQuestion++) {
            if (!selected_string[startQuestion].equals("no answer selected")) {
                if (selected_string[startQuestion].equalsIgnoreCase(questions[startQuestion].answer))
                    scor++;
            }
        }
        submit.setVisibility(View.INVISIBLE);

    }
    public void disable(){
        radiobutton1.setClickable(false);

        radiobutton2.setClickable(false);

        radiobutton3.setClickable(false);

        radiobutton4.setClickable(false);

        radiobutton5.setClickable(false);

        radiobutton6.setClickable(false);

        radiobutton7.setClickable(false);

        radiobutton8.setClickable(false);

        radiobutton9.setClickable(false);

        radiobutton10.setClickable(false);

        radiobutton11.setClickable(false);

        radiobutton12.setClickable(false);

        submit.setVisibility(View.INVISIBLE);
    }

    private void score() {
        radio1.setVisibility(View.INVISIBLE);
        radio2.setVisibility(View.INVISIBLE);
        radio3.setVisibility(View.INVISIBLE);
        next.setVisibility(View.INVISIBLE);
        submit.setVisibility(View.INVISIBLE);
        submit.setVisibility(View.INVISIBLE);
        score.setVisibility(View.VISIBLE);
        scores.setVisibility(View.VISIBLE);
        qbutton3.setVisibility(View.INVISIBLE);
        qbutton2.setVisibility(View.INVISIBLE);
        qbutton.setVisibility(View.INVISIBLE);
    }
    private void erocs() {
        radio1.setVisibility(View.VISIBLE);
        radio2.setVisibility(View.VISIBLE);
        radio3.setVisibility(View.VISIBLE);
        next.setVisibility(View.VISIBLE);
        score.setVisibility(View.INVISIBLE);
        scores.setVisibility(View.INVISIBLE);
        qbutton3.setVisibility(View.VISIBLE);
        qbutton2.setVisibility(View.VISIBLE);
        qbutton.setVisibility(View.VISIBLE);
    }

    private void submit() {

        RadioButton selectedRadioButton;


        if (startQuestion >= 0 && startQuestion < maxquestion) {


            int selectedId;

            if (startQuestion < maxquestion) {

                if (!selected_string[startQuestion].equals("no answer selected")) {
                    selected[startQuestion].setChecked(true);
                    if (selected_string[startQuestion].equalsIgnoreCase(questions[startQuestion].answer)) {
                        selected[startQuestion].setBackgroundColor(Color.GREEN);
                    } else {
                        selected[startQuestion].setBackgroundColor(Color.RED);
                        if (questions[startQuestion].answer.equalsIgnoreCase((String) radiobutton1.getText()))
                            radiobutton1.setBackgroundColor(Color.GREEN);
                        if (questions[startQuestion].answer.equalsIgnoreCase((String) radiobutton2.getText()))
                            radiobutton2.setBackgroundColor(Color.GREEN);
                        if (questions[startQuestion].answer.equalsIgnoreCase((String) radiobutton3.getText()))
                            radiobutton3.setBackgroundColor(Color.GREEN);
                        if (questions[startQuestion].answer.equalsIgnoreCase((String) radiobutton4.getText()))
                            radiobutton4.setBackgroundColor(Color.GREEN);
                    }
                } else {
                    if (!selected_string[startQuestion].equals("no answer selected")) {
                        selected[startQuestion].setChecked(true);
                        if (selected_string[startQuestion].equalsIgnoreCase(questions[startQuestion].answer)) {
                            selected[startQuestion].setBackgroundColor(Color.GREEN);
                        } else {
                            selected[startQuestion].setBackgroundColor(Color.RED);
                            if (questions[startQuestion].answer.equalsIgnoreCase((String) radiobutton1.getText()))
                                radiobutton1.setBackgroundColor(Color.GREEN);
                            if (questions[startQuestion].answer.equalsIgnoreCase((String) radiobutton2.getText()))
                                radiobutton2.setBackgroundColor(Color.GREEN);
                            if (questions[startQuestion].answer.equalsIgnoreCase((String) radiobutton3.getText()))
                                radiobutton3.setBackgroundColor(Color.GREEN);
                            if (questions[startQuestion].answer.equalsIgnoreCase((String) radiobutton4.getText()))
                                radiobutton4.setBackgroundColor(Color.GREEN);
                        }

                }
                else{
                    if (questions[startQuestion].answer.equalsIgnoreCase((String) radiobutton1.getText()))
                        radiobutton1.setBackgroundColor(Color.GREEN);
                    if (questions[startQuestion].answer.equalsIgnoreCase((String) radiobutton2.getText()))
                        radiobutton2.setBackgroundColor(Color.GREEN);
                    if (questions[startQuestion].answer.equalsIgnoreCase((String) radiobutton3.getText()))
                        radiobutton3.setBackgroundColor(Color.GREEN);
                    if (questions[startQuestion].answer.equalsIgnoreCase((String) radiobutton4.getText()))
                        radiobutton4.setBackgroundColor(Color.GREEN);
                }
            }
            }
            if (startQuestion + 1 < maxquestion) {



                if (!selected_string[startQuestion + 1].equals("no answer selected")){
                    selected[startQuestion + 1].setChecked(true);
                    if(selected_string[startQuestion+1].equalsIgnoreCase(questions[startQuestion+1].answer)){
                        selected[startQuestion+1].setBackgroundColor(Color.GREEN);
                        }
                    else{
                        selected[startQuestion+1].setBackgroundColor(Color.RED);
                        if(questions[startQuestion+1].answer.equalsIgnoreCase((String) radiobutton5.getText()))
                            radiobutton5.setBackgroundColor(Color.GREEN);
                        if(questions[startQuestion+1].answer.equalsIgnoreCase((String) radiobutton6.getText()))
                            radiobutton6.setBackgroundColor(Color.GREEN);
                        if(questions[startQuestion+1].answer.equalsIgnoreCase((String) radiobutton7.getText()))
                            radiobutton7.setBackgroundColor(Color.GREEN);
                        if(questions[startQuestion+1].answer.equalsIgnoreCase((String) radiobutton8.getText()))
                            radiobutton8.setBackgroundColor(Color.GREEN);}
                }
                else{
                    if(questions[startQuestion+1].answer.equalsIgnoreCase((String) radiobutton5.getText()))
                        radiobutton5.setBackgroundColor(Color.GREEN);
                    if(questions[startQuestion+1].answer.equalsIgnoreCase((String) radiobutton6.getText()))
                        radiobutton6.setBackgroundColor(Color.GREEN);
                    if(questions[startQuestion+1].answer.equalsIgnoreCase((String) radiobutton7.getText()))
                        radiobutton7.setBackgroundColor(Color.GREEN);
                    if(questions[startQuestion+1].answer.equalsIgnoreCase((String) radiobutton8.getText()))
                        radiobutton8.setBackgroundColor(Color.GREEN);
                }}


        }
        if (startQuestion + 2 < maxquestion) {


            if (!selected_string[startQuestion + 2].equals("no answer selected")) {
                selected[startQuestion + 2].setChecked(true);
                if(selected_string[startQuestion+2].equalsIgnoreCase(questions[startQuestion+2].answer)){
                    selected[startQuestion+2].setBackgroundColor(Color.GREEN);
                    }
                else{
                    selected[startQuestion+2].setBackgroundColor(Color.RED);
                    if(questions[startQuestion+2].answer.equalsIgnoreCase((String) radiobutton9.getText()))
                        radiobutton9.setBackgroundColor(Color.GREEN);
                    if(questions[startQuestion+2].answer.equalsIgnoreCase((String) radiobutton10.getText()))
                        radiobutton10.setBackgroundColor(Color.GREEN);
                    if(questions[startQuestion+2].answer.equalsIgnoreCase((String) radiobutton11.getText()))
                        radiobutton11.setBackgroundColor(Color.GREEN);
                    if(questions[startQuestion+2].answer.equalsIgnoreCase((String) radiobutton12.getText()))
                        radiobutton12.setBackgroundColor(Color.GREEN);}

            }
            else{
                if(questions[startQuestion+2].answer.equalsIgnoreCase((String) radiobutton9.getText()))
                    radiobutton9.setBackgroundColor(Color.GREEN);
                if(questions[startQuestion+2].answer.equalsIgnoreCase((String) radiobutton10.getText()))
                    radiobutton10.setBackgroundColor(Color.GREEN);
                if(questions[startQuestion+2].answer.equalsIgnoreCase((String) radiobutton11.getText()))
                    radiobutton11.setBackgroundColor(Color.GREEN);
                if(questions[startQuestion+2].answer.equalsIgnoreCase((String) radiobutton12.getText()))
                    radiobutton12.setBackgroundColor(Color.GREEN);
            }
        }

    }


    private void captureAnswers () {
        int selectedId;
        RadioButton selectedRadioButton;

        if (startQuestion >= 0 && startQuestion < maxquestion) {
            if (startQuestion < maxquestion) {
                if (radio1.getCheckedRadioButtonId() == -1) {
                    selected_string[startQuestion] = "no answer selected";
                } else {

                    selectedId = radio1.getCheckedRadioButtonId();
                    selectedRadioButton = findViewById(selectedId);
                    selected[startQuestion] = selectedRadioButton;
                    selected_string[startQuestion] = (String) selectedRadioButton.getText();
                }
            }

            if (startQuestion + 1 < maxquestion) {
                if (radio2.getCheckedRadioButtonId() == -1)
                    selected_string[startQuestion + 1] = "no answer selected";
                else {

                    selectedId = radio2.getCheckedRadioButtonId();
                    selectedRadioButton = findViewById(selectedId);
                    selected[startQuestion + 1] = selectedRadioButton;
                    selected_string[startQuestion + 1] = (String) selectedRadioButton.getText();
                }
            }
            if (startQuestion + 2 < maxquestion) {
                if (radio3.getCheckedRadioButtonId() == -1) {
                    selected_string[startQuestion + 2] = "no answer selected";
                } else {

                    selectedId = radio3.getCheckedRadioButtonId();
                    selectedRadioButton = findViewById(selectedId);
                    selected[startQuestion + 2] = selectedRadioButton;
                    selected_string[startQuestion + 2] = (String) selectedRadioButton.getText();
                }
            }
        }
    }

    private void   DisplayQuestions() {
        RadioButton selectedRadioButton;

        int [][]order = new int [][]{{0,1,2,3},{0,1,3,2},{0,2,1,3},{0,2,3,1}, {0,3,1,2}, {0,3,2,1},
                {1,0,2,3},{1,0,3,2},{1,2,0,3},{1,2,3,0}, {1,3,0,2}, {1,3,2,0},
                {2,1,0,3},{2,1,3,0},{2,0,1,3},{2,0,3,1}, {2,3,1,0}, {2,3,0,1},
                {3,1,2,0},{3,1,0,2},{3,2,1,0},{3,2,0,1}, {3,0,1,2}, {3,0,2,1}};



        if(startQuestion>=0&&startQuestion<maxquestion){


            q1Options = new RadioButton[]{radiobutton1, radiobutton2, radiobutton3, radiobutton4};
            q2Options = new RadioButton[]{radiobutton5, radiobutton6, radiobutton7, radiobutton8};
            q3Options = new RadioButton[]{radiobutton9, radiobutton10, radiobutton11, radiobutton12};


            int selectedId;

            if (startQuestion<maxquestion) {
                radio1.setVisibility(View.VISIBLE);
                qbutton.setVisibility(View.VISIBLE);
                radiobutton1.setBackgroundColor(Color.WHITE);
                radiobutton2.setBackgroundColor(Color.WHITE);
                radiobutton3.setBackgroundColor(Color.WHITE);
                radiobutton4.setBackgroundColor(Color.WHITE);
                String[] props = {questions[startQuestion].answer, questions[startQuestion].op1, questions[startQuestion].op2, questions[startQuestion].op3};
                qbutton.setText(questions[startQuestion].question);
                q1Options[order[options[startQuestion]][0]].setText(props[0]);
                q1Options[order[options[startQuestion]][1]].setText(props[1]);
                q1Options[order[options[startQuestion]][2]].setText(props[2]);
                q1Options[order[options[startQuestion]][3]].setText(props[3]);
                if (!selected_string[startQuestion].equals("no answer selected")){
                    selected[startQuestion].setChecked(true);
                }
            }
            else{
                radio1.setVisibility(View.INVISIBLE);
                qbutton.setVisibility(View.INVISIBLE);
            }

            if(startQuestion+1<maxquestion) {
                radio2.setVisibility(View.VISIBLE);
                qbutton2.setVisibility(View.VISIBLE);
                radiobutton5.setBackgroundColor(Color.WHITE);
                radiobutton6.setBackgroundColor(Color.WHITE);
                radiobutton7.setBackgroundColor(Color.WHITE);
                radiobutton8.setBackgroundColor(Color.WHITE);
                String[] pros = {questions[startQuestion+1].answer, questions[startQuestion+1].op1, questions[startQuestion+1].op2, questions[startQuestion+1].op3};
                qbutton2.setText(questions[startQuestion+1].question);
                q2Options[order[options[startQuestion+1]][0]].setText(pros[0]);
                q2Options[order[options[startQuestion+1]][1]].setText(pros[1]);
                q2Options[order[options[startQuestion+1]][2]].setText(pros[2]);
                q2Options[order[options[startQuestion+1]][3]].setText(pros[3]);
                if (!selected_string[startQuestion+1].equals("no answer selected"))
                    selected[startQuestion+1].setChecked(true);


            }
            else{
                radio2.setVisibility(View.INVISIBLE);
                qbutton2.setVisibility(View.INVISIBLE);
            }
            if(startQuestion+2<maxquestion) {
                radio3.setVisibility(View.VISIBLE);
                qbutton3.setVisibility(View.VISIBLE);
                radiobutton9.setBackgroundColor(Color.WHITE);
                radiobutton10.setBackgroundColor(Color.WHITE);
                radiobutton11.setBackgroundColor(Color.WHITE);
                radiobutton12.setBackgroundColor(Color.WHITE);
                String[] prop = {questions[startQuestion+2].answer, questions[startQuestion+2].op1, questions[startQuestion+2].op2, questions[startQuestion+2].op3};
                qbutton3.setText(questions[startQuestion+2].question);
                q3Options[order[options[startQuestion+2]][0]].setText(prop[0]);
                q3Options[order[options[startQuestion+2]][1]].setText(prop[1]);
                q3Options[order[options[startQuestion+2]][2]].setText(prop[2]);
                q3Options[order[options[startQuestion+2]][3]].setText(prop[3]);
                if (!selected_string[startQuestion+2].equals("no answer selected"))
                    selected[startQuestion+2].setChecked(true);

            }
            else{
                radio3.setVisibility(View.INVISIBLE);
                qbutton3.setVisibility(View.INVISIBLE);
            }
        }
    }
}