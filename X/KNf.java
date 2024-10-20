package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KNf.class */
public final class KNf {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KNf[] A01;
    public static final KNf A02;
    public static final KNf A03;
    public static final KNf A04;
    public final Number status;

    static {
        KNf kNf = new KNf(0, OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 0);
        A04 = kNf;
        KNf kNf2 = new KNf(1, "NOT_NORMALIZED", 1);
        A03 = kNf2;
        KNf kNf3 = new KNf(2, "NORMALIZED", 2);
        A02 = kNf3;
        KNf[] kNfArr = {kNf, kNf2, kNf3};
        A01 = kNfArr;
        A00 = C00t.A00(kNfArr);
    }

    public KNf(Number number, String str, int i) {
        this.status = number;
    }

    public static KNf valueOf(String str) {
        return (KNf) Enum.valueOf(KNf.class, str);
    }

    public static KNf[] values() {
        return (KNf[]) A01.clone();
    }
}
