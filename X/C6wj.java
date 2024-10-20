package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6wj, reason: invalid class name */
/* loaded from: 6wj.class */
public final class C6wj {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6wj[] A01;
    public static final C6wj A02;
    public static final C6wj A03;

    static {
        C6wj c6wj = new C6wj("DEFAULT_HORIZONTAL", 0);
        A02 = c6wj;
        C6wj c6wj2 = new C6wj("INFINITE_VERTICAL", 1);
        A03 = c6wj2;
        C6wj[] c6wjArr = {c6wj, c6wj2};
        A01 = c6wjArr;
        A00 = C00t.A00(c6wjArr);
    }

    public C6wj(String str, int i) {
    }

    public static C6wj valueOf(String str) {
        return (C6wj) Enum.valueOf(C6wj.class, str);
    }

    public static C6wj[] values() {
        return (C6wj[]) A01.clone();
    }
}
