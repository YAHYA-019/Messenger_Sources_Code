package X;

/* loaded from: D5g.class */
public final class D5g implements Runnable {
    public static final String __redex_internal_original_name = "AllContactsFragment$contactsListScrollRunnable$1";
    public final /* synthetic */ B4e A00;

    public D5g(B4e b4e) {
        this.A00 = b4e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Number A0o;
        B4e b4e = this.A00;
        java.util.Map map = b4e.A0O;
        if (map == null || !map.containsKey(b4e.A0J)) {
            return;
        }
        B2Y b2y = b4e.A0a;
        b2y.A02 = -1;
        java.util.Map map2 = b4e.A0O;
        if (map2 == null || (A0o = 1BK.A0o(b4e.A0J, map2)) == null) {
            return;
        }
        int intValue = A0o.intValue() + 1;
        C2kx.A01(null, b2y, intValue, intValue, false);
    }
}
