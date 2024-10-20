package X;

import com.google.common.collect.ImmutableList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6o1, reason: invalid class name */
/* loaded from: 6o1.class */
public final class C6o1 {
    public static final java.util.Map A00 = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r304v2, types: [java.lang.Object, X.6o2] */
    public static final boolean A00(int i) {
        C6o2 c6o2 = (C6o2) A00.get(Integer.valueOf(i));
        C6o2 c6o22 = c6o2;
        if (c6o2 == null) {
            ImmutableList of = ImmutableList.of();
            11T.A0A(of);
            ?? obj = new Object();
            obj.A02 = true;
            obj.A00 = of;
            obj.A03 = false;
            obj.A01 = false;
            c6o22 = obj;
        }
        return c6o22.A01;
    }

    /* JADX WARN: Type inference failed for: r304v2, types: [java.lang.Object, X.6o2] */
    public static final boolean A01(int i) {
        C6o2 c6o2 = (C6o2) A00.get(Integer.valueOf(i));
        C6o2 c6o22 = c6o2;
        if (c6o2 == null) {
            ImmutableList of = ImmutableList.of();
            11T.A0A(of);
            ?? obj = new Object();
            obj.A02 = true;
            obj.A00 = of;
            obj.A03 = false;
            obj.A01 = false;
            c6o22 = obj;
        }
        return c6o22.A02;
    }

    /* JADX WARN: Type inference failed for: r304v2, types: [java.lang.Object, X.6o2] */
    public static final boolean A02(int i) {
        C6o2 c6o2 = (C6o2) A00.get(Integer.valueOf(i));
        C6o2 c6o22 = c6o2;
        if (c6o2 == null) {
            ImmutableList of = ImmutableList.of();
            11T.A0A(of);
            ?? obj = new Object();
            obj.A02 = true;
            obj.A00 = of;
            obj.A03 = false;
            obj.A01 = false;
            c6o22 = obj;
        }
        return c6o22.A03;
    }
}
