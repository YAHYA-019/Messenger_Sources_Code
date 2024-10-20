package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4mf.class */
public final class EnumC08284mf {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC08284mf[] A01;
    public static final EnumC08284mf A02;
    public static final EnumC08284mf A03;
    public static final EnumC08284mf A04;
    public static final EnumC08284mf A05;
    public static final EnumC08284mf A06;
    public static final EnumC08284mf A07;

    static {
        EnumC08284mf enumC08284mf = new EnumC08284mf("FROM_SERVER", 0);
        A06 = enumC08284mf;
        EnumC08284mf enumC08284mf2 = new EnumC08284mf("FROM_CACHE_UP_TO_DATE", 1);
        A05 = enumC08284mf2;
        EnumC08284mf enumC08284mf3 = new EnumC08284mf("FROM_CACHE_STALE", 2);
        A04 = enumC08284mf3;
        EnumC08284mf enumC08284mf4 = new EnumC08284mf("NO_DATA", 3);
        A07 = enumC08284mf4;
        EnumC08284mf enumC08284mf5 = new EnumC08284mf("FROM_CACHE_INCOMPLETE", 4);
        A03 = enumC08284mf5;
        EnumC08284mf enumC08284mf6 = new EnumC08284mf("FROM_CACHE_HAD_SERVER_ERROR", 5);
        A02 = enumC08284mf6;
        EnumC08284mf[] enumC08284mfArr = {enumC08284mf, enumC08284mf2, enumC08284mf3, enumC08284mf4, enumC08284mf5, enumC08284mf6, new EnumC08284mf("FROM_DB_NEED_INITIAL_FETCH", 6)};
        A01 = enumC08284mfArr;
        A00 = C00t.A00(enumC08284mfArr);
    }

    public EnumC08284mf(String str, int i) {
    }

    public static EnumC08284mf valueOf(String str) {
        return (EnumC08284mf) Enum.valueOf(EnumC08284mf.class, str);
    }

    public static EnumC08284mf[] values() {
        return (EnumC08284mf[]) A01.clone();
    }
}
