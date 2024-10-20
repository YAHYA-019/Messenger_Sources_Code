package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.98c, reason: invalid class name */
/* loaded from: 98c.class */
public final class C98c implements AXD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C98c[] A01;
    public static final C98c A02;
    public final String text;

    static {
        C98c c98c = new C98c("OPEN_GALLERY", 0, "open_gallery");
        A02 = c98c;
        C98c[] c98cArr = {c98c, new C98c("SELECT_MEDIA", 1, "select_media")};
        A01 = c98cArr;
        A00 = C00t.A00(c98cArr);
    }

    public C98c(String str, int i, String str2) {
        this.text = str2;
    }

    public static C98c valueOf(String str) {
        return (C98c) Enum.valueOf(C98c.class, str);
    }

    public static C98c[] values() {
        return (C98c[]) A01.clone();
    }
}
