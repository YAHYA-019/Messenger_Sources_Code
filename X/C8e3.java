package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.video.engine.api.VideoPlayerParams;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8e3, reason: invalid class name */
/* loaded from: 8e3.class */
public final class C8e3 extends 1LH {
    public final 8Lu A00;
    public final String A01;
    public final C00m A02;
    public final Function1 A03;
    public final double A04;
    public final Uri A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C8e3(Uri uri, 8Lu r303, String str, String str2, C00m c00m, Function1 function1, double d, boolean z, boolean z2, boolean z3) {
        1BK.A1K(str, 2, str2);
        this.A05 = uri;
        this.A01 = str;
        this.A04 = d;
        this.A06 = str2;
        this.A07 = z;
        this.A09 = z2;
        this.A08 = z3;
        this.A02 = c00m;
        this.A03 = function1;
        this.A00 = r303;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        FbUserSession A01 = 1Fw.A01(r0.A0D);
        8Lu r02 = this.A00;
        if (r02 != null && 7zP.A1V((C2lh) r02.A01)) {
            2JB.A01(new ADA(this));
        }
        6TA A00 = 9CV.A00(this.A05, this.A01);
        A00.A1h = true;
        VideoPlayerParams videoPlayerParams = new VideoPlayerParams(A00);
        HashMap A0u = AnonymousClass001.A0u();
        HashSet A0v = AnonymousClass001.A0v();
        CallerContext callerContext = CallerContext.A08;
        1Fz r03 = FbUserSession.A00;
        6TI A002 = 6TF.A00(A01, callerContext, videoPlayerParams, A0u, (java.util.Map) null, A0v, this.A04, false);
        GR6 A003 = GR5.A00(r0);
        A003.A2a(new 92O(this.A09));
        A003.A2Z(9nH.A02);
        A003.A2c(true);
        GR5 gr5 = A003.A01;
        gr5.A0N = true;
        gr5.A0M = this.A07;
        gr5.A02 = c2k5.B7k().A07(2131427335);
        A003.A2Y(6TN.A09);
        A003.A2b(A002);
        A003.A2X((float) A002.A00);
        gr5.A0Q = this.A08;
        7zO.A1N(A003, AVC.A01(this, 23));
        A003.A1q(7zL.A0a(AVC.A01(this, 24)));
        A003.A2S(this.A06);
        return A003.A2W();
    }
}
