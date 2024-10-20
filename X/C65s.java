package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.65s, reason: invalid class name */
/* loaded from: 65s.class */
public final class C65s {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C65s[] A01;
    public static final C65s A02;
    public static final C65s A03;
    public static final C65s A04;
    public static final C65s A05;
    public static final C65s A06;
    public static final C65s A07;
    public static final C65s A08;
    public final C65t xappInformTreatmentCategory;

    static {
        C65s c65s = new C65s(C65t.A07, "PARTLY_FALSE", 0);
        A07 = c65s;
        C65s c65s2 = new C65s(C65t.A06, "MISSING_CONTEXT", 1);
        A06 = c65s2;
        C65s c65s3 = new C65s(C65t.A03, "ALTERED_MEDIA", 2);
        A03 = c65s3;
        C65s c65s4 = new C65s(C65t.A05, "FALSE_INFORMATION", 3);
        A05 = c65s4;
        C65s c65s5 = new C65s(C65t.A08, "SENSITIVE_CONTENT", 4);
        A08 = c65s5;
        C65s c65s6 = new C65s(C65t.A02, "AI_GENERATED_CONTENT", 5);
        A02 = c65s6;
        C65s c65s7 = new C65s(C65t.A04, "DEFAULT", 6);
        A04 = c65s7;
        C65s[] c65sArr = {c65s, c65s2, c65s3, c65s4, c65s5, c65s6, c65s7};
        A01 = c65sArr;
        A00 = C00t.A00(c65sArr);
    }

    public C65s(C65t c65t, String str, int i) {
        this.xappInformTreatmentCategory = c65t;
    }

    public static C65s valueOf(String str) {
        return (C65s) Enum.valueOf(C65s.class, str);
    }

    public static C65s[] values() {
        return (C65s[]) A01.clone();
    }
}
