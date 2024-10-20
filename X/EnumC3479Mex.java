package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Mex, reason: case insensitive filesystem */
/* loaded from: Mex.class */
public final class EnumC3479Mex {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC3479Mex[] A01;
    public static final EnumC3479Mex A02;
    public static final EnumC3479Mex A03;
    public static final EnumC3479Mex A04;

    static {
        EnumC3479Mex enumC3479Mex = new EnumC3479Mex("DISABLED", 0);
        A02 = enumC3479Mex;
        EnumC3479Mex enumC3479Mex2 = new EnumC3479Mex("ENABLED", 1);
        A03 = enumC3479Mex2;
        EnumC3479Mex enumC3479Mex3 = new EnumC3479Mex("NOT_APPLICABLE", 2);
        A04 = enumC3479Mex3;
        EnumC3479Mex[] enumC3479MexArr = {enumC3479Mex, enumC3479Mex2, enumC3479Mex3};
        A01 = enumC3479MexArr;
        A00 = C00t.A00(enumC3479MexArr);
    }

    public EnumC3479Mex(String str, int i) {
    }

    public static EnumC3479Mex valueOf(String str) {
        return (EnumC3479Mex) Enum.valueOf(EnumC3479Mex.class, str);
    }

    public static EnumC3479Mex[] values() {
        return (EnumC3479Mex[]) A01.clone();
    }
}
