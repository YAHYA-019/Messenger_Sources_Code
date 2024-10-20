package X;

/* renamed from: X.0qf, reason: invalid class name */
/* loaded from: 0qf.class */
public final class C0qf {
    public String A00(C0gq c0gq, 0iP r303) {
        String str;
        if (!r303.equals(0iP.A0S) && !r303.equals(0iP.A0P) && !r303.equals(0iP.A0O) && !r303.equals(0iP.A09) && !r303.equals(0iP.A05)) {
            boolean equals = r303.equals(0iP.A0C);
            str = "collector";
            C0gq c0gq2 = C0gq.CRITICAL_REPORT;
            if (!equals) {
                return c0gq != c0gq2 ? null : "collector";
            }
            if (c0gq != c0gq2) {
                return str;
            }
        }
        return "perf";
    }
}
