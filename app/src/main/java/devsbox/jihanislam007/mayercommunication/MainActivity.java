package devsbox.jihanislam007.mayercommunication;

import android.Manifest;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView one,    two,    three,    four,    five,    six,    seven,
            eight,    nine,    ten,    eleven,    twelve;

    LinearLayout w_one ,w_two ,w_three ,s_w_one ,s_ward_two,s_ward_three;

    ImageView call, sms;
    Dialog mDialog;
    Button sendAll ,sendAll_ward, sendAll_s_ward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                one = findViewById(R.id.one);
                two = findViewById(R.id.two);
                three = findViewById(R.id.three);
                four = findViewById(R.id.four);
                five = findViewById(R.id.five);
                six = findViewById(R.id.six);
                seven = findViewById(R.id.seven);
                eight = findViewById(R.id.eight);
                nine = findViewById(R.id.nine);
                ten = findViewById(R.id.ten);
                eleven = findViewById(R.id.eleven);
                twelve = findViewById(R.id.twelve);

        sendAll = findViewById(R.id.sendAll);

//////////////////////////////////////////////////////

        w_one = findViewById(R.id.w_one);
        w_two = findViewById(R.id.w_two);
        w_three = findViewById(R.id.w_three);

        sendAll_s_ward = findViewById(R.id.sendAll_ward);

        //////////////////////////////////////////////////////

        s_w_one = findViewById(R.id.s_w_one);
        s_ward_two = findViewById(R.id.s_ward_two);
        s_ward_three = findViewById(R.id.s_ward_three);

        sendAll_s_ward = findViewById(R.id.sendAll_s_ward);
        //////////////////////////////////////////


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                two();
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                three();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                four();
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                five();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                six();
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seven();
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eight();
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nine();
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ten();
            }
        });

        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eleven();
            }
        });

        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                twelve();
            }
        });

        ////////////////send all sms////////////////////
        sendAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int identity = 0;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        /////////////////////////////////////////////////
        w_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w_one();
            }
        });

        w_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w_two();
            }
        });

        w_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w_three();
            }
        });

        /////////////////////////////////////////////////



        /*sendAll_ward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               *//* int identity = 100;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);*//*
            }
        });*/

        /////////////////////////////////////////////////
        s_w_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s_w_one();
            }
        });

        s_ward_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s_ward_two();
            }
        });

        s_ward_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s_ward_three();
            }
        });

        /////////////////////////////////////////////////
        sendAll_s_ward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int identity = 200;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
    }

    public void one(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01709900501"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 1;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    //    Toast.makeText(this, " I am clear", Toast.LENGTH_SHORT).show();
    }

    public void two(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01709940189"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 2;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void three(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01709900590"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 3;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void four(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01820533860"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 4;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void five(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01713114916"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 5;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void six(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01715175677"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 6;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void seven(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01711387462"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 7;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void eight(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01712191222"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 8;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void nine(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01715023000"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 9;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void ten(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01824529700"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 10;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void eleven(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01719679771"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 11;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void twelve(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01711781847"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 12;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }
///////////////////////////////////////////////////////
    public void w_one(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01911340892"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 101;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void w_two(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01552375383"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 102;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void w_three(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01711610315"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 103;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    ///////////////////////////////////////////////////////
    public void s_w_one(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01716819381"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 201;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void s_ward_two(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01711019252"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 202;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void s_ward_three(){

        pop();
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01816074452"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int identity = 203;
                Intent in = new Intent(MainActivity.this,SmsActivity.class);
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });
        mDialog.show();
    }

    public void pop() {

        mDialog = new Dialog(MainActivity.this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(R.layout.popuap);

        call =  mDialog.findViewById(R.id.imageViewCall);
        sms =  mDialog.findViewById(R.id.imageViewSms);

      //  takePermission();
    }
}
