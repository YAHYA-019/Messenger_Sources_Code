package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: H9v.class */
public final class H9v {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ H9v[] A01;
    public static final H9v A02;
    public static final H9v A03;
    public static final H9v A04;

    static {
        H9v h9v = new H9v("WATCH_FEED", 0);
        A04 = h9v;
        H9v h9v2 = new H9v("FB_SHORTS", 1);
        A02 = h9v2;
        H9v h9v3 = new H9v("UNKOWN", 2);
        A03 = h9v3;
        H9v[] h9vArr = {h9v, h9v2, h9v3};
        A01 = h9vArr;
        A00 = C00t.A00(h9vArr);
    }

    public H9v(String str, int i) {
    }

    public static H9v valueOf(String str) {
        return (H9v) Enum.valueOf(H9v.class, str);
    }

    public static H9v[] values() {
        return (H9v[]) A01.clone();
    }
}
