package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.63c, reason: invalid class name */
/* loaded from: 63c.class */
public final class C63c {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C63c[] A01;
    public static final C63c A02;
    public static final C63c A03;
    public final int value;

    static {
        C63c c63c = new C63c("REGULAR", 0, 0);
        A03 = c63c;
        C63c c63c2 = new C63c("BUMP", 1, 1);
        A02 = c63c2;
        C63c[] c63cArr = {c63c, c63c2};
        A01 = c63cArr;
        A00 = C00t.A00(c63cArr);
    }

    public C63c(String str, int i, int i2) {
        this.value = i2;
    }

    public static C63c valueOf(String str) {
        return (C63c) Enum.valueOf(C63c.class, str);
    }

    public static C63c[] values() {
        return (C63c[]) A01.clone();
    }
}
