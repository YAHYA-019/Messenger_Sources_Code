package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2ik, reason: invalid class name */
/* loaded from: 2ik.class */
public final class C2ik {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C2ik[] A01;
    public static final C2ik A02;
    public static final C2ik A03;

    static {
        C2ik c2ik = new C2ik("SENDER", 0);
        A03 = c2ik;
        C2ik c2ik2 = new C2ik("RECEIVER", 1);
        A02 = c2ik2;
        C2ik[] c2ikArr = {c2ik, c2ik2};
        A01 = c2ikArr;
        A00 = C00t.A00(c2ikArr);
    }

    public C2ik(String str, int i) {
    }

    public static C2ik valueOf(String str) {
        return (C2ik) Enum.valueOf(C2ik.class, str);
    }

    public static C2ik[] values() {
        return (C2ik[]) A01.clone();
    }
}
