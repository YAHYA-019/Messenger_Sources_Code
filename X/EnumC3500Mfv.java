package X;

/* renamed from: X.Mfv, reason: case insensitive filesystem */
/* loaded from: Mfv.class */
public enum EnumC3500Mfv implements 0Eq {
    R_PENDING(1),
    R_PENDING_VERIFICATION(2),
    R_PENDING_VERIFICATION_PROCESSING(3),
    R_PENDING_MANUAL_REVIEW(4),
    R_CANCELED(5),
    R_CANCELED_SENDER_RISK(6),
    R_CANCELED_RECIPIENT_RISK(7),
    R_CANCELED_DECLINED(8),
    R_CANCELED_EXPIRED(9),
    R_CANCELED_SAME_CARD(10),
    R_CANCELED_CUSTOMER_SERVICE(11),
    R_CANCELED_CHARGEBACK(12),
    R_CANCELED_SYSTEM_FAIL(13),
    R_COMPLETED(14),
    R_PENDING_NUX(15),
    R_PENDING_PROCESSING(16),
    R_PENDING_PUSH_FAIL(17),
    /* JADX INFO: Fake field, exist only in values array */
    R_PENDING_PUSH_FAIL_CARD_EXPIRED(18);

    public static final java.util.Map A00 = AnonymousClass001.A0u();
    public final int value;

    static {
        for (EnumC3500Mfv enumC3500Mfv : values()) {
            A00.put(Integer.valueOf(enumC3500Mfv.value), enumC3500Mfv);
        }
    }

    EnumC3500Mfv(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
