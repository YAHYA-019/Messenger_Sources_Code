package com.facebook.runtimepermissions;

import X.0FI;
import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.1Rv;
import X.1yM;
import X.2Ov;
import X.AbJ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00i;
import X.C3Om;
import X.HL5;
import X.Hnz;
import X.I1b;
import X.I52;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.common.dextricks.DexStore;
import com.google.common.base.Preconditions;
import java.util.ArrayList;

/* loaded from: RuntimePermissionsRationaleDialogFragment.class */
public class RuntimePermissionsRationaleDialogFragment extends 2Ov {
    public Activity A00;
    public Hnz A01;
    public I52 A02;
    public RequestPermissionsConfig A03;
    public I1b A04;
    public Integer A05;
    public Integer A06;
    public String A07;
    public String[] A08;
    public HL5 A09;
    public Integer A0A;
    public Integer A0B;
    public boolean A0C;
    public final C00i A0D = 1BQ.A02(67196);
    public final 1Rv A0E = (1Rv) 1Bi.A03(67262);

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
            com.facebook.runtimepermissions.RequestPermissionsConfig r0 = r0.A03
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.runtimepermissions.RuntimePermissionsRationaleDialogFragment.A05(android.widget.LinearLayout, java.lang.CharSequence):void");
    }

    private String[] A06(Activity activity, String[] strArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        int length = strArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return AnonymousClass002.A0b(A0s);
            }
            String str = strArr[i2];
            1Rv r0 = this.A0E;
            if (!r0.A08(str) && !r0.A05(activity, str)) {
                A0s.add(str);
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a3, code lost:
    
        if (r0.A01 != 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00cd, code lost:
    
        if (r314 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03c8, code lost:
    
        if (r0.A01 != 1) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0410  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog A0n(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.runtimepermissions.RuntimePermissionsRationaleDialogFragment.A0n(android.os.Bundle):android.app.Dialog");
    }

    public void onCancel(DialogInterface dialogInterface) {
        Hnz hnz = this.A01;
        if (hnz != null) {
            hnz.A00();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1012060842);
        super.onCreate(bundle);
        boolean z = true;
        if (bundle != null) {
            this.A0C = true;
        }
        this.A09 = (HL5) 1Bn.A0A(116251);
        this.A05 = (Integer) 1Bn.A0A(116254);
        this.A0A = (Integer) 1Bn.A0A(116258);
        this.A0B = (Integer) 1Bn.A0A(116259);
        this.A02 = (I52) 1Bn.A0A(116250);
        this.A06 = (Integer) 1Bn.A0A(116255);
        this.A04 = (I1b) 1Bn.A0A(116260);
        this.A07 = C3Om.A00(getContext(), AbJ.A0E(), (1yM) 1Bi.A03(16885));
        Bundle requireArguments = requireArguments();
        this.A03 = (RequestPermissionsConfig) requireArguments.getParcelable(DexStore.CONFIG_FILENAME);
        this.A08 = requireArguments.getStringArray("permissions");
        Activity A16 = A16();
        this.A00 = A16;
        if ((this.A03 == null && this.A08 == null) || A16 == null) {
            z = false;
        }
        Preconditions.checkArgument(z);
        0FI.A08(-1058983450, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1306284052);
        super/*androidx.fragment.app.Fragment*/.onResume();
        if (this.A0C) {
            A0o();
        }
        0FI.A08(948348480, A02);
    }
}
