package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.62b, reason: invalid class name */
/* loaded from: 62b.class */
public final class C62b {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C62b[] A01;
    public static final C62b A02;
    public static final C62b A03;
    public static final C62b A04;
    public static final C62b A05;
    public static final C62b A06;
    public static final C62b A07;
    public static final C62b A08;
    public static final C62b A09;
    public static final C62b A0A;
    public static final C62b A0B;
    public static final C62b A0C;
    public static final C62b A0D;
    public static final C62b A0E;
    public static final C62b A0F;
    public static final C62b A0G;
    public static final C62b A0H;
    public static final C62b A0I;
    public static final C62b A0J;
    public static final C62b A0K;
    public static final C62b A0L;
    public static final C62b A0M;
    public static final C62b A0N;
    public static final C62b A0O;
    public static final C62b A0P;
    public static final C62b A0Q;
    public static final C62b A0R;

    static {
        C62b c62b = new C62b("MESSAGE", 0, "MESSAGE");
        A0G = c62b;
        C62b c62b2 = new C62b("RECEIPT", 1, "RECEIPT");
        A0M = c62b2;
        C62b c62b3 = new C62b("TYPING", 2, "TYPING");
        A0Q = c62b3;
        C62b c62b4 = new C62b("MSYS_TYPING", 3, "MSYS_TYPING");
        A0J = c62b4;
        C62b c62b5 = new C62b("LIST_END_SPACER", 4, "LIST_END_SPACER");
        A0D = c62b5;
        C62b c62b6 = new C62b("SOFT_INPUT_SPACER", 5, "SOFT_INPUT_SPACER");
        A0O = c62b6;
        C62b c62b7 = new C62b("LOAD_MORE_OLD_MESSAGES", 6, "LOAD_MORE_OLD_MESSAGES");
        A0E = c62b7;
        C62b c62b8 = new C62b("LOAD_MORE_RECENT_MESSAGES", 7, "LOAD_MORE_RECENT_MESSAGES");
        A0F = c62b8;
        C62b c62b9 = new C62b("MONTAGE_REPLY", 8, "MONTAGE_REPLY");
        A0H = c62b9;
        C62b c62b10 = new C62b("MONTAGE_VIEWED_BY", 9, "MONTAGE_VIEWED_BY");
        A0I = c62b10;
        C62b c62b11 = new C62b("HOT_LIKE_PREVIEW", 10, "HOT_LIKE_PREVIEW");
        A0A = c62b11;
        C62b c62b12 = new C62b("TIMESTAMP_DIVIDER", 11, "TIMESTAMP_DIVIDER");
        A0P = c62b12;
        C62b c62b13 = new C62b("LINE_DIVIDER", 12, "LINE_DIVIDER");
        A0C = c62b13;
        C62b c62b14 = new C62b("SOCIAL_CONTEXT", 13, "SOCIAL_CONTEXT");
        A0N = c62b14;
        C62b c62b15 = new C62b("GROUP_CREATED", 14, "GROUP_CREATED");
        A07 = c62b15;
        C62b c62b16 = new C62b("EXPANDABLE_ADMIN_MESSAGE", 15, "EXPANDABLE_ADMIN_MESSAGE");
        A06 = c62b16;
        C62b c62b17 = new C62b("COALESCED_ADMIN_MESSAGE_GAME_UPDATE", 16, "COALESCED_ADMIN_MESSAGE_GAME_UPDATE");
        A05 = c62b17;
        C62b c62b18 = new C62b("OPTIMISTIC_GROUP_STATUS", 17, "OPTIMISTIC_GROUP_STATUS");
        A0K = c62b18;
        C62b c62b19 = new C62b("GROUP_SET_IMAGE_NAME", 18, "GROUP_SET_IMAGE_NAME");
        A08 = c62b19;
        C62b c62b20 = new C62b("UNREAD_DIVIDER", 19, "UNREAD_DIVIDER");
        A0R = c62b20;
        C62b c62b21 = new C62b("ADMIN_TEXT_WITH_LINK", 20, "ADMIN_TEXT_WITH_LINK");
        A03 = c62b21;
        C62b c62b22 = new C62b("ADMIN_MESSAGE_GROWTH_GENERIC", 21, "ADMIN_MESSAGE_GROWTH_GENERIC");
        A02 = c62b22;
        C62b c62b23 = new C62b("POLLING", 22, "POLLING");
        A0L = c62b23;
        C62b c62b24 = new C62b("ICE_BREAKER", 23, "ICE_BREAKER");
        A0B = c62b24;
        C62b c62b25 = new C62b("HELPER_BOT_RESPONSES", 24, "HELPER_BOT_RESPONSES");
        A09 = c62b25;
        C62b c62b26 = new C62b("BROADCAST_CHANNEL_NULL_STATE", 25, "BROADCAST_CHANNEL_NULL_STATE");
        A04 = c62b26;
        C62b[] c62bArr = {c62b, c62b2, c62b3, c62b4, c62b5, c62b6, c62b7, c62b8, c62b9, c62b10, c62b11, c62b12, c62b13, c62b14, c62b15, c62b16, c62b17, c62b18, c62b19, c62b20, c62b21, c62b22, c62b23, c62b24, c62b25, c62b26};
        A01 = c62bArr;
        A00 = C00t.A00(c62bArr);
    }

    public C62b(String str, int i, String str2) {
        if (!str2.equals(name())) {
            throw AnonymousClass001.A0L("Failed requirement.");
        }
    }

    public static C62b valueOf(String str) {
        return (C62b) Enum.valueOf(C62b.class, str);
    }

    public static C62b[] values() {
        return (C62b[]) A01.clone();
    }
}
