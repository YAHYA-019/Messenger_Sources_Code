package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.20M, reason: invalid class name */
/* loaded from: 20M.class */
public final class C20M {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C20M[] A02;
    public static final C20M A03;
    public final int value;

    static {
        C20M c20m = new C20M("TAKEN_DOWN", 0, 1);
        A03 = c20m;
        C20M[] c20mArr = {c20m, new C20M("RESTORED", 1, 2)};
        A02 = c20mArr;
        A01 = C00t.A00(c20mArr);
        A00 = C01g.A01(20P.A00);
    }

    public C20M(String str, int i, int i2) {
        this.value = i2;
    }

    public static C20M valueOf(String str) {
        return (C20M) Enum.valueOf(C20M.class, str);
    }

    public static C20M[] values() {
        return (C20M[]) A02.clone();
    }
}
