package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.292, reason: invalid class name */
/* loaded from: 292.class */
public final class AnonymousClass292 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass292[] A01;
    public static final AnonymousClass292 A02;
    public static final AnonymousClass292 A03;
    public static final AnonymousClass292 A04;
    public static final AnonymousClass292 A05;
    public final String appId;

    static {
        AnonymousClass292 anonymousClass292 = new AnonymousClass292("M4A", 0, "com.facebook.orca");
        A05 = anonymousClass292;
        AnonymousClass292 anonymousClass2922 = new AnonymousClass292("FB_BLUE", 1, "com.facebook.katana");
        A02 = anonymousClass2922;
        AnonymousClass292 anonymousClass2923 = new AnonymousClass292("FB_BLUE_DEBUG", 2, "com.facebook.wakizashi");
        A03 = anonymousClass2923;
        AnonymousClass292 anonymousClass2924 = new AnonymousClass292("FB_LITE", 3, "com.facebook.lite");
        A04 = anonymousClass2924;
        AnonymousClass292[] anonymousClass292Arr = {anonymousClass292, anonymousClass2922, anonymousClass2923, anonymousClass2924};
        A01 = anonymousClass292Arr;
        A00 = C00t.A00(anonymousClass292Arr);
    }

    public AnonymousClass292(String str, int i, String str2) {
        this.appId = str2;
    }

    public static AnonymousClass292 valueOf(String str) {
        return (AnonymousClass292) Enum.valueOf(AnonymousClass292.class, str);
    }

    public static AnonymousClass292[] values() {
        return (AnonymousClass292[]) A01.clone();
    }
}
