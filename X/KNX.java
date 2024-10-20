package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KNX.class */
public final class KNX {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KNX[] A01;
    public static final KNX A02;
    public static final KNX A03;
    public final int status;

    static {
        KNX knx = new KNX("TIMESTAMP_UPDATED", 0, 0);
        A02 = knx;
        KNX knx2 = new KNX("VALIDATE_RECOVERY_CODE_FAILED", 1, 1);
        A03 = knx2;
        KNX[] knxArr = {knx, knx2};
        A01 = knxArr;
        A00 = C00t.A00(knxArr);
    }

    public KNX(String str, int i, int i2) {
        this.status = i2;
    }

    public static KNX valueOf(String str) {
        return (KNX) Enum.valueOf(KNX.class, str);
    }

    public static KNX[] values() {
        return (KNX[]) A01.clone();
    }
}
