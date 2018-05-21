package devsbox.jihanislam007.mayercommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class SmsActivity extends AppCompatActivity {


    EditText data;
    Button send;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);


        data = findViewById(R.id.editText);
        send = findViewById(R.id.send);

        Intent in = getIntent();
        final int smsValue = in.getIntExtra("identity", 0);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mess = data.getText().toString();

                if(smsValue==1){

                    String phone = "01709900501";
                    /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", message);
                    startActivity(smsIntent);*/

                 //   String one = "+88-01817511628";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess );
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী ", Toast.LENGTH_LONG).show();
                    finish();


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==2){

                    String phone = "01709940189";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                    /*String phoneNumber = "0123456789";
                    String message = "Hello World! Now we are going to demonstrate " +
                            "how to send a message with more than 160 characters from your Android application.";
                    SmsManager smsManager = SmsManager.getDefault();
                    ArrayList<String> parts = smsManager.divideMessage(message);
                    smsManager.sendMultipartTextMessage(phoneNumber, null, parts, null, null);
*/
                }else if(smsValue==3){

                    String phone = "01709900590";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();
                }else if(smsValue==4){

                    String phone = "01820533860";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==5){

                    String phone = "01713114916";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==6){

                    String phone = "01715175677";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==7){

                    String phone = "01711387462";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==8){
                    String phone = "01712191222";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==9){

                    String phone = "01715023000";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==10){

                    String phone = "01824529700";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==11){

                    String phone = "01719679771";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==12){

                    String phone = "01711781847";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==0){

                    String phone = "01709900501;01709940189;01709900590;01820533860;01713114916;01715175677;01711387462;01712191222;01715023000;01824529700;01719679771;01711781847";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }

                ////////////////////////////////////////////////////////////////

                else if(smsValue==101){

                    String phone = "01911340892";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==102){

                    String phone = "01552375383";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==103){

                    String phone = "01711610315";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }
                else if(smsValue==100){

                    String phone = "01911340892;01552375383;01711610315";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                } ////////////////////////////////////////////////////////////////

                else if(smsValue==201){

                    String phone = "01716819381";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==202){

                    String phone = "01711019252";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==203){

                    String phone = "01816074452";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }
                else if(smsValue==200){

                    String phone = "01716819381;01711019252;01816074452";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phone );
                    smsIntent.putExtra("sms_body", mess);
                    startActivity(smsIntent);


                    Toast.makeText(SmsActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী", Toast.LENGTH_LONG).show();
                    finish();

                }

            }
        });


    }
}
