package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96c, reason: invalid class name */
/* loaded from: 96c.class */
public final class C96c {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96c[] A01;
    public static final C96c A02;
    public static final C96c A03;
    public static final C96c A04;
    public static final C96c A05;
    public static final C96c A06;
    public final String type;

    static {
        C96c c96c = new C96c("RECOVERY_CODE", 0, "RECOVERY_CODE");
        A06 = c96c;
        C96c c96c2 = new C96c("PIN_CODE", 1, "PIN_CODE");
        A05 = c96c2;
        C96c c96c3 = new C96c("DEVICE_ONLY", 2, "DEVICE_ONLY");
        A03 = c96c3;
        C96c c96c4 = new C96c("GOOGLE_DRIVE", 3, "GOOGLE_DRIVE");
        A04 = c96c4;
        C96c c96c5 = new C96c("BLOCK_STORE", 4, "BLOCK_STORE");
        A02 = c96c5;
        C96c[] c96cArr = {c96c, c96c2, c96c3, c96c4, c96c5};
        A01 = c96cArr;
        A00 = C00t.A00(c96cArr);
    }

    public C96c(String str, int i, String str2) {
        this.type = str2;
    }

    public static C96c valueOf(String str) {
        return (C96c) Enum.valueOf(C96c.class, str);
    }

    public static C96c[] values() {
        return (C96c[]) A01.clone();
    }
}
