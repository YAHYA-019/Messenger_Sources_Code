package X;

/* loaded from: Lmf.class */
public final class Lmf implements Runnable {
    public static final String __redex_internal_original_name = "SystemForegroundDispatcher$1";
    public final /* synthetic */ LRn A00;
    public final /* synthetic */ String A01;

    public Lmf(LRn lRn, String str) {
        this.A00 = lRn;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        C4Kf c4Kf;
        LRn lRn = this.A00;
        C4Ji c4Ji = lRn.A00.A03;
        String str = this.A01;
        synchronized (c4Ji.A09) {
            C4Kp c4Kp = (C4Kp) c4Ji.A05.get(str);
            if (c4Kp == null) {
                c4Kp = (C4Kp) c4Ji.A04.get(str);
                if (c4Kp == null) {
                    c4Kf = null;
                }
            }
            c4Kf = c4Kp.A08;
        }
        if (c4Kf == null || !7zL.A1X(C4Ke.A08, c4Kf.A0B)) {
            return;
        }
        synchronized (lRn.A06) {
            lRn.A09.put(C4Kh.A00(c4Kf), c4Kf);
            lRn.A08.put(C4Kh.A00(c4Kf), KxE.A00(lRn, lRn.A04, c4Kf, ((C4Ih) lRn.A05).A03));
        }
    }
}
