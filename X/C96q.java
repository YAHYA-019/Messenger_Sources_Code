package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96q, reason: invalid class name */
/* loaded from: 96q.class */
public final class C96q {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96q[] A01;
    public static final C96q A02;
    public static final C96q A03;
    public static final C96q A04;
    public static final C96q A05;
    public static final C96q A06;
    public static final C96q A07;
    public static final C96q A08;
    public static final C96q A09;
    public static final C96q A0A;
    public static final C96q A0B;
    public static final C96q A0C;
    public static final C96q A0D;
    public static final C96q A0E;
    public static final C96q A0F;
    public static final C96q A0G;
    public static final C96q A0H;
    public static final C96q A0I;
    public static final C96q A0J;
    public static final C96q A0K;
    public static final C96q A0L;
    public final boolean finishEventOnBackPressed;

    static {
        C96q c96q = new C96q("NUX", 0, true);
        A0A = c96q;
        C96q c96q2 = new C96q("HARD_BLOCK_NUX", 1, true);
        A05 = c96q2;
        C96q c96q3 = new C96q("SETTING", 2, false);
        A0I = c96q3;
        C96q c96q4 = new C96q("QP", 3, false);
        A0F = c96q4;
        C96q c96q5 = new C96q("SECURITY_METHODS", 4, false);
        A0H = c96q5;
        C96q c96q6 = new C96q("INBOX_BANNER", 5, false);
        A06 = c96q6;
        C96q c96q7 = new C96q("THREAD_BANNER", 6, false);
        A0K = c96q7;
        C96q c96q8 = new C96q("SEARCH_BANNER", 7, false);
        A0G = c96q8;
        C96q c96q9 = new C96q("PUSH_NOTIFICATION", 8, false);
        A0E = c96q9;
        C96q c96q10 = new C96q("HARD_BLOCK_LEAKAGE", 9, false);
        A04 = c96q10;
        C96q c96q11 = new C96q("STARTUP_JOB", 10, false);
        A0J = c96q11;
        C96q c96q12 = new C96q("ONE_TIME_CODE", 11, false);
        A0B = c96q12;
        C96q c96q13 = new C96q("PIN_REMINDER", 12, false);
        A0C = c96q13;
        C96q c96q14 = new C96q("MEDIA_EXPIRATION_TOMBSTONE_BOTTOMSHEET", 13, false);
        A07 = c96q14;
        C96q c96q15 = new C96q("MESSAGE_EXPIRATION_TOMBSTONE_BOTTOMSHEET", 14, false);
        A08 = c96q15;
        C96q c96q16 = new C96q("ME_RESTORE_BANNER", 15, false);
        A09 = c96q16;
        C96q c96q17 = new C96q("DEFAULT_EB_UPSELL", 16, false);
        A02 = c96q17;
        C96q c96q18 = new C96q("UNSET", 17, false);
        A0L = c96q18;
        C96q c96q19 = new C96q("EMPLOYEE_40C_MIGRATION", 18, true);
        A03 = c96q19;
        C96q c96q20 = new C96q("PROD_40C_MIGRATION", 19, false);
        A0D = c96q20;
        C96q[] c96qArr = {c96q, c96q2, c96q3, c96q4, c96q5, c96q6, c96q7, c96q8, c96q9, c96q10, c96q11, c96q12, c96q13, c96q14, c96q15, c96q16, c96q17, c96q18, c96q19, c96q20};
        A01 = c96qArr;
        A00 = C00t.A00(c96qArr);
    }

    public C96q(String str, int i, boolean z) {
        this.finishEventOnBackPressed = z;
    }

    public static C96q valueOf(String str) {
        return (C96q) Enum.valueOf(C96q.class, str);
    }

    public static C96q[] values() {
        return (C96q[]) A01.clone();
    }
}
