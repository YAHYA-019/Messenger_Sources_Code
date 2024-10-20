package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: H9e.class */
public final class H9e {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ H9e[] A01;
    public static final H9e A02;
    public static final H9e A03;

    static {
        H9e h9e = new H9e("HIDDEN", 0);
        A03 = h9e;
        H9e h9e2 = new H9e("EXPANDED", 1);
        A02 = h9e2;
        H9e[] h9eArr = {h9e, h9e2};
        A01 = h9eArr;
        A00 = C00t.A00(h9eArr);
    }

    public H9e(String str, int i) {
    }

    public static H9e valueOf(String str) {
        return (H9e) Enum.valueOf(H9e.class, str);
    }

    public static H9e[] values() {
        return (H9e[]) A01.clone();
    }
}
