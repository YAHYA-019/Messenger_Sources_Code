package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1nm, reason: invalid class name */
/* loaded from: 1nm.class */
public final class C1nm {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1nm[] A01;
    public static final C1nm A02;
    public static final C1nm A03;
    public final int value;

    static {
        C1nm c1nm = new C1nm("AT_MOST_ONCE", 0, 0);
        A03 = c1nm;
        C1nm c1nm2 = new C1nm("AT_LEAST_ONCE", 1, 1);
        A02 = c1nm2;
        C1nm[] c1nmArr = {c1nm, c1nm2};
        A01 = c1nmArr;
        A00 = C00t.A00(c1nmArr);
    }

    public C1nm(String str, int i, int i2) {
        this.value = i2;
    }

    public static C1nm valueOf(String str) {
        return (C1nm) Enum.valueOf(C1nm.class, str);
    }

    public static C1nm[] values() {
        return (C1nm[]) A01.clone();
    }
}
