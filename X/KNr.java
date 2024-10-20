package X;

import com.shopify.checkout.models.errors.VaultedPaymentErrorCode$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KNr.class */
public final class KNr {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ KNr[] A02;
    public static final KNr A03;
    public static final VaultedPaymentErrorCode$Companion Companion;
    public final String value;

    /* JADX WARN: Type inference failed for: r0v10, types: [com.shopify.checkout.models.errors.VaultedPaymentErrorCode$Companion, java.lang.Object] */
    static {
        KNr kNr = new KNr("InvalidSession", 0, "invalid_session");
        A03 = kNr;
        KNr[] kNrArr = {kNr, new KNr("InvalidPaymentInfo", 1, "invalid_payment_info")};
        A02 = kNrArr;
        A01 = C00t.A00(kNrArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M3G.A00);
    }

    public KNr(String str, int i, String str2) {
        this.value = str2;
    }

    public static KNr valueOf(String str) {
        return (KNr) Enum.valueOf(KNr.class, str);
    }

    public static KNr[] values() {
        return (KNr[]) A02.clone();
    }
}
