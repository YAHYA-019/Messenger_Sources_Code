package X;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.24q, reason: invalid class name */
/* loaded from: 24q.class */
public final class C24q extends C24r implements C24s {
    public static final C24t A0E = new C24t(null, Collections.emptyList(), Collections.emptyList());
    public C24t A00;
    public 68E A01;
    public List A02;
    public final 24S A03;
    public final C24w A04;
    public final Class A05;
    public final AnonymousClass248 A06;
    public final C24z A07;
    public final 24W A08;
    public final 24R A09;
    public final Class A0A;
    public final List A0B;
    public final boolean A0C;
    public transient Boolean A0D;

    public C24q(AnonymousClass248 anonymousClass248, 24S r303, C24z c24z, 24W r305, 24R r306, C24w c24w, Class cls, Class cls2, List list, boolean z) {
        this.A03 = r303;
        this.A05 = cls;
        this.A0B = list;
        this.A0A = cls2;
        this.A04 = c24w;
        this.A08 = r305;
        this.A06 = anonymousClass248;
        this.A07 = c24z;
        this.A09 = r306;
        this.A0C = z;
    }

    public C24q(Class cls) {
        this.A03 = null;
        this.A05 = cls;
        this.A0B = Collections.emptyList();
        this.A0A = null;
        this.A04 = C24u.A01;
        this.A08 = 24W.A00;
        this.A06 = null;
        this.A07 = null;
        this.A09 = null;
        this.A0C = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0349  */
    /* JADX WARN: Type inference failed for: r0v343, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r320v0 */
    /* JADX WARN: Type inference failed for: r320v1 */
    /* JADX WARN: Type inference failed for: r320v2 */
    /* JADX WARN: Type inference failed for: r320v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C24t A00(X.C24q r301) {
        /*
            Method dump skipped, instructions count: 2086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24q.A00(X.24q):X.24t");
    }

    /* JADX WARN: Type inference failed for: r302v10 */
    /* JADX WARN: Type inference failed for: r302v3 */
    /* JADX WARN: Type inference failed for: r302v7, types: [X.68E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r302v9 */
    public static final 68E A01(C24q c24q) {
        ?? r302;
        Class ASt;
        68E r3022 = c24q.A01;
        68E r3023 = r3022;
        if (r3022 == null) {
            24S r0 = c24q.A03;
            if (r0 != null) {
                AnonymousClass248 anonymousClass248 = c24q.A06;
                C24z c24z = c24q.A07;
                24R r02 = c24q.A09;
                List<24S> list = c24q.A0B;
                Class cls = c24q.A0A;
                C68A c68a = new C68A(anonymousClass248, c24z, c24q.A0C);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C68A.A00(c68a, c24q, r0._class, cls, linkedHashMap);
                for (24S r03 : list) {
                    C24z c24z2 = c68a.A00;
                    C68A.A00(c68a, new C67w(r03.A0I(), r02), r03._class, c24z2 == null ? null : c24z2.ASt(r03._class), linkedHashMap);
                }
                C24z c24z3 = c68a.A00;
                if (c24z3 != null && (ASt = c24z3.ASt(Object.class)) != null) {
                    C68A.A01(c68a, c24q, r0._class, ASt, linkedHashMap);
                    if (((C67u) c68a).A00 != null && !linkedHashMap.isEmpty()) {
                        Iterator A0x = AnonymousClass001.A0x(linkedHashMap);
                        while (A0x.hasNext()) {
                            Map.Entry A0z = AnonymousClass001.A0z(A0x);
                            68B r04 = (68B) A0z.getKey();
                            String str = r04.A00;
                            if ("hashCode".equals(str) && r04.A01.length == 0) {
                                try {
                                    Method declaredMethod = Object.class.getDeclaredMethod(str, new Class[0]);
                                    if (declaredMethod != null) {
                                        68C r05 = (68C) A0z.getValue();
                                        r05.A00 = c68a.A05(r05.A00, declaredMethod.getDeclaredAnnotations());
                                        r05.A02 = declaredMethod;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        68C r06 = (68C) entry.getValue();
                        Method method = r06.A02;
                        if (method != null) {
                            linkedHashMap2.put(entry.getKey(), new C68D(r06.A00.A01(), r06.A01, method, null));
                        }
                    }
                    ?? obj = new Object();
                    ((68E) obj).A00 = linkedHashMap2;
                    r302 = obj;
                    c24q.A01 = r302 == true ? 1 : 0;
                    r3023 = r302;
                }
            }
            r302 = new Object();
            c24q.A01 = r302 == true ? 1 : 0;
            r3023 = r302;
        }
        return r3023;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.67t] */
    /* JADX WARN: Type inference failed for: r302v3 */
    /* JADX WARN: Type inference failed for: r302v4 */
    /* JADX WARN: Type inference failed for: r302v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final List A02(C24q c24q) {
        ?? emptyList;
        List list = c24q.A02;
        List list2 = list;
        if (list == null) {
            24S r0 = c24q.A03;
            if (r0 != null) {
                final AnonymousClass248 anonymousClass248 = c24q.A06;
                final C24z c24z = c24q.A07;
                final 24R r02 = c24q.A09;
                final boolean z = c24q.A0C;
                java.util.Map A00 = C67t.A00(r0, new C67u(anonymousClass248, c24z, r02, z) { // from class: X.67t
                    public final C24z A00;
                    public final 24R A01;
                    public final boolean A02;

                    {
                        super(anonymousClass248);
                        this.A01 = r02;
                        this.A00 = anonymousClass248 == null ? null : c24z;
                        this.A02 = z;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fd, code lost:
                    
                        if (r308 != r0) goto L27;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:30:0x0100, code lost:
                    
                        r0.add(r308);
                        r308 = r308.getSuperclass();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:31:0x0111, code lost:
                    
                        if (r308 == null) goto L51;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x0118, code lost:
                    
                        if (r308 != r0) goto L53;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:37:0x011b, code lost:
                    
                        r0 = r0.iterator();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:39:0x012b, code lost:
                    
                        if (r0.hasNext() == false) goto L54;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:40:0x012e, code lost:
                    
                        r0 = ((java.lang.Class) r0.next()).getDeclaredFields();
                        r0 = r0.length;
                        r312 = 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:42:0x014f, code lost:
                    
                        if (r312 >= r0) goto L55;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:43:0x0152, code lost:
                    
                        r0 = r0[r312];
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:44:0x0162, code lost:
                    
                        if (r0.isSynthetic() != false) goto L57;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:46:0x0171, code lost:
                    
                        if (java.lang.reflect.Modifier.isStatic(r0.getModifiers()) != false) goto L58;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:47:0x0174, code lost:
                    
                        r0 = (X.C67x) r304.get(r0.getName());
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:48:0x018a, code lost:
                    
                        if (r0 == null) goto L59;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:49:0x018d, code lost:
                    
                        r0.A00 = r302.A04(r0.A00, r0.getDeclaredAnnotations());
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ac, code lost:
                    
                        r312 = r312 + 1;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public static java.util.Map A00(X.24S r301, X.C67t r302, X.C24s r303) {
                        /*
                            Method dump skipped, instructions count: 439
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C67t.A00(X.24S, X.67t, X.24s):java.util.Map");
                    }
                }, c24q);
                if (A00 != null) {
                    emptyList = new ArrayList(A00.size());
                    for (C67x c67x : A00.values()) {
                        emptyList.add(new C67y(c67x.A00.A01(), c67x.A01, c67x.A02));
                    }
                    c24q.A02 = emptyList == true ? 1 : 0;
                    list2 = emptyList;
                }
            }
            emptyList = Collections.emptyList();
            c24q.A02 = emptyList == true ? 1 : 0;
            list2 = emptyList;
        }
        return list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r0.getEnclosingClass() == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A09() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Boolean r0 = r0.A0D
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L4b
            r0 = r301
            java.lang.Class r0 = r0.A05
            r303 = r0
            X.27F[] r0 = X.27C.A01
            r302 = r0
            r0 = r303
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L3b
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r302 = r0
            r0 = r303
            r1 = r302
            if (r0 == r1) goto L3b
            r0 = r303
            boolean r0 = r0.isPrimitive()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L3b
            r0 = r303
            java.lang.Class r0 = r0.getEnclosingClass()
            r302 = r0
            r0 = 1
            r305 = r0
            r0 = r302
            if (r0 != 0) goto L40
        L3b:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L40:
            r0 = r305
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A0D = r1
        L4b:
            r0 = r302
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24q.A09():boolean");
    }

    @Override // X.C24s
    public 24S Ci9(Type type) {
        return 24R.A02((43K) null, this.A08, this.A09, type);
    }

    @Override // X.C24r
    public boolean equals(Object obj) {
        if (obj != this) {
            Class<?> cls = getClass();
            C27F[] c27fArr = 27C.A01;
            if (obj == null || obj.getClass() != cls || ((C24q) obj).A05 != this.A05) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C24r
    public int hashCode() {
        return this.A05.getName().hashCode();
    }

    @Override // X.C24r
    public String toString() {
        return 0Pz.A0j("[AnnotedClass ", this.A05.getName(), "]");
    }
}
