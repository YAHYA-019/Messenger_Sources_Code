package X;

/* renamed from: X.4Xf, reason: invalid class name */
/* loaded from: 4Xf.class */
public final class C4Xf implements C15h {
    public final int A00;

    public C4Xf(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.5fj] */
    @Override // X.C15h
    public /* bridge */ /* synthetic */ Object get() {
        String str;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                return 1Bn.A0A(33096);
            case 1:
                return new Object();
            case 2:
                C0o7 c0o7 = C0ft.A04;
                if (c0o7 == null) {
                    return "";
                }
                str3 = c0o7.A05;
                if (str3 == null) {
                    return "unknown";
                }
                return str3;
            case 3:
                return new Object();
            case 4:
                C0o7 c0o72 = C0ft.A04;
                if (c0o72 != null) {
                    str2 = c0o72.A05;
                    if (str2 == null) {
                        str2 = "unknown";
                    }
                } else {
                    str2 = null;
                }
                return new C1q1(str2);
            case 5:
                return new Object();
            case 6:
                C0o7 c0o73 = C0ft.A04;
                if (c0o73 != null) {
                    str = c0o73.A05;
                    if (str == null) {
                        str = "unknown";
                    }
                } else {
                    str = null;
                }
                ?? obj = new Object();
                obj.A01 = str;
                obj.A00 = 1;
                return obj;
            case 7:
                return 1Bn.A0A(66569);
            default:
                str3 = null;
                return str3;
        }
    }
}
