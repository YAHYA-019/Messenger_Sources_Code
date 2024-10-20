package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.960, reason: invalid class name */
/* loaded from: 960.class */
public final class AnonymousClass960 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass960[] A01;
    public static final AnonymousClass960 A02;
    public static final AnonymousClass960 A03;
    public static final AnonymousClass960 A04;
    public static final AnonymousClass960 A05;

    static {
        AnonymousClass960 anonymousClass960 = new AnonymousClass960("EMPTY", 0);
        A02 = anonymousClass960;
        AnonymousClass960 anonymousClass9602 = new AnonymousClass960("ERROR", 1);
        A03 = anonymousClass9602;
        AnonymousClass960 anonymousClass9603 = new AnonymousClass960("LOADING", 2);
        A05 = anonymousClass9603;
        AnonymousClass960 anonymousClass9604 = new AnonymousClass960("LOADED", 3);
        A04 = anonymousClass9604;
        AnonymousClass960[] anonymousClass960Arr = {anonymousClass960, anonymousClass9602, anonymousClass9603, anonymousClass9604};
        A01 = anonymousClass960Arr;
        A00 = C00t.A00(anonymousClass960Arr);
    }

    public AnonymousClass960(String str, int i) {
    }

    public static AnonymousClass960 valueOf(String str) {
        return (AnonymousClass960) Enum.valueOf(AnonymousClass960.class, str);
    }

    public static AnonymousClass960[] values() {
        return (AnonymousClass960[]) A01.clone();
    }
}
