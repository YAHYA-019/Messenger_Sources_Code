package X;

import java.util.HashSet;

/* renamed from: X.6tn, reason: invalid class name */
/* loaded from: 6tn.class */
public final class C6tn {
    public final C00i A00 = new 1BQ(32915);

    public void A00(C47q c47q) {
        C00i c00i = this.A00;
        synchronized (c00i) {
            HashSet hashSet = ((C47p) c00i.get()).A00;
            synchronized (hashSet) {
                hashSet.add(c47q);
            }
        }
    }
}
