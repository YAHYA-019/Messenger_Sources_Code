package X;

import java.util.LinkedHashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: BM1.class */
public final class BM1 {
    public static final java.util.Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ BM1[] A02;
    public static final BM1 A03;
    public static final BM1 A04;
    public static final BM1 A05;
    public final int status;

    static {
        BM1 bm1 = new BM1("PENDING", 0, 0);
        A04 = bm1;
        BM1 bm12 = new BM1("SUCCESS", 1, 1);
        A05 = bm12;
        BM1 bm13 = new BM1("FAILURE", 2, 2);
        A03 = bm13;
        BM1[] bm1Arr = {bm1, bm12, bm13};
        A02 = bm1Arr;
        A01 = C00t.A00(bm1Arr);
        BM1[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbL.A00(values.length));
        for (BM1 bm14 : values) {
            1BK.A1O(bm14, linkedHashMap, bm14.status);
        }
        A00 = linkedHashMap;
    }

    public BM1(String str, int i, int i2) {
        this.status = i2;
    }

    public static BM1 valueOf(String str) {
        return (BM1) Enum.valueOf(BM1.class, str);
    }

    public static BM1[] values() {
        return (BM1[]) A02.clone();
    }
}
