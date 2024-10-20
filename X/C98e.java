package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.98e, reason: invalid class name */
/* loaded from: 98e.class */
public final class C98e implements AXD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C98e[] A01;
    public static final C98e A02;
    public static final C98e A03;
    public static final C98e A04;
    public final String text;

    static {
        C98e c98e = new C98e("SHOW_MENTIONS", 0, "show_mentions");
        A03 = c98e;
        C98e c98e2 = new C98e("TRIGGER_MENTIONS", 1, "trigger_mentions");
        A04 = c98e2;
        C98e c98e3 = new C98e("SELECT_MENTION", 2, "select_mention");
        A02 = c98e3;
        C98e[] c98eArr = {c98e, c98e2, c98e3};
        A01 = c98eArr;
        A00 = C00t.A00(c98eArr);
    }

    public C98e(String str, int i, String str2) {
        this.text = str2;
    }

    public static C98e valueOf(String str) {
        return (C98e) Enum.valueOf(C98e.class, str);
    }

    public static C98e[] values() {
        return (C98e[]) A01.clone();
    }
}
