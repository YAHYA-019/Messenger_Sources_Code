package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95b, reason: invalid class name */
/* loaded from: 95b.class */
public final class C95b {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95b[] A01;
    public static final C95b A02;
    public static final C95b A03;
    public static final C95b A04;

    static {
        C95b c95b = new C95b("Nux", 0);
        A02 = c95b;
        C95b c95b2 = new C95b("SettingOnboarding", 1);
        A03 = c95b2;
        C95b c95b3 = new C95b("SettingToggle", 2);
        A04 = c95b3;
        C95b[] c95bArr = {c95b, c95b2, c95b3};
        A01 = c95bArr;
        A00 = C00t.A00(c95bArr);
    }

    public C95b(String str, int i) {
    }

    public static C95b valueOf(String str) {
        return (C95b) Enum.valueOf(C95b.class, str);
    }

    public static C95b[] values() {
        return (C95b[]) A01.clone();
    }
}
