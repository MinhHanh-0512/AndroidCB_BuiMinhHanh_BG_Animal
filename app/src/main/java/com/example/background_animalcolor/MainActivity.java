package com.example.background_animalcolor;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lấy ID của LinearLayout, ImageView, và TextView
        LinearLayout lo = findViewById(R.id.linear_layout);
        ImageView img = findViewById(R.id.my_image_view);
        TextView tv = findViewById(R.id.text_view);

        // Mảng các màu từ colors.xml
        int[] colors = {
                getResources().getColor(R.color.purple_200),
                getResources().getColor(R.color.purple_500),
                getResources().getColor(R.color.purple_700),
                getResources().getColor(R.color.teal_200),
                getResources().getColor(R.color.teal_700),
                getResources().getColor(R.color.black),
                getResources().getColor(R.color.white)
                // Thêm các màu khác nếu có
        };

        // Mảng các biểu tượng từ drawable
        int[] icons = {
                R.drawable.penguin,
                R.drawable.costa_rica,
                R.drawable.mexico
                // Thêm các biểu tượng khác nếu có
        };

        // Chọn màu ngẫu nhiên từ mảng
        Random random = new Random();
        int randomColor = colors[random.nextInt(colors.length)];

        // Chọn biểu tượng ngẫu nhiên từ mảng
        int randomIcon = icons[random.nextInt(icons.length)];

        // Đặt nền của layout thành màu ngẫu nhiên
        lo.setBackgroundColor(randomColor);

        // Đặt hình ảnh của ImageView thành biểu tượng ngẫu nhiên
        img.setImageResource(randomIcon);

    }
}