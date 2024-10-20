package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.98f, reason: invalid class name */
/* loaded from: 98f.class */
public final class C98f implements AXD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C98f[] A01;
    public static final C98f A02;
    public static final C98f A03;
    public static final C98f A04;
    public static final C98f A05;
    public static final C98f A06;
    public static final C98f A07;
    public static final C98f A08;
    public static final C98f A09;
    public static final C98f A0A;
    public final String text;

    static {
        C98f c98f = new C98f("OPEN_GIF_KEYBOARD", 0, "open_gif_keyboard");
        A07 = c98f;
        C98f c98f2 = new C98f("REQUEST_PREVIEW", 1, "request_preview");
        A08 = c98f2;
        C98f c98f3 = new C98f("CLOSE_GIF_KEYBOARD", 2, "close_gif_keyboard");
        A02 = c98f3;
        C98f c98f4 = new C98f("GIF_SELECTED", 3, "gif_selected");
        A05 = c98f4;
        C98f c98f5 = new C98f("GIF_SEARCH_STARTED", 4, "gif_search_started");
        A04 = c98f5;
        C98f c98f6 = new C98f("SEARCH_CONTENT_FAILED", 5, "search_content_failed");
        A09 = c98f6;
        C98f c98f7 = new C98f("SEARCH_CONTENT_SUCCESS", 6, "search_content_success");
        A0A = c98f7;
        C98f c98f8 = new C98f("GIF_TAB_TAP", 7, "gif_tab_tap");
        A06 = c98f8;
        C98f c98f9 = new C98f("GIF_LONG_PRESS", 8, "gif_long_press");
        A03 = c98f9;
        C98f[] c98fArr = {c98f, c98f2, c98f3, c98f4, c98f5, c98f6, c98f7, c98f8, c98f9};
        A01 = c98fArr;
        A00 = C00t.A00(c98fArr);
    }

    public C98f(String str, int i, String str2) {
        this.text = str2;
    }

    public static C98f valueOf(String str) {
        return (C98f) Enum.valueOf(C98f.class, str);
    }

    public static C98f[] values() {
        return (C98f[]) A01.clone();
    }
}
