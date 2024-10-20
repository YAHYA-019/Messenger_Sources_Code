package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1zL, reason: invalid class name */
/* loaded from: 1zL.class */
public final class C1zL {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1zL[] A01;
    public static final C1zL A02;
    public static final C1zL A03;
    public static final C1zL A04;
    public static final C1zL A05;
    public final int dbValue;

    static {
        C1zL c1zL = new C1zL("NON_ADMIN", 0, -1);
        A04 = c1zL;
        C1zL c1zL2 = new C1zL("REGULAR_ADMIN", 1, 0);
        A05 = c1zL2;
        C1zL c1zL3 = new C1zL("GROUP_CREATOR", 2, 1);
        A03 = c1zL3;
        C1zL c1zL4 = new C1zL("CHAT_SUPER_ADMIN", 3, 2);
        A02 = c1zL4;
        C1zL[] c1zLArr = {c1zL, c1zL2, c1zL3, c1zL4};
        A01 = c1zLArr;
        A00 = C00t.A00(c1zLArr);
    }

    public C1zL(String str, int i, int i2) {
        this.dbValue = i2;
    }

    public static C1zL valueOf(String str) {
        return (C1zL) Enum.valueOf(C1zL.class, str);
    }

    public static C1zL[] values() {
        return (C1zL[]) A01.clone();
    }
}
