package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KN0.class */
public final class KN0 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KN0[] A01;
    public static final KN0 A02;
    public static final KN0 A03;
    public static final KN0 A04;
    public static final KN0 A05;

    static {
        KN0 kn0 = new KN0("NONE", 0);
        A04 = kn0;
        KN0 kn02 = new KN0("EDIT", 1);
        A03 = kn02;
        KN0 kn03 = new KN0("SELECT", 2);
        A05 = kn03;
        KN0 kn04 = new KN0("ALWAYS_SELECT", 3);
        A02 = kn04;
        KN0[] kn0Arr = {kn0, kn02, kn03, kn04};
        A01 = kn0Arr;
        A00 = C00t.A00(kn0Arr);
    }

    public KN0(String str, int i) {
    }

    public static KN0 valueOf(String str) {
        return (KN0) Enum.valueOf(KN0.class, str);
    }

    public static KN0[] values() {
        return (KN0[]) A01.clone();
    }
}
