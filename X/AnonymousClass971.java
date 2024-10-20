package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.971, reason: invalid class name */
/* loaded from: 971.class */
public final class AnonymousClass971 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass971[] A01;
    public static final AnonymousClass971 A02;
    public static final AnonymousClass971 A03;
    public static final AnonymousClass971 A04;
    public static final AnonymousClass971 A05;
    public static final AnonymousClass971 A06;
    public static final AnonymousClass971 A07;
    public static final AnonymousClass971 A08;
    public static final AnonymousClass971 A09;
    public final C1u3 iconName;
    public final String promptTextForLogging;
    public final int stringRes;
    public final 96F type;

    static {
        AnonymousClass971 anonymousClass971 = new AnonymousClass971(C1u3.A4l, 96F.A07, "REPHRASE", "rephrase", 0, 2131964371);
        A07 = anonymousClass971;
        C1u3 c1u3 = C1u3.A2p;
        AnonymousClass971 anonymousClass9712 = new AnonymousClass971(c1u3, 96F.A04, "MAKE_FUNNIER", "make funnier", 1, 2131958995);
        A04 = anonymousClass9712;
        AnonymousClass971 anonymousClass9713 = new AnonymousClass971(C1u3.A5e, 96F.A09, "SHORTEN", "make shorter", 2, 2131965962);
        A09 = anonymousClass9713;
        AnonymousClass971 anonymousClass9714 = new AnonymousClass971(C1u3.A3m, 96F.A05, "MAKE_SUPPORTIVE", "make supportive", 3, 2131958997);
        A05 = anonymousClass9714;
        AnonymousClass971 anonymousClass9715 = new AnonymousClass971(C1u3.A2k, 96F.A02, "ADD_EMOJIS", "add emoji", 4, 2131952327);
        A02 = anonymousClass9715;
        AnonymousClass971 anonymousClass9716 = new AnonymousClass971(C1u3.A4E, 96F.A06, "PROOFREAD", "fix grammar", 5, 2131963952);
        A06 = anonymousClass9716;
        AnonymousClass971 anonymousClass9717 = new AnonymousClass971(c1u3, 96F.A03, "ADD_PUNS", "add puns", 6, 2131952367);
        A03 = anonymousClass9717;
        AnonymousClass971 anonymousClass9718 = new AnonymousClass971(C1u3.A2i, 96F.A08, "SARCASTIC", "make sarcastic", 7, 2131965416);
        A08 = anonymousClass9718;
        AnonymousClass971[] anonymousClass971Arr = {anonymousClass971, anonymousClass9712, anonymousClass9713, anonymousClass9714, anonymousClass9715, anonymousClass9716, anonymousClass9717, anonymousClass9718};
        A01 = anonymousClass971Arr;
        A00 = C00t.A00(anonymousClass971Arr);
    }

    public AnonymousClass971(C1u3 c1u3, 96F r303, String str, String str2, int i, int i2) {
        this.stringRes = i2;
        this.iconName = c1u3;
        this.type = r303;
        this.promptTextForLogging = str2;
    }

    public static AnonymousClass971 valueOf(String str) {
        return (AnonymousClass971) Enum.valueOf(AnonymousClass971.class, str);
    }

    public static AnonymousClass971[] values() {
        return (AnonymousClass971[]) A01.clone();
    }
}
