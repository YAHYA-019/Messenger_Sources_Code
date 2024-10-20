package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KN4.class */
public final class KN4 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KN4[] A01;
    public static final KN4 A02;
    public static final KN4 A03;
    public static final KN4 A04;
    public static final KN4 A05;
    public static final KN4 A06;

    static {
        KN4 kn4 = new KN4("PROMPTED_SYSTEM_AUTOFILL", 0);
        A06 = kn4;
        KN4 kn42 = new KN4("ACCEPTED_SYSTEM_AUTOFILL", 1);
        A02 = kn42;
        KN4 kn43 = new KN4("DECLINED_SYSTEM_AUTOFILL", 2);
        A04 = kn43;
        KN4 kn44 = new KN4("NOT_PROMPTED_SYSTEM_AUTOFILL", 3);
        A05 = kn44;
        KN4 kn45 = new KN4("AUTOFILL_MANAGER_CANCEL_SUCCESS", 4);
        A03 = kn45;
        KN4[] kn4Arr = {kn4, kn42, kn43, kn44, kn45, new KN4("AUTOFILL_MANAGER_CANCEL_FAILURE", 5)};
        A01 = kn4Arr;
        A00 = C00t.A00(kn4Arr);
    }

    public KN4(String str, int i) {
    }

    public static KN4 valueOf(String str) {
        return (KN4) Enum.valueOf(KN4.class, str);
    }

    public static KN4[] values() {
        return (KN4[]) A01.clone();
    }
}
