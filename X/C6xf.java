package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6xf, reason: invalid class name */
/* loaded from: 6xf.class */
public final class C6xf {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6xf[] A01;
    public static final C6xf A02;
    public static final C6xf A03;
    public static final C6xf A04;
    public static final C6xf A05;

    static {
        C6xf c6xf = new C6xf("GENERATED_STICKERS_EMPLOYEE_DISCLOSURE", 0);
        A03 = c6xf;
        C6xf c6xf2 = new C6xf("GENERATED_STICKERS_PUBLIC_TEST_DISCLOSURE", 1);
        A05 = c6xf2;
        C6xf c6xf3 = new C6xf("GENERATED_STICKERS_E2EE_PUBLIC_TEST_DISCLOSURE", 2);
        A02 = c6xf3;
        C6xf c6xf4 = new C6xf("GENERATED_STICKERS_META_AI_DISCLOSURE", 3);
        A04 = c6xf4;
        C6xf[] c6xfArr = {c6xf, c6xf2, c6xf3, c6xf4};
        A01 = c6xfArr;
        A00 = C00t.A00(c6xfArr);
    }

    public C6xf(String str, int i) {
    }

    public static C6xf valueOf(String str) {
        return (C6xf) Enum.valueOf(C6xf.class, str);
    }

    public static C6xf[] values() {
        return (C6xf[]) A01.clone();
    }
}
