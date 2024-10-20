package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1jX, reason: invalid class name */
/* loaded from: 1jX.class */
public final class C1jX {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1jX[] A01;
    public static final C1jX A02;
    public static final C1jX A03;
    public static final C1jX A04;

    static {
        C1jX c1jX = new C1jX("COMPACT", 0);
        A02 = c1jX;
        C1jX c1jX2 = new C1jX("MEDIUM", 1);
        A04 = c1jX2;
        C1jX c1jX3 = new C1jX("EXPANDED", 2);
        A03 = c1jX3;
        C1jX[] c1jXArr = {c1jX, c1jX2, c1jX3};
        A01 = c1jXArr;
        A00 = C00t.A00(c1jXArr);
    }

    public C1jX(String str, int i) {
    }

    public static C1jX valueOf(String str) {
        return (C1jX) Enum.valueOf(C1jX.class, str);
    }

    public static C1jX[] values() {
        return (C1jX[]) A01.clone();
    }
}
