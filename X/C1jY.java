package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1jY, reason: invalid class name */
/* loaded from: 1jY.class */
public final class C1jY {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1jY[] A01;
    public static final C1jY A02;
    public static final C1jY A03;
    public static final C1jY A04;

    static {
        C1jY c1jY = new C1jY("COMPACT", 0);
        A02 = c1jY;
        C1jY c1jY2 = new C1jY("MEDIUM", 1);
        A04 = c1jY2;
        C1jY c1jY3 = new C1jY("EXPANDED", 2);
        A03 = c1jY3;
        C1jY[] c1jYArr = {c1jY, c1jY2, c1jY3};
        A01 = c1jYArr;
        A00 = C00t.A00(c1jYArr);
    }

    public C1jY(String str, int i) {
    }

    public static C1jY valueOf(String str) {
        return (C1jY) Enum.valueOf(C1jY.class, str);
    }

    public static C1jY[] values() {
        return (C1jY[]) A01.clone();
    }
}
