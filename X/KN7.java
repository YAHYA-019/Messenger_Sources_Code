package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KN7.class */
public final class KN7 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KN7[] A01;
    public static final KN7 A02;
    public static final KN7 A03;
    public static final KN7 A04;
    public static final KN7 A05;
    public static final KN7 A06;
    public static final KN7 A07;

    static {
        KN7 kn7 = new KN7("ON_DOM_LOADED", 0);
        A03 = kn7;
        KN7 kn72 = new KN7("ON_PAGE_INTERACTIVE", 1);
        A06 = kn72;
        KN7 kn73 = new KN7("ON_PAGE_FINISHED", 2);
        A05 = kn73;
        KN7 kn74 = new KN7("ON_PAUSE", 3);
        A07 = kn74;
        KN7 kn75 = new KN7("ON_LARGEST_CONTENTFUL_PAINT", 4);
        A04 = kn75;
        KN7 kn76 = new KN7("ON_BROWSER_CLOSE", 5);
        A02 = kn76;
        KN7[] kn7Arr = {kn7, kn72, kn73, kn74, kn75, kn76};
        A01 = kn7Arr;
        A00 = C00t.A00(kn7Arr);
    }

    public KN7(String str, int i) {
    }

    public static KN7 valueOf(String str) {
        return (KN7) Enum.valueOf(KN7.class, str);
    }

    public static KN7[] values() {
        return (KN7[]) A01.clone();
    }
}
