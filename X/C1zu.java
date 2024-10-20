package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1zu, reason: invalid class name */
/* loaded from: 1zu.class */
public final class C1zu {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C1zu[] A02;
    public static final C1zu A03;
    public static final C1zu A04;
    public static final C1zu A05;
    public final int value;

    static {
        C1zu c1zu = new C1zu("NORMAL", 0, 0);
        A03 = c1zu;
        C1zu c1zu2 = new C1zu("PAUSED", 1, 1);
        A04 = c1zu2;
        C1zu c1zu3 = new C1zu("PAUSED_AND_UPGRADED_TO_COMMUNITY", 2, 2);
        A05 = c1zu3;
        C1zu[] c1zuArr = {c1zu, c1zu2, c1zu3, new C1zu("UPGRADED_TO_COMMUNITY_AND_TO_BE_PAUSED", 3, 3)};
        A02 = c1zuArr;
        A01 = C00t.A00(c1zuArr);
        A00 = C01g.A00(C03i.A03, C1zw.A00);
    }

    public C1zu(String str, int i, int i2) {
        this.value = i2;
    }

    public static C1zu valueOf(String str) {
        return (C1zu) Enum.valueOf(C1zu.class, str);
    }

    public static C1zu[] values() {
        return (C1zu[]) A02.clone();
    }
}
