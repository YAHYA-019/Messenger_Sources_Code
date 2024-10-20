package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5fs, reason: invalid class name */
/* loaded from: 5fs.class */
public final class C5fs {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C5fs[] A01;
    public static final C5fs A02;
    public static final C5fs A03;
    public static final C5fs A04;
    public static final C5fs A05;

    static {
        C5fs c5fs = new C5fs("RECEIVED", 0);
        A05 = c5fs;
        C5fs c5fs2 = new C5fs("PRE_PROCESSED", 1);
        A04 = c5fs2;
        C5fs c5fs3 = new C5fs("POST_PROCESSED", 2);
        A02 = c5fs3;
        C5fs c5fs4 = new C5fs("POST_PROCESSED_UNCHANGED", 3);
        A03 = c5fs4;
        C5fs[] c5fsArr = {c5fs, c5fs2, c5fs3, c5fs4};
        A01 = c5fsArr;
        A00 = C00t.A00(c5fsArr);
    }

    public C5fs(String str, int i) {
    }

    public static C5fs valueOf(String str) {
        return (C5fs) Enum.valueOf(C5fs.class, str);
    }

    public static C5fs[] values() {
        return (C5fs[]) A01.clone();
    }
}
