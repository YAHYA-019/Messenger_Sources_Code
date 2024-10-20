package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: H9z.class */
public final class H9z {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ H9z[] A01;
    public static final H9z A02;
    public static final H9z A03;
    public static final H9z A04;

    static {
        H9z h9z = new H9z("FULL_PICKER", 0);
        A03 = h9z;
        H9z h9z2 = new H9z("SINGLE_SECTION", 1);
        A04 = h9z2;
        H9z h9z3 = new H9z("FEATURED_SECTION", 2);
        A02 = h9z3;
        H9z[] h9zArr = {h9z, h9z2, h9z3};
        A01 = h9zArr;
        A00 = C00t.A00(h9zArr);
    }

    public H9z(String str, int i) {
    }

    public static H9z valueOf(String str) {
        return (H9z) Enum.valueOf(H9z.class, str);
    }

    public static H9z[] values() {
        return (H9z[]) A01.clone();
    }
}
