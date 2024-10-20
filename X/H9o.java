package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: H9o.class */
public final class H9o {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ H9o[] A01;
    public static final H9o A02;
    public static final H9o A03;

    static {
        H9o h9o = new H9o("DELETE", 0);
        A02 = h9o;
        H9o h9o2 = new H9o("RESTART", 1);
        A03 = h9o2;
        H9o[] h9oArr = {h9o, h9o2};
        A01 = h9oArr;
        A00 = C00t.A00(h9oArr);
    }

    public H9o(String str, int i) {
    }

    public static H9o valueOf(String str) {
        return (H9o) Enum.valueOf(H9o.class, str);
    }

    public static H9o[] values() {
        return (H9o[]) A01.clone();
    }
}
