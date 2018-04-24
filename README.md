# FloatMenu
仿wps主界面悬浮按钮展开菜单

先上效果图:

![image](https://github.com/linux-liu/FloatMenu/blob/master/gif/effect.gif)


##用法：

###1.在xml中添加MenuLayout,如下：
<br>
```xml
 <com.liuxin.floatmenulib.view.MenuLayout
        android:id="@+id/menuLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:fab_margin_buttom="30dp"
        app:fab_margin_right="30dp"
        />
```
可以通过自定义参数设置是否显示菜单按钮背景，是否显示文字等，详情参数看第三步

###2.在java文件中添加代码
<br>
```java
 menuLayout=findViewById(R.id.menuLayout);
        menuLayout.setMainButtonColorAndIcon(R.color.colorWhite,R.mipmap.ic_add_black_36dp)
                //设置菜单的图片资源
                .setListImageResource(R.mipmap.ic_alarm_black_24dp,R.mipmap.ic_face_black_24dp,R.mipmap.ic_g_translate_black_24dp)
                //设置文字
                .setListText("alarm","face","translate")
                //点击事件监听
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
                
```
###3.MenuLayout中支持的自定义的参数如下：
<br>
```xml
    <declare-styleable name="MenuLayout">

        <!--  悬浮按钮动画时的旋转方向-->
        <attr name="fab_rotation_direction" format="integer">
            <!--  顺时针-->
            <enum name="cw" value="1"/>
            <!-- 逆时针 -->
            <enum name="ncw" value="2"/>

        </attr>
       <!-- 悬浮按钮大小 -->
        <attr name="fab_Size" format="dimension"/>
        <!-- 悬浮按钮离右下的间距 -->
        <attr name="fab_margin_right" format="dimension"/>
        <attr name="fab_margin_buttom" format="dimension"/>

        <!--  弹出的菜单按钮大小-->
        <attr name="popup_fab_size" format="dimension"/>

        <!--   弹出的每个菜单按钮之间的间距-->
        <attr name="popup_fab_margin" format="dimension"/>
        <!-- 是否显示文字-->
        <attr name="show_text" format="boolean"/>
        <!-- 是否显示文字背景-->
        <attr name="show_text_bg" format="boolean"/>
        <!-- 显示文本的文字大小 -->
        <attr name="textSize" format="dimension"/>
        <!-- 显示文本的颜色 -->
        <attr name="textColor" format="color"/>
        <!-- 显示文本背景色颜色 -->
        <attr name="text_bg_color" format="color"/>

        <!-- 是否显示图片背景-->
        <attr name="show_image_bg" format="boolean"/>

        <!-- 图片背景颜色-->
        <attr name="image_bg_color" format="color"/>

        <!-- 文字和图片之间的间隙 -->

        <attr name="text_image_maragin" format="dimension"/>


    </declare-styleable>
```


