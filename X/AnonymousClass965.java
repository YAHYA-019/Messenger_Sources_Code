package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.965, reason: invalid class name */
/* loaded from: 965.class */
public final class AnonymousClass965 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass965[] A01;
    public static final AnonymousClass965 A02;
    public static final AnonymousClass965 A03;
    public static final AnonymousClass965 A04;
    public static final AnonymousClass965 A05;
    public static final AnonymousClass965 A06;

    static {
        AnonymousClass965 anonymousClass965 = new AnonymousClass965("Gdrive", 0);
        A04 = anonymousClass965;
        AnonymousClass965 anonymousClass9652 = new AnonymousClass965("Pin", 1);
        A05 = anonymousClass9652;
        AnonymousClass965 anonymousClass9653 = new AnonymousClass965("StoreLocally", 2);
        A06 = anonymousClass9653;
        AnonymousClass965 anonymousClass9654 = new AnonymousClass965("FortyDigitCode", 3);
        A03 = anonymousClass9654;
        AnonymousClass965 anonymousClass9655 = new AnonymousClass965("Back", 4);
        A02 = anonymousClass9655;
        AnonymousClass965[] anonymousClass965Arr = {anonymousClass965, anonymousClass9652, anonymousClass9653, anonymousClass9654, anonymousClass9655};
        A01 = anonymousClass965Arr;
        A00 = C00t.A00(anonymousClass965Arr);
    }

    public AnonymousClass965(String str, int i) {
    }

    public static AnonymousClass965 valueOf(String str) {
        return (AnonymousClass965) Enum.valueOf(AnonymousClass965.class, str);
    }

    public static AnonymousClass965[] values() {
        return (AnonymousClass965[]) A01.clone();
    }
}
