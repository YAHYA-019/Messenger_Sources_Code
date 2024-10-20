package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96o, reason: invalid class name */
/* loaded from: 96o.class */
public final class C96o {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96o[] A01;
    public static final C96o A02;
    public static final C96o A03;
    public static final C96o A04;
    public static final C96o A05;
    public static final C96o A06;
    public static final C96o A07;
    public static final C96o A08;
    public static final C96o A09;
    public static final C96o A0A;
    public static final C96o A0B;
    public static final C96o A0C;
    public static final C96o A0D;
    public static final C96o A0E;
    public final C65t category;

    static {
        C96o c96o = new C96o(C65t.A07, "MISLEADING_NEWS", 0);
        A09 = c96o;
        C96o c96o2 = new C96o(C65t.A06, "MISSING_CONTEXT", 1);
        A0A = c96o2;
        C96o c96o3 = new C96o(C65t.A03, "ALTERED_MEDIA", 2);
        A03 = c96o3;
        C65t c65t = C65t.A08;
        C96o c96o4 = new C96o(c65t, "CHILD_ABUSE", 3);
        A04 = c96o4;
        C96o c96o5 = new C96o(c65t, "CRUEL", 4);
        A05 = c96o5;
        C96o c96o6 = new C96o(c65t, "SENSITIVE", 5);
        A0B = c96o6;
        C96o c96o7 = new C96o(c65t, "VIOLENCE", 6);
        A0C = c96o7;
        C65t c65t2 = C65t.A05;
        C96o c96o8 = new C96o(c65t2, "FALSE_NEWS", 7);
        A07 = c96o8;
        C96o c96o9 = new C96o(c65t2, "GRAPHIC_MISINFO", 8);
        A08 = c96o9;
        C96o c96o10 = new C96o(c65t2, "WIDELY_DEBUNKED_HOAX_COVID", 9);
        A0D = c96o10;
        C96o c96o11 = new C96o(c65t2, "WIDELY_DEBUNKED_HOAX_VACCINE", 10);
        A0E = c96o11;
        C96o c96o12 = new C96o(C65t.A02, "AI_GENERATED_CONTENT", 11);
        A02 = c96o12;
        C96o c96o13 = new C96o(C65t.A04, "DEFAULT", 12);
        A06 = c96o13;
        C96o[] c96oArr = {c96o, c96o2, c96o3, c96o4, c96o5, c96o6, c96o7, c96o8, c96o9, c96o10, c96o11, c96o12, c96o13};
        A01 = c96oArr;
        A00 = C00t.A00(c96oArr);
    }

    public C96o(C65t c65t, String str, int i) {
        this.category = c65t;
    }

    public static C96o valueOf(String str) {
        return (C96o) Enum.valueOf(C96o.class, str);
    }

    public static C96o[] values() {
        return (C96o[]) A01.clone();
    }
}
