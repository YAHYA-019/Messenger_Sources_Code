package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2pq, reason: invalid class name */
/* loaded from: 2pq.class */
public final class C2pq implements C1p8 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C2pq[] A01;
    public static final C2pq A02;
    public static final C2pq A03;
    public static final C2pq A04;
    public static final C2pq A05;
    public static final C2pq A06;
    public static final C2pq A07;
    public static final C2pq A08;
    public final C1p9 dspUsageColor;

    static {
        C2pq c2pq = new C2pq(C1p9.A0M, "DELIVERY_STATE", 0);
        A04 = c2pq;
        C2pq c2pq2 = new C2pq(C1p9.A0O, "RED", 1);
        A06 = c2pq2;
        C2pq c2pq3 = new C2pq(C1p9.A0K, "ACTIVE", 2);
        A03 = c2pq3;
        C2pq c2pq4 = new C2pq(C1p9.A0N, "RECENTLY_ACTIVE", 3);
        A05 = c2pq4;
        C2pq c2pq5 = new C2pq(C1p9.A0P, "RING_READ", 4);
        A07 = c2pq5;
        C2pq c2pq6 = new C2pq(C1p9.A0Q, "RING_UNREAD", 5);
        A08 = c2pq6;
        C2pq c2pq7 = new C2pq(C1p9.A0J, "ACCENT", 6);
        A02 = c2pq7;
        C2pq[] c2pqArr = {c2pq, c2pq2, c2pq3, c2pq4, c2pq5, c2pq6, c2pq7};
        A01 = c2pqArr;
        A00 = C00t.A00(c2pqArr);
    }

    public C2pq(C1p9 c1p9, String str, int i) {
        this.dspUsageColor = c1p9;
    }

    public static C2pq valueOf(String str) {
        return (C2pq) Enum.valueOf(C2pq.class, str);
    }

    public static C2pq[] values() {
        return (C2pq[]) A01.clone();
    }

    @Override // X.C1p8
    public int AgL() {
        return C1pA.A00.A01(this.dspUsageColor, true);
    }

    @Override // X.C1p8
    public int Ato() {
        return C1pA.A00.A01(this.dspUsageColor, false);
    }
}
