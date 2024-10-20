package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6p1, reason: invalid class name */
/* loaded from: 6p1.class */
public final class C6p1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6p1[] A01;
    public static final C6p1 A02;
    public static final C6p1 A03;
    public final int priority;

    static {
        C6p1 c6p1 = new C6p1("DISAPPEARING_MODE", 0, 1);
        A02 = c6p1;
        C6p1 c6p12 = new C6p1("SEARCH_IN_CHAT", 1, 2);
        A03 = c6p12;
        C6p1[] c6p1Arr = {c6p1, c6p12};
        A01 = c6p1Arr;
        A00 = C00t.A00(c6p1Arr);
    }

    public C6p1(String str, int i, int i2) {
        this.priority = i2;
    }

    public static C6p1 valueOf(String str) {
        return (C6p1) Enum.valueOf(C6p1.class, str);
    }

    public static C6p1[] values() {
        return (C6p1[]) A01.clone();
    }
}
