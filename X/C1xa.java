package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1xa, reason: invalid class name */
/* loaded from: 1xa.class */
public final class C1xa {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1xa[] A01;
    public static final C1xa A02;
    public static final C1xa A03;
    public static final C1xa A04;
    public static final C1xa A05;
    public static final C1xa A06;
    public static final C1xa A07;
    public final int calendarMapping;
    public final String capitalizedDay;
    public final int msysValue;

    static {
        C1xa c1xa = new C1xa(0, 7, "SUNDAY", 1, "SUNDAY");
        A04 = c1xa;
        C1xa c1xa2 = new C1xa(1, 1, "MONDAY", 2, "MONDAY");
        A03 = c1xa2;
        C1xa c1xa3 = new C1xa(2, 2, "TUESDAY", 3, "TUESDAY");
        A06 = c1xa3;
        C1xa c1xa4 = new C1xa(3, 3, "WEDNESDAY", 4, "WEDNESDAY");
        A07 = c1xa4;
        C1xa c1xa5 = new C1xa(4, 4, "THURSDAY", 5, "THURSDAY");
        A05 = c1xa5;
        C1xa c1xa6 = new C1xa(5, 5, "FRIDAY", 6, "FRIDAY");
        A02 = c1xa6;
        C1xa[] c1xaArr = {c1xa, c1xa2, c1xa3, c1xa4, c1xa5, c1xa6, new C1xa(6, 6, "SATURDAY", 7, "SATURDAY")};
        A01 = c1xaArr;
        A00 = C00t.A00(c1xaArr);
    }

    public C1xa(int i, int i2, String str, int i3, String str2) {
        this.capitalizedDay = str2;
        this.msysValue = i2;
        this.calendarMapping = i3;
    }

    public static C1xa valueOf(String str) {
        return (C1xa) Enum.valueOf(C1xa.class, str);
    }

    public static C1xa[] values() {
        return (C1xa[]) A01.clone();
    }
}
