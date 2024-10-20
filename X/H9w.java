package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: H9w.class */
public final class H9w {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ H9w[] A01;
    public static final H9w A02;
    public static final H9w A03;
    public static final H9w A04;

    static {
        H9w h9w = new H9w("ALCHEMIST", 0);
        A02 = h9w;
        H9w h9w2 = new H9w("MOZJPEG", 1);
        A03 = h9w2;
        H9w h9w3 = new H9w("PLATFORM", 2);
        A04 = h9w3;
        H9w[] h9wArr = {h9w, h9w2, h9w3, new H9w("TURBO", 3)};
        A01 = h9wArr;
        A00 = C00t.A00(h9wArr);
    }

    public H9w(String str, int i) {
    }

    public static H9w valueOf(String str) {
        return (H9w) Enum.valueOf(H9w.class, str);
    }

    public static H9w[] values() {
        return (H9w[]) A01.clone();
    }
}
