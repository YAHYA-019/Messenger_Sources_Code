package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KNb.class */
public final class KNb {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KNb[] A01;
    public static final KNb A02;
    public static final KNb A03;
    public final Kzt DEFAULT_SPRING_CONFIG;

    static {
        KNb kNb = new KNb("PAGING", 40.0d, 0);
        A02 = kNb;
        KNb kNb2 = new KNb("WHEEL_OF_FORTUNE", 30.0d, 1);
        A03 = kNb2;
        KNb[] kNbArr = {kNb, kNb2};
        A01 = kNbArr;
        A00 = C00t.A00(kNbArr);
    }

    public KNb(String str, double d, int i) {
        this.DEFAULT_SPRING_CONFIG = Kzt.A00(d, 9.2d);
    }

    public static KNb valueOf(String str) {
        return (KNb) Enum.valueOf(KNb.class, str);
    }

    public static KNb[] values() {
        return (KNb[]) A01.clone();
    }
}
