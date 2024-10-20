package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9gH, reason: invalid class name */
/* loaded from: 9gH.class */
public final class C9gH {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final C70n A04;
    public final ConcurrentHashMap A05;
    public final 0Xs A06;
    public final C15t A07;
    public final 1De A08;

    public C9gH(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A08 = r303;
        this.A03 = 1Bq.A00(68686);
        1BY r0 = r303.A00;
        this.A02 = 1Bu.A03(r0, 68752);
        this.A00 = 1Lm.A03(fbUserSession, r0, 68721);
        this.A01 = 1Lm.A03(fbUserSession, r0, 68682);
        this.A05 = new ConcurrentHashMap();
        0Ro A00 = 0Du.A00(C0ty.A00);
        this.A06 = A00;
        this.A07 = A00;
        this.A04 = ((82O) 1Bn.A0E((Context) null, r0, 363)).A0Y(FbInjector.A00());
        AJT.A02(this, 7zN.A0y(), 36);
    }

    public static final 8Jw A00(8Jw r301, C9gH c9gH) {
        Uri uri = (Uri) r301.A04;
        C5en A00 = C5en.A00();
        A00.A0E = uri;
        A00.A0P = 5HP.A0F;
        Uri uri2 = c9gH.A04.A01(4YU.A0Y(A00)).A0E;
        11T.A09(uri2);
        String str = r301.A06;
        Uri uri3 = (Uri) r301.A02;
        C5fo c5fo = (C5fo) r301.A01;
        C5fo c5fo2 = (C5fo) r301.A03;
        String str2 = r301.A05;
        11T.A0F(str, 0);
        7zT.A1T(uri3, c5fo, c5fo2);
        11T.A0F(str2, 5);
        return new 8Jw(uri3, uri2, c5fo, c5fo2, str, str2, 0);
    }
}
