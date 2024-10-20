package X;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.67f, reason: invalid class name */
/* loaded from: 67f.class */
public final class C67f {
    public static final C24w A08 = C24u.A01;
    public final AnonymousClass248 A00;
    public final 24S A01;
    public final AnonymousClass253 A02;
    public final C24z A03;
    public final 24W A04;
    public final Class A05;
    public final Class A06;
    public final boolean A07;

    public C67f(24S r302, AnonymousClass253 anonymousClass253, C24z c24z) {
        this.A02 = anonymousClass253;
        this.A01 = r302;
        Class cls = r302._class;
        this.A05 = cls;
        this.A03 = c24z;
        this.A04 = r302.A0I();
        Class cls2 = null;
        AnonymousClass248 A02 = anonymousClass253.A08() ? anonymousClass253.A02() : null;
        this.A00 = A02;
        this.A06 = c24z != null ? c24z.ASt(cls) : cls2;
        this.A07 = (A02 == null || (27C.A0K(cls) && r302.A0Q())) ? false : true;
    }

    public C67f(AnonymousClass253 anonymousClass253, C24z c24z, Class cls) {
        this.A02 = anonymousClass253;
        AnonymousClass248 anonymousClass248 = null;
        this.A01 = null;
        this.A05 = cls;
        this.A03 = c24z;
        this.A04 = 24W.A00;
        this.A00 = anonymousClass253.A08() ? anonymousClass253.A02() : anonymousClass248;
        this.A06 = c24z.ASt(cls);
        this.A07 = AnonymousClass001.A1T(this.A00);
    }

    public static C24q A00(24S r301, AnonymousClass253 anonymousClass253, C24z c24z) {
        if (r301.A0O()) {
            Class cls = r301._class;
            if (anonymousClass253 == null || anonymousClass253.ASt(cls) == null) {
                return new C24q(r301._class);
            }
        }
        C67f c67f = new C67f(r301, anonymousClass253, c24z);
        ArrayList arrayList = new ArrayList(8);
        24S r0 = c67f.A01;
        Class cls2 = r0._class;
        if (cls2 != Object.class) {
            if (cls2.isInterface()) {
                A07(r0, arrayList, false);
            } else {
                A08(r0, arrayList, false);
            }
        }
        C24t c24t = C24q.A0E;
        Class cls3 = c67f.A05;
        Class cls4 = c67f.A06;
        C24w A06 = c67f.A06(arrayList);
        return new C24q(c67f.A00, r0, c67f.A03, c67f.A04, c67f.A02._base._typeFactory, A06, cls3, cls4, arrayList, c67f.A07);
    }

    public static C24q A01(AnonymousClass253 anonymousClass253, C24z c24z, Class cls) {
        return (cls.isArray() && anonymousClass253.ASt(cls) == null) ? new C24q(cls) : A02(new C67f(anonymousClass253, c24z, cls));
    }

    public static C24q A02(C67f c67f) {
        List emptyList = Collections.emptyList();
        C24t c24t = C24q.A0E;
        Class cls = c67f.A05;
        Class cls2 = c67f.A06;
        C24w A06 = c67f.A06(emptyList);
        return new C24q(c67f.A00, null, c67f.A03, c67f.A04, c67f.A02._base._typeFactory, A06, cls, cls2, emptyList, c67f.A07);
    }

    private C24u A03(C24u c24u, Class cls, Class cls2) {
        if (cls2 != null) {
            c24u = A05(c24u, 27C.A0N(cls2));
            ArrayList A0t = AnonymousClass001.A0t(8);
            if (cls2 != cls) {
                while (true) {
                    cls2 = cls2.getSuperclass();
                    if (cls2 == null || cls2 == cls) {
                        break;
                    }
                    A0t.add(cls2);
                }
            }
            Iterator it = A0t.iterator();
            while (it.hasNext()) {
                c24u = A05(c24u, 27C.A0N((Class) it.next()));
            }
        }
        return c24u;
    }

    private C24u A04(C24u c24u, Annotation annotation) {
        Annotation[] A0N = 27C.A0N(annotation.annotationType());
        int length = A0N.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return c24u;
            }
            Annotation annotation2 = A0N[i2];
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !c24u.A03(annotation2)) {
                c24u = c24u.A00(annotation2);
                if (this.A00.A0o(annotation2)) {
                    c24u = A04(c24u, annotation2);
                }
            }
            i = i2 + 1;
        }
    }

    private C24u A05(C24u c24u, Annotation[] annotationArr) {
        if (annotationArr != null) {
            int length = annotationArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                Annotation annotation = annotationArr[i2];
                if (!c24u.A03(annotation)) {
                    c24u = c24u.A00(annotation);
                    if (this.A00.A0o(annotation)) {
                        c24u = A04(c24u, annotation);
                    }
                }
                i = i2 + 1;
            }
        }
        return c24u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        if (r301.A07 == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private X.C24w A06(java.util.List r302) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67f.A06(java.util.List):X.24w");
    }

    public static void A07(24S r301, List list, boolean z) {
        int length;
        Class cls = r301._class;
        if (z) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((24S) list.get(i))._class == cls) {
                    return;
                }
            }
            list.add(r301);
            if (cls == List.class || cls == java.util.Map.class) {
                return;
            }
        }
        24S[] r0 = ((C24c) r301)._superInterfaces;
        Iterator it = ((r0 == null || (length = r0.length) == 0) ? Collections.emptyList() : length != 1 ? Arrays.asList(r0) : Collections.singletonList(r0[0])).iterator();
        while (it.hasNext()) {
            A07((24S) it.next(), list, true);
        }
    }

    public static void A08(24S r301, List list, boolean z) {
        int length;
        Class cls = r301._class;
        if (cls == Object.class || cls == Enum.class) {
            return;
        }
        if (z) {
            int size = list.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    list.add(r301);
                    break;
                } else if (((24S) list.get(i2))._class == cls) {
                    return;
                } else {
                    i = i2 + 1;
                }
            }
        }
        24S[] r0 = ((C24c) r301)._superInterfaces;
        Iterator it = ((r0 == null || (length = r0.length) == 0) ? Collections.emptyList() : length != 1 ? Arrays.asList(r0) : Collections.singletonList(r0[0])).iterator();
        while (it.hasNext()) {
            A07((24S) it.next(), list, true);
        }
        24S A07 = r301.A07();
        if (A07 != null) {
            A08(A07, list, true);
        }
    }
}
