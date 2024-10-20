package com.facebook.fbavatar;

import X.06Z;
import X.0FI;
import X.0Q8;
import X.0QD;
import X.0S2;
import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1lN;
import X.2LK;
import X.2S0;
import X.4YU;
import X.4fF;
import X.67L;
import X.7zM;
import X.7zO;
import X.9ZF;
import X.AbF;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C0s8;
import X.C3o5;
import X.C61y;
import X.DKE;
import X.DeC;
import X.ELa;
import X.EVM;
import X.Ech;
import X.EpL;
import X.EpM;
import X.ExI;
import X.Eze;
import X.FAN;
import X.FIl;
import X.GAY;
import X.Hmc;
import X.IEo;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.fbavatar.logging.AvatarScubaLoggerParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: FbAvatarEditorBaseActivity.class */
public abstract class FbAvatarEditorBaseActivity extends FbFragmentActivity implements 1lN, 2LK {
    public FAN A00;
    public FIl A02;
    public Hmc A04;
    public String A05;
    public String A06;
    public ViewGroup A07;
    public EpL A08;
    public EVM A09;
    public C61y A0A;
    public 9ZF A0B;
    public final C01i A0K = C01g.A00(C03i.A02, new GAY(this, 33));
    public final 1Br A0G = 1Bq.A00(99498);
    public final 1Br A0D = 1Bq.A00(82810);
    public final 1Br A0I = 1Bq.A00(82360);
    public final 1Br A0C = 7zM.A0N();
    public final 1Br A0E = 1Bq.A00(99862);
    public final 1Br A0F = 1Bq.A00(68609);
    public final 1Br A0H = 1Bu.A00(147475);
    public final 1Br A0J = 1Bq.A00(115909);
    public AvatarScubaLoggerParams A03 = new AvatarScubaLoggerParams("unknown", "unknown", "unknown", "unknown");
    public final Ech A0L = new Ech(this);
    public ELa A01 = ELa.A04;
    public final DeC A0M = new DeC(this, 0);

    public static String A12(BaseBundle baseBundle, String str, String str2) {
        String string = baseBundle.getString(str, "unknown");
        if (11T.A0O(string, "unknown")) {
            return str2;
        }
        11T.A0D(string);
        11T.A0F(string, 0);
        return string;
    }

    private final void A15() {
        Bundle A0H;
        if (isFinishing() || (A0H = 7zO.A0H(this)) == null || !A0H.getBoolean("is_request_from_sdk_login")) {
            return;
        }
        setResult(-1, AbF.A05());
        finishActivity(2211);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public Integer A2h() {
        return DKE.A0c().AZk(72340172821302526L) ? 0S2.A00 : 0S2.A0C;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        ((67L) 1Br.A0B(this.A0J)).A04(this.A0M);
        if (1Br.A07(this.A0C).AZk(72339103374377035L)) {
            ((4fF) 1Br.A0B(((EpM) 1Br.A0B(this.A0G)).A02)).A0G();
        }
        1Br.A0C(this.A0H);
        FAN fan = this.A00;
        if (fan == null) {
            11T.A0L("navigationManager");
            throw 0Q8.createAndThrow();
        }
        fan.A00 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x0632. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:105:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06f3  */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 2044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbavatar.FbAvatarEditorBaseActivity.A2y(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r307 == X.0S2.A0C) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A3B() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbavatar.FbAvatarEditorBaseActivity.A3B():void");
    }

    public final void A3C() {
        A3B();
        super.onBackPressed();
    }

    public String AWg() {
        return this.A03.A01;
    }

    public Map Agf() {
        HashMap A0u = AnonymousClass001.A0u();
        Map map = ((ExI) 1Br.A0B(this.A0D)).A07;
        String[] A0n = C3o5.A0n(0QD.A0S(map.keySet()));
        ArrayList A10 = C0s8.A10(Arrays.copyOf(A0n, A0n.length));
        String[] A0n2 = C3o5.A0n(0QD.A0S(map.values()));
        ArrayList A102 = C0s8.A10(Arrays.copyOf(A0n2, A0n2.length));
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("{");
        int size = A10.size();
        int i = 0;
        while (i < size) {
            A0k.append("\"");
            A0k.append((String) A10.get(i));
            A0k.append("\": \"");
            A0k.append((String) A102.get(i));
            A0k.append("\"");
            A0k.append(i == A10.size() - 1 ? "\n" : ",\n");
            i++;
        }
        String A0v = 1BL.A0v(A0k);
        11T.A0A(A0v);
        A0u.put("Avatar Config", A0v);
        return A0u;
    }

    public Long Am7() {
        return 946709759111584L;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        List A0A;
        FAN fan = this.A00;
        if (fan == null) {
            11T.A0L("navigationManager");
            throw 0Q8.createAndThrow();
        }
        Context context = ((Eze) 1Br.A0B(fan.A07)).A00;
        11T.A0I(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        06Z BDe = ((FragmentActivity) context).BDe();
        Object obj = null;
        if (BDe != null && (A0A = BDe.A0T.A0A()) != null) {
            Iterator it = A0A.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    obj = next;
                    break;
                }
            }
            2S0 r0 = (Fragment) obj;
            if (r0 != null && r0.isVisible() && (r0 instanceof 2S0) && r0.Bkd()) {
                return;
            }
        }
        A15();
        A3C();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-331404759);
        super.onPause();
        if (this.A09 == null) {
            11T.A0L("shareToFeedPostEventsReceiver");
            throw 0Q8.createAndThrow();
        }
        0FI.A07(-2092391383, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-810232070);
        super.onResume();
        if (this.A09 == null) {
            11T.A0L("shareToFeedPostEventsReceiver");
            throw 0Q8.createAndThrow();
        }
        0FI.A07(912889742, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(-669696604);
        super.onStart();
        Hmc hmc = this.A04;
        if (hmc == null) {
            11T.A0L("avatarEditorRtcSetup");
            throw 0Q8.createAndThrow();
        }
        FbUserSession fbUserSession = (FbUserSession) this.A0K.getValue();
        11T.A0F(fbUserSession, 0);
        ((IEo) 4YU.A0o(fbUserSession, hmc.A00, 100046)).A07 = true;
        0FI.A07(-1538805809, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(669975034);
        super.onStop();
        Hmc hmc = this.A04;
        if (hmc == null) {
            11T.A0L("avatarEditorRtcSetup");
            throw 0Q8.createAndThrow();
        }
        FbUserSession fbUserSession = (FbUserSession) this.A0K.getValue();
        11T.A0F(fbUserSession, 0);
        ((IEo) 4YU.A0o(fbUserSession, hmc.A00, 100046)).A07 = false;
        0FI.A07(-1408377402, A00);
    }
}
