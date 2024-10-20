package com.facebook.sosource.bsod;

import X.05X;
import X.0FI;
import X.AnonymousClass001;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: BSODActivity.class */
public class BSODActivity extends Activity {
    public static void A00(Context context, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String str3;
        Resources resources = context.getResources();
        Intent intent = new Intent(context, (Class<?>) BSODActivity.class);
        intent.addFlags(335544320);
        if (resources != null) {
            str = resources.getString(i4);
            String string = resources.getString(i3, str);
            intent.putExtra("com.facebook.sosource.bsod.application_name", str);
            intent.putExtra("com.facebook.sosource.bsod.bsod_cause_text", string);
        } else {
            str = null;
        }
        Notification.Builder autoCancel = new Notification.Builder(context).setSmallIcon(2131230803).setAutoCancel(true);
        if (resources != null) {
            str3 = resources.getString(i, str);
            str2 = resources.getString(i2, str);
            autoCancel.setContentText(str2);
        } else {
            str2 = "Unknown error. Please open for details.";
            autoCancel.setContentText(str2);
            str3 = "Application Error";
        }
        autoCancel.setContentTitle(str3);
        autoCancel.setTicker(str2);
        05X r0 = new 05X();
        r0.A0D(intent, context.getClassLoader());
        autoCancel.setContentIntent(r0.A01(context, 0, 134217728));
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        autoCancel.setChannelId("com.facebook.sosource.bsod");
        notificationManager.createNotificationChannel(new NotificationChannel("com.facebook.sosource.bsod", str, 4));
        notificationManager.notify(1, autoCancel.build());
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        RuntimeException A0T;
        int i;
        int A00 = 0FI.A00(444714414);
        super.onCreate(bundle);
        Resources resources = getResources();
        Intent intent = getIntent();
        setContentView(2132541632);
        TextView textView = (TextView) findViewById(2131362668);
        TextView textView2 = (TextView) findViewById(2131362671);
        TextView textView3 = (TextView) findViewById(2131362669);
        ImageView imageView = (ImageView) findViewById(2131362670);
        String stringExtra = intent.getStringExtra("com.facebook.sosource.bsod.application_name");
        if (stringExtra != null) {
            String stringExtra2 = intent.getStringExtra("com.facebook.sosource.bsod.bsod_cause_text");
            if (stringExtra2 == null) {
                stringExtra2 = resources.getString(2131951711);
            }
            if (textView != null) {
                textView.setText(resources.getString(2131951711, stringExtra));
            }
            if (textView3 != null) {
                if (stringExtra2 != null) {
                    textView3.setText(Html.fromHtml(stringExtra2));
                    textView3.setMovementMethod(LinkMovementMethod.getInstance());
                } else {
                    A0T = AnonymousClass001.A0T("Missing description");
                    i = 927405545;
                }
            }
            int intExtra = intent.getIntExtra("com.facebook.sosource.bsod.bsod_msg_icon", 0);
            if (imageView != null && intExtra != 0) {
                imageView.setImageResource(intExtra);
                imageView.setVisibility(0);
            }
            String stringExtra3 = intent.getStringExtra("com.facebook.sosource.bsod.bsod_title_text");
            if (stringExtra3 != null && textView2 != null) {
                textView2.setText(stringExtra3);
                textView2.setVisibility(0);
            }
            0FI.A07(-443158044, A00);
            return;
        }
        A0T = AnonymousClass001.A0T("Missing app name");
        i = 1765954956;
        0FI.A07(i, A00);
        throw A0T;
    }

    @Override // android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(459820724);
        super.onStop();
        Log.i("BSODActivity", "Exiting BSOD");
        try {
            System.exit(10);
        } catch (Throwable unused) {
        }
        0FI.A07(-1829284441, A00);
    }
}
