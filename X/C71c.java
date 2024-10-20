package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.71c, reason: invalid class name */
/* loaded from: 71c.class */
public final class C71c {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C71c[] A01;
    public static final C71c A02;
    public static final C71c A03;

    static {
        C71c c71c = new C71c("HSCROLL_BLOKS", 0);
        A03 = c71c;
        C71c c71c2 = new C71c("DMXA_CENTERED", 1);
        A02 = c71c2;
        C71c[] c71cArr = {c71c, c71c2};
        A01 = c71cArr;
        A00 = C00t.A00(c71cArr);
    }

    public C71c(String str, int i) {
    }

    public static C71c valueOf(String str) {
        return (C71c) Enum.valueOf(C71c.class, str);
    }

    public static C71c[] values() {
        return (C71c[]) A01.clone();
    }
}
