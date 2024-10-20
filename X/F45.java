package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* loaded from: F45.class */
public abstract class F45 {
    public static final List A00;
    public static final List A01;
    public static final List A02;
    public static final List A03;
    public static final List A04;
    public static final C67c A05;
    public static final C67c A06;
    public static final C67c A07;
    public static final C67c A08;
    public static final C67c A09;
    public static final C67c A0A;
    public static final C67c A0B;
    public static final C67c A0C;
    public static final C67c A0D;
    public static final C67c A0E;
    public static final C67c A0F;
    public static final C67c A0G;
    public static final C67c A0H;
    public static final C67c A0I;
    public static final C67c A0J;
    public static final C67c A0K;
    public static final C67c A0L;
    public static final C67c A0M;
    public static final C67c A0N;
    public static final C67c A0O;
    public static final C67c A0P;
    public static final C67c A0Q;
    public static final C67c A0R;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v110, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v127, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v133, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v139, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v147, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v155, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v162, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v170, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v179, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v189, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v198, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v49, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v58, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v67, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v75, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v85, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v90, types: [X.67c] */
    /* JADX WARN: Type inference failed for: r0v99, types: [X.67c] */
    static {
        final 6QD r0 = new 6QD("user_values", "name='active_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"});
        final 67T r02 = 67T.A01;
        final 02C r03 = C02D.A0d;
        final String str = "content://com.facebook.katana.provider.FirstPartyUserValuesProvider/user_values";
        final String str2 = "com.facebook.katana";
        ?? r04 = new C67d(r03, str, str2, r0, r02) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str, str2, r0, r02);
                11T.A0F(r03, 5);
            }
        };
        A0B = r04;
        final 6QD A002 = A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value", "user_values", "name='active_session_info'");
        final String str3 = "com.facebook.wakizashi";
        final String str4 = "content://com.facebook.wakizashi.provider.FirstPartyUserValuesProvider/user_values";
        ?? r05 = new C67d(r03, str4, str3, A002, r02) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str4, str3, A002, r02);
                11T.A0F(r03, 5);
            }
        };
        A06 = r05;
        final 6QD A003 = A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value", "user_values", "name='active_session_info'");
        final 67T r06 = 67T.A03;
        final String str5 = "content://com.facebook.lite.provider.UserValuesProvider/user_values";
        final String str6 = "com.facebook.lite";
        ?? r07 = new C67d(r03, str5, str6, A003, r06) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str5, str6, A003, r06);
                11T.A0F(r03, 5);
            }
        };
        A09 = r07;
        final 6QD A004 = A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value", "user_values", "name='active_session_info'");
        final 67T r08 = 67T.A06;
        final String str7 = "content://com.facebook.orca.provider.FamilyAppsUserValuesProvider/user_values";
        final String str8 = "com.facebook.orca";
        ?? r09 = new C67d(r03, str7, str8, A004, r08) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str7, str8, A004, r08);
                11T.A0F(r03, 5);
            }
        };
        A0K = r09;
        final 6QD r010 = new 6QD((String) null, (String) null, new String[0]);
        final 67T r011 = 67T.A04;
        final 02C r012 = C02D.A0m;
        final String str9 = "content://com.instagram.contentprovider.FamilyAppsUserValuesProvider";
        final String str10 = "com.instagram.android";
        ?? r013 = new C67d(r012, str9, str10, r010, r011) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r012, str9, str10, r010, r011);
                11T.A0F(r012, 5);
            }
        };
        A0I = r013;
        final 6QD r014 = new 6QD("user_values", "name='active_session_info'", new String[0]);
        final 67T r015 = 67T.A0C;
        final 02C r016 = C02D.A0u;
        final String str11 = "content://com.oculus.twilight.contentprovider.FamilyAppsUserValuesProvider/user_values";
        final String str12 = "com.oculus.twilight";
        ?? r017 = new C67d(r016, str11, str12, r014, r015) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r016, str11, str12, r014, r015);
                11T.A0F(r016, 5);
            }
        };
        A0R = r017;
        final 6QD r018 = new 6QD((String) null, "all_session_info", new String[0]);
        ?? r019 = new C67d(r012, str9, str10, r018, r011) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r012, str9, str10, r018, r011);
                11T.A0F(r012, 5);
            }
        };
        A0H = r019;
        final 6QD r020 = new 6QD("user_values", "name='all_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"});
        final String str13 = "content://com.facebook.katana.provider.UserValuesProvider/user_values";
        ?? r021 = new C67d(r03, str13, str2, r020, r02) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str13, str2, r020, r02);
                11T.A0F(r03, 5);
            }
        };
        A0A = r021;
        final 6QD A005 = A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value", "user_values", "name='all_session_info'");
        final String str14 = "content://com.facebook.wakizashi.provider.UserValuesProvider/user_values";
        ?? r022 = new C67d(r03, str14, str3, A005, r02) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str14, str3, A005, r02);
                11T.A0F(r03, 5);
            }
        };
        A05 = r022;
        final 6QD A006 = A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value", "user_values", "name='all_session_info'");
        ?? r023 = new C67d(r03, str7, str8, A006, r08) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str7, str8, A006, r08);
                11T.A0F(r03, 5);
            }
        };
        A0N = r023;
        final 6QD r024 = new 6QD((String) null, "name='saved_session_info'", new String[0]);
        ?? r025 = new C67d(r012, str9, str10, r024, r011) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r012, str9, str10, r024, r011);
                11T.A0F(r012, 5);
            }
        };
        A0J = r025;
        final 6QD A007 = A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value", "user_values", "name='saved_session_info'");
        ?? r026 = new C67d(r03, str7, str8, A007, r08) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str7, str8, A007, r08);
                11T.A0F(r03, 5);
            }
        };
        A0O = r026;
        final 6QD A008 = A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value", "user_values", "name='saved_session_info'");
        ?? r027 = new C67d(r03, str, str2, A008, r02) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str, str2, A008, r02);
                11T.A0F(r03, 5);
            }
        };
        A0E = r027;
        final 6QD r028 = new 6QD("device_values", "device_id_value", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID, "timestamp"});
        final String str15 = "content://com.facebook.katana.provider.FirstPartyUserValuesProvider/device_values";
        ?? r029 = new C67d(r03, str15, str2, r028, r02) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str15, str2, r028, r02);
                11T.A0F(r03, 5);
            }
        };
        A0C = r029;
        final 6QD A009 = A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "timestamp", "device_values", "device_id_value");
        final String str16 = "content://com.facebook.wakizashi.provider.FirstPartyUserValuesProvider/device_values";
        ?? r030 = new C67d(r03, str16, str3, A009, r02) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str16, str3, A009, r02);
                11T.A0F(r03, 5);
            }
        };
        A07 = r030;
        final 6QD A0010 = A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "timestamp", "device_values", "device_id_value");
        final String str17 = "content://com.facebook.orca.provider.FamilyAppsUserValuesProvider/device_values";
        ?? r031 = new C67d(r03, str17, str8, A0010, r08) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str17, str8, A0010, r08);
                11T.A0F(r03, 5);
            }
        };
        A0L = r031;
        final 6QD r032 = new 6QD((String) null, "device_id_value", new String[0]);
        ?? r033 = new C67d(r012, str9, str10, r032, r011) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r012, str9, str10, r032, r011);
                11T.A0F(r012, 5);
            }
        };
        A0F = r033;
        final 6QD r034 = new 6QD("device_values", "machine_id_value", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID});
        ?? r035 = new C67d(r03, str15, str2, r034, r02) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str15, str2, r034, r02);
                11T.A0F(r03, 5);
            }
        };
        A0D = r035;
        final 6QD r036 = new 6QD("device_values", "machine_id_value", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID});
        ?? r037 = new C67d(r03, str16, str3, r036, r02) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str16, str3, r036, r02);
                11T.A0F(r03, 5);
            }
        };
        A08 = r037;
        final 6QD r038 = new 6QD("device_values", "machine_id_value", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID});
        ?? r039 = new C67d(r03, str17, str8, r038, r08) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r03, str17, str8, r038, r08);
                11T.A0F(r03, 5);
            }
        };
        A0M = r039;
        final 6QD r040 = new 6QD((String) null, "machine_id_value", new String[0]);
        ?? r041 = new C67d(r012, str9, str10, r040, r011) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r012, str9, str10, r040, r011);
                11T.A0F(r012, 5);
            }
        };
        A0G = r041;
        final 6QD r042 = new 6QD("user_values", "name='active_session_info'", new String[0]);
        final 67T r043 = 67T.A09;
        final 02C r044 = C02D.A1f;
        final String str18 = "content://com.facebook.stella.access.contentprovider.FamilyAppsUserValuesProvider/user_values";
        final String str19 = "com.facebook.stella";
        ?? r045 = new C67d(r044, str18, str19, r042, r043) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r044, str18, str19, r042, r043);
                11T.A0F(r044, 5);
            }
        };
        A0P = r045;
        final 6QD r046 = new 6QD("user_values", "name='active_session_info'", new String[0]);
        final 67T r047 = 67T.A0A;
        final String str20 = "com.facebook.stella_debug";
        ?? r048 = new C67d(r044, str18, str20, r046, r047) { // from class: X.67c
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r044, str18, str20, r046, r047);
                11T.A0F(r044, 5);
            }
        };
        A0Q = r048;
        A03 = C0s8.A14(r04, r05, r07, r09, r013, r017, r045, r048);
        A04 = C0s8.A14(r027, r025, r026);
        A00 = C0s8.A14(r021, r022, r019, r023);
        A01 = C0s8.A14(r029, r030, r031, r033);
        A02 = C0s8.A14(r035, r037, r039, r041);
    }

    public static 6QD A00(String str, String str2, String str3, String str4) {
        return new 6QD(str3, str4, new String[]{str, str2});
    }
}
