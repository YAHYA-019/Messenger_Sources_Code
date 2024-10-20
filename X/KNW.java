package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KNW.class */
public final class KNW {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KNW[] A01;
    public static final KNW A02;
    public final int styleType;

    static {
        KNW knw = new KNW("DISCLAIMER_PUX", 0, 6);
        A02 = knw;
        KNW[] knwArr = {knw, new KNW("DISCLAIMER_NUX", 1, 7)};
        A01 = knwArr;
        A00 = C00t.A00(knwArr);
    }

    public KNW(String str, int i, int i2) {
        this.styleType = i2;
    }

    public static KNW valueOf(String str) {
        return (KNW) Enum.valueOf(KNW.class, str);
    }

    public static KNW[] values() {
        return (KNW[]) A01.clone();
    }
}
