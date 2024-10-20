package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: L8e.class */
public final class L8e {
    public final 24S A00;
    public final C7rl[] A01;
    public final 28P[] A02;
    public final String[] A03;
    public final java.util.Map A04;

    public L8e(24S r302, java.util.Map map, C7rl[] c7rlArr) {
        this.A00 = r302;
        this.A01 = c7rlArr;
        this.A04 = map;
        this.A03 = null;
        this.A02 = null;
    }

    public L8e(L8e l8e) {
        this.A00 = l8e.A00;
        C7rl[] c7rlArr = l8e.A01;
        this.A01 = c7rlArr;
        this.A04 = l8e.A04;
        int length = c7rlArr.length;
        this.A03 = new String[length];
        this.A02 = new 28P[length];
    }

    private final void A00(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj, String str, int i) {
        if (str == null) {
            throw 4DO.A00(c27t.A00, this.A00, "Internal error in external Type Id handling: `null` type id passed");
        }
        4rL A0y = this.A02[i].A0y(abstractC01033pi);
        if (A0y.A1K() == C42h.A09) {
            this.A01[i].A01.A0M(obj, (Object) null);
            return;
        }
        28P r0 = new 28P(abstractC01033pi, c27t);
        r0.A0a();
        r0.A0r(str);
        r0.A10(A0y);
        r0.A0X();
        4rL A0y2 = r0.A0y(abstractC01033pi);
        A0y2.A1K();
        this.A01[i].A01.A0L(obj, A0y2, c27t);
    }

    public void A01(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj, String str) {
        Object obj2 = this.A04.get(str);
        if (obj2 != null) {
            String A1Z = abstractC01033pi.A1Z();
            if (obj2 instanceof List) {
                Iterator A1G = GOn.A1G(obj2);
                while (A1G.hasNext()) {
                    int A0F = DKE.A0F(A1G);
                    if (str.equals(this.A01[A0F].A03)) {
                        if (obj != null) {
                            28P[] r0 = this.A02;
                            if (r0[A0F] != null) {
                                A00(abstractC01033pi, c27t, obj, A1Z, A0F);
                                r0[A0F] = null;
                            }
                        }
                        this.A03[A0F] = A1Z;
                    }
                }
                return;
            }
            int A03 = AnonymousClass001.A03(obj2);
            if (str.equals(this.A01[A03].A03)) {
                if (obj != null) {
                    28P[] r02 = this.A02;
                    if (r02[A03] != null) {
                        A00(abstractC01033pi, c27t, obj, A1Z, A03);
                        r02[A03] = null;
                        return;
                    }
                }
                this.A03[A03] = A1Z;
            }
        }
    }

    public void A02(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t) {
        C7rl c7rl;
        0Q8 c2cb;
        24S r322;
        String str;
        Object[] objArr;
        String str2;
        C7rl[] c7rlArr = this.A01;
        int length = c7rlArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            String str3 = this.A03[i2];
            c7rl = c7rlArr[i2];
            28P r0 = this.A02[i2];
            if (str3 != null) {
                if (r0 == null) {
                    68S r02 = c7rl.A01;
                    Boolean bool = ((68T) r02)._metadata._required;
                    if ((bool == null || !bool.booleanValue()) && !c27t.A0p(C26O.A09)) {
                        return;
                    }
                    Class<?> cls = obj.getClass();
                    String str4 = r02._propName._simpleName;
                    c2cb = new C2cb(c27t.A00, String.format(4YT.A00(696), str4, c7rl.A03));
                    ((4DO) c2cb)._targetType = cls;
                    if (str4 != null) {
                        c2cb.A08(cls, str4);
                        throw c2cb;
                    }
                }
                A00(abstractC01033pi, c27t, obj, str3, i2);
            } else if (r0 != null) {
                if (4rI.A04[((int) r0.A04.A00) & 15]._isScalar) {
                    4rL A0y = r0.A0y(abstractC01033pi);
                    A0y.A1K();
                    68S r03 = c7rl.A01;
                    Object A00 = C68e.A00(A0y, r03._type);
                    if (A00 != null) {
                        r03.A0M(obj, A00);
                    }
                }
                Jyp jyp = (Jyp) c7rl.A02;
                24S r04 = jyp._defaultImpl;
                if (r04 == null) {
                    r322 = this.A00;
                    str = c7rl.A01._propName._simpleName;
                    objArr = new Object[]{c7rl.A03};
                    str2 = "Missing external type id property '%s' (and no 'defaultImpl' specified)";
                    break;
                }
                C27F[] c27fArr = 27C.A01;
                Class cls2 = r04._class;
                if (cls2 == null) {
                    break;
                }
                str3 = jyp._idResolver.BOT(cls2, (Object) null);
                if (str3 == null) {
                    break;
                }
                A00(abstractC01033pi, c27t, obj, str3, i2);
            } else {
                continue;
            }
            i = i2 + 1;
        }
        r322 = this.A00;
        str = c7rl.A01._propName._simpleName;
        objArr = new Object[]{c7rl.A03};
        str2 = "Invalid default type id for property '%s': `null` returned by TypeIdResolver";
        c27t.A0c(r322, str, str2, objArr);
        c2cb = 0Q8.createAndThrow();
        throw c2cb;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03(X.AbstractC01033pi r302, X.C27T r303, java.lang.Object r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L8e.A03(X.3pi, X.27T, java.lang.Object, java.lang.String):boolean");
    }
}
