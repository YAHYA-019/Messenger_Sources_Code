package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KNa.class */
public final class KNa {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KNa[] A01;
    public static final KNa A02;
    public static final KNa A03;
    public final int type;

    static {
        KNa kNa = new KNa("CONNECTED", 0, 1);
        A02 = kNa;
        KNa kNa2 = new KNa("DISCONNECTED", 1, 2);
        A03 = kNa2;
        KNa[] kNaArr = {kNa, kNa2};
        A01 = kNaArr;
        A00 = C00t.A00(kNaArr);
    }

    public KNa(String str, int i, int i2) {
        this.type = i2;
    }

    public static KNa valueOf(String str) {
        return (KNa) Enum.valueOf(KNa.class, str);
    }

    public static KNa[] values() {
        return (KNa[]) A01.clone();
    }
}
