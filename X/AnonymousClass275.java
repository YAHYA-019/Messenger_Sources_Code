package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.275, reason: invalid class name */
/* loaded from: 275.class */
public final class AnonymousClass275 extends AnonymousClass277 implements Serializable {
    public static final long serialVersionUID = 1;
    public static final Class[] A01 = {Throwable.class};
    public static final AnonymousClass275 A00 = new AnonymousClass277(new C27I());

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        if (r312 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.68S A00(X.C27T r301, X.24S r302, X.AnonymousClass275 r303, X.AnonymousClass251 r304, X.AnonymousClass687 r305) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass275.A00(X.27T, X.24S, X.275, X.251, X.687):X.68S");
    }

    public static void A01(C27T c27t, 68X r302, AnonymousClass275 anonymousClass275, AnonymousClass251 anonymousClass251) {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (AnonymousClass687 anonymousClass687 : AnonymousClass251.A01(anonymousClass251)) {
            AnonymousClass688 A0A = anonymousClass687.A0A();
            if (A0A != null && A0A.A00 == 0S2.A01) {
                String str = A0A.A01;
                if (arrayList == null) {
                    arrayList = AnonymousClass001.A0s();
                    hashSet = AnonymousClass001.A0v();
                    hashSet.add(str);
                } else if (!hashSet.add(str)) {
                    C27F[] c27fArr = 27C.A01;
                    throw 0Pz.A05("Multiple back-reference properties with name ", str == null ? "[null]" : 27C.A08(str));
                }
                arrayList.add(anonymousClass687);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass687 anonymousClass6872 = (AnonymousClass687) it.next();
                AnonymousClass688 A0A2 = anonymousClass6872.A0A();
                String str2 = A0A2 == null ? null : A0A2.A01;
                68S A002 = A00(c27t, anonymousClass6872.A0B(), anonymousClass275, anonymousClass251, anonymousClass6872);
                if (r302.A05 == null) {
                    r302.A05 = new HashMap(4);
                }
                C26L c26l = r302.A0A;
                if (c26l.A07()) {
                    try {
                        A002.A0K(c26l);
                    } catch (IllegalArgumentException e) {
                        68X.A01(r302, e);
                        throw 0Q8.createAndThrow();
                    }
                }
                r302.A05.put(str2, A002);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0729, code lost:
    
        if (X.C68c.A01(r0.A0M(), r302.A06, r302.A07) != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0750, code lost:
    
        r0 = r0.A0H();
        r0 = r303.A0H(r301, r0.A03(), r0);
        r320 = new X.Jy3(r0, r0, r0, (X.C68e) r0._typeHandler, r0.A04);
        r312 = X.AnonymousClass277.A05(r301, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x07a4, code lost:
    
        if (r312 != null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x07a7, code lost:
    
        r312 = (com.fasterxml.jackson.databind.JsonDeserializer) r0._valueHandler;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x07b3, code lost:
    
        if (r312 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x07b6, code lost:
    
        r320 = r320.A04(r301.A0H(r320, r0, r312));
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x074d, code lost:
    
        if (r0.A0C().A00 != null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02e0, code lost:
    
        if (r321 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03c1, code lost:
    
        if (r312 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x028b, code lost:
    
        if (r306 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02d1, code lost:
    
        if (r321 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02e3, code lost:
    
        r321 = r301.A0H(r322, r317, r321);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02f0, code lost:
    
        r0 = new X.7Rr(r322, r317, r321, r306, r319, (X.C68e) r317._typeHandler);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0328, code lost:
    
        if (r302.A01 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0331, code lost:
    
        throw X.AnonymousClass001.A0N("_anySetter already set to non-null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x03f6, code lost:
    
        r302.A01 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x042a, code lost:
    
        if (r0.A09(X.AnonymousClass260.A0A) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0538, code lost:
    
        if (r322 == null) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0689 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020d  */
    /* JADX WARN: Type inference failed for: r0v118, types: [X.68D, X.24r, X.3pX] */
    /* JADX WARN: Type inference failed for: r0v139, types: [X.68S] */
    /* JADX WARN: Type inference failed for: r0v233, types: [X.68S] */
    /* JADX WARN: Type inference failed for: r301v0, types: [X.27T, X.26d] */
    /* JADX WARN: Type inference failed for: r303v0, types: [X.277, X.275] */
    /* JADX WARN: Type inference failed for: r319v8, types: [X.68D, X.3pW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(X.C27T r301, X.68X r302, X.AnonymousClass275 r303, X.AnonymousClass251 r304) {
        /*
            Method dump skipped, instructions count: 2197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass275.A02(X.27T, X.68X, X.275, X.251):void");
    }

    public static void A03(C27T c27t, 68X r302, AnonymousClass251 anonymousClass251) {
        24S r310;
        68S r309;
        3eQ A06;
        7Rm r0 = anonymousClass251.A00;
        if (r0 != null) {
            Class cls = r0.A01;
            MCW A07 = c27t.A07(r0);
            if (cls == JxY.class) {
                C26G c26g = r0.A00;
                r309 = (68S) r302.A0D.get(c26g._simpleName);
                if (r309 == null) {
                    throw 1BK.A0f("Invalid Object Id definition for %s: cannot find property with name %s", new Object[]{27C.A04(anonymousClass251.A05), 27C.A08(c26g._simpleName)});
                }
                r310 = r309._type;
                A06 = new JxZ(r0.A03);
            } else {
                r310 = 24R.A05(c27t.A0F(cls), 3eQ.class)[0];
                r309 = null;
                A06 = c27t.A06(r0);
            }
            r302.A03 = new C7Rt(A06, A07, r310, c27t.A0J(r310), r0.A00, r309);
        }
    }

    public static void A04(68X r301, AnonymousClass251 anonymousClass251) {
        java.util.Map emptyMap;
        C00963pY c00963pY = anonymousClass251.A08;
        if (c00963pY != null) {
            if (!c00963pY.A0A) {
                C00963pY.A03(c00963pY);
            }
            emptyMap = c00963pY.A01;
        } else {
            emptyMap = Collections.emptyMap();
        }
        if (emptyMap != null) {
            Iterator A0y = AnonymousClass001.A0y(emptyMap);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                AbstractC00953pX abstractC00953pX = (AbstractC00953pX) A0z.getValue();
                C26G A002 = C26G.A00(abstractC00953pX.A05());
                24S A03 = abstractC00953pX.A03();
                Object key = A0z.getKey();
                if (r301.A08 == null) {
                    r301.A08 = AnonymousClass001.A0s();
                }
                C26L c26l = r301.A0A;
                if (c26l.A07()) {
                    try {
                        abstractC00953pX.A0E(c26l.A09(AnonymousClass260.A0K));
                    } catch (IllegalArgumentException e) {
                        68X.A01(r301, e);
                        throw 0Q8.createAndThrow();
                    }
                }
                r301.A08.add(new 7Rs(A03, A002, abstractC00953pX, key));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.277, X.275] */
    @Override // X.AnonymousClass277
    public AnonymousClass275 A0I(C27I c27i) {
        if (this._factoryConfig == c27i) {
            return this;
        }
        27C.A0F(AnonymousClass275.class, this, "withConfig");
        return new AnonymousClass277(c27i);
    }
}
