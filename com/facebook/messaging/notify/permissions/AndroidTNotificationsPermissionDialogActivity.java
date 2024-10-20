package com.facebook.messaging.notify.permissions;

import X.0S2;
import X.1BJ;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1G2;
import X.1UG;
import X.1ZG;
import X.1wT;
import X.2yD;
import X.53S;
import X.AbF;
import X.AbG;
import X.AbK;
import X.AnonymousClass000;
import X.BHs;
import X.C0et;
import X.C1io;
import X.C2dm;
import X.C2dp;
import X.C5fi;
import X.C5iw;
import X.JKS;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.runtimepermissions.RequestPermissionsConfig;

/* loaded from: AndroidTNotificationsPermissionDialogActivity.class */
public final class AndroidTNotificationsPermissionDialogActivity extends FbFragmentActivity implements C1io {
    public final 1Br A03 = 1Bu.A01(this, 49478);
    public final 1Br A00 = 1Bu.A00(66245);
    public final 1Br A01 = 1BK.A0E();
    public final 1Br A02 = 1Bu.A00(66532);

    public static final /* synthetic */ C2dp A12(AndroidTNotificationsPermissionDialogActivity androidTNotificationsPermissionDialogActivity) {
        return (C2dp) 1Br.A0B(androidTNotificationsPermissionDialogActivity.A02);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.5iw, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.JKS, com.facebook.runtimepermissions.RequestPermissionsConfig, java.lang.String[], X.53T] */
    /* JADX WARN: Type inference failed for: r0v48, types: [int, X.1Ql, X.1G2] */
    /* JADX WARN: Type inference failed for: r0v66, types: [X.5iw, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v67, types: [X.5iw, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v69, types: [int, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v70, types: [X.5iw, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v71, types: [X.5iw, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v73, types: [X.5iw, java.lang.String] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        C5iw c5iw;
        super.A2y(bundle);
        1Br.A0B(((1wT) this.A00.A00.get()).A01);
        C0et c0et = C0et.A0P;
        if (c0et == c0et) {
            1Br.A07(((1wT) c0et).A00);
            if (AbF.A1Y((2yD) 36323753898429394, 36323753898429394L)) {
                C5fi.A00(this);
            }
        }
        getIntent();
        1BJ.A00(2151);
        Intent intent = null;
        int i = 0;
        Integer num = intent.getBooleanExtra(null, false) ? 0S2.A01 : 0S2.A00;
        Integer num2 = 0S2.A01;
        Integer num3 = num;
        if (num3 == num3) {
            1Br.A09(this.A01);
            1G2 r0 = C2dm.A0C;
            i = r0.ArU(r0, 0);
        }
        ((1wT) ((53S) 1Br.A0B(this.A03)).A00(this).get()).A00();
        Integer num4 = 0S2.A0N;
        if (num4 == num4) {
            new C5iw();
            ?? A11 = AbG.A11();
            A11.A00 = A11;
            ?? string = getString(2131962281);
            string.A04 = string;
            ?? A12 = AbK.A12(this);
            ?? A0v = 1BK.A0v(this, (Object) A12, (int) A12);
            A0v.A00(A0v);
            ?? string2 = getString(2131962280);
            string2.A02 = string2;
            ?? string3 = getString(2131962279);
            string3.A03 = string3;
            c5iw = string3;
        } else {
            new C5iw();
            int i2 = 0;
            i2.A00 = 0;
            c5iw = 0;
        }
        new RequestPermissionsConfig(c5iw);
        new BHs(this, num, i);
        AnonymousClass000.A00(28);
        ?? r02 = {r02};
        r02.AHQ((RequestPermissionsConfig) r02, (JKS) r02, (String[]) r02);
        if (bundle == null) {
            1Br.A02(((C2dp) 1Br.A0B(this.A02)).A01);
            1ZG r03 = 1ZG.A03;
            String A00 = 1BJ.A00(1615);
            if (AbG.A0A(A00, A00, A00).isSampled()) {
                1BJ.A00(1847);
                String A002 = 1BJ.A00(45);
                A002.A7R(A002, A002);
                "event_type".A7R("event_type", "event_type");
                String str = num.intValue() != 0 ? "post_login" : "pre_login";
                String A003 = 1BJ.A00(922);
                A003.A7R(A003, str);
                1BK.A0l(i);
                1UG A004 = 1BJ.A00(1988);
                A004.A6H(A004, A004);
                A004.BZL();
            }
            Integer num5 = num;
            if (num5 == num5) {
                1Br.A08(this.A01);
                1G2 r04 = C2dm.A0C;
                ?? r05 = i + 1;
                r05.CaE((1G2) r05, (int) r05);
                r05.commitImmediately();
            }
        }
    }
}
