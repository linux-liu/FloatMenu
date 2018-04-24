package com.liuxin.floatmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.liuxin.floatmenulib.view.MenuLayout;

public class MainActivity extends AppCompatActivity {
    private MenuLayout menuLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuLayout=findViewById(R.id.menuLayout);
        menuLayout.setMainButtonColorAndIcon(R.color.colorWhite,R.mipmap.ic_add_black_36dp)
                .setListImageResource(R.mipmap.ic_alarm_black_24dp,R.mipmap.ic_face_black_24dp,R.mipmap.ic_g_translate_black_24dp)
                .setListText("alarm","face","translate")
                .setOnItemClickListener(new MenuLayout.OnItemClickListener() {
                    @Override
                    public void onTextItemClickListener(int position, String str) {
                        Toast.makeText(MainActivity.this,"positiion"+position+":"+str,Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onImageItemClickListener(int position, int resId) {
                        Toast.makeText(MainActivity.this,"positiion"+position+":"+resId,Toast.LENGTH_SHORT).show();
                    }
                }).createMenu();
    }
}
