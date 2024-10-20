package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4Nk, reason: invalid class name */
/* loaded from: 4Nk.class */
public final class C4Nk {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C4Nk[] A01;
    public static final C4Nk A02;
    public static final C4Nk A03;
    public static final C4Nk A04;
    public static final C4Nk A05;
    public static final C4Nk A06;
    public static final C4Nk A07;
    public static final C4Nk A08;
    public static final C4Nk A09;
    public static final C4Nk A0A;
    public final String key;

    static {
        C4Nk c4Nk = new C4Nk("PAID", 0, "payment_received");
        A08 = c4Nk;
        C4Nk c4Nk2 = new C4Nk("SHIPPED", 1, "order_dispatched");
        A0A = c4Nk2;
        C4Nk c4Nk3 = new C4Nk("ORDERED", 2, "order_created");
        A07 = c4Nk3;
        C4Nk c4Nk4 = new C4Nk("BOOKED", 3, "appointment_booked");
        A03 = c4Nk4;
        C4Nk c4Nk5 = new C4Nk("LEAD", 4, "lead_identified");
        A06 = c4Nk5;
        C4Nk c4Nk6 = new C4Nk("AUTO_LEAD", 5, "auto_identified_lead");
        A02 = c4Nk6;
        C4Nk c4Nk7 = new C4Nk("PRIORITY", 6, "priority");
        A09 = c4Nk7;
        C4Nk c4Nk8 = new C4Nk("HIGH_INTENT", 7, "high_intent");
        A05 = c4Nk8;
        C4Nk c4Nk9 = new C4Nk("EMPTY", 8, "");
        A04 = c4Nk9;
        C4Nk[] c4NkArr = {c4Nk, c4Nk2, c4Nk3, c4Nk4, c4Nk5, c4Nk6, c4Nk7, c4Nk8, c4Nk9};
        A01 = c4NkArr;
        A00 = C00t.A00(c4NkArr);
    }

    public C4Nk(String str, int i, String str2) {
        this.key = str2;
    }

    public static C4Nk valueOf(String str) {
        return (C4Nk) Enum.valueOf(C4Nk.class, str);
    }

    public static C4Nk[] values() {
        return (C4Nk[]) A01.clone();
    }
}
