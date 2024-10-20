package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Mf0, reason: case insensitive filesystem */
/* loaded from: Mf0.class */
public final class EnumC3482Mf0 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC3482Mf0[] A01;
    public static final EnumC3482Mf0 A02;
    public static final EnumC3482Mf0 A03;
    public static final EnumC3482Mf0 A04;

    static {
        EnumC3482Mf0 enumC3482Mf0 = new EnumC3482Mf0("DEFAULT", 0);
        A02 = enumC3482Mf0;
        EnumC3482Mf0 enumC3482Mf02 = new EnumC3482Mf0("SIMPLE", 1);
        A03 = enumC3482Mf02;
        EnumC3482Mf0 enumC3482Mf03 = new EnumC3482Mf0("TAGGING", 2);
        A04 = enumC3482Mf03;
        EnumC3482Mf0[] enumC3482Mf0Arr = {enumC3482Mf0, enumC3482Mf02, enumC3482Mf03, new EnumC3482Mf0("MUSIC", 3)};
        A01 = enumC3482Mf0Arr;
        A00 = C00t.A00(enumC3482Mf0Arr);
    }

    public EnumC3482Mf0(String str, int i) {
    }

    public static EnumC3482Mf0 valueOf(String str) {
        return (EnumC3482Mf0) Enum.valueOf(EnumC3482Mf0.class, str);
    }

    public static EnumC3482Mf0[] values() {
        return (EnumC3482Mf0[]) A01.clone();
    }
}
