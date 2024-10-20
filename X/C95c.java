package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95c, reason: invalid class name */
/* loaded from: 95c.class */
public final class C95c {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95c[] A01;
    public static final C95c A02;
    public static final C95c A03;
    public static final C95c A04;

    static {
        C95c c95c = new C95c("OTC", 0);
        A03 = c95c;
        C95c c95c2 = new C95c("OTCAndRecoveryCode", 1);
        A04 = c95c2;
        C95c c95c3 = new C95c("Base", 2);
        A02 = c95c3;
        C95c[] c95cArr = {c95c, c95c2, c95c3};
        A01 = c95cArr;
        A00 = C00t.A00(c95cArr);
    }

    public C95c(String str, int i) {
    }

    public static C95c valueOf(String str) {
        return (C95c) Enum.valueOf(C95c.class, str);
    }

    public static C95c[] values() {
        return (C95c[]) A01.clone();
    }
}
