package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6jR, reason: invalid class name */
/* loaded from: 6jR.class */
public final class C6jR {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6jR[] A01;
    public static final C6jR A02;
    public static final C6jR A03;

    static {
        C6jR c6jR = new C6jR("GROUP", 0);
        A03 = c6jR;
        C6jR c6jR2 = new C6jR("CHAT", 1);
        A02 = c6jR2;
        C6jR[] c6jRArr = {c6jR, c6jR2};
        A01 = c6jRArr;
        A00 = C00t.A00(c6jRArr);
    }

    public C6jR(String str, int i) {
    }

    public static C6jR valueOf(String str) {
        return (C6jR) Enum.valueOf(C6jR.class, str);
    }

    public static C6jR[] values() {
        return (C6jR[]) A01.clone();
    }
}
