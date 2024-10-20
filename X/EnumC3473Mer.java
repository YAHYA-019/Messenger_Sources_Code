package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Mer, reason: case insensitive filesystem */
/* loaded from: Mer.class */
public final class EnumC3473Mer {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC3473Mer[] A01;
    public static final EnumC3473Mer A02;

    static {
        EnumC3473Mer enumC3473Mer = new EnumC3473Mer("PENDING", 0);
        A02 = enumC3473Mer;
        EnumC3473Mer[] enumC3473MerArr = {enumC3473Mer, new EnumC3473Mer("RUNNING", 1)};
        A01 = enumC3473MerArr;
        A00 = C00t.A00(enumC3473MerArr);
    }

    public EnumC3473Mer(String str, int i) {
    }

    public static EnumC3473Mer valueOf(String str) {
        return (EnumC3473Mer) Enum.valueOf(EnumC3473Mer.class, str);
    }

    public static EnumC3473Mer[] values() {
        return (EnumC3473Mer[]) A01.clone();
    }
}
