package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Mf1, reason: case insensitive filesystem */
/* loaded from: Mf1.class */
public final class EnumC3483Mf1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC3483Mf1[] A01;
    public static final EnumC3483Mf1 A02;
    public static final EnumC3483Mf1 A03;
    public static final EnumC3483Mf1 A04;
    public static final EnumC3483Mf1 A05;
    public static final EnumC3483Mf1 A06;

    static {
        EnumC3483Mf1 enumC3483Mf1 = new EnumC3483Mf1("APPLIED", 0);
        A02 = enumC3483Mf1;
        EnumC3483Mf1 enumC3483Mf12 = new EnumC3483Mf1("LOADING", 1);
        A05 = enumC3483Mf12;
        EnumC3483Mf1 enumC3483Mf13 = new EnumC3483Mf1("NOT_APPLIED", 2);
        A06 = enumC3483Mf13;
        EnumC3483Mf1 enumC3483Mf14 = new EnumC3483Mf1("DETECTING", 3);
        A04 = enumC3483Mf14;
        EnumC3483Mf1 enumC3483Mf15 = new EnumC3483Mf1("CANCEL", 4);
        A03 = enumC3483Mf15;
        EnumC3483Mf1[] enumC3483Mf1Arr = {enumC3483Mf1, enumC3483Mf12, enumC3483Mf13, enumC3483Mf14, enumC3483Mf15};
        A01 = enumC3483Mf1Arr;
        A00 = C00t.A00(enumC3483Mf1Arr);
    }

    public EnumC3483Mf1(String str, int i) {
    }

    public static EnumC3483Mf1 valueOf(String str) {
        return (EnumC3483Mf1) Enum.valueOf(EnumC3483Mf1.class, str);
    }

    public static EnumC3483Mf1[] values() {
        return (EnumC3483Mf1[]) A01.clone();
    }
}
