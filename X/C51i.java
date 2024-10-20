package X;

import java.util.List;

/* renamed from: X.51i, reason: invalid class name */
/* loaded from: 51i.class */
public final class C51i implements Runnable {
    public static final String __redex_internal_original_name = "GooglePlayDownloader$5";
    public final /* synthetic */ C2uw A00;

    public C51i(C2uw c2uw) {
        this.A00 = c2uw;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2uw c2uw = this.A00;
        c2uw.A0G.BAF().A09(new C51o() { // from class: X.51q
            @Override // X.C51o
            public void Bpv(C4Ez c4Ez) {
                if (c4Ez.A0E()) {
                    List list = (List) c4Ez.A05();
                    C2uw c2uw2 = C51i.this.A00;
                    for (int i = 0; i < list.size(); i++) {
                        C2uw.A03(c2uw2, (3NT) list.get(i), false);
                    }
                }
                C2uw c2uw3 = C51i.this.A00;
                synchronized (c2uw3) {
                    c2uw3.A09 = true;
                    c2uw3.A04 = false;
                    c2uw3.A07 = false;
                }
                C2uw.A02(c2uw3);
            }
        }, c2uw.A0K);
    }
}
