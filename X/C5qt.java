package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5qt, reason: invalid class name */
/* loaded from: 5qt.class */
public final class C5qt {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C5qt[] A01;
    public static final C5qt A02;
    public static final C5qt A03;
    public static final C5qt A04;
    public static final C5qt A05;
    public static final C5qt A06;
    public static final C5qt A07;
    public static final C5qt A08;
    public static final C5qt A09;
    public static final C5qt A0A;
    public static final C5qt A0B;
    public static final C5qt A0C;
    public static final C5qt A0D;
    public static final C5qt A0E;
    public final String value;

    static {
        C5qt c5qt = new C5qt("NONE", 0, "");
        A09 = c5qt;
        C5qt c5qt2 = new C5qt("IGNORE_FOR_WEBHOOK", 1, "ignore_for_webhook");
        A07 = c5qt2;
        C5qt c5qt3 = new C5qt("POSTBACK_DATA", 2, "postback_data");
        A0C = c5qt3;
        C5qt c5qt4 = new C5qt("QUICK_REPLIES", 3, "quick_replies");
        A0D = c5qt4;
        C5qt c5qt5 = new C5qt("QUICK_REPLY_TYPE", 4, "quick_reply_type");
        A0E = c5qt5;
        C5qt c5qt6 = new C5qt("AD_ID", 5, "ad_id");
        A02 = c5qt6;
        C5qt c5qt7 = new C5qt("AD_TYPE", 6, "ad_type");
        A03 = c5qt7;
        C5qt c5qt8 = new C5qt("MARKETPLACE_TAB_MESSAGE", 7, "marketplace_tab_message");
        A08 = c5qt8;
        C5qt c5qt9 = new C5qt("BROADCAST_UNIT_ID", 8, "broadcast_unit_id");
        A05 = c5qt9;
        C5qt c5qt10 = new C5qt("PERSONA", 9, "persona");
        A0A = c5qt10;
        C5qt c5qt11 = new C5qt("CHAT_ENTITY_XMD", 10, "chat_entity_xmd");
        A06 = c5qt11;
        C5qt c5qt12 = new C5qt("POSTBACK", 11, "postback");
        A0B = c5qt12;
        C5qt c5qt13 = new C5qt("AUTOMATION_SUPPORT", 12, "automation_support");
        A04 = c5qt13;
        C5qt[] c5qtArr = {c5qt, c5qt2, c5qt3, c5qt4, c5qt5, c5qt6, c5qt7, c5qt8, c5qt9, c5qt10, c5qt11, c5qt12, c5qt13};
        A01 = c5qtArr;
        A00 = C00t.A00(c5qtArr);
    }

    public C5qt(String str, int i, String str2) {
        this.value = str2;
    }

    public static C5qt valueOf(String str) {
        return (C5qt) Enum.valueOf(C5qt.class, str);
    }

    public static C5qt[] values() {
        return (C5qt[]) A01.clone();
    }
}
