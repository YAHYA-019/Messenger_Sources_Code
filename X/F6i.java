package X;

import android.content.Context;
import java.util.HashSet;

/* loaded from: F6i.class */
public final class F6i {
    public static final HashSet A0A;
    public static final HashSet A0B;
    public static final HashSet A0C;
    public final Context A00;
    public final Throwable A01;
    public final C01i A02;
    public final C01i A03;
    public final C01i A04;
    public final C01i A05;
    public final C01i A06;
    public final C01i A07;
    public final C01i A08;
    public final C01i A09;

    static {
        HashSet A0v = AnonymousClass001.A0v();
        AnonymousClass001.A1J(A0v, 5202);
        AnonymousClass001.A1J(A0v, 3088003);
        AnonymousClass001.A1J(A0v, 3088004);
        A0B = A0v;
        HashSet A0v2 = AnonymousClass001.A0v();
        AnonymousClass001.A1J(A0v2, 5204);
        AnonymousClass001.A1J(A0v2, 3088002);
        AnonymousClass001.A1J(A0v2, 3088006);
        A0A = A0v2;
        HashSet A0v3 = AnonymousClass001.A0v();
        A0v3.addAll(A0v);
        A0v3.addAll(A0v2);
        A0C = A0v3;
    }

    public F6i(Context context, Throwable th) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A01 = th;
        this.A02 = GAW.A00(this, 19);
        this.A09 = GAW.A00(this, 26);
        this.A08 = GAW.A00(this, 25);
        this.A04 = GAW.A00(this, 21);
        this.A03 = GAW.A00(this, 20);
        this.A06 = GAW.A00(this, 23);
        this.A07 = GAW.A00(this, 24);
        this.A05 = GAW.A00(this, 22);
    }
}
