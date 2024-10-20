package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.96b, reason: invalid class name */
/* loaded from: 96b.class */
public final class C96b {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C96b[] A01;
    public static final C96b A02;
    public static final C96b A03;
    public static final C96b A04;
    public static final C96b A05;
    public final C96p type;

    static {
        C96b c96b = new C96b(C96p.A06, "Gdrive", 0);
        A03 = c96b;
        C96b c96b2 = new C96b(C96p.A08, "Pin", 1);
        A05 = c96b2;
        C96b c96b3 = new C96b(C96p.A0D, "FortyDigitCode", 2);
        A02 = c96b3;
        C96b c96b4 = new C96b(null, "OTC", 3);
        A04 = c96b4;
        C96b[] c96bArr = {c96b, c96b2, c96b3, c96b4};
        A01 = c96bArr;
        A00 = C00t.A00(c96bArr);
    }

    public C96b(C96p c96p, String str, int i) {
        this.type = c96p;
    }

    public static C96b valueOf(String str) {
        return (C96b) Enum.valueOf(C96b.class, str);
    }

    public static C96b[] values() {
        return (C96b[]) A01.clone();
    }
}
