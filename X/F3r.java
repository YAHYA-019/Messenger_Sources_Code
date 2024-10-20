package X;

/* loaded from: F3r.class */
public abstract class F3r {
    public static final java.util.Map A00;
    public static final java.util.Map A01;

    static {
        Integer A11 = AbG.A11();
        03Y A002 = A00(A11, "BILLING_UNAVAILABLE", "Billing API version is not supported for the type requested");
        Integer A0k = 4YU.A0k();
        03Y A003 = A00(5, "DEVELOPER_ERROR", "Invalid arguments provided to the API");
        Integer A0i = 7zN.A0i();
        03Y A004 = A00(6, "ERROR", "Fatal error during the API action");
        03Y A005 = A00(-2, "FEATURE_NOT_SUPPORTED", "Requested feature is not supported by Play Store on the current device");
        03Y A006 = A00(7, "ITEM_ALREADY_OWNED", "Failure to purchase since item is already owned");
        03Y A007 = A00(8, "ITEM_NOT_OWNED", "Failure to consume since item is not owned");
        03Y A008 = A00(4, "ITEM_UNAVAILABLE", "Requested product is not available for purchase");
        03Y A009 = A00(A0k, "OK", "Success");
        Integer A0h = 7zN.A0h();
        A01 = 04R.A09(new 03Y[]{A002, A003, A004, A005, A006, A007, A008, A009, A00(A0h, "SERVICE_DISCONNECTED", "Play Store service is not connected now - potentially transient state"), A00(2, "SERVICE_UNAVAILABLE", "The service is currently unavailable"), A00(A0i, "USER_CANCELED", "User pressed back or canceled a dialog"), A00(12, "NETWORK_ERROR", "Network connection is down")});
        A00 = 04R.A09(new 03Y[]{A00(A11, "BILLING_UNAVAILABLE", "Billing API version is not supported for the type requested"), A00(5, "DEVELOPER_ERROR", "Invalid arguments provided to the API"), A00(6, "ERROR", "Fatal error during the API action"), A00(-2, "FEATURE_NOT_SUPPORTED", "Requested feature is not supported by Play Store on the current device"), A00(7, "ITEM_ALREADY_OWNED", "Failure to purchase since item is already owned"), A00(8, "ITEM_NOT_OWNED", "Failure to consume since item is not owned"), A00(4, "ITEM_UNAVAILABLE", "Requested product is not available for purchase"), A00(A0k, "OK", "Success"), A00(A0h, "SERVICE_DISCONNECTED", "Play Store service is not connected now - potentially transient state"), A00(2, "SERVICE_TIMEOUT", "The request has reached the maximum timeout before Google Play responds"), A00(A0i, "USER_CANCELED", "User pressed back or canceled a dialog"), A00(12, "SERVICE_UNAVAILABLE", "Network connection is down")});
    }

    public static 03Y A00(Object obj, String str, String str2) {
        return new 03Y(obj, new Eix(str, str2));
    }
}
