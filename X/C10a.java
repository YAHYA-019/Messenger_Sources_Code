package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.10a, reason: invalid class name */
/* loaded from: 10a.class */
public final class C10a implements AnonymousClass100 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C10a[] A01;
    public static final C10a A02;
    public static final C10a A03;
    public static final C10a A04;
    public static final C10a A05;
    public static final C10a A06;
    public static final C10a A07;
    public final int mask;
    public final int value;

    static {
        C10a c10a = new C10a("IGNORE_CASE", 0, 2, 2);
        A04 = c10a;
        C10a c10a2 = new C10a("MULTILINE", 1, 8, 8);
        A06 = c10a2;
        C10a c10a3 = new C10a("LITERAL", 2, 16, 16);
        A05 = c10a3;
        C10a c10a4 = new C10a("UNIX_LINES", 3, 1, 1);
        A07 = c10a4;
        C10a c10a5 = new C10a("COMMENTS", 4, 4, 4);
        A02 = c10a5;
        C10a c10a6 = new C10a("DOT_MATCHES_ALL", 5, 32, 32);
        A03 = c10a6;
        C10a[] c10aArr = {c10a, c10a2, c10a3, c10a4, c10a5, c10a6, new C10a("CANON_EQ", 6, 128, 128)};
        A01 = c10aArr;
        A00 = C00t.A00(c10aArr);
    }

    public C10a(String str, int i, int i2, int i3) {
        this.value = i2;
        this.mask = i3;
    }

    public static C10a valueOf(String str) {
        return (C10a) Enum.valueOf(C10a.class, str);
    }

    public static C10a[] values() {
        return (C10a[]) A01.clone();
    }
}
