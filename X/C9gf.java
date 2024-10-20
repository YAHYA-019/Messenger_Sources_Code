package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.9gf, reason: invalid class name */
/* loaded from: 9gf.class */
public final class C9gf {
    public static final int A0Q = 7zL.A03();
    public final int A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final ThreadViewColorScheme A05;
    public final 6tM A06;
    public final 6yJ A07;
    public final AYx A08;
    public final ThreadThemeInfo A09;
    public final C66e A0A;
    public final ImmutableMap A0B;
    public final C01i A0C;
    public final C01i A0D;
    public final C01i A0E;
    public final C01i A0F;
    public final C01i A0G;
    public final C01i A0H;
    public final C01i A0I;
    public final C01i A0J;
    public final C01i A0K;
    public final C01i A0L;
    public final C01i A0M;
    public final C01i A0N;
    public final C01i A0O;
    public final boolean A0P;

    public C9gf(Context context, FbUserSession fbUserSession, ThreadKey threadKey, ThreadViewColorScheme threadViewColorScheme, 6yJ r306, AYx aYx, ThreadThemeInfo threadThemeInfo, C66e c66e, ImmutableMap immutableMap, boolean z) {
        11T.A0F(threadViewColorScheme, 4);
        this.A01 = context;
        this.A04 = threadKey;
        this.A02 = fbUserSession;
        this.A05 = threadViewColorScheme;
        this.A07 = r306;
        this.A09 = threadThemeInfo;
        this.A0B = immutableMap;
        this.A0A = c66e;
        this.A08 = aYx;
        this.A0P = z;
        this.A03 = 1Bu.A00(66810);
        2qR r0 = 6tM.A01;
        MigColorScheme migColorScheme = threadViewColorScheme.A0F;
        11T.A0A(migColorScheme);
        this.A06 = new 6tM(migColorScheme);
        this.A00 = migColorScheme.B9T();
        this.A0O = AQr.A01(this, C03i.A03, 8);
        C03i c03i = C03i.A02;
        this.A0K = AQr.A01(this, c03i, 4);
        this.A0F = AQr.A01(this, c03i, 2);
        this.A0C = C01g.A00(c03i, AQl.A01(this, 49));
        this.A0L = AQr.A01(this, c03i, 5);
        this.A0N = AQr.A01(this, c03i, 7);
        this.A0D = AQr.A01(this, c03i, 0);
        this.A0I = C01g.A00(c03i, AMq.A00);
        this.A0E = AQr.A01(this, c03i, 1);
        this.A0M = AQr.A01(this, c03i, 6);
        this.A0G = C01g.A00(c03i, AMo.A00);
        this.A0J = AQr.A01(this, c03i, 3);
        this.A0H = C01g.A00(c03i, AMp.A00);
    }
}
