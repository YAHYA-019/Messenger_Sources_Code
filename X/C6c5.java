package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6c5, reason: invalid class name */
/* loaded from: 6c5.class */
public final class C6c5 {
    public static int A08;
    public double A00;
    public 5Rk A02;
    public final C6c6 A04 = new Object();
    public final C6c6 A05 = new Object();
    public final C6c6 A06 = new Object();
    public boolean A03 = true;
    public double A01 = 0.0d;
    public final CopyOnWriteArraySet A07 = new CopyOnWriteArraySet();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.6c6] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.6c6] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.6c6] */
    public C6c5() {
        A08++;
        this.A02 = 5Rk.A02;
    }

    public void A00(double d) {
        if (this.A00 == d && A01()) {
            return;
        }
        this.A00 = d;
        Iterator it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("onSpringEndStateChange");
        }
    }

    public boolean A01() {
        C6c6 c6c6 = this.A04;
        if (Math.abs(c6c6.A01) <= 0.005d) {
            return Math.abs(this.A00 - c6c6.A00) <= 0.005d || this.A02.A01 == 0.0d;
        }
        return false;
    }
}
