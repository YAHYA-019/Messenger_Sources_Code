package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: H9s.class */
public final class H9s {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ H9s[] A01;
    public static final H9s A02;
    public static final H9s A03;
    public static final H9s A04;

    static {
        H9s h9s = new H9s("ACCEPTED", 0);
        A02 = h9s;
        H9s h9s2 = new H9s("DECLINED", 1);
        A04 = h9s2;
        H9s h9s3 = new H9s("CANCELLED", 2);
        A03 = h9s3;
        H9s[] h9sArr = {h9s, h9s2, h9s3};
        A01 = h9sArr;
        A00 = C00t.A00(h9sArr);
    }

    public H9s(String str, int i) {
    }

    public static H9s valueOf(String str) {
        return (H9s) Enum.valueOf(H9s.class, str);
    }

    public static H9s[] values() {
        return (H9s[]) A01.clone();
    }
}
