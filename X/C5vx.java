package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5vx, reason: invalid class name */
/* loaded from: 5vx.class */
public final class C5vx {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C5vx[] A01;
    public static final C5vx A02;
    public static final C5vx A03;
    public static final C5vx A04;
    public static final C5vx A05;
    public static final C5vx A06;
    public static final C5vx A07;
    public static final C5vx A08;
    public static final C5vx A09;
    public static final C5vx A0A;
    public static final C5vx A0B;
    public static final C5vx A0C;
    public static final C5vx A0D;
    public static final C5vx A0E;
    public static final C5vx A0F;
    public static final C5vx A0G;
    public static final C5vx A0H;
    public static final C5vx A0I;

    static {
        C5vx c5vx = new C5vx("ADD_MEMBERS", 0);
        A02 = c5vx;
        C5vx c5vx2 = new C5vx("ADMIN", 1);
        A03 = c5vx2;
        C5vx c5vx3 = new C5vx("E2EE_NOTICE", 2);
        A0A = c5vx3;
        C5vx c5vx4 = new C5vx("ENCRYPTED_BACKUPS_IN_THREAD_RESTORE_ADMIN_MESSAGE", 3);
        A0D = c5vx4;
        C5vx c5vx5 = new C5vx("AI_SUMMON_NUX", 4);
        A05 = c5vx5;
        C5vx c5vx6 = new C5vx("CUTOVER_E2EE_NOTICE", 5);
        A07 = c5vx6;
        C5vx c5vx7 = new C5vx("ADMIN_MESSAGE_OTHER_TOOK_SCREENSHOT_NOTIFICATION", 6);
        A04 = c5vx7;
        C5vx c5vx8 = new C5vx("CALL_LOG", 7);
        A06 = c5vx8;
        C5vx c5vx9 = new C5vx("REMOVE_MEMBERS", 8);
        A0G = c5vx9;
        C5vx c5vx10 = new C5vx("SET_NAME", 9);
        A0H = c5vx10;
        C5vx c5vx11 = new C5vx("E2EE_POLL_CREATION", 10);
        A0B = c5vx11;
        C5vx c5vx12 = new C5vx("E2EE_POLL_UPDATE", 11);
        A0C = c5vx12;
        C5vx c5vx13 = new C5vx("DISAPPEARING_MESSAGE_CHANGE_SETTINGS", 12);
        A09 = c5vx13;
        C5vx c5vx14 = new C5vx("INTEROP_NOTICE", 13);
        A0E = c5vx14;
        C5vx c5vx15 = new C5vx("MAGIC_WORDS_UPDATE", 14);
        A0F = c5vx15;
        C5vx c5vx16 = new C5vx("SHARED_ALBUM_ADDITION", 15);
        A0I = c5vx16;
        C5vx c5vx17 = new C5vx("DETECTED_OUTCOME", 16);
        A08 = c5vx17;
        C5vx[] c5vxArr = {c5vx, c5vx2, c5vx3, c5vx4, c5vx5, c5vx6, c5vx7, c5vx8, c5vx9, c5vx10, c5vx11, c5vx12, c5vx13, c5vx14, c5vx15, c5vx16, c5vx17, new C5vx(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 17)};
        A01 = c5vxArr;
        A00 = C00t.A00(c5vxArr);
    }

    public C5vx(String str, int i) {
    }

    public static C5vx valueOf(String str) {
        return (C5vx) Enum.valueOf(C5vx.class, str);
    }

    public static C5vx[] values() {
        return (C5vx[]) A01.clone();
    }
}
