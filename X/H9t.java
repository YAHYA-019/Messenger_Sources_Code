package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: H9t.class */
public final class H9t {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ H9t[] A01;
    public static final H9t A02;
    public static final H9t A03;
    public static final H9t A04;

    static {
        H9t h9t = new H9t("EFFECTS", 0);
        A02 = h9t;
        H9t h9t2 = new H9t("FILTERS", 1);
        A03 = h9t2;
        H9t h9t3 = new H9t("TOUCH_UP", 2);
        A04 = h9t3;
        H9t[] h9tArr = {h9t, h9t2, h9t3};
        A01 = h9tArr;
        A00 = C00t.A00(h9tArr);
    }

    public H9t(String str, int i) {
    }

    public static H9t valueOf(String str) {
        return (H9t) Enum.valueOf(H9t.class, str);
    }

    public static H9t[] values() {
        return (H9t[]) A01.clone();
    }
}
