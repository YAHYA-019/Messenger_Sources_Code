package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95u, reason: invalid class name */
/* loaded from: 95u.class */
public final class C95u {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95u[] A01;
    public static final C95u A02;
    public static final C95u A03;
    public static final C95u A04;

    static {
        C95u c95u = new C95u("EMPTY", 0);
        A03 = c95u;
        C95u c95u2 = new C95u("ACTIVE", 1);
        A02 = c95u2;
        C95u c95u3 = new C95u("IDLE", 2);
        A04 = c95u3;
        C95u[] c95uArr = {c95u, c95u2, c95u3};
        A01 = c95uArr;
        A00 = C00t.A00(c95uArr);
    }

    public C95u(String str, int i) {
    }

    public static C95u valueOf(String str) {
        return (C95u) Enum.valueOf(C95u.class, str);
    }

    public static C95u[] values() {
        return (C95u[]) A01.clone();
    }
}
