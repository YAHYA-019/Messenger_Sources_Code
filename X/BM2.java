package X;

import java.util.LinkedHashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: BM2.class */
public final class BM2 {
    public static final java.util.Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ BM2[] A02;
    public static final BM2 A03;
    public static final BM2 A04;
    public static final BM2 A05;
    public final int status;

    static {
        BM2 bm2 = new BM2("PENDING", 0, 0);
        A04 = bm2;
        BM2 bm22 = new BM2("SUCCESS", 1, 1);
        A05 = bm22;
        BM2 bm23 = new BM2("FAILURE", 2, 2);
        A03 = bm23;
        BM2[] bm2Arr = {bm2, bm22, bm23};
        A02 = bm2Arr;
        A01 = C00t.A00(bm2Arr);
        BM2[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbL.A00(values.length));
        for (BM2 bm24 : values) {
            1BK.A1O(bm24, linkedHashMap, bm24.status);
        }
        A00 = linkedHashMap;
    }

    public BM2(String str, int i, int i2) {
        this.status = i2;
    }

    public static BM2 valueOf(String str) {
        return (BM2) Enum.valueOf(BM2.class, str);
    }

    public static BM2[] values() {
        return (BM2[]) A02.clone();
    }
}
