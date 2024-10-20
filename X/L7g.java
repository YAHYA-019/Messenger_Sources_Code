package X;

import com.google.common.collect.ImmutableList;

/* loaded from: L7g.class */
public final class L7g {
    public final int A00;
    public final ImmutableList A01;
    public final String A02;
    public final Throwable A03;

    public L7g(ImmutableList immutableList, String str, Throwable th, int i) {
        this.A00 = i;
        this.A03 = th;
        this.A02 = str;
        this.A01 = immutableList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, X.Lxy] */
    public static Throwable A00(L7g l7g) {
        ?? th = new Throwable((String) null);
        th.mIpcException = l7g;
        Throwable th2 = l7g.A03;
        if (th2 != null) {
            A01(th2, th);
            return th2;
        }
        String str = l7g.A02;
        if (str != null) {
            Lxz lxz = new Lxz(l7g, str);
            A01(lxz, th);
            return lxz;
        }
        Lxz lxz2 = new Lxz(l7g, 0Pz.A0T("Remote error code ", l7g.A00));
        A01(lxz2, th);
        return lxz2;
    }

    public static void A01(Throwable th, Throwable th2) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        if (th.getClass() != th2.getClass()) {
            try {
                th.initCause(th2);
            } catch (IllegalStateException e) {
                7kF.A00(e, th2);
            }
        }
    }
}
