package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: H9g.class */
public final class H9g {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ H9g[] A01;
    public static final H9g A02;
    public static final H9g A03;

    static {
        H9g h9g = new H9g("SHOW_UI", 0);
        A03 = h9g;
        H9g h9g2 = new H9g("INCOMING_CALL", 1);
        A02 = h9g2;
        H9g[] h9gArr = {h9g, h9g2};
        A01 = h9gArr;
        A00 = C00t.A00(h9gArr);
    }

    public H9g(String str, int i) {
    }

    public static H9g valueOf(String str) {
        return (H9g) Enum.valueOf(H9g.class, str);
    }

    public static H9g[] values() {
        return (H9g[]) A01.clone();
    }
}
