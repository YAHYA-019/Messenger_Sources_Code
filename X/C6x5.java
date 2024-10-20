package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6x5, reason: invalid class name */
/* loaded from: 6x5.class */
public final class C6x5 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6x5[] A01;
    public static final C6x5 A02;
    public static final C6x5 A03;
    public static final C6x5 A04;
    public static final C6x5 A05;
    public static final C6x5 A06;
    public static final C6x5 A07;
    public static final C6x5 A08;

    static {
        C6x5 c6x5 = new C6x5("INBOX", 0);
        A04 = c6x5;
        C6x5 c6x52 = new C6x5("INBOX_ACTIVITY", 1);
        A05 = c6x52;
        C6x5 c6x53 = new C6x5("DIALOG", 2);
        A03 = c6x53;
        C6x5 c6x54 = new C6x5("ACTIVITY", 3);
        A02 = c6x54;
        C6x5 c6x55 = new C6x5("THREAD_FRAGMENT", 4);
        A08 = c6x55;
        C6x5 c6x56 = new C6x5("MEDIA_EDITOR", 5);
        A06 = c6x56;
        C6x5 c6x57 = new C6x5("QR_CODE", 6);
        A07 = c6x57;
        C6x5[] c6x5Arr = {c6x5, c6x52, c6x53, c6x54, c6x55, c6x56, c6x57};
        A01 = c6x5Arr;
        A00 = C00t.A00(c6x5Arr);
    }

    public C6x5(String str, int i) {
    }

    public static C6x5 valueOf(String str) {
        return (C6x5) Enum.valueOf(C6x5.class, str);
    }

    public static C6x5[] values() {
        return (C6x5[]) A01.clone();
    }
}
