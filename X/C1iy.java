package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1iy, reason: invalid class name */
/* loaded from: 1iy.class */
public final class C1iy {
    public Long A00;
    public Runnable A01;
    public String A02;
    public boolean A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0C;
    public final C00i A0D;
    public final C00i A0K;
    public final C00i A0L;
    public final Set A0M;
    public final Context A0N;
    public final C00i A0F = new 1BQ(16971);
    public final C00i A0H = new 1BQ(16972);
    public final C00i A0G = new 1BQ(32849);
    public final C00i A0E = new 1BQ(16961);
    public final C00i A0I = new 1BQ(16973);
    public final C00i A07 = new 1BQ(99390);
    public final C00i A0J = new 1BV(16459);

    public C1iy() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A0N = context;
        this.A0K = new 1HH(context, 100179);
        this.A09 = new 1BQ(17096);
        this.A0B = new 1BQ(16849);
        this.A06 = new 1BQ(16616);
        this.A08 = new 1BQ(17093);
        this.A0A = new 1BQ(66401);
        this.A05 = new 1BQ(49250);
        this.A0L = new 1BQ(16639);
        this.A0C = new 1BQ(16634);
        this.A0D = new 1BQ(16385);
        this.A0M = new HashSet();
        this.A04 = new 1BQ(16642);
        this.A03 = true;
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
    }

    public static String A00(C1iy c1iy, FbUserSession fbUserSession) {
        String A06;
        synchronized (c1iy) {
            A06 = ((2Kq) 1Lo.A06(fbUserSession, 65959)).A06();
        }
        return A06;
    }
}
