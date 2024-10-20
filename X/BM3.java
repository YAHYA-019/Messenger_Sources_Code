package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: BM3.class */
public final class BM3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BM3[] A01;
    public static final BM3 A02;
    public static final BM3 A03;
    public static final BM3 A04;
    public static final BM3 A05;
    public final int valueForMailbox;

    static {
        BM3 bm3 = new BM3("ALL_MEMBERS", 0, 0);
        A03 = bm3;
        BM3 bm32 = new BM3("ADMINS", 1, 1);
        A02 = bm32;
        BM3 bm33 = new BM3("MODERATORS", 2, 2);
        A05 = bm33;
        BM3 bm34 = new BM3("CHAT_CAPTAINS", 3, 3);
        A04 = bm34;
        BM3[] bm3Arr = {bm3, bm32, bm33, bm34};
        A01 = bm3Arr;
        A00 = C00t.A00(bm3Arr);
    }

    public BM3(String str, int i, int i2) {
        this.valueForMailbox = i2;
    }

    public static BM3 valueOf(String str) {
        return (BM3) Enum.valueOf(BM3.class, str);
    }

    public static BM3[] values() {
        return (BM3[]) A01.clone();
    }
}
