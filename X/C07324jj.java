package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.zero.common.ZeroToken;
import com.facebook.zero.zerobalance.ping.ZeroBalancePingController;

/* renamed from: X.4jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4jj.class */
public final class C07324jj implements 2Bs {
    public 2BS A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0B;
    public final C00i A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final C00i A0F;
    public final C15h A0H;
    public final C0et A0I;
    public final C00i A0J;
    public final String A0G = 0Pz.A0W("ZeroBalanceResultForAutoFlexController", ".ZeroOptin");
    public final C00i A0A = new 1BQ(16931);
    public final C15h A0K = new G7G(this, 24);
    public final C00i A03 = new 1BQ(99939);

    public C07324jj() {
        1BQ r0 = new 1BQ(16923);
        this.A0J = r0;
        1BQ r02 = new 1BQ(49219);
        this.A0B = r02;
        this.A04 = new 1BQ(16922);
        this.A0C = new 1BQ(49293);
        this.A01 = new 1BQ(98462);
        this.A09 = new 1BV(16934);
        this.A06 = new 1BQ(16520);
        this.A08 = new 1BV(16430);
        this.A0F = new 1BV(33101);
        1BQ r03 = new 1BQ(16385);
        this.A05 = r03;
        this.A0E = new 1BQ(16966);
        this.A07 = new 1BQ(98466);
        this.A0D = new 1BQ(98453);
        this.A0I = (C0et) 1Bi.A03(83604);
        this.A02 = new 1BQ(98465);
        this.A0H = new G7G(this, 25);
        if (((2yD) r03.get()).AZk(36311337151826673L)) {
            return;
        }
        ((C07334jk) r02.get()).A02.add(this);
        1Fw.A04((1EZ) 1Bn.A0A(16428));
        this.A00 = new 2BS() { // from class: X.4jl
            public void ByR(1QE r302, String str, Throwable th) {
            }

            public void ByS(FbUserSession fbUserSession, ZeroToken zeroToken, 1QE r304, String str) {
                C07324jj c07324jj = C07324jj.this;
                if (((ZeroBalancePingController) c07324jj.A0A.get()).A05() && r304 == 1QE.A02) {
                    ((C07334jk) c07324jj.A0B.get()).A01(FbInjector.A00(), fbUserSession, 0S2.A01);
                }
            }
        };
        ((2BR) r0.get()).A0G(this.A00);
    }

    public static void A00(C07324jj c07324jj, String str, int i) {
        View findViewById;
        Activity A08 = 4YU.A0K(c07324jj.A03).A08();
        if (A08 == null || (findViewById = A08.findViewById(R.id.content)) == null) {
            return;
        }
        L5Q A00 = L5Q.A00(findViewById, str, -2, i);
        A00.A07(new FXl(c07324jj, A00, 5), 2131962432);
        A00.A02();
    }

    public void onDetectionFinished(2C1 r302, String str, Context context) {
        String str2;
        if (this.A0I != C0et.A0P) {
            boolean equals = r302.equals(2C1.A03);
            String str3 = this.A0G;
            0fH.A0g(Boolean.valueOf(equals), str3, "onDetectionFinished: hasBalance: %s");
            if (str.equals(1BJ.A00(2129)) || str.equals(1BJ.A00(2128))) {
                0fH.A0g(str, str3, "onDetectionFinished: exiting since trigger is: %s");
                return;
            }
            Activity A08 = 4YU.A0K(this.A03).A08();
            if (A08 == null) {
                str2 = "onDetectionFinished: activity is null";
            } else {
                if (1BL.A1a(this.A0K)) {
                    A08.runOnUiThread(new G4f(A08, this, equals));
                    return;
                }
                str2 = "onDetectionFinished: dialtone GK is false";
            }
            0fH.A0j(str3, str2);
        }
    }
}
