package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: BKw.class */
public final class BKw {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BKw[] A01;
    public static final BKw A02;
    public static final BKw A03;

    static {
        BKw bKw = new BKw("ALL", 0);
        A03 = bKw;
        BKw bKw2 = new BKw("ADMIN_ONLY", 1);
        A02 = bKw2;
        BKw[] bKwArr = {bKw, bKw2};
        A01 = bKwArr;
        A00 = C00t.A00(bKwArr);
    }

    public BKw(String str, int i) {
    }

    public static BKw valueOf(String str) {
        return (BKw) Enum.valueOf(BKw.class, str);
    }

    public static BKw[] values() {
        return (BKw[]) A01.clone();
    }
}
