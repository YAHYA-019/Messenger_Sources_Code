package X;

/* renamed from: X.4cu, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4cu.class */
public final class C05104cu {
    public final C05034cn A00 = new C05034cn();

    public void A00() {
        if (!this.A00.A0B()) {
            throw AnonymousClass001.A0N("Cannot cancel a completed task.");
        }
    }

    public void A01(Exception exc) {
        C05034cn c05034cn = this.A00;
        Object obj = c05034cn.A05;
        synchronized (obj) {
            if (c05034cn.A02) {
                throw AnonymousClass001.A0N("Cannot set the error on a completed task.");
            }
            c05034cn.A02 = true;
            c05034cn.A00 = exc;
            obj.notifyAll();
            C05034cn.A05(c05034cn);
        }
    }

    public void A02(Object obj) {
        if (!this.A00.A0C(obj)) {
            throw AnonymousClass001.A0N("Cannot set the result of a completed task.");
        }
    }
}
