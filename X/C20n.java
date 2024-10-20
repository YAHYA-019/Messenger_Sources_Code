package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.20n, reason: invalid class name */
/* loaded from: 20n.class */
public final class C20n {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C20n[] A01;
    public static final C20n A02;
    public static final C20n A03;
    public static final C20n A04;

    static {
        C20n c20n = new C20n("ADVANCED_CRYPTO_TRANSPORT", 0);
        A02 = c20n;
        C20n c20n2 = new C20n("OPEN_THREAD", 1);
        A04 = c20n2;
        C20n c20n3 = new C20n("COMMUNITY_THREAD", 2);
        A03 = c20n3;
        C20n[] c20nArr = {c20n, c20n2, c20n3};
        A01 = c20nArr;
        A00 = C00t.A00(c20nArr);
    }

    public C20n(String str, int i) {
    }

    public static C20n valueOf(String str) {
        return (C20n) Enum.valueOf(C20n.class, str);
    }

    public static C20n[] values() {
        return (C20n[]) A01.clone();
    }
}
