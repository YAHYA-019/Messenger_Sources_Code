package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KNh.class */
public final class KNh {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KNh[] A01;
    public static final KNh A02;
    public static final KNh A03;
    public static final KNh A04;
    public final String value;

    static {
        KNh kNh = new KNh("BLOKS_SHELL_TEST", 0, "bloks_shell_test");
        A02 = kNh;
        KNh kNh2 = new KNh("PAYMENTS_AUTOFILL", 1, "payments_autofill");
        A04 = kNh2;
        KNh kNh3 = new KNh("ENCRYPTED_BACKUPS", 2, "encrypted_backups");
        A03 = kNh3;
        KNh[] kNhArr = {kNh, kNh2, kNh3};
        A01 = kNhArr;
        A00 = C00t.A00(kNhArr);
    }

    public KNh(String str, int i, String str2) {
        this.value = str2;
    }

    public static KNh valueOf(String str) {
        return (KNh) Enum.valueOf(KNh.class, str);
    }

    public static KNh[] values() {
        return (KNh[]) A01.clone();
    }
}
