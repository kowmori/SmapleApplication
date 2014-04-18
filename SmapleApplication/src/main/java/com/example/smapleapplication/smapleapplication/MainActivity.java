package com.example.smapleapplication.smapleapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.app.Activity;
import android.widget.ImageView;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

    // 画像を保持するメンバ変数
    private Bitmap img0 = null;
    private Bitmap img1 = null;

    /**
     * アクティビティ作成時に呼び出されるメソッド
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // スーパークラスのonCreateを呼び出す
        super.onCreate(savedInstanceState);

        // コンテントビューにレイアウトリソースをセットする
        setContentView(R.layout.activity_main);

        // img0ファイルとimg1ファイルをビットマップに変換する
        img0 = BitmapFactory.decodeResource(getResources(), R.drawable.img0);
        img1 = BitmapFactory.decodeResource(getResources(), R.drawable.img1);

    }

    /*
     ** 左側のボタンを押したときに呼び出されるメソッド
     */
    public void onClickImg0(View view) {
        // ImageViewを取得する
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        // ImageViewにimg0をセットする
        imageView.setImageBitmap(img0);
    }

    /**
     * 右側のボタンを押したときに呼び出されるメソッド
     */
    public void onClickImg1(View view) {
        // ImageViewを取得する
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        // ImageViewにimg1をセットする
        imageView.setImageBitmap(img1);
    }
}