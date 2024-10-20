package X;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.251, reason: invalid class name */
/* loaded from: 251.class */
public final class AnonymousClass251 {
    public static final Class[] A09 = new Class[0];
    public 7Rm A00;
    public List A01;
    public boolean A02;
    public Class[] A03;
    public final AnonymousClass248 A04;
    public final 24S A05;
    public final AnonymousClass253 A06;
    public final C24q A07;
    public final C00963pY A08;

    public AnonymousClass251(24S r302, AnonymousClass253 anonymousClass253, C24q c24q, List list) {
        this.A05 = r302;
        AnonymousClass248 anonymousClass248 = null;
        this.A08 = null;
        this.A06 = anonymousClass253;
        this.A04 = anonymousClass253 != null ? anonymousClass253.A02() : anonymousClass248;
        this.A07 = c24q;
        this.A01 = list;
    }

    public AnonymousClass251(C00963pY c00963pY) {
        24S r0 = c00963pY.A0C;
        C24q c24q = c00963pY.A0F;
        this.A05 = r0;
        this.A08 = c00963pY;
        AnonymousClass253 anonymousClass253 = c00963pY.A0D;
        this.A06 = anonymousClass253;
        this.A04 = anonymousClass253.A02();
        this.A07 = c24q;
        AnonymousClass248 anonymousClass248 = c00963pY.A0B;
        7Rm A0J = anonymousClass248.A0J(c24q);
        this.A00 = A0J != null ? anonymousClass248.A0K(c24q, A0J) : A0J;
    }

    public static C3m9 A00(AnonymousClass251 anonymousClass251, Object obj) {
        C3m9 c3m9 = null;
        if (obj != null) {
            if (obj instanceof C3m9) {
                c3m9 = (C3m9) obj;
            } else {
                if (!(obj instanceof Class)) {
                    throw 0Pz.A07("AnnotationIntrospector returned Converter definition of type ", AnonymousClass001.A0Y(obj), "; expected type Converter or Class<Converter> instead");
                }
                Class cls = (Class) obj;
                if (cls != 3dD.class && !27C.A0J(cls)) {
                    if (C3m9.class.isAssignableFrom(cls)) {
                        return (C3m9) 1BK.A0q(anonymousClass251.A06, cls);
                    }
                    throw 0Pz.A07("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<Converter>");
                }
            }
        }
        return c3m9;
    }

    public static List A01(AnonymousClass251 anonymousClass251) {
        List list = anonymousClass251.A01;
        if (list == null) {
            C00963pY c00963pY = anonymousClass251.A08;
            if (!c00963pY.A0A) {
                C00963pY.A03(c00963pY);
            }
            list = new ArrayList(c00963pY.A02.values());
            anonymousClass251.A01 = list;
        }
        return list;
    }

    public C25s A02() {
        C25s A06;
        C25s c25s = null;
        AnonymousClass248 anonymousClass248 = this.A04;
        if (anonymousClass248 != null && (A06 = anonymousClass248.A06(this.A07)) != null) {
            c25s = A06;
        }
        C25s A00 = this.A06.A00(this.A07.A05);
        return A00 != null ? c25s == null ? A00 : c25s.A00(A00) : c25s;
    }

    public AbstractC00953pX A03() {
        C00963pY c00963pY = this.A08;
        if (c00963pY == null) {
            return null;
        }
        if (!c00963pY.A0A) {
            C00963pY.A03(c00963pY);
        }
        LinkedList linkedList = c00963pY.A09;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1) {
            return (AbstractC00953pX) linkedList.get(0);
        }
        C00963pY.A04(c00963pY, "Multiple 'as-value' properties defined (%s vs %s)", 1BL.A1b(linkedList));
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.68D, X.24r, X.3pW, java.lang.Object] */
    public List A04() {
        List<??> list = C24q.A00(this.A07).A02;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = null;
        for (?? r0 : list) {
            Method method = r0.A00;
            if (this.A05._class.isAssignableFrom(method.getReturnType())) {
                68P A05 = this.A04.A05(r0);
                if (A05 == null || A05 == 68P.A03) {
                    String name = method.getName();
                    if ("valueOf".equals(name)) {
                        if (r0.A0G() == 1) {
                        }
                    }
                    if ("fromString".equals(name)) {
                        if (r0.A0G() == 1) {
                            Class A0J = r0.A0J(0);
                            if (A0J != String.class && !CharSequence.class.isAssignableFrom(A0J)) {
                            }
                        }
                    }
                }
                if (arrayList == null) {
                    arrayList = AnonymousClass001.A0s();
                }
                arrayList.add(r0);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (r304 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Class[] A05() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A02
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L39
            r0 = 1
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A02 = r1
            r0 = r301
            X.248 r0 = r0.A04
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L3e
            r0 = 0
            r304 = r0
        L1b:
            r0 = r301
            X.253 r0 = r0.A06
            r303 = r0
            X.260 r0 = X.AnonymousClass260.A0F
            r305 = r0
            r0 = r303
            r1 = r305
            boolean r0 = r0.A09(r1)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L34
            java.lang.Class[] r0 = X.AnonymousClass251.A09
            r304 = r0
        L34:
            r0 = r301
            r1 = r304
            r0.A03 = r1
        L39:
            r0 = r301
            java.lang.Class[] r0 = r0.A03
            return r0
        L3e:
            r0 = r301
            X.24q r0 = r0.A07
            r305 = r0
            r0 = r303
            r1 = r305
            java.lang.Class[] r0 = r0.A0p(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L34
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass251.A05():java.lang.Class[]");
    }
}
