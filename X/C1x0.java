package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1x0, reason: invalid class name */
/* loaded from: 1x0.class */
public final class C1x0 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1x0[] A01;
    public static final C1x0 A02;
    public static final C1x0 A03;
    public static final C1x0 A04;
    public static final C1x0 A05;

    static {
        C1x0 c1x0 = new C1x0("Initial", 0);
        A04 = c1x0;
        C1x0 c1x02 = new C1x0("Loading", 1);
        A05 = c1x02;
        C1x0 c1x03 = new C1x0("Finished", 2);
        A03 = c1x03;
        C1x0 c1x04 = new C1x0("Error", 3);
        A02 = c1x04;
        C1x0[] c1x0Arr = {c1x0, c1x02, c1x03, c1x04};
        A01 = c1x0Arr;
        A00 = C00t.A00(c1x0Arr);
    }

    public C1x0(String str, int i) {
    }

    public static C1x0 valueOf(String str) {
        return (C1x0) Enum.valueOf(C1x0.class, str);
    }

    public static C1x0[] values() {
        return (C1x0[]) A01.clone();
    }
}
