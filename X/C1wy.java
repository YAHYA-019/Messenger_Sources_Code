package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1wy, reason: invalid class name */
/* loaded from: 1wy.class */
public final class C1wy {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1wy[] A01;
    public static final C1wy A02;
    public static final C1wy A03;
    public static final C1wy A04;

    static {
        C1wy c1wy = new C1wy("HasBackup", 0);
        A02 = c1wy;
        C1wy c1wy2 = new C1wy("HasNoBackup", 1);
        A03 = c1wy2;
        C1wy c1wy3 = new C1wy("Unknown", 2);
        A04 = c1wy3;
        C1wy[] c1wyArr = {c1wy, c1wy2, c1wy3};
        A01 = c1wyArr;
        A00 = C00t.A00(c1wyArr);
    }

    public C1wy(String str, int i) {
    }

    public static C1wy valueOf(String str) {
        return (C1wy) Enum.valueOf(C1wy.class, str);
    }

    public static C1wy[] values() {
        return (C1wy[]) A01.clone();
    }
}
