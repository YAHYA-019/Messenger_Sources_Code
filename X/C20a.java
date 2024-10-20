package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.20a, reason: invalid class name */
/* loaded from: 20a.class */
public final class C20a {
    public static final C20a[] A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C20a[] A02;
    public static final C20a A03;
    public static final C20a A04;
    public static final C20a A05;
    public static final C20a A06;
    public static final C20a A07;
    public final int value;

    static {
        C20a c20a = new C20a("NONE", 0, 0);
        A03 = c20a;
        C20a c20a2 = new C20a("VOICE_CALL", 1, 1);
        A07 = c20a2;
        C20a c20a3 = new C20a("VIDEO_CALL", 2, 2);
        A06 = c20a3;
        C20a c20a4 = new C20a("RECENT_VOICE_CALL", 3, 3);
        A05 = c20a4;
        C20a c20a5 = new C20a("RECENT_VIDEO_CALL", 4, 4);
        A04 = c20a5;
        C20a[] c20aArr = {c20a, c20a2, c20a3, c20a4, c20a5};
        A02 = c20aArr;
        C00u A002 = C00t.A00(c20aArr);
        A01 = A002;
        A00 = (C20a[]) A002.toArray(new C20a[0]);
    }

    public C20a(String str, int i, int i2) {
        this.value = i2;
    }

    public static C20a valueOf(String str) {
        return (C20a) Enum.valueOf(C20a.class, str);
    }

    public static C20a[] values() {
        return (C20a[]) A02.clone();
    }
}
