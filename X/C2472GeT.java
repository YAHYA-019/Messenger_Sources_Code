package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.endtoend.EndToEnd;
import com.facebook.inject.FbInjector;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* renamed from: X.GeT, reason: case insensitive filesystem */
/* loaded from: GeT.class */
public final class C2472GeT extends C1q6 {
    public 9Yk A00;
    public 9Yk A01;
    public Integer A02;
    public C00m A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1BP A0E;
    public final 1De A0F;
    public final Function1 A0G;

    public C2472GeT(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0F = r303;
        1BY r0 = r303.A00;
        this.A0B = 1Lm.A03(fbUserSession, r0, 114859);
        this.A07 = GOn.A0i(fbUserSession, r0);
        this.A05 = GOn.A0j(fbUserSession, r0);
        this.A0A = 1Lm.A03(fbUserSession, r0, 99846);
        this.A0C = 1Lm.A03(fbUserSession, r0, 83902);
        this.A08 = 1Bu.A03(r0, 100292);
        this.A0E = FbInjector.A00;
        this.A0D = 1Lm.A03(fbUserSession, r0, 85142);
        this.A04 = 1Bu.A03(r0, 33230);
        this.A09 = 1Lm.A03(fbUserSession, r0, 84181);
        this.A06 = 1Lm.A03(fbUserSession, r0, 115640);
        this.A0G = new AV2(this, 4);
    }

    public static final 9Yk A00(C2472GeT c2472GeT, String str) {
        9Yk r305 = null;
        if (GOq.A1T(c2472GeT.A07)) {
            r305 = ((CNY) 1Br.A0B(c2472GeT.A09)).A02((Exception) null, str);
            GAY gay = new GAY(1Br.A0B(c2472GeT.A08), 3);
            if (EndToEnd.isRunningEndToEndTest()) {
                gay.invoke();
            }
        }
        return r305;
    }

    @Override // X.C1q6, X.C1pu
    public void CHq(Fragment fragment) {
        11T.A0F(fragment, 0);
        if (((C2j5) 1Br.A0B(this.A04)).A01() || Build.VERSION.SDK_INT > 30) {
            return;
        }
        Intent A05 = AbF.A05();
        A05.setAction(AnonymousClass000.A00(43));
        FbInjector.A03.sendBroadcast(A05);
    }

    @Override // X.C1q6, X.C1pu, X.C1pv
    public void CMf(Fragment fragment) {
        11T.A0F(fragment, 0);
        CP1 cp1 = (CP1) 1Br.A0B(this.A0D);
        ScheduledFuture scheduledFuture = cp1.A00;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            cp1.A00 = null;
        }
        Activity A1Q = ((1pK) fragment).A1Q();
        11T.A0A(A1Q);
        9Yk r0 = this.A00;
        if (r0 != null) {
            r0.A00(A1Q, "CameraStateListener_on_start_continue_camera", true);
        } else {
            C00i c00i = this.A07.A00;
            if (AbJ.A0j(c00i).A0A == 0S2.A0C && !AbJ.A0j(c00i).A0U) {
                CNY.A00(A1Q, (CNY) 1Br.A0B(this.A09), (1K9) null, "CameraStateListener_continue_camera", false, false);
            }
        }
        this.A00 = null;
        C00i c00i2 = this.A07.A00;
        if (AbJ.A0j(c00i2).A0A == 0S2.A0C && !AbJ.A0j(c00i2).A0U) {
            1Br.A0C(this.A0C);
            GAY gay = new GAY(1Br.A0B(this.A08), 4);
            if (EndToEnd.isRunningEndToEndTest()) {
                gay.invoke();
            }
        }
        GOp.A0f(this.A0B).A03(true);
        String A02 = I6F.A02(fragment);
        if (A02 == null) {
            throw AnonymousClass001.A0N("Attempting to access localCallId from hierarchy without RpCallUiRoot.  Fragment or Activity must implement RpCallUiRoot to access localCallId/rpStore.");
        }
        this.A03 = C9lt.A00(A02).A00(new Iey(this.A0G, 2), JAb.A00, true);
        this.A02 = 1BK.A0j(fragment);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
    
        if (r0.inCallState == 4) goto L41;
     */
    @Override // X.C1q6, X.C1pu, X.C1pv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CNf(androidx.fragment.app.Fragment r302) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2472GeT.CNf(androidx.fragment.app.Fragment):void");
    }
}
