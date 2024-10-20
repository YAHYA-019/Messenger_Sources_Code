package X;

import java.util.List;

/* renamed from: X.4s8, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4s8.class */
public final class C10014s8 {
    public 2EU A00;
    public C03183xW A01;
    public String A02;
    public List A03;
    public final 2G8 A04;

    public C10014s8(2EU r302, C03183xW c03183xW, 2G8 r304, String str, List list) {
        this.A04 = r304;
        this.A00 = r302 != null ? r302.A08() : null;
        this.A03 = 2EU.A03(list);
        this.A01 = c03183xW;
        this.A02 = str;
    }

    public C10014s8(2G8 r302) {
        this.A04 = r302;
    }

    public 2EU A00() {
        2EU A08;
        synchronized (this) {
            2EU r0 = this.A00;
            A08 = r0 != null ? r0.A08() : null;
        }
        return A08;
    }
}
