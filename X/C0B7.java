package X;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: X.0B7, reason: invalid class name */
/* loaded from: 0B7.class */
public final class C0B7 {
    public static Collection A00(Object obj) {
        if ((obj instanceof AnonymousClass116) && !(obj instanceof C18t)) {
            A05(obj, "kotlin.collections.MutableCollection");
            throw 0Q8.createAndThrow();
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            11T.A06(C0B7.class, e);
            throw e;
        }
    }

    public static List A01(Object obj) {
        if ((obj instanceof AnonymousClass116) && !(obj instanceof C07c)) {
            A05(obj, "kotlin.collections.MutableList");
            throw 0Q8.createAndThrow();
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            11T.A06(C0B7.class, e);
            throw e;
        }
    }

    public static java.util.Map A02(Object obj) {
        if ((obj instanceof AnonymousClass116) && !(obj instanceof 0C2)) {
            A05(obj, "kotlin.collections.MutableMap");
            throw 0Q8.createAndThrow();
        }
        try {
            return (java.util.Map) obj;
        } catch (ClassCastException e) {
            11T.A06(C0B7.class, e);
            throw e;
        }
    }

    public static Set A03(Object obj) {
        if ((obj instanceof AnonymousClass116) && !(obj instanceof 0eD)) {
            A05(obj, "kotlin.collections.MutableSet");
            throw 0Q8.createAndThrow();
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            11T.A06(C0B7.class, e);
            throw e;
        }
    }

    public static void A04(Object obj, int i) {
        if (obj == null || A06(i, obj)) {
            return;
        }
        A05(obj, 0Pz.A0T("kotlin.jvm.functions.Function", i));
        throw 0Q8.createAndThrow();
    }

    public static void A05(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(0Pz.A0j(obj == null ? "null" : AnonymousClass001.A0Y(obj), " cannot be cast to ", str));
        11T.A06(C0B7.class, classCastException);
        throw classCastException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r304 != r301) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A06(int r301, java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0B7.A06(int, java.lang.Object):boolean");
    }

    public static boolean A07(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof AnonymousClass116) || (obj instanceof C07c);
        }
        return false;
    }

    public static boolean A08(Object obj) {
        if (obj instanceof java.util.Map) {
            return !(obj instanceof AnonymousClass116) || (obj instanceof 0C2);
        }
        return false;
    }
}
