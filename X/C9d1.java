package X;

/* renamed from: X.9d1, reason: invalid class name */
/* loaded from: 9d1.class */
public abstract class C9d1 {
    public static 8Dm A00(C2k6 c2k6, C2lu c2lu, long j) {
        return A01(c2k6, null, c2lu, new C2lu(j), new C2lu(j));
    }

    public static final 8Dm A01(C2k6 c2k6, C2lu c2lu, C2lu c2lu2, C2lu c2lu3, C2lu c2lu4) {
        Integer num = null;
        Integer valueOf = c2lu != null ? Integer.valueOf(7zO.A06(c2k6, c2lu.A00)) : null;
        Integer valueOf2 = c2lu2 != null ? Integer.valueOf(7zO.A06(c2k6, c2lu2.A00)) : null;
        Integer valueOf3 = c2lu3 != null ? Integer.valueOf(7zO.A06(c2k6, c2lu3.A00)) : null;
        if (c2lu4 != null) {
            num = Integer.valueOf(7zO.A06(c2k6, c2lu4.A00));
        }
        return new 8Dm(valueOf, valueOf2, valueOf3, num);
    }
}
