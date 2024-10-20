package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Mez, reason: case insensitive filesystem */
/* loaded from: Mez.class */
public final class EnumC3481Mez {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC3481Mez[] A01;
    public static final EnumC3481Mez A02;
    public static final EnumC3481Mez A03;
    public static final EnumC3481Mez A04;

    static {
        EnumC3481Mez enumC3481Mez = new EnumC3481Mez("BLOCKED_AND_USER_NOT_NOTIFIED", 0);
        A03 = enumC3481Mez;
        EnumC3481Mez enumC3481Mez2 = new EnumC3481Mez("BLOCKED_AND_USER_NOTIFIED", 1);
        A02 = enumC3481Mez2;
        EnumC3481Mez enumC3481Mez3 = new EnumC3481Mez("ENABLED", 2);
        A04 = enumC3481Mez3;
        EnumC3481Mez[] enumC3481MezArr = {enumC3481Mez, enumC3481Mez2, enumC3481Mez3};
        A01 = enumC3481MezArr;
        A00 = C00t.A00(enumC3481MezArr);
    }

    public EnumC3481Mez(String str, int i) {
    }

    public static EnumC3481Mez valueOf(String str) {
        return (EnumC3481Mez) Enum.valueOf(EnumC3481Mez.class, str);
    }

    public static EnumC3481Mez[] values() {
        return (EnumC3481Mez[]) A01.clone();
    }
}
