package X;

import java.util.Set;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96p, reason: invalid class name */
/* loaded from: 96p.class */
public final class C96p {
    public static final Set A00;
    public static final Set A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C96p[] A03;
    public static final C96p A04;
    public static final C96p A05;
    public static final C96p A06;
    public static final C96p A07;
    public static final C96p A08;
    public static final C96p A09;
    public static final C96p A0A;
    public static final C96p A0B;
    public static final C96p A0C;
    public static final C96p A0D;
    public static final C96p A0E;
    public static final C96p A0F;
    public static final C96p A0G;
    public final Number type;

    static {
        C96p c96p = new C96p(1, "OFFLINE", 0);
        A0D = c96p;
        C96p c96p2 = new C96p(2, "HSM", 1);
        A08 = c96p2;
        C96p c96p3 = new C96p(3, "BLOCK_STORE", 2);
        A04 = c96p3;
        C96p c96p4 = new C96p(5, "KEYCHAIN", 3);
        A0C = c96p4;
        C96p c96p5 = new C96p(6, "ICLOUD_KVS", 4);
        A0B = c96p5;
        C96p c96p6 = new C96p(7, "GOOGLE_DRIVE", 5);
        A06 = c96p6;
        C96p c96p7 = new C96p(8, "CLOUDKIT", 6);
        A05 = c96p7;
        C96p c96p8 = new C96p(9, "ICLOUD_DRIVE", 7);
        A09 = c96p8;
        C96p c96p9 = new C96p(10, "PASSKEY", 8);
        A0E = c96p9;
        C96p c96p10 = new C96p(11, "ICLOUD_KEYCHAIN", 9);
        A0A = c96p10;
        C96p c96p11 = new C96p(12, "GOOGLE_ONE_AUTO_BACKUP", 10);
        A07 = c96p11;
        C96p c96p12 = new C96p(13, "SECURITY_QUESTION_HSM", 11);
        A0F = c96p12;
        C96p c96p13 = new C96p(14, "TRUSTED_CONTACT", 12);
        A0G = c96p13;
        C96p[] c96pArr = {c96p, c96p2, c96p3, c96p4, c96p5, c96p6, c96p7, c96p8, c96p9, c96p10, c96p11, c96p12, c96p13};
        A03 = c96pArr;
        A02 = C00t.A00(c96pArr);
        A01 = 02H.A02(new C96p[]{c96p3, c96p, c96p2, c96p6, c96p9, c96p11, c96p12, c96p13});
        A00 = 02H.A02(new C96p[]{c96p, c96p2, c96p6, c96p9, c96p12, c96p13});
    }

    public C96p(Number number, String str, int i) {
        this.type = number;
    }

    public static C96p valueOf(String str) {
        return (C96p) Enum.valueOf(C96p.class, str);
    }

    public static C96p[] values() {
        return (C96p[]) A03.clone();
    }
}
