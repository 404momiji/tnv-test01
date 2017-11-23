/*
//
//Next Do ...
//
// TextViewに表示
//
// CSV で読み込み
//
 */

package com.tool.tetsu2kasen.tnv_test01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    int GC=0;//行カウント
    final int BM=2;
    public int Bcot=0;
    public String TMPTXT[]={"","",""};
    public String TMPKKK="";//カキコ用テンプ


    public String txt[]={
            "abcdef\nGHIJK\nlmnopqrSTUVWXYZ",
            "123\n456\n7890-^\\"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);

    }
    public boolean onTouchEvent(MotionEvent event){
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                loadtxt();
                Log.d("TouchEvent", "getAction()" + "ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("TouchEvent", "getAction()" + "ACTION_UP");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("TouchEvent", "getAction()" + "ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d("TouchEvent", "getAction()" + "ACTION_CANCEL");
                break;
        }
        return true;
    }
    public void initV(){
        GC=0;
        TMPTXT[0]="";
        TMPTXT[1]="";
        TMPTXT[2]="";
        TMPKKK="";
    }
    public void loadtxt(){

        initV();
        String result = "";

        for(int i=0; i < txt[0].length(); i++)
        {
            if(txt[0].charAt(i)=='\n'){
                GC++;
            }else{
                TMPTXT[GC] += txt[0].charAt(i);
            }
            //Switch文の使った場合も書いておくが、結構使い物にならない（caseとdefaultが同時に実行され、\nがエスケープされなくなる（誰かに教えるときのためのメモ、見る人いるかな？（笑い

            /*
            switch(txt[0].charAt(i))
            {
                case '\b':
                    //result += "\\b";break;
                case '\t':
                    //result += "\\t";break;
                case '\n':
                    GC++;
                    //result += "\\n";break;
                case '\f':
                    //result += "\\f";break;
                case '\r':
                    //result += "\\r";break;
                case '\"':
                    //result += "\\\"";break;
                case '\'':
                    //result += "\\\'";break;
                case '\\':
                    //result += "\\\\";break;
                default:
                    TMPTXT[GC] += txt[0].charAt(i);


            }*/
        }
        Log.d("LOADEDTEXT:","lows:"+1+"NAIYO:"+ TMPTXT[0]);
        Log.d("LOADEDTEXT:","lows:"+2+"NAIYO:"+ TMPTXT[1]);
        Log.d("LOADEDTEXT:","lows:"+3+"NAIYO:"+ TMPTXT[2]);
    }
}
