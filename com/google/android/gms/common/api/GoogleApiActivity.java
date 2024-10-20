package com.google.android.gms.common.api;

import X.0FI;
import X.0Pz;
import X.28O;
import X.4YT;
import X.AnonymousClass001;
import X.K4w;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

/* loaded from: GoogleApiActivity.class */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public int A00 = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.A00 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                28O A01 = 28O.A01(this);
                if (i2 == -1) {
                    Handler handler = A01.A06;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    A01.A05(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.A00 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.A00 = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A00 = 0FI.A00(717675665);
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = bundle.getInt("resolution");
        }
        if (this.A00 != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get(4YT.A00(173));
                Object obj = extras.get(TraceFieldType.ErrorCode);
                if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.A00 = 1;
                    } catch (ActivityNotFoundException e) {
                        if (extras.getBoolean("notify_manager", true)) {
                            28O.A01(this).A05(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String A0j = 0Pz.A0j("Activity not found while launching ", pendingIntent.toString(), ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                A0j = A0j.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", A0j, e);
                        }
                        this.A00 = 1;
                    } catch (IntentSender.SendIntentException e2) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                        finish();
                    }
                } else if (obj != null) {
                    int A03 = AnonymousClass001.A03(obj);
                    AlertDialog A002 = GoogleApiAvailability.A00(this, this, new K4w(this, GoogleApiAvailability.A00.A05(this, "d", A03), 2), A03);
                    if (A002 != null) {
                        GoogleApiAvailability.A01(this, A002, this, "GooglePlayServicesErrorDialog");
                    }
                    this.A00 = 1;
                } else {
                    str = "Activity started without resolution";
                }
                i = 1910397801;
            }
            Log.e("GoogleApiActivity", str);
            finish();
            i = 1910397801;
        } else {
            i = 1256905274;
        }
        0FI.A07(i, A00);
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.A00);
        super.onSaveInstanceState(bundle);
    }
}
