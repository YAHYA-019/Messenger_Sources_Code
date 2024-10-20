package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5yf, reason: invalid class name */
/* loaded from: 5yf.class */
public final class C5yf {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C5yf[] A01;
    public static final C5yf A02;

    static {
        C5yf c5yf = new C5yf();
        A02 = c5yf;
        C5yf[] c5yfArr = {c5yf};
        A01 = c5yfArr;
        A00 = C00t.A00(c5yfArr);
    }

    public static C5yf valueOf(String str) {
        return (C5yf) Enum.valueOf(C5yf.class, str);
    }

    public static C5yf[] values() {
        return (C5yf[]) A01.clone();
    }
}
