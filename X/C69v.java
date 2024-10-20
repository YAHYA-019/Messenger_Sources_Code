package X;

import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.concurrent.Executor;

/* renamed from: X.69v, reason: invalid class name */
/* loaded from: 69v.class */
public abstract class C69v implements C69w, 5C5 {
    public static final java.util.Map A0J = C05004ck.A00("component_tag", "drawee");
    public static final java.util.Map A0K = C05004ck.A01("origin", "memory_bitmap", "origin_sub", "shortcut");
    public Drawable A00;
    public 4gJ A01;
    public C69f A02;
    public C7s5 A03;
    public Object A05;
    public String A06;
    public boolean A09;
    public 1OW A0A;
    public Object A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public Drawable A0F;
    public final 5C6 A0G;
    public final Executor A0I;
    public final 69Y A0H = new 69Y();
    public C06714hp A04 = new C06714hp();
    public boolean A07 = true;
    public boolean A08 = false;

    public C69v(5C6 r302, Executor executor) {
        this.A0G = r302;
        this.A0I = executor;
        A07(this, null, null);
    }

    private 5CI A02(Uri uri, java.util.Map map, java.util.Map map2) {
        PointF pointF;
        C69f c69f = this.A02;
        String str = null;
        if (c69f != null) {
            str = String.valueOf(!(C69f.A00(c69f, 2) instanceof 5CE) ? null : C69f.A01(c69f, 2).A05);
            pointF = !(C69f.A00(c69f, 2) instanceof 5CE) ? null : C69f.A01(c69f, 2).A04;
        } else {
            pointF = null;
        }
        java.util.Map map3 = A0J;
        java.util.Map map4 = A0K;
        C69f c69f2 = this.A02;
        return 5CH.A00(pointF, c69f2 == null ? null : c69f2.A05.getBounds(), uri, this.A05, str, map3, map4, map, (java.util.Map) null, map2, this.A08);
    }

    private void A03() {
        java.util.Map map;
        boolean z = this.A0E;
        this.A0E = false;
        this.A0C = false;
        1OV r0 = this.A0A;
        java.util.Map map2 = null;
        if (r0 != null) {
            map = r0.A04;
            r0.AGD();
            this.A0A = null;
        } else {
            map = null;
        }
        6CQ r02 = this.A0F;
        if (r02 != null && (r02 instanceof 6CQ)) {
            r02.AOo();
        }
        this.A0F = null;
        Object obj = this.A0B;
        if (obj != null) {
            2EU r03 = (2EU) obj;
            C0By.A04(2EU.A06(r03));
            java.util.Map AlR = ((2Ea) r03.A09()).Aq4().AlR();
            A08(this.A0B);
            2EU.A04((2EU) this.A0B);
            this.A0B = null;
            map2 = AlR;
        }
        if (z) {
            4gJ r305 = this.A01;
            if (r305 == null) {
                r305 = 4gM.A00;
            }
            r305.CG6(this.A06);
            this.A04.CG8(A02(null, map, map2), this.A06);
        }
    }

