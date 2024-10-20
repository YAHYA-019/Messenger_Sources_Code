package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.98d, reason: invalid class name */
/* loaded from: 98d.class */
public final class C98d implements AXD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C98d[] A01;
    public static final C98d A02;
    public final String text;

    static {
        C98d c98d = new C98d("CLICK_SEND_POWER_UP", 0, "click_send_power_up");
        A02 = c98d;
        C98d[] c98dArr = {c98d, new C98d("VIEW_AVATAR_POWER_UP", 1, "view_avatar_power_up")};
        A01 = c98dArr;
        A00 = C00t.A00(c98dArr);
    }

    public C98d(String str, int i, String str2) {
        this.text = str2;
    }

    public static C98d valueOf(String str) {
        return (C98d) Enum.valueOf(C98d.class, str);
    }

    public static C98d[] values() {
        return (C98d[]) A01.clone();
    }
}
