package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.98g, reason: invalid class name */
/* loaded from: 98g.class */
public final class C98g implements AXD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C98g[] A01;
    public static final C98g A02;
    public static final C98g A03;
    public static final C98g A04;
    public static final C98g A05;
    public static final C98g A06;
    public static final C98g A07;
    public static final C98g A08;
    public static final C98g A09;
    public static final C98g A0A;
    public static final C98g A0B;
    public static final C98g A0C;
    public static final C98g A0D;
    public static final C98g A0E;
    public static final C98g A0F;
    public final String text;

    static {
        C98g c98g = new C98g("CLICK_STICKER_TAG", 0, "click_sticker_tag");
        A03 = c98g;
        C98g c98g2 = new C98g("VIEW_STICKER_TAGS", 1, "view_sticker_tags");
        A0E = c98g2;
        C98g c98g3 = new C98g("SEND_TRENDING_STICKER", 2, "send_trending_sticker");
        A0C = c98g3;
        C98g c98g4 = new C98g("VIEW_TRENDING_STICKERS", 3, "view_trending_stickers");
        A0F = c98g4;
        C98g c98g5 = new C98g("FAILED_LOADING_TRENDING_STICKERS", 4, "failed_loading_trending_stickers");
        A06 = c98g5;
        C98g c98g6 = new C98g("REQUEST_PREVIEW", 5, "request_preview");
        A0B = c98g6;
        C98g c98g7 = new C98g("OPEN_STICKER_KEYBOARD", 6, "open_sticker_keyboard");
        A07 = c98g7;
        C98g c98g8 = new C98g("CLICK_STICKER_MESSAGE_TO_OPEN_STICKER_KEYBOARD", 7, "click_sticker_message_to_open_sticker_keyboard");
        A02 = c98g8;
        C98g c98g9 = new C98g("CLOSE_STICKER_KEYBOARD", 8, "close_sticker_keyboard");
        A04 = c98g9;
        C98g c98g10 = new C98g("OPEN_STICKER_SEARCH", 9, "open_sticker_search");
        A08 = c98g10;
        C98g c98g11 = new C98g("OPEN_STICKER_STORE", 10, "open_sticker_store");
        A09 = c98g11;
        C98g c98g12 = new C98g("STICKER_SEARCH_STARTED", 11, "sticker_search_started");
        A0D = c98g12;
        C98g c98g13 = new C98g("OPEN_SUGGESTED_KEYBOARD", 12, "open_suggested_keyboard");
        A0A = c98g13;
        C98g c98g14 = new C98g("CLOSE_SUGGESTED_KEYBOARD", 13, "close_suggested_keyboard");
        A05 = c98g14;
        C98g[] c98gArr = {c98g, c98g2, c98g3, c98g4, c98g5, c98g6, c98g7, c98g8, c98g9, c98g10, c98g11, c98g12, c98g13, c98g14};
        A01 = c98gArr;
        A00 = C00t.A00(c98gArr);
    }

    public C98g(String str, int i, String str2) {
        this.text = str2;
    }

    public static C98g valueOf(String str) {
        return (C98g) Enum.valueOf(C98g.class, str);
    }

    public static C98g[] values() {
        return (C98g[]) A01.clone();
    }
}
