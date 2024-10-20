package X;

/* renamed from: X.Mfw, reason: case insensitive filesystem */
/* loaded from: Mfw.class */
public enum EnumC3501Mfw implements 0Eq {
    S_PENDING(1),
    S_PENDING_VERIFICATION(2),
    S_PENDING_VERIFICATION_PROCESSING(3),
    S_PENDING_MANUAL_REVIEW(4),
    S_CANCELED(5),
    S_CANCELED_SENDER_RISK(6),
    S_CANCELED_RECIPIENT_RISK(7),
    S_CANCELED_DECLINED(8),
    S_CANCELED_EXPIRED(9),
    S_CANCELED_SAME_CARD(10),
    S_CANCELED_CUSTOMER_SERVICE(11),
    S_CANCELED_CHARGEBACK(12),
    S_CANCELED_SYSTEM_FAIL(13),
    S_COMPLETED(14),
    S_SENT(15);

    public final int value;

    EnumC3501Mfw(int i) {
        this.value = i;
    }

    public static EnumC3501Mfw A00(int i) {
        switch (i) {
            case 1:
                return S_PENDING;
            case 2:
                return S_PENDING_VERIFICATION;
            case 3:
                return S_PENDING_VERIFICATION_PROCESSING;
            case 4:
                return S_PENDING_MANUAL_REVIEW;
            case 5:
                return S_CANCELED;
            case 6:
                return S_CANCELED_SENDER_RISK;
            case 7:
                return S_CANCELED_RECIPIENT_RISK;
            case 8:
                return S_CANCELED_DECLINED;
            case 9:
                return S_CANCELED_EXPIRED;
            case 10:
                return S_CANCELED_SAME_CARD;
            case 11:
                return S_CANCELED_CUSTOMER_SERVICE;
            case 12:
                return S_CANCELED_CHARGEBACK;
            case 13:
                return S_CANCELED_SYSTEM_FAIL;
            case 14:
                return S_COMPLETED;
            case 15:
                return S_SENT;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
