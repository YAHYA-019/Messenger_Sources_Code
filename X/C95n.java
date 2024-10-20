package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95n, reason: invalid class name */
/* loaded from: 95n.class */
public final class C95n {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95n[] A01;
    public static final C95n A02;
    public static final C95n A03;
    public static final C95n A04;

    static {
        C95n c95n = new C95n("COMPOSER", 0);
        A02 = c95n;
        C95n c95n2 = new C95n("TEXT_SELECTION", 1);
        A04 = c95n2;
        C95n c95n3 = new C95n("NULL_STATE", 2);
        A03 = c95n3;
        C95n[] c95nArr = {c95n, c95n2, c95n3};
        A01 = c95nArr;
        A00 = C00t.A00(c95nArr);
    }

    public C95n(String str, int i) {
    }

    public static C95n valueOf(String str) {
        return (C95n) Enum.valueOf(C95n.class, str);
    }

    public static C95n[] values() {
        return (C95n[]) A01.clone();
    }
}
