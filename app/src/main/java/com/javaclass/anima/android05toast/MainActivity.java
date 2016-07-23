package com.javaclass.anima.android05toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View toast1,toast2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast1 = findViewById(R.id.toast1);
        toast2= findViewById(R.id.toast2);

        toast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowToast1();
            }
        });

        toast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast2("重要訊息", "恭喜您中了大大大樂透");
            }
        });

    }

private void  ShowToast1(){
    Toast tst1 = Toast.makeText(this, "大家好, 偶素Brad", Toast.LENGTH_LONG);
    tst1.setGravity(Gravity.FILL_HORIZONTAL + Gravity.CENTER_VERTICAL, 0, 0);
    tst1.show();
}
    private void showToast2(String title,String msg){
        LayoutInflater inflater = getLayoutInflater();
       View view = inflater.inflate(R.layout.toast_view, (ViewGroup) findViewById(R.id.toast_layout));

    TextView toastTitle= (TextView) view.findViewById(R.id.toast_title);
    TextView toastMsg = (TextView) view.findViewById(R.id.toast_msg);
        toastTitle.setText(title);
        toastMsg.setText(msg);

        Toast toast = new Toast(getApplicationContext());

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();

    }



}
