package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Mey, reason: case insensitive filesystem */
/* loaded from: Mey.class */
public final class EnumC3480Mey {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC3480Mey[] A01;
    public static final EnumC3480Mey A02;
    public static final EnumC3480Mey A03;
    public static final EnumC3480Mey A04;

    static {
        EnumC3480Mey enumC3480Mey = new EnumC3480Mey("SHORT_FORM_VIDEO", 0);
        A02 = enumC3480Mey;
        EnumC3480Mey enumC3480Mey2 = new EnumC3480Mey("UNIFIED_VIDEO_SHARE_SHEET", 1);
        A03 = enumC3480Mey2;
        EnumC3480Mey enumC3480Mey3 = new EnumC3480Mey("UNSUPPORTED_SURFACE", 2);
        A04 = enumC3480Mey3;
        EnumC3480Mey[] enumC3480MeyArr = {enumC3480Mey, enumC3480Mey2, enumC3480Mey3};
        A01 = enumC3480MeyArr;
        A00 = C00t.A00(enumC3480MeyArr);
    }

    public EnumC3480Mey(String str, int i) {
    }

    public static EnumC3480Mey valueOf(String str) {
        return (EnumC3480Mey) Enum.valueOf(EnumC3480Mey.class, str);
    }

    public static EnumC3480Mey[] values() {
        return (EnumC3480Mey[]) A01.clone();
    }
}
