package com.example.testbutton2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    private TextView textView;
//    private boolean flag = false;
//    private  Button button;
//    private  LinearLayout.LayoutParams buttonLayoutParams;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main);
//
//        // リニアレイアウトの設定
//        LinearLayout layout = new LinearLayout(this);
//        layout.setOrientation(LinearLayout.VERTICAL);
//
//        layout.setLayoutParams(new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.MATCH_PARENT));
//
//        // レイアウト中央寄せ
//        layout.setGravity(Gravity.CENTER);
//        setContentView(layout);
//
//        // テキスト設定
//        textView = new TextView(this);
//        textView.setText("Hello");
//        // テキストサイズ 30sp
//        textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
//        // テキストカラー
//        textView.setTextColor(Color.rgb(0x0, 0x0, 0x0));
//
//        LinearLayout.LayoutParams textLayoutParams = new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.WRAP_CONTENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT);
//
//        textView.setLayoutParams(textLayoutParams);
//        layout.addView(textView);
//
//        // ボタンの設定
//        button = new Button(this);
//        button.setText("Button");
//        // dp単位を取得
//        float scale = getResources().getDisplayMetrics().density;
//        // 横幅 150dp, 縦 100dp に設定
//        buttonLayoutParams = new LinearLayout.LayoutParams(
////                LinearLayout.LayoutParams.WRAP_CONTENT,
//                (int)(150 * scale),
//                LinearLayout.LayoutParams.WRAP_CONTENT);
//        // マージン 20dp に設定
//        int margins = (int)(20 * scale);
//        buttonLayoutParams.setMargins(margins, margins, margins, margins);
//
//        button.setLayoutParams(buttonLayoutParams);
//        layout.addView(button);
//
//        // リスナーをボタンに登録
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // flagがtrueの時
//                if (flag) {
//                    textView.setText("Hello");
//                    flag = false;
//                }
//                // flagがfalseの時
//                else {
//                    textView.setText("World");
//                    flag = true;
//
//                    // いわゆるdipの代わり
//                    float scale = getResources().getDisplayMetrics().density;
//                    int buttonWidth = (int)(250 * scale);
//                    int buttonHeight = (int)(100 * scale);
//                    // 横幅 250dp に設定
//                    buttonLayoutParams = new LinearLayout.LayoutParams(
//                            buttonWidth, buttonHeight);
//                    int margins = (int)(20 * scale);
//                    // setMargins (int left, int top, int right, int bottom)
//                    buttonLayoutParams.setMargins((int) (5 * scale), (int)(50 * scale),
//                            (int)(50 * scale), (int)(20 * scale));
//                    button.setLayoutParams(buttonLayoutParams);
//
//                }
//            }
//        });
//    }

    private RelativeLayout layout;
    private RelativeLayout.LayoutParams buttonLayoutParams;
    private RelativeLayout.LayoutParams textLayoutParams;
    private TextView textView;
    private  Button button;
    private int buttonWidth;
    private int buttonHeight;
    private float scale;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // リラティブレイアウトの設定
        layout = new RelativeLayout(this);

        layout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT));

        layout.setBackgroundColor(Color.rgb(220,255,240));
        setContentView(layout);

        // dp 設定
        scale = getResources().getDisplayMetrics().density;

        // テキスト設定
        textView = new TextView(this);
        textView.setText("Hello");
        // テキストサイズ 30sp
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 50);
        // テキストカラー
        textView.setTextColor(Color.rgb(0x0, 0x0, 0xff));

        textLayoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        // setMargins (int left, int top, int right, int bottom)
        textLayoutParams.setMargins((int)(150*scale), (int)(300*scale), 0, 0);

        textView.setLayoutParams(textLayoutParams);
        layout.addView(textView);


        // ボタンの設定
        button = new Button(this);
        button.setText("Button");

        button.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        // ボタンサイズ
        buttonWidth = (int)(200 * scale);
        buttonHeight = (int)(100 * scale);
        buttonLayoutParams = new RelativeLayout.LayoutParams(buttonWidth, buttonHeight);

        // button margin : left, top, right, bottom
        buttonLayoutParams.setMargins((int)(105*scale), (int)(360*scale), 0, 0);

        button.setLayoutParams(buttonLayoutParams);

        layout.addView(button);

        // リスナーをボタンに登録
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // flagがtrueの時
                if (flag) {
                    textView.setText("Hello");
                    buttonWidth = (int)(250 * scale);
                    buttonHeight = (int)(100 * scale);
                    buttonLayoutParams = new RelativeLayout.LayoutParams(buttonWidth, buttonHeight);
                    // setMargins (int left, int top, int right, int bottom)
                    buttonLayoutParams.setMargins((int)(150*scale), (int)(360*scale), 0, 0);
                    button.setLayoutParams(buttonLayoutParams);
                    flag = false;
                }
                // flagがfalseの時
                else {
                    textView.setText("World");
                    buttonWidth = (int)(250 * scale);
                    buttonHeight = (int)(100 * scale);
                    buttonLayoutParams = new RelativeLayout.LayoutParams(buttonWidth, buttonHeight);
                    // setMargins (int left, int top, int right, int bottom)
                    buttonLayoutParams.setMargins((int) (5 * scale), (int)(50 * scale),
                            (int)(50 * scale), (int)(20 * scale));
                    button.setLayoutParams(buttonLayoutParams);
                    flag = true;
                }
            }
        });
    }



}
