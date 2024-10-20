package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KNt.class */
public final class KNt {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KNt[] A01;
    public static final KNt A02;
    public static final KNt A03;
    public static final KNt A04;
    public static final KNt A05;
    public final Number value;

    static {
        KNt kNt = new KNt(0, "MESSENGER_ENCRYPTED_BACKUP", 0);
        A05 = kNt;
        KNt kNt2 = new KNt(1, "FBLITE_ENCRYPTED_BACKUP", 1);
        A03 = kNt2;
        KNt kNt3 = new KNt(2, "FBAPP_ENCRYPTED_BACKUP", 2);
        A02 = kNt3;
        KNt kNt4 = new KNt(3, "IGD_ENCRYPTED_BACKUP", 3);
        A04 = kNt4;
        KNt[] kNtArr = {kNt, kNt2, kNt3, kNt4, new KNt(4, "AR_MESSENGER_ENCRYPTED_BACKUP", 4)};
        A01 = kNtArr;
        A00 = C00t.A00(kNtArr);
    }

    public KNt(Number number, String str, int i) {
        this.value = number;
    }

    public static KNt valueOf(String str) {
        return (KNt) Enum.valueOf(KNt.class, str);
    }

    public static KNt[] values() {
        return (KNt[]) A01.clone();
    }
}
