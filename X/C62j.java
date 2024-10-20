package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.62j, reason: invalid class name */
/* loaded from: 62j.class */
public final class C62j extends C1pl {
    public long A00;
    public boolean A01;
    public final C04w A02;
    public final C62l A03;
    public final ArrayList A04;
    public final ArrayList A05;

    public C62j() {
        this((C62l) 1Bi.A03(131273));
    }

    public C62j(C62l c62l) {
        this.A02 = new C04w();
        this.A04 = new ArrayList();
        this.A05 = new ArrayList();
        this.A01 = false;
        this.A00 = -1;
        this.A03 = c62l;
    }

    private void A00(double d, boolean z) {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            C66i c66i = (C66i) it.next();
            if (z == c66i.A0C()) {
                c66i.A05(d / 1.0E9d);
            }
        }
    }

    public static void A01(C62j c62j) {
        boolean z;
        boolean isEmpty = c62j.A02.isEmpty();
        if (isEmpty && c62j.A01) {
            c62j.A03.CeK(c62j);
            c62j.A00 = -1;
            z = false;
        } else {
            if (isEmpty || c62j.A01) {
                return;
            }
            c62j.A03.CXz(c62j);
            z = true;
        }
        c62j.A01 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r301.A05.isEmpty() == false) goto L20;
     */
    @Override // X.C1pl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(long r302) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62j.A03(long):void");
    }

    public void A04(C66i c66i) {
        synchronized (this) {
            if (c66i.A0B != this) {
                throw AnonymousClass002.A0C(c66i, "Invalid Spring ", AnonymousClass001.A0k());
            }
            this.A02.add(c66i);
            A01(this);
        }
    }
}
