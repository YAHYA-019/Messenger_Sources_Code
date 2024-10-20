package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96s, reason: invalid class name */
/* loaded from: 96s.class */
public final class C96s {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96s[] A01;
    public static final C96s A02;
    public static final C96s A03;
    public final int id;
    public final int labelId;

    static {
        C96s c96s = new C96s("LARGEST", 0, 0, 2131967012);
        A02 = c96s;
        C96s c96s2 = new C96s("NEWEST", 1, 1, 2131967013);
        A03 = c96s2;
        C96s[] c96sArr = {c96s, c96s2, new C96s("OLDEST", 2, 2, 2131967014)};
        A01 = c96sArr;
        A00 = C00t.A00(c96sArr);
    }

    public C96s(String str, int i, int i2, int i3) {
        this.id = i2;
        this.labelId = i3;
    }

    public static C96s valueOf(String str) {
        return (C96s) Enum.valueOf(C96s.class, str);
    }

    public static C96s[] values() {
        return (C96s[]) A01.clone();
    }
}
