package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: H9u.class */
public final class H9u {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ H9u[] A01;
    public static final H9u A02;
    public static final H9u A03;
    public static final H9u A04;

    static {
        H9u h9u = new H9u("MEMORY", 0);
        A03 = h9u;
        H9u h9u2 = new H9u("NETWORK", 1);
        A04 = h9u2;
        H9u h9u3 = new H9u("DISK", 2);
        A02 = h9u3;
        H9u[] h9uArr = {h9u, h9u2, h9u3};
        A01 = h9uArr;
        A00 = C00t.A00(h9uArr);
    }

    public H9u(String str, int i) {
    }

    public static H9u valueOf(String str) {
        return (H9u) Enum.valueOf(H9u.class, str);
    }

    public static H9u[] values() {
        return (H9u[]) A01.clone();
    }
}
