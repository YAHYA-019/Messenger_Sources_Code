package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6bK, reason: invalid class name */
/* loaded from: 6bK.class */
public final class C6bK {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6bK[] A01;
    public static final C6bK A02;
    public static final C6bK A03;

    static {
        C6bK c6bK = new C6bK("PREALLOCATE", 0);
        A02 = c6bK;
        C6bK c6bK2 = new C6bK("RENDERER", 1);
        A03 = c6bK2;
        C6bK[] c6bKArr = {c6bK, c6bK2};
        A01 = c6bKArr;
        A00 = C00t.A00(c6bKArr);
    }

    public C6bK(String str, int i) {
    }

    public static C6bK valueOf(String str) {
        return (C6bK) Enum.valueOf(C6bK.class, str);
    }

    public static C6bK[] values() {
        return (C6bK[]) A01.clone();
    }
}
