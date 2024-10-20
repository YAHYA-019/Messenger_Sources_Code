package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KN9.class */
public final class KN9 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KN9[] A01;
    public static final KN9 A02;
    public static final KN9 A03;
    public static final KN9 A04;
    public static final KN9 A05;
    public static final KN9 A06;
    public static final KN9 A07;

    static {
        KN9 kn9 = new KN9("A", 0);
        A02 = kn9;
        KN9 kn92 = new KN9("B", 1);
        A03 = kn92;
        KN9 kn93 = new KN9("C", 2);
        A04 = kn93;
        KN9 kn94 = new KN9("D", 3);
        A05 = kn94;
        KN9 kn95 = new KN9("E", 4);
        A07 = kn95;
        KN9 kn96 = new KN9("Drawable", 5);
        A06 = kn96;
        KN9[] kn9Arr = {kn9, kn92, kn93, kn94, kn95, kn96};
        A01 = kn9Arr;
        A00 = C00t.A00(kn9Arr);
    }

    public KN9(String str, int i) {
    }

    public static KN9 valueOf(String str) {
        return (KN9) Enum.valueOf(KN9.class, str);
    }

    public static KN9[] values() {
        return (KN9[]) A01.clone();
    }
}
