package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4wa.class */
public final class EnumC11364wa {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC11364wa[] A01;
    public static final EnumC11364wa A02;
    public static final EnumC11364wa A03;
    public static final EnumC11364wa A04;
    public final String value;

    static {
        EnumC11364wa enumC11364wa = new EnumC11364wa("OPT_IN", 0, "opt_in");
        A03 = enumC11364wa;
        EnumC11364wa enumC11364wa2 = new EnumC11364wa("NOT_OPT_IN", 1, "not_opt_in");
        A02 = enumC11364wa2;
        EnumC11364wa enumC11364wa3 = new EnumC11364wa("OPT_OUT", 2, "opt_out");
        A04 = enumC11364wa3;
        EnumC11364wa[] enumC11364waArr = {enumC11364wa, enumC11364wa2, enumC11364wa3};
        A01 = enumC11364waArr;
        A00 = C00t.A00(enumC11364waArr);
    }

    public EnumC11364wa(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumC11364wa valueOf(String str) {
        return (EnumC11364wa) Enum.valueOf(EnumC11364wa.class, str);
    }

    public static EnumC11364wa[] values() {
        return (EnumC11364wa[]) A01.clone();
    }
}
