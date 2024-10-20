package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2gu, reason: invalid class name */
/* loaded from: 2gu.class */
public final class C2gu {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C2gu[] A01;
    public static final C2gu A02;
    public static final C2gu A03;
    public static final C2gu A04;
    public static final C2gu A05;
    public final String analyticsString;

    static {
        C2gu c2gu = new C2gu("SECTION_HEADER", 0, "h");
        A05 = c2gu;
        C2gu c2gu2 = new C2gu("MONTAGE_SECTION_HEADER", 1, "w");
        A03 = c2gu2;
        C2gu c2gu3 = new C2gu("MORE_FOOTER", 2, "m");
        A04 = c2gu3;
        C2gu c2gu4 = new C2gu("COLLAPSED_UNIT", 3, "c");
        A02 = c2gu4;
        C2gu[] c2guArr = {c2gu, c2gu2, c2gu3, c2gu4, new C2gu("CREATE_ROOM", 4, "r")};
        A01 = c2guArr;
        A00 = C00t.A00(c2guArr);
    }

    public C2gu(String str, int i, String str2) {
        this.analyticsString = str2;
    }

    public static C2gu valueOf(String str) {
        return (C2gu) Enum.valueOf(C2gu.class, str);
    }

    public static C2gu[] values() {
        return (C2gu[]) A01.clone();
    }
}
