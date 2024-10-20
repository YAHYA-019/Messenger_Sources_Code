package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6fo, reason: invalid class name */
/* loaded from: 6fo.class */
public final class C6fo {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6fo[] A01;
    public static final C6fo A02;
    public static final C6fo A03;
    public static final C6fo A04;

    static {
        C6fo c6fo = new C6fo("ACTION_BAR", 0);
        A02 = c6fo;
        C6fo c6fo2 = new C6fo("MORE_DRAWER", 1);
        A04 = c6fo2;
        C6fo c6fo3 = new C6fo("INPUT", 2);
        A03 = c6fo3;
        C6fo[] c6foArr = {c6fo, c6fo2, c6fo3};
        A01 = c6foArr;
        A00 = C00t.A00(c6foArr);
    }

    public C6fo(String str, int i) {
    }

    public static C6fo valueOf(String str) {
        return (C6fo) Enum.valueOf(C6fo.class, str);
    }

    public static C6fo[] values() {
        return (C6fo[]) A01.clone();
    }
}
