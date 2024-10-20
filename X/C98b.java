package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.98b, reason: invalid class name */
/* loaded from: 98b.class */
public final class C98b implements AXD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C98b[] A01;
    public static final C98b A02;
    public final String actionName;

    static {
        C98b c98b = new C98b("OPEN_EMOJI_KEYBOARD", 0, "open_emoji_keyboard");
        A02 = c98b;
        C98b[] c98bArr = {c98b, new C98b("ADD_EMOJI_TO_TEXT", 1, "add_emoji_to_text")};
        A01 = c98bArr;
        A00 = C00t.A00(c98bArr);
    }

    public C98b(String str, int i, String str2) {
        this.actionName = str2;
    }

    public static C98b valueOf(String str) {
        return (C98b) Enum.valueOf(C98b.class, str);
    }

    public static C98b[] values() {
        return (C98b[]) A01.clone();
    }
}
