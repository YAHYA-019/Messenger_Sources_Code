package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95j, reason: invalid class name */
/* loaded from: 95j.class */
public final class C95j {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95j[] A01;
    public static final C95j A02;
    public static final C95j A03;
    public static final C95j A04;

    static {
        C95j c95j = new C95j("MAIN_VIEW", 0);
        A03 = c95j;
        C95j c95j2 = new C95j("END_OF_FEED", 1);
        A02 = c95j2;
        C95j c95j3 = new C95j("NULL_STATE", 2);
        A04 = c95j3;
        C95j[] c95jArr = {c95j, c95j2, c95j3};
        A01 = c95jArr;
        A00 = C00t.A00(c95jArr);
    }

    public C95j(String str, int i) {
    }

    public static C95j valueOf(String str) {
        return (C95j) Enum.valueOf(C95j.class, str);
    }

    public static C95j[] values() {
        return (C95j[]) A01.clone();
    }
}
