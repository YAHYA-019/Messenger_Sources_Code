package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.969, reason: invalid class name */
/* loaded from: 969.class */
public final class AnonymousClass969 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass969[] A01;
    public static final AnonymousClass969 A02;
    public static final AnonymousClass969 A03;
    public static final AnonymousClass969 A04;
    public static final AnonymousClass969 A05;
    public static final AnonymousClass969 A06;
    public static final AnonymousClass969 A07;

    static {
        AnonymousClass969 anonymousClass969 = new AnonymousClass969("THREAD_VIEW", 0);
        A06 = anonymousClass969;
        AnonymousClass969 anonymousClass9692 = new AnonymousClass969("META_AI_TAB", 1);
        A03 = anonymousClass9692;
        AnonymousClass969 anonymousClass9693 = new AnonymousClass969("INTERSTITIAL_NUX", 2);
        A02 = anonymousClass9693;
        AnonymousClass969 anonymousClass9694 = new AnonymousClass969("SEARCH", 3);
        A05 = anonymousClass9694;
        AnonymousClass969 anonymousClass9695 = new AnonymousClass969("WRITE_WITH_AI", 4);
        A07 = anonymousClass9695;
        AnonymousClass969 anonymousClass9696 = new AnonymousClass969("MULTIMODAL_NUX", 5);
        A04 = anonymousClass9696;
        AnonymousClass969[] anonymousClass969Arr = {anonymousClass969, anonymousClass9692, anonymousClass9693, anonymousClass9694, anonymousClass9695, anonymousClass9696};
        A01 = anonymousClass969Arr;
        A00 = C00t.A00(anonymousClass969Arr);
    }

    public AnonymousClass969(String str, int i) {
    }

    public static AnonymousClass969 valueOf(String str) {
        return (AnonymousClass969) Enum.valueOf(AnonymousClass969.class, str);
    }

    public static AnonymousClass969[] values() {
        return (AnonymousClass969[]) A01.clone();
    }
}
