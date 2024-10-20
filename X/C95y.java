package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.95y, reason: invalid class name */
/* loaded from: 95y.class */
public final class C95y {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C95y[] A01;
    public static final C95y A02;
    public static final C95y A03;
    public static final C95y A04;
    public static final C95y A05;

    static {
        C95y c95y = new C95y("Pin", 0);
        A04 = c95y;
        C95y c95y2 = new C95y("Gdrive", 1);
        A03 = c95y2;
        C95y c95y3 = new C95y("StoreLocally", 2);
        A05 = c95y3;
        C95y c95y4 = new C95y("FortyDigitCode", 3);
        A02 = c95y4;
        C95y[] c95yArr = {c95y, c95y2, c95y3, c95y4};
        A01 = c95yArr;
        A00 = C00t.A00(c95yArr);
    }

    public C95y(String str, int i) {
    }

    public static C95y valueOf(String str) {
        return (C95y) Enum.valueOf(C95y.class, str);
    }

    public static C95y[] values() {
        return (C95y[]) A01.clone();
    }
}
