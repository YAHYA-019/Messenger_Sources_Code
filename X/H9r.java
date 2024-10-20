package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: H9r.class */
public final class H9r {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ H9r[] A01;
    public static final H9r A02;
    public static final H9r A03;
    public static final H9r A04;

    static {
        H9r h9r = new H9r("NONE", 0);
        A04 = h9r;
        H9r h9r2 = new H9r("FIT", 1);
        A03 = h9r2;
        H9r h9r3 = new H9r("CROP", 2);
        A02 = h9r3;
        H9r[] h9rArr = {h9r, h9r2, h9r3};
        A01 = h9rArr;
        A00 = C00t.A00(h9rArr);
    }

    public H9r(String str, int i) {
    }

    public static H9r valueOf(String str) {
        return (H9r) Enum.valueOf(H9r.class, str);
    }

    public static H9r[] values() {
        return (H9r[]) A01.clone();
    }
}
