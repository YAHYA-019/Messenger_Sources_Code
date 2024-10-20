package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KNV.class */
public final class KNV {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KNV[] A01;
    public static final KNV A02;
    public final String typeName;

    static {
        KNV knv = new KNV("FACEBOOK", 0, "FACEBOOK");
        A02 = knv;
        KNV[] knvArr = {knv, new KNV("INSTAGRAM", 1, "INSTAGRAM")};
        A01 = knvArr;
        A00 = C00t.A00(knvArr);
    }

    public KNV(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static KNV valueOf(String str) {
        return (KNV) Enum.valueOf(KNV.class, str);
    }

    public static KNV[] values() {
        return (KNV[]) A01.clone();
    }
}
