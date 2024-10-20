package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: H9h.class */
public final class H9h {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ H9h[] A01;
    public static final H9h A02;
    public static final H9h A03;

    static {
        H9h h9h = new H9h("CALL_STARTED", 0);
        A03 = h9h;
        H9h h9h2 = new H9h("CALL_ABORTED", 1);
        A02 = h9h2;
        H9h[] h9hArr = {h9h, h9h2};
        A01 = h9hArr;
        A00 = C00t.A00(h9hArr);
    }

    public H9h(String str, int i) {
    }

    public static H9h valueOf(String str) {
        return (H9h) Enum.valueOf(H9h.class, str);
    }

    public static H9h[] values() {
        return (H9h[]) A01.clone();
    }
}
