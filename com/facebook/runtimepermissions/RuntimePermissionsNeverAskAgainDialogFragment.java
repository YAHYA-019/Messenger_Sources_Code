package com.facebook.runtimepermissions;

import X.2Ov;
import X.53T;
import X.DMV;
import X.HL5;
import X.Hgh;
import X.I1b;
import X.I52;
import android.app.Activity;
import android.content.DialogInterface;

/* loaded from: RuntimePermissionsNeverAskAgainDialogFragment.class */
public class RuntimePermissionsNeverAskAgainDialogFragment extends 2Ov {
    public Activity A00;
    public DMV A01;
    public Hgh A02;
    public I52 A03;
    public RequestPermissionsConfig A04;
    public I1b A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public String A0A;
    public String[] A0B;
    public HL5 A0C;
    public Integer A0D;
    public Integer A0E;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r0.A01 != 1) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A05(android.widget.LinearLayout r302, java.lang.CharSequence r303) {
        /*
            r301 = this;
            r0 = r301
            android.app.Activity r0 = r0.A00
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            r304 = r0
            r0 = r301
            com.facebook.runtimepermissions.RequestPermissionsConfig r0 = r0.A04
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L28
            r0 = r305
            int r0 = r0.A01
            r307 = r0
            r0 = 2132541680(0x7f1c00f0, float:2.0736444E38)
            r308 = r0
            r0 = r307
            r1 = r306
            if (r0 == r1) goto L2c
        L28:
            r0 = 2132543275(0x7f1c072b, float:2.0739679E38)
            r308 = r0
        L2c:
            r0 = r304
            r1 = r308
            r2 = r302
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r305 = r0
            r0 = r305
            r1 = r303
            r0.setText(r1)
            r0 = r302
            r1 = r305
            r0.addView(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.runtimepermissions.RuntimePermissionsNeverAskAgainDialogFragment.A05(android.widget.LinearLayout, java.lang.CharSequence):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a6, code lost:
    
        if (r0.A01 != 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cf, code lost:
    
        if (r304 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b5, code lost:
    
        if (r0.A01 != 1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog A0n(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.runtimepermissions.RuntimePermissionsNeverAskAgainDialogFragment.A0n(android.os.Bundle):android.app.Dialog");
    }

    public void onCancel(DialogInterface dialogInterface) {
        Hgh hgh = this.A02;
        if (hgh != null) {
            53T r0 = hgh.A00;
            String[] strArr = hgh.A02;
            53T.A00(r0, "CANCEL", strArr);
            r0.A02.onPermissionsNotGranted(hgh.A03, strArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x011a, code lost:
    
        if (r0 == null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.runtimepermissions.RuntimePermissionsNeverAskAgainDialogFragment.onCreate(android.os.Bundle):void");
    }
}
