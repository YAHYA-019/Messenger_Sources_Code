package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.65r, reason: invalid class name */
/* loaded from: 65r.class */
public final class C65r {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C65r[] A01;
    public static final C65r A02;
    public static final C65r A03;
    public static final C65r A04;
    public static final C65r A05;
    public static final C65r A06;
    public static final C65r A07;
    public static final C65r A08;
    public static final C65r A09;
    public static final C65r A0A;
    public static final C65r A0B;
    public static final C65r A0C;
    public static final C65r A0D;
    public static final C65r A0E;
    public final C65s category;

    static {
        C65r c65r = new C65r(C65s.A07, "MISLEADING_NEWS", 0);
        A09 = c65r;
        C65r c65r2 = new C65r(C65s.A06, "MISSING_CONTEXT", 1);
        A0A = c65r2;
        C65r c65r3 = new C65r(C65s.A03, "ALTERED_MEDIA", 2);
        A03 = c65r3;
        C65r c65r4 = new C65r(C65s.A02, "AI_GENERATED_CONTENT", 3);
        A02 = c65r4;
        C65s c65s = C65s.A08;
        C65r c65r5 = new C65r(c65s, "CHILD_ABUSE", 4);
        A04 = c65r5;
        C65r c65r6 = new C65r(c65s, "CRUEL", 5);
        A05 = c65r6;
        C65r c65r7 = new C65r(c65s, "SENSITIVE", 6);
        A0B = c65r7;
        C65r c65r8 = new C65r(c65s, "VIOLENCE", 7);
        A0C = c65r8;
        C65s c65s2 = C65s.A05;
        C65r c65r9 = new C65r(c65s2, "FALSE_NEWS", 8);
        A07 = c65r9;
        C65r c65r10 = new C65r(c65s2, "GRAPHIC_MISINFO", 9);
        A08 = c65r10;
        C65r c65r11 = new C65r(c65s2, "WIDELY_DEBUNKED_HOAX_COVID", 10);
        A0D = c65r11;
        C65r c65r12 = new C65r(c65s2, "WIDELY_DEBUNKED_HOAX_VACCINE", 11);
        A0E = c65r12;
        C65r c65r13 = new C65r(C65s.A04, "DEFAULT", 12);
        A06 = c65r13;
        C65r[] c65rArr = {c65r, c65r2, c65r3, c65r4, c65r5, c65r6, c65r7, c65r8, c65r9, c65r10, c65r11, c65r12, c65r13};
        A01 = c65rArr;
        A00 = C00t.A00(c65rArr);
    }

    public C65r(C65s c65s, String str, int i) {
        this.category = c65s;
    }

    public static C65r valueOf(String str) {
        return (C65r) Enum.valueOf(C65r.class, str);
    }

    public static C65r[] values() {
        return (C65r[]) A01.clone();
    }
}
