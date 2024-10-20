package X;

import java.util.ArrayList;

/* renamed from: X.66i, reason: invalid class name */
/* loaded from: 66i.class */
public final class C66i {
    public double A01;
    public double A03;
    public C66h A05;
    public boolean A06;
    public final C62j A0B;
    public final C66j A09 = new Object();
    public final C66j A0A = new Object();
    public final C66j A0C = new Object();
    public boolean A07 = true;
    public double A02 = 1.0E-4d;
    public double A00 = 1.0E-4d;
    public C66k A04 = new Object();
    public double A08 = 0.0d;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.66j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.66k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.66j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.66j, java.lang.Object] */
    public C66i(C62j c62j) {
        this.A0B = c62j;
    }

    private void A00(double d) {
        if (d > 0.064d) {
            d = 0.064d;
        }
        this.A08 += d;
    }

    public void A01() {
        this.A04.A01();
        C62j c62j = this.A0B;
        synchronized (c62j) {
            c62j.A02.remove(this);
            C62j.A01(c62j);
        }
    }

    public void A02() {
        C66j c66j = this.A09;
        double d = c66j.A00;
        this.A01 = d;
        this.A0C.A00 = d;
        c66j.A01 = 0.0d;
    }

    public final void A03() {
        A06(1.0d);
    }

    public final void A04() {
        A07(1.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x028b, code lost:
    
        if (r315 > r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02a3, code lost:
    
        if (r315 < r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x033b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(double r302) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66i.A05(double):void");
    }

    public void A06(double d) {
        this.A03 = d;
        this.A09.A00 = d;
        1Du it = this.A04.A00().iterator();
        while (it.hasNext()) {
            ((C66n) it.next()).CMV(this);
        }
    }

    public void A07(double d) {
        if (this.A01 == d && A0C()) {
            return;
        }
        this.A03 = this.A09.A00;
        this.A01 = d;
        this.A0B.A04(this);
        1Du it = this.A04.A00().iterator();
        while (it.hasNext()) {
            ((C66n) it.next()).CMS(this);
        }
    }

    public void A08(double d) {
        this.A09.A01 = d;
        if (d != 0.0d) {
            this.A0B.A04(this);
        }
    }

    public void A09(C66h c66h) {
        c66h.getClass();
        this.A05 = c66h;
    }

    public void A0A(C66n c66n) {
        c66n.getClass();
        C66k c66k = this.A04;
        synchronized (c66k) {
            if (c66n instanceof ArrayList) {
                throw new IllegalArgumentException();
            }
            Object obj = c66k.A01;
            if (obj == null) {
                c66k.A01 = c66n;
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                if (!arrayList.contains(c66n)) {
                    arrayList.add(c66n);
                }
            } else if (obj != c66n) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(obj);
                arrayList2.add(c66n);
                c66k.A01 = arrayList2;
            }
            c66k.A00 = null;
        }
    }

    public void A0B(C66n c66n) {
        c66n.getClass();
        C66k c66k = this.A04;
        synchronized (c66k) {
            Object obj = c66k.A01;
            if (obj != null) {
                if (obj == c66n) {
                    c66k.A01 = null;
                    c66k.A00 = null;
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    int indexOf = arrayList.indexOf(c66n);
                    if (indexOf != -1) {
                        arrayList.remove(indexOf);
                        c66k.A00 = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0048, code lost:
    
        if (java.lang.Math.abs(r301.A01 - r0.A00) > r301.A00) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0C() {
        /*
            r301 = this;
            r0 = r301
            X.66j r0 = r0.A09
            r302 = r0
            r0 = r302
            double r0 = r0.A01
            r303 = r0
            r0 = r303
            double r0 = java.lang.Math.abs(r0)
            r305 = r0
            r0 = r301
            double r0 = r0.A02
            r307 = r0
            r0 = r305
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = r309
            if (r0 > 0) goto L4b
            r0 = r301
            double r0 = r0.A01
            r310 = r0
            r0 = r302
            double r0 = r0.A00
            r303 = r0
            r0 = r310
            r1 = r303
            double r0 = r0 - r1
            double r0 = java.lang.Math.abs(r0)
            r312 = r0
            r0 = r301
            double r0 = r0.A00
            r310 = r0
            r0 = r312
            r1 = r310
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r314 = r0
            r0 = 1
            r309 = r0
            r0 = r314
            if (r0 <= 0) goto L4e
        L4b:
            r0 = 0
            r309 = r0
        L4e:
            r0 = r309
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66i.A0C():boolean");
    }
}
