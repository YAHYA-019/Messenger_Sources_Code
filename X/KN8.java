package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KN8.class */
public final class KN8 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KN8[] A01;
    public static final KN8 A02;
    public static final KN8 A03;
    public static final KN8 A04;
    public static final KN8 A05;
    public static final KN8 A06;
    public static final KN8 A07;

    static {
        KN8 kn8 = new KN8("NOT_A_JSON_OBJECT", 0);
        A03 = kn8;
        KN8 kn82 = new KN8("NO_PRF_FIELD", 1);
        A04 = kn82;
        KN8 kn83 = new KN8("PRF_NOT_ENABLED", 2);
        A05 = kn83;
        KN8 kn84 = new KN8("FIRST_EVAL_MISSING", 3);
        A02 = kn84;
        KN8 kn85 = new KN8("WRONG_ENCODING", 4);
        A06 = kn85;
        KN8 kn86 = new KN8("WRONG_RESULT_LENGTH", 5);
        A07 = kn86;
        KN8[] kn8Arr = {kn8, kn82, kn83, kn84, kn85, kn86};
        A01 = kn8Arr;
        A00 = C00t.A00(kn8Arr);
    }

    public KN8(String str, int i) {
    }

    public static KN8 valueOf(String str) {
        return (KN8) Enum.valueOf(KN8.class, str);
    }

    public static KN8[] values() {
        return (KN8[]) A01.clone();
    }
}
