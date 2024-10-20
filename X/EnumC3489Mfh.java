package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Mfh, reason: case insensitive filesystem */
/* loaded from: Mfh.class */
public final class EnumC3489Mfh {
    public static final /* synthetic */ EnumC3489Mfh[] A00;
    public static final EnumC3489Mfh A01;
    public final String serverValue;

    static {
        EnumC3489Mfh A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A01 = A002;
        EnumC3489Mfh A003 = A00("CHANGE_PIN_CONFIRM_NEW_PIN", 1);
        EnumC3489Mfh A004 = A00("CHANGE_PIN_CREATE_NEW_PIN", 2);
        EnumC3489Mfh A005 = A00("CHANGE_PIN_NEW_PIN_CREATED", 3);
        EnumC3489Mfh A006 = A00("CONFIRM_PIN", 4);
        EnumC3489Mfh A007 = A00("CONNECT_CVV_VERIFICATION", 5);
        EnumC3489Mfh A008 = A00("CONNECT_PAYPAL_VERIFICATION", 6);
        EnumC3489Mfh A009 = A00("CONNECT_PIN_VERIFICATION", 7);
        EnumC3489Mfh A0010 = A00("CONNECT_WITH_PIN_AUTH_FAILURE_CVV_FALLBACK", 8);
        EnumC3489Mfh A0011 = A00("CONNECT_WITH_PIN_AUTH_FAILURE_PAYPAL_FALLBACK", 9);
        EnumC3489Mfh A0012 = A00("CONNECT_WITH_PIN_AUTH_FAILURE_SDC_FALLBACK", 10);
        EnumC3489Mfh A0013 = A00("CREATE_BIO", 11);
        EnumC3489Mfh A0014 = A00("CREATE_PIN", 12);
        EnumC3489Mfh A0015 = A00("DISABLE_BIO_CONFORMATION", 13);
        EnumC3489Mfh A0016 = A00("DISABLE_PIN_CONFIRMATION", 14);
        EnumC3489Mfh A0017 = A00("FORGOT_PIN_RESET_WITH_PASSWORD", 15);
        EnumC3489Mfh A0018 = A00("LEAVE_WITHOUT_ENTERING_CVV_TO_CONNECT_DIALOG", 16);
        EnumC3489Mfh A0019 = A00("LEAVE_WITHOUT_ENTERING_PIN_TO_CONNECT_DIALOG", 17);
        EnumC3489Mfh A0020 = A00("LEAVE_WITHOUT_LOG_IN_PAYPAL_TO_CONNECT_DIALOG", 18);
        EnumC3489Mfh A0021 = A00("LEAVE_WITHOUT_RESETTING_PIN_CONFIRMATION", 19);
        EnumC3489Mfh A0022 = A00("PIN_CREATED", 20);
        EnumC3489Mfh A0023 = A00("PIN_VERIFY_TO_CHECKOUT", 21);
        EnumC3489Mfh A0024 = A00("RESET_CONFIRM_NEW_PIN", 22);
        EnumC3489Mfh A0025 = A00("RESET_CREATE_NEW_PIN", 23);
        EnumC3489Mfh A0026 = A00("RESET_NEW_PIN_CREATED", 24);
        EnumC3489Mfh A0027 = A00("RESET_PIN_WITH_PASSWORD", 25);
        EnumC3489Mfh A0028 = A00("SETUP_PIN_TO_CREATE_BIO_CONFIRMATION", 26);
        EnumC3489Mfh[] enumC3489MfhArr = new EnumC3489Mfh[35];
        System.arraycopy(new EnumC3489Mfh[]{A00("UNABLE_TO_CONNECT_CHECKOUT", 27), A00("UNABLE_TO_CONNECT_HUB", 28), A00("VERIFY_BIO_TO_DISABLE_BIO", 29), A00("VERIFY_BIO_TO_ENABLE_BIO", 30), A00("VERIFY_BIO_TO_PAY", 31), A00("VERIFY_PIN_HUB", 32), A00("VERIFY_PIN_TO_CHANGE_PIN", 33), A00("VERIFY_PIN_TO_PAY", 34)}, 1BK.A1W(new EnumC3489Mfh[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, enumC3489MfhArr) ? 1 : 0, enumC3489MfhArr, 27, 8);
        A00 = enumC3489MfhArr;
    }

    public EnumC3489Mfh(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static EnumC3489Mfh A00(String str, int i) {
        return new EnumC3489Mfh(str, i, str);
    }

    public static EnumC3489Mfh valueOf(String str) {
        return (EnumC3489Mfh) Enum.valueOf(EnumC3489Mfh.class, str);
    }

    public static EnumC3489Mfh[] values() {
        return (EnumC3489Mfh[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
