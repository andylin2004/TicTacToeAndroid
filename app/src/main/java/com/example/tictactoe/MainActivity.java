package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    boolean player1Turn = true;
    String[][] board = new String[3][3];
    MainActivity view;

    Button r0c0, r0c1, r0c2, r1c0, r1c1, r1c2, r2c0, r2c1, r2c2;
    TextView turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r0c0 = (Button)findViewById(R.id.r0c0);
        r0c1 = (Button)findViewById(R.id.r0c1);
        r0c2 = (Button)findViewById(R.id.r0c2);
        r1c0 = (Button)findViewById(R.id.r1c0);
        r1c1 = (Button)findViewById(R.id.r1c1);
        r1c2 = (Button)findViewById(R.id.r1c2);
        r2c0 = (Button)findViewById(R.id.r2c0);
        r2c1 = (Button)findViewById(R.id.r2c1);
        r2c2 = (Button)findViewById(R.id.r2c2);
        turn = (TextView)findViewById(R.id.turn);
    }

    public void makeMove(View view){
        switch (view.getId()) {
            case R.id.r0c0:
                if (board[0][0] == null) {
                    if (player1Turn) {
                        board[0][0] = "X";
                    } else {
                        board[0][0] = "O";
                    }
                    r0c0.setText(board[0][0]);
                    player1Turn = !player1Turn;
                }
                break;
            case R.id.r0c1:
                if (board[0][1] == null) {
                    if (player1Turn) {
                        board[0][1] = "X";
                    } else {
                        board[0][1] = "O";
                    }
                    r0c1.setText(board[0][1]);
                    player1Turn = !player1Turn;
                }
                break;
            case R.id.r0c2:
                if (board[0][2] == null) {
                    if (player1Turn) {
                        board[0][2] = "X";
                    } else {
                        board[0][2] = "O";
                    }
                    r0c2.setText(board[0][2]);
                    player1Turn = !player1Turn;
                }
                break;
            case R.id.r1c0:
                if (board[1][0] == null) {
                    if (player1Turn) {
                        board[1][0] = "X";
                    } else {
                        board[1][0] = "O";
                    }
                    r1c0.setText(board[1][0]);
                    player1Turn = !player1Turn;
                }
                break;
            case R.id.r1c1:
                if (board[1][1] == null) {
                    if (player1Turn) {
                        board[1][1] = "X";
                    } else {
                        board[1][1] = "O";
                    }
                    r1c1.setText(board[1][1]);
                    player1Turn = !player1Turn;
                }
                break;
            case R.id.r1c2:
                if (board[1][2] == null) {
                    if (player1Turn) {
                        board[1][2] = "X";
                    } else {
                        board[1][2] = "O";
                    }
                    r1c2.setText(board[1][2]);
                    player1Turn = !player1Turn;
                }
                break;
            case R.id.r2c0:
                if (board[2][0] == null) {
                    if (player1Turn) {
                        board[2][0] = "X";
                    } else {
                        board[2][0] = "O";
                    }
                    r2c0.setText(board[2][0]);
                    player1Turn = !player1Turn;
                }
                break;
            case R.id.r2c1:
                if (board[2][1] == null) {
                    if (player1Turn) {
                        board[2][1] = "X";
                    } else {
                        board[2][1] = "O";
                    }
                    r2c1.setText(board[2][1]);
                    player1Turn = !player1Turn;
                }
                break;
            case R.id.r2c2:
                if (board[2][2] == null) {
                    if (player1Turn) {
                        board[2][2] = "X";
                    } else {
                        board[2][2] = "O";
                    }
                    r2c2.setText(board[2][2]);
                    player1Turn = !player1Turn;
                }
                break;
        }
        if (player1Turn){
            turn.setText("Player 1's turn");
        }else{
            turn.setText("Player 2's turn");
        }
    }

}