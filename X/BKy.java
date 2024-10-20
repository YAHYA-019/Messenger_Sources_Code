package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: BKy.class */
public final class BKy {
    public static final BKy[] A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ BKy[] A02;
    public static final BKy A03;

    static {
        BKy bKy = new BKy();
        A03 = bKy;
        BKy[] bKyArr = {bKy};
        A02 = bKyArr;
        C00u A002 = C00t.A00(bKyArr);
        A01 = A002;
        A00 = (BKy[]) A002.toArray(new BKy[0]);
    }

    public static BKy valueOf(String str) {
        return (BKy) Enum.valueOf(BKy.class, str);
    }

    public static BKy[] values() {
        return (BKy[]) A02.clone();
    }
}
