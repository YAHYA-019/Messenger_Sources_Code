package com.facebook.rtc.activities;

import X.0QO;
import X.1BQ;
import X.1BV;
import X.1Rv;
import X.53T;
import X.AnonymousClass001;
import X.C00i;
import X.C04r;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.rtc.interfaces.RtcCallStartParams;

/* loaded from: CallPermissionsActivity.class */
public class CallPermissionsActivity extends FbFragmentActivity {
    public static final String[] A08 = {"android.permission.RECORD_AUDIO"};
    public static final String[] A09 = {"android.permission.RECORD_AUDIO", "android.permission.CAMERA"};
    public FbUserSession A00;
    public RtcCallStartParams A01;
    public 53T A02;
    public String A03;
    public final C00i A04 = 1BQ.A02(33154);
    public final C00i A07 = 1BV.A00(306);
    public final C00i A05 = 1BQ.A02(115641);
    public final C00i A06 = 1BQ.A02(67262);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0QO, X.04r] */
    public static C04r A12(boolean z) {
        ?? r0 = new 0QO(0);
        r0.put("android.permission.RECORD_AUDIO", AnonymousClass001.A0K());
        if (z) {
            r0.put("android.permission.CAMERA", false);
        }
        return r0;
    }

    private boolean A15(String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return true;
            }
            String str = strArr[i2];
            C00i c00i = this.A06;
            if (!((1Rv) c00i.get()).A08(str) && !((1Rv) c00i.get()).A05(this, str)) {
                return false;
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r301.length != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A16(java.lang.String[] r301, java.lang.String[] r302, boolean r303) {
        /*
            r0 = r302
            int r0 = r0.length
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L16
            r0 = r301
            int r0 = r0.length
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 == 0) goto L19
        L16:
            r0 = 0
            r307 = r0
        L19:
            r0 = r303
            X.04r r0 = A12(r0)
            r308 = r0
            r0 = r301
            int r0 = r0.length
            r309 = r0
            r0 = 0
            r310 = r0
        L26:
            r0 = r310
            r1 = r309
            if (r0 >= r1) goto L5c
            r0 = r301
            r1 = r310
            r0 = r0[r1]
            r311 = r0
            r0 = r308
            r1 = r311
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L53
            r0 = r311
            boolean r0 = r0.booleanValue()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L53
            r0 = 1
            r307 = r0
        L53:
            r0 = r310
            r1 = 1
            int r0 = r0 + r1
            r310 = r0
            goto L26
        L5c:
            r0 = r305
            r1 = r304
            if (r0 >= r1) goto L91
            r0 = r302
            r1 = r305
            r0 = r0[r1]
            r311 = r0
            r0 = r308
            r1 = r311
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L88
            r0 = r311
            boolean r0 = r0.booleanValue()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L88
            r0 = 1
            r307 = r0
        L88:
            r0 = r305
            r1 = 1
            int r0 = r0 + r1
            r305 = r0
            goto L5c
        L91:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.activities.CallPermissionsActivity.A16(java.lang.String[], java.lang.String[], boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x03b8, code lost:
    
        if (r0 != false) goto L79;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.activities.CallPermissionsActivity.A2y(android.os.Bundle):void");
    }
}
