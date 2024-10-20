package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Mes, reason: case insensitive filesystem */
/* loaded from: Mes.class */
public final class EnumC3474Mes {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC3474Mes[] A01;
    public static final EnumC3474Mes A02;
    public static final EnumC3474Mes A03;

    static {
        EnumC3474Mes enumC3474Mes = new EnumC3474Mes("VOLUME_BUTTON", 0);
        A03 = enumC3474Mes;
        EnumC3474Mes enumC3474Mes2 = new EnumC3474Mes("CAPTURE_BUTTON", 1);
        A02 = enumC3474Mes2;
        EnumC3474Mes[] enumC3474MesArr = {enumC3474Mes, enumC3474Mes2};
        A01 = enumC3474MesArr;
        A00 = C00t.A00(enumC3474MesArr);
    }

    public EnumC3474Mes(String str, int i) {
    }

    public static EnumC3474Mes valueOf(String str) {
        return (EnumC3474Mes) Enum.valueOf(EnumC3474Mes.class, str);
    }

    public static EnumC3474Mes[] values() {
        return (EnumC3474Mes[]) A01.clone();
    }
}