    /* JADX WARN: Finally extract failed */
    public static void A04(1OW r301, C69v c69v, Object obj, String str, float f, boolean z, boolean z2, boolean z3) {
        2EU r311;
        Drawable A0H;
        C69f c69f;
        try {
            if (2D9.A00().BWo()) {
                2D9.A02("AbstractDraweeController#onNewResultInternal");
            }
            if (A09(r301, c69v, str)) {
                c69v.A0H.A00(z ? C69l.ON_DATASOURCE_RESULT : C69l.ON_DATASOURCE_RESULT_INT);
                try {
                    C69u c69u = (C69u) c69v;
                    if (c69u instanceof C69t) {
                        r311 = (2EU) obj;
                        A0H = ((C69t) c69u).A0H(r311);
                    } else {
                        r311 = (2EU) obj;
                        A0H = c69u.A0H(r311);
                    }
                    Object obj2 = c69v.A0B;
                    Drawable drawable = c69v.A0F;
                    c69v.A0B = obj;
                    c69v.A0F = A0H;
                    try {
                        if (z) {
                            c69v.A08(obj);
                            c69v.A0A = null;
                            c69f = c69v.A02;
                            if (c69f == null) {
                                StringBuilder A0k = AnonymousClass001.A0k();
                                A0k.append("mSettableDraweeHierarchy is null; Caller context: ");
                                throw AnonymousClass002.A0E(c69v.A05, A0k);
                            }
                        } else if (z3) {
                            c69v.A08(obj);
                            c69f = c69v.A02;
                            if (c69f == null) {
                                StringBuilder A0k2 = AnonymousClass001.A0k();
                                A0k2.append("mSettableDraweeHierarchy is null; Caller context: ");
                                throw AnonymousClass002.A0E(c69v.A05, A0k2);
                            }
                        } else {
                            c69v.A08(obj);
                            C69f c69f2 = c69v.A02;
                            if (c69f2 == null) {
                                StringBuilder A0k3 = AnonymousClass001.A0k();
                                A0k3.append("mSettableDraweeHierarchy is null; Caller context: ");
                                throw AnonymousClass002.A0E(c69v.A05, A0k3);
                            }
                            c69f2.A07(A0H, f, z2);
                            C0By.A04(2EU.A06(r311));
                            2Ec Aq4 = ((2Ea) r311.A09()).Aq4();
                            4gJ r309 = c69v.A01;
                            if (r309 == null) {
                                r309 = 4gM.A00;
                            }
                            r309.C2E(str, Aq4);
                            c69v.A04.C2E(str, Aq4);
                            if (drawable != null && drawable != A0H && (drawable instanceof 6CQ)) {
                                ((6CQ) drawable).AOo();
                            }
                            if (obj2 != null && obj2 != obj) {
                                c69v.A08(obj2);
                                2EU.A04((2EU) obj2);
                            }
                        }
                        c69f.A07(A0H, 1.0f, z2);
                        C0By.A04(2EU.A06(r311));
                        2Ec Aq42 = ((2Ea) r311.A09()).Aq4();
                        4gJ r3112 = c69v.A01;
                        if (r3112 == null) {
                            r3112 = 4gM.A00;
                        }
                        r3112.Byc(c69v.AWq(), Aq42, str);
                        c69v.A04.Byd(c69v.A02(null, r301 == null ? null : ((1OV) r301).A04, Aq42.AlR()), Aq42, str);
                        if (drawable != null) {
                            ((6CQ) drawable).AOo();
                        }
                        if (obj2 != null) {
                            c69v.A08(obj2);
                            2EU.A04((2EU) obj2);
                        }
                    } catch (Throwable th) {
                        if (drawable != null && drawable != A0H && (drawable instanceof 6CQ)) {
                            ((6CQ) drawable).AOo();
                        }
                        if (obj2 != null && obj2 != obj) {
                            c69v.A08(obj2);
                            2EU.A04((2EU) obj2);
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    c69v.A08(obj);
                    2EU.A04((2EU) obj);
                    A05(r301, c69v, str, e, z);
                }
            } else {
                c69v.A08(obj);
                2EU.A04((2EU) obj);
                r301.AGD();
            }
            if (2D9.A00().BWo()) {
                2D9.A01();
            }
        } catch (Throwable th2) {
            4YV.A14();
            throw th2;
        }
    }

    public static void A05(1OW r301, C69v c69v, String str, Throwable th, boolean z) {
        Drawable drawable;
        if (2D9.A00().BWo()) {
            2D9.A02("AbstractDraweeController#onFailureInternal");
        }
        if (A09(r301, c69v, str)) {
            c69v.A0H.A00(z ? C69l.ON_DATASOURCE_FAILURE : C69l.ON_DATASOURCE_FAILURE_INT);
            if (z) {
                c69v.A0A = null;
                c69v.A0C = true;
                C69f c69f = c69v.A02;
                if (c69f != null) {
                    if (!c69v.A09 || (drawable = c69v.A0F) == null) {
                        5C0 r0 = c69f.A03;
                        r0.A02++;
                        C69f.A03(c69f);
                        int i = 5;
                        if (r0.A01(5) == null) {
                            i = 1;
                        }
                        C69f.A06(c69f, i);
                        r0.A03();
                    } else {
                        c69f.A07(drawable, 1.0f, true);
                    }
                }
                5CI A02 = c69v.A02(null, r301 == null ? null : ((1OV) r301).A04, null);
                4gJ r308 = c69v.A01;
                if (r308 == null) {
                    r308 = 4gM.A00;
                }
                r308.Bxg(c69v.A06, th);
                c69v.A04.Bxq(A02, c69v.A06, th);
            } else {
                4gJ r3082 = c69v.A01;
                if (r3082 == null) {
                    r3082 = 4gM.A00;
                }
                r3082.C2D(c69v.A06, th);
                c69v.A04.C2C(c69v.A06);
            }
        } else {
            r301.AGD();
        }
        if (2D9.A00().BWo()) {
            2D9.A01();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00da, code lost:
    
        if (r304 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006e, code lost:
    
        if (r304 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A06(X.1OW r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69v.A06(X.1OW, java.lang.Object):void");
    }

    /* JADX WARN: Type inference failed for: r0v48, types: [X.69h, android.graphics.drawable.Drawable] */
    public static void A07(C69v c69v, Object obj, String str) {
        synchronized (c69v) {
            if (2D9.A00().BWo()) {
                2D9.A02("AbstractDraweeController#init");
            }
            c69v.A0H.A00(C69l.ON_INIT_CONTROLLER);
            if (!c69v.A07) {
                5C6 r0 = c69v.A0G;
                if (r0 != null) {
                    r0.A01(c69v);
                }
            }
            c69v.A0D = false;
            c69v.A03();
            c69v.A09 = false;
            C7s5 c7s5 = c69v.A03;
            if (c7s5 != null) {
                c7s5.A03 = null;
                c7s5.A04 = false;
                c7s5.A05 = false;
                c7s5.A03 = c69v;
            }
            C69x c69x = c69v.A01;
            if (c69x instanceof C69x) {
                C69x c69x2 = c69x;
                synchronized (c69x2) {
                    ((4gI) c69x2).A00.clear();
                }
            } else {
                c69v.A01 = null;
            }
            C69f c69f = c69v.A02;
            if (c69f != null) {
                c69f.A04.A03(c69f.A02);
                C69f.A04(c69f);
                ?? r02 = c69v.A02.A05;
                r02.A00 = null;
                r02.invalidateSelf();
                c69v.A02 = null;
            }
            c69v.A00 = null;
            c69v.A06 = str;
            c69v.A05 = obj;
            if (2D9.A00().BWo()) {
                2D9.A01();
            }
        }
    }

    private void A08(Object obj) {
        2EU r0;
        if (C0d7.A00.BTv(2) && (r0 = (2EU) obj) != null && r0.A0A()) {
            synchronized (r0.A02) {
            }
        }
    }

    public static boolean A09(1OW r301, C69v c69v, String str) {
        if (r301 == null && c69v.A0A == null) {
            return true;
        }
        return str.equals(c69v.A06) && r301 == c69v.A0A && c69v.A0E;
    }

    public abstract 1OW A0A();

    public Object A0B() {
        return this.A05;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0C() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69v.A0C():void");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.69h, android.graphics.drawable.Drawable] */
    public void A0D(Drawable drawable) {
        this.A00 = drawable;
        C69f c69f = this.A02;
        if (c69f != null) {
            ?? r0 = c69f.A05;
            r0.A00 = drawable;
            r0.invalidateSelf();
        }
    }

    public void A0E(4gJ r302) {
        r302.getClass();
        4gI r0 = this.A01;
        if (r0 instanceof C69x) {
            r0.A01(r302);
            return;
        }
        if (r0 != null) {
            if (2D9.A00().BWo()) {
                2D9.A02("AbstractDraweeController#createInternal");
            }
            4gJ r02 = new 4gI();
            r02.A01(r0);
            r02.A01(r302);
            if (2D9.A00().BWo()) {
                2D9.A01();
            }
            r302 = r02;
        }
        this.A01 = r302;
    }

    public boolean A0F() {
        return false;
    }

    public boolean A0G() {
        return false;
    }

    @Override // X.C69w
    public Animatable AWq() {
        Object obj = this.A0F;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    @Override // X.C69w
    public void BjV() {
        if (2D9.A00().BWo()) {
            2D9.A02("AbstractDraweeController#onAttach");
        }
        this.A0H.A00(C69l.ON_ATTACH_CONTROLLER);
        this.A02.getClass();
        this.A0G.A01(this);
        this.A0D = true;
        if (!this.A0E) {
            A0C();
        }
        if (2D9.A00().BWo()) {
            2D9.A01();
        }
    }

    @Override // X.C69w
    public void BtM() {
        if (2D9.A00().BWo()) {
            2D9.A02("AbstractDraweeController#onDetach");
        }
        this.A0H.A00(C69l.ON_DETACH_CONTROLLER);
        this.A0D = false;
        this.A0G.A02(this);
        if (2D9.A00().BWo()) {
            2D9.A01();
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.69h, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.69h, android.graphics.drawable.Drawable] */
    @Override // X.C69w
    public void CpU(C69f c69f) {
        this.A0H.A00(c69f != null ? C69l.ON_SET_HIERARCHY : C69l.ON_CLEAR_HIERARCHY);
        if (this.A0E) {
            this.A0G.A01(this);
            release();
        }
        C69f c69f2 = this.A02;
        if (c69f2 != null) {
            ?? r0 = c69f2.A05;
            r0.A00 = null;
            r0.invalidateSelf();
            this.A02 = null;
        }
        if (c69f != null) {
            C0By.A02(Boolean.valueOf(c69f instanceof C69f));
            this.A02 = c69f;
            Drawable drawable = this.A00;
            ?? r02 = c69f.A05;
            r02.A00 = drawable;
            r02.invalidateSelf();
        }
    }

    public void release() {
        this.A0H.A00(C69l.ON_RELEASE_CONTROLLER);
        C7s5 c7s5 = this.A03;
        if (c7s5 != null) {
            c7s5.A04 = false;
            c7s5.A05 = false;
        }
        C69f c69f = this.A02;
        if (c69f != null) {
            c69f.A04.A03(c69f.A02);
            C69f.A04(c69f);
        }
        A03();
    }

    public String toString() {
        C46q A00 = C2qv.A00(this);
        A00.A02("isAttached", this.A0D);
        A00.A02("isRequestSubmitted", this.A0E);
        A00.A02("hasFetchFailed", this.A0C);
        2EU r0 = (2EU) this.A0B;
        A00.A01("fetchedImage", (r0 == null || !r0.A0A()) ? 0 : System.identityHashCode(r0.A02.A00()));
        C46q.A00(A00, this.A0H.toString(), "events");
        return A00.toString();
    }
}
