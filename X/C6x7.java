package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6x7, reason: invalid class name */
/* loaded from: 6x7.class */
public final class C6x7 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6x7[] A01;
    public static final C6x7 A02;
    public static final C6x7 A03;

    static {
        C6x7 c6x7 = new C6x7("FB", 0);
        A02 = c6x7;
        C6x7 c6x72 = new C6x7("MESSENGER", 1);
        A03 = c6x72;
        C6x7[] c6x7Arr = {c6x7, c6x72};
        A01 = c6x7Arr;
        A00 = C00t.A00(c6x7Arr);
    }

    public C6x7(String str, int i) {
    }

    public static C6x7 valueOf(String str) {
        return (C6x7) Enum.valueOf(C6x7.class, str);
    }

    public static C6x7[] values() {
        return (C6x7[]) A01.clone();
    }
}
