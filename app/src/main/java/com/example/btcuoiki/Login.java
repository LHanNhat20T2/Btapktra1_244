package com.example.btcuoiki;

import androidx.appcompat.app.AppCompatActivity;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btnXacNhan;
    EditText edtUserName, edtPassword;
    CheckBox cbRemember;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Anhxa();
        sharedPreferences  = getSharedPreferences("dataLogin",MODE_PRIVATE);

        // lay gia tri
        edtUserName.setText(sharedPreferences.getString("taikhoan",""));
        edtPassword.setText(sharedPreferences.getString("matkhau",""));
        cbRemember.setChecked(sharedPreferences.getBoolean("checked",false));
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edtUserName.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                if (username.equals("hannhat244") && password.equals("123")){
                    Intent i = new Intent(Login.this, MainActivity.class);
                    startActivity(i);
                    Toast.makeText(Login.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    //  nêu co check
                    if(cbRemember.isChecked()){
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("taikhoan", username);
                        editor.putString("matkhau", password);
                        editor.putBoolean("checked", true);
                        editor.commit();
                        Intent intent = new Intent(Login.this, MainActivity.class);
                        startActivity(intent);
                        Toast.makeText(Login.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();

                    }else   {
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.remove("taikhoan");
                        editor.remove(("matkhau"));
                        editor.remove("checked");
                        editor.commit();
                    }
                }else {
                    Toast.makeText(Login.this,"Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void Anhxa(){
        btnXacNhan = (Button) findViewById(R.id.buttonLogin);
        edtUserName = (EditText) findViewById(R.id.edittextUser);
        edtPassword = (EditText) findViewById(R.id.edittextPassword);
        cbRemember = (CheckBox) findViewById(R.id.checkboxRemember);
    }
}