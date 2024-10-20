package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Met, reason: case insensitive filesystem */
/* loaded from: Met.class */
public final class EnumC3475Met {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC3475Met[] A01;
    public static final EnumC3475Met A02;
    public static final EnumC3475Met A03;

    static {
        EnumC3475Met enumC3475Met = new EnumC3475Met("REEL", 0);
        A02 = enumC3475Met;
        EnumC3475Met enumC3475Met2 = new EnumC3475Met("VOD", 1);
        A03 = enumC3475Met2;
        EnumC3475Met[] enumC3475MetArr = {enumC3475Met, enumC3475Met2};
        A01 = enumC3475MetArr;
        A00 = C00t.A00(enumC3475MetArr);
    }

    public EnumC3475Met(String str, int i) {
    }

    public static EnumC3475Met valueOf(String str) {
        return (EnumC3475Met) Enum.valueOf(EnumC3475Met.class, str);
    }

    public static EnumC3475Met[] values() {
        return (EnumC3475Met[]) A01.clone();
    }
}
