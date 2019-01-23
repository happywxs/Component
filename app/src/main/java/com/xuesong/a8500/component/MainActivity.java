package com.xuesong.a8500.component;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {
    private Button mbtnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnStart=findViewById(R.id.btn_start_sub);
        mbtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ApplicationInfo applicationInfo = null;
                try {
                    applicationInfo = MainActivity.this.getPackageManager().getApplicationInfo(MainActivity.this.getPackageName(), 0);
                    Log.i("wang","===="+applicationInfo.dataDir+"=====");
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
/*                final List list=new ArrayList(9000000);
                final CountDownLatch countDownLatch=new CountDownLatch(9000000);

                    DefaultPoolExecutor.getInstance().execute(new Runnable() {
                        @Override
                        public void run() {
                            for(int i=0;i<list.size();i++){

                                final int finalI = i;
                            Log.i("wang","==list=="+ finalI);
                            list.add(finalI);
                            countDownLatch.countDown();
                        }
                        }
                    });

                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                ARouter.getInstance().build("/sub/SubActiivty").navigation();
            }
        });
    }

}
