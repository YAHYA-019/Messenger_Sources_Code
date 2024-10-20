package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KO9.class */
public final class KO9 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KO9[] A01;
    public static final KO9 A02;
    public static final KO9 A03;
    public static final KO9 A04;
    public static final KO9 A05;
    public static final KO9 A06;
    public static final KO9 A07;
    public static final KO9 A08;
    public static final KO9 A09;
    public static final KO9 A0A;
    public static final KO9 A0B;
    public static final KO9 A0C;
    public static final KO9 A0D;
    public static final KO9 A0E;
    public static final KO9 A0F;
    public static final KO9 A0G;
    public static final KO9 A0H;
    public static final KO9 A0I;
    public final int value;

    static {
        KO9 ko9 = new KO9(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 0, 0);
        A0I = ko9;
        KO9 ko92 = new KO9("INTERNAL", 1, 1);
        A0A = ko92;
        KO9 ko93 = new KO9("ACCESS_DENIED", 2, 2);
        A02 = ko93;
        KO9 ko94 = new KO9("ACCOUNT_NOT_FOUND", 3, 3);
        A06 = ko94;
        KO9 ko95 = new KO9("MALFORMED_INPUT", 4, 4);
        A0F = ko95;
        KO9 ko96 = new KO9("REGISTRATION_NOT_IN_PROGRESS", 5, 5);
        A0G = ko96;
        KO9 ko97 = new KO9("LOGIN_NOT_IN_PROGRESS", 6, 6);
        A0D = ko97;
        KO9 ko98 = new KO9("ACCOUNT_DELETED", 7, 7);
        A04 = ko98;
        KO9 ko99 = new KO9("INCOMPLETE_REGISTRATION", 8, 8);
        A09 = ko99;
        KO9 ko910 = new KO9("ACCOUNT_ALREADY_REGISTERED", 9, 9);
        A03 = ko910;
        KO9 ko911 = new KO9("LOGIN_ATTEMPTS_EXHAUSTED", 10, 10);
        A0C = ko911;
        KO9 ko912 = new KO9("LOGIN_RATE_LIMITED", 11, 11);
        A0E = ko912;
        KO9 ko913 = new KO9("INTERNAL_NON_RETRYABLE", 12, 12);
        A0B = ko913;
        KO9 ko914 = new KO9("ACCOUNT_MIGRATED", 13, 13);
        A05 = ko914;
        KO9 ko915 = new KO9("REQUEST_IN_PROGRESS", 14, 14);
        A0H = ko915;
        KO9 ko916 = new KO9("GET_USERS_PENDING_FLEET_MIGRATION_RATE_LIMITED", 15, 15);
        A07 = ko916;
        KO9 ko917 = new KO9("INCOMPATIBLE_API_VERSION", 16, 16);
        A08 = ko917;
        KO9[] ko9Arr = {ko9, ko92, ko93, ko94, ko95, ko96, ko97, ko98, ko99, ko910, ko911, ko912, ko913, ko914, ko915, ko916, ko917, new KO9("SERVICE_OVERLOADED", 17, 17)};
        A01 = ko9Arr;
        A00 = C00t.A00(ko9Arr);
    }

    public KO9(String str, int i, int i2) {
        this.value = i2;
    }

    public static KO9 valueOf(String str) {
        return (KO9) Enum.valueOf(KO9.class, str);
    }

    public static KO9[] values() {
        return (KO9[]) A01.clone();
    }
}
