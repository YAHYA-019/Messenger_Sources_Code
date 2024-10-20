package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96z, reason: invalid class name */
/* loaded from: 96z.class */
public final class C96z {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96z[] A01;
    public static final C96z A02;
    public static final C96z A03;
    public static final C96z A04;
    public static final C96z A05;
    public final C95b entryPoint;
    public final 96R flowType;
    public final boolean isFromSettingToggle;

    static {
        96R r0 = 96R.A03;
        C95b c95b = C95b.A02;
        C96z c96z = new C96z(r0, c95b, "NuxSetup", 0);
        A03 = c96z;
        96R r02 = 96R.A02;
        C96z c96z2 = new C96z(r02, c95b, "NuxRestore", 1);
        A02 = c96z2;
        C95b c95b2 = C95b.A03;
        C96z c96z3 = new C96z(r0, c95b2, "SettingSetup", 2);
        A05 = c96z3;
        C96z c96z4 = new C96z(r02, c95b2, "SettingRestore", 3);
        A04 = c96z4;
        C96z[] c96zArr = {c96z, c96z2, c96z3, c96z4, new C96z(r0, C95b.A04, "SettingToggleSetup", 4)};
        A01 = c96zArr;
        A00 = C00t.A00(c96zArr);
    }

    public C96z(96R r302, C95b c95b, String str, int i) {
        this.flowType = r302;
        this.entryPoint = c95b;
        this.isFromSettingToggle = AnonymousClass001.A1W(c95b, C95b.A04);
    }

    public static C96z valueOf(String str) {
        return (C96z) Enum.valueOf(C96z.class, str);
    }

    public static C96z[] values() {
        return (C96z[]) A01.clone();
    }
}
