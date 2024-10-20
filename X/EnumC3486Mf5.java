package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Mf5, reason: case insensitive filesystem */
/* loaded from: Mf5.class */
public abstract class EnumC3486Mf5 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC3486Mf5[] A01;
    public static final EnumC3486Mf5 A02;
    public static final EnumC3486Mf5 A03;
    public static final EnumC3486Mf5 A04;
    public final long value;

    static {
        EnumC3486Mf5 mWa = new MWa();
        A04 = mWa;
        EnumC3486Mf5 mwy = new MWY();
        A02 = mwy;
        EnumC3486Mf5 mwz = new MWZ();
        A03 = mwz;
        EnumC3486Mf5[] enumC3486Mf5Arr = {mWa, mwy, mwz};
        A01 = enumC3486Mf5Arr;
        A00 = C00t.A00(enumC3486Mf5Arr);
    }

    public EnumC3486Mf5(String str, int i, long j) {
        this.value = j;
    }

    public static EnumC3486Mf5 valueOf(String str) {
        return (EnumC3486Mf5) Enum.valueOf(EnumC3486Mf5.class, str);
    }

    public static EnumC3486Mf5[] values() {
        return (EnumC3486Mf5[]) A01.clone();
    }
}
