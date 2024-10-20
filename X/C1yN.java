package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1yN, reason: invalid class name */
/* loaded from: 1yN.class */
public final class C1yN {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1yN[] A01;
    public static final C1yN A02;
    public static final C1yN A03;
    public static final C1yN A04;
    public final int deliveryMode;
    public final Integer pageSize;

    static {
        C1yN c1yN = new C1yN(null, "LEGACY", 0, 0);
        A04 = c1yN;
        C1yN c1yN2 = new C1yN(10, "IMMERSIVE", 1, 1);
        A03 = c1yN2;
        C1yN c1yN3 = new C1yN(null, "CLASSIC", 2, 0);
        A02 = c1yN3;
        C1yN[] c1yNArr = {c1yN, c1yN2, c1yN3};
        A01 = c1yNArr;
        A00 = C00t.A00(c1yNArr);
    }

    public C1yN(Integer num, String str, int i, int i2) {
        this.deliveryMode = i2;
        this.pageSize = num;
    }

    public static C1yN valueOf(String str) {
        return (C1yN) Enum.valueOf(C1yN.class, str);
    }

    public static C1yN[] values() {
        return (C1yN[]) A01.clone();
    }
}
