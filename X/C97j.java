package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.97j, reason: invalid class name */
/* loaded from: 97j.class */
public final class C97j {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C97j[] A01;
    public static final C97j A0D;
    public final String key = toString();
    public static final C97j A0k = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
    public static final C97j A0i = A00("TOGGLE_ON_BACKUP", 1);
    public static final C97j A0H = A00("GENERATE_NEW_ACCESS_CODE", 2);
    public static final C97j A0h = A00("START_SETUP_BACKUP", 3);
    public static final C97j A03 = A00("BACK_TO_INTRODUCTION", 4);
    public static final C97j A0C = A00("DONE_BACKUP", 5);
    public static final C97j A0j = A00("TOGGLE_ON_RESTORE", 6);
    public static final C97j A0G = A00("ENTER_PIN_RESTORE", 7);
    public static final C97j A0E = A00("DONE_RESTORE", 8);
    public static final C97j A0N = A00("SKIP_RESTORE", 9);
    public static final C97j A06 = A00("CANCEL_SETUP_BACKUP", 10);
    public static final C97j A07 = A00("CANCEL_SETUP_RESTORE", 11);
    public static final C97j A05 = A00("CANCEL_CONFIRM_PIN", 12);
    public static final C97j A0B = A00("DEVICE_ONBOARDED", 13);
    public static final C97j A08 = A00("CAN_NOT_RESET_PIN", 14);
    public static final C97j A0F = A00("END_OF_ROAD_OTHER_OPTIONS", 15);
    public static final C97j A09 = A00("CAN_NOT_RESET_RECOVERY_CODE", 16);
    public static final C97j A04 = A00("BACK_TO_RESET_YOUR_PIN_CODE", 17);
    public static final C97j A0b = A00("START_PIN_SETUP", 18);
    public static final C97j A0R = A00("START_ADVANCED_SETUP_WITH_PIN_PRE_SELECTED", 19);
    public static final C97j A0Q = A00("START_ADVANCED_SETUP_WITH_GDRIVE_PRE_SELECTED", 20);
    public static final C97j A0U = A00("START_GDRIVE_SETUP", 21);
    public static final C97j A0X = A00("START_MORE_OPTIONS_RESTORE", 22);
    public static final C97j A0m = A00("USER_OPT_OUT_SETUP", 23);
    public static final C97j A0l = A00("USER_OPT_OUT_RESTORE", 24);
    public static final C97j A0O = A00("SKIP_SETUP", 25);
    public static final C97j A0P = A00("SKIP_SETUP_WITH_ERROR", 26);
    public static final C97j A02 = A00("ASYNC_PIN_STARTED", 27);
    public static final C97j A0a = A00("START_PIN_RESTORE", 28);
    public static final C97j A0Y = A00("START_OTC_RESTORE", 29);
    public static final C97j A0e = A00("START_RC_RESTORE", 30);
    public static final C97j A0T = A00("START_GDRIVE_RESTORE", 31);
    public static final C97j A0Z = A00("START_PASSKEY_RESTORE", 32);
    public static final C97j A0f = A00("START_RESET_INVALID_PIN", 33);
    public static final C97j A0W = A00("START_HSM_MIGRATION_SETUP", 34);
    public static final C97j A0V = A00("START_HSM_MIGRATION_RESTORE", 35);
    public static final C97j A0g = A00("START_RESTORE_FOR_INVALID_PIN_RESET", 36);
    public static final C97j A0M = A00("PASSKEY_UPSELL", 37);
    public static final C97j A0A = A00("DEFAULT_EB_UPSELL", 38);
    public static final C97j A0K = A00("MESSAGE_EXPIRATION_HARDBLOCK", 39);
    public static final C97j A0I = A00("HSM_MIGRATION_HARDBLOCK", 40);
    public static final C97j A0J = A00("INVALID_PIN_RESET_HARDBLOCK", 41);
    public static final C97j A0L = A00("OPEN_OPTOUT_SETTING", 42);
    public static final C97j A0S = A00("START_EMPLOYEE_RC_MIGRATION", 43);
    public static final C97j A0c = A00("START_RC_MIGRATION", 44);
    public static final C97j A0d = A00("START_RC_MIGRATION_CONFIRM", 45);

    static {
        C97j A002 = A00("DONE_RC_MIGRATION_CONFIRM", 46);
        A0D = A002;
        C97j[] c97jArr = new C97j[47];
        System.arraycopy(new C97j[]{A02, A0a, A0Y, A0e, A0T, A0Z, A0f, A0W, A0V, A0g, A0M, A0A, A0K, A0I, A0J, A0L, A0S, A0c, A0d, A002}, 1BK.A1W(new C97j[]{A0k, A0i, A0H, A0h, A03, A0C, A0j, A0G, A0E, A0N, A06, A07, A05, A0B, A08, A0F, A09, A04, A0b, A0R, A0Q, A0U, A0X, A0m, A0l, A0O, A0P}, c97jArr) ? 1 : 0, c97jArr, 27, 20);
        A01 = c97jArr;
        A00 = C00t.A00(c97jArr);
    }

    public C97j(String str, int i) {
    }

    public static C97j A00(String str, int i) {
        return new C97j(str, i);
    }

    public static C97j valueOf(String str) {
        return (C97j) Enum.valueOf(C97j.class, str);
    }

    public static C97j[] values() {
        return (C97j[]) A01.clone();
    }
}
