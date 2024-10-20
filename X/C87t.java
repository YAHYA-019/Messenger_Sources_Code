package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.87t, reason: invalid class name */
/* loaded from: 87t.class */
public final class C87t {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C87t[] A01;
    public static final C87t A02;
    public static final C87t A03;

    static {
        C87t c87t = new C87t("DEFAULT", 0);
        A02 = c87t;
        C87t c87t2 = new C87t("TEXT_FOCUSED", 1);
        A03 = c87t2;
        C87t[] c87tArr = {c87t, c87t2};
        A01 = c87tArr;
        A00 = C00t.A00(c87tArr);
    }

    public C87t(String str, int i) {
    }

    public static C87t valueOf(String str) {
        return (C87t) Enum.valueOf(C87t.class, str);
    }

    public static C87t[] values() {
        return (C87t[]) A01.clone();
    }
}
