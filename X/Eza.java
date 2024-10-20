package X;

/* loaded from: Eza.class */
public final class Eza {
    public final int A00;
    public final EMg A01;
    public final EPN A02;
    public final EzG A03;
    public final 9cD A04;
    public final C9i3 A05;
    public final RU0 A06;
    public final CharSequence A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public Eza(EMg eMg, EPN epn, EzG ezG, 9cD r305, C9i3 c9i3, RU0 ru0, CharSequence charSequence, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        11T.A0F(num, 12);
        7zP.A1Q(eMg, 13, num2);
        11T.A0F(num3, 15);
        11T.A0F(str2, 18);
        11T.A0F(num4, 31);
        11T.A0F(num5, 35);
        this.A02 = epn;
        this.A05 = c9i3;
        this.A0H = z;
        this.A0Q = z2;
        this.A0E = z3;
        this.A0J = z4;
        this.A0O = z5;
        this.A0P = z6;
        this.A0F = z7;
        this.A08 = num;
        this.A01 = eMg;
        this.A0A = num2;
        this.A09 = num3;
        this.A0C = str;
        this.A0B = str2;
        this.A0G = z8;
        this.A06 = ru0;
        this.A0I = z9;
        this.A0K = z10;
        this.A04 = r305;
        this.A00 = i;
        this.A03 = ezG;
        this.A0L = z11;
        this.A0M = z12;
        this.A07 = charSequence;
        this.A0D = z13;
        this.A0N = z2 && !(z5 && z6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eza)) {
                return false;
            }
            Eza eza = (Eza) obj;
            if (this.A02 != eza.A02 || !11T.A0O(this.A05, eza.A05) || this.A0H != eza.A0H || this.A0Q != eza.A0Q || this.A0E != eza.A0E || this.A0J != eza.A0J || this.A0O != eza.A0O || this.A0P != eza.A0P || this.A0F != eza.A0F || this.A08 != eza.A08 || this.A01 != eza.A01 || this.A0A != eza.A0A || !11T.A0O(this.A0C, eza.A0C) || !11T.A0O(this.A0B, eza.A0B) || this.A0G != eza.A0G || !11T.A0O(this.A06, eza.A06) || this.A0I != eza.A0I || this.A0K != eza.A0K || !11T.A0O(this.A04, eza.A04) || this.A00 != eza.A00 || !11T.A0O(this.A03, eza.A03) || this.A0L != eza.A0L || this.A0M != eza.A0M || !11T.A0O(this.A07, eza.A07) || this.A0D != eza.A0D) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        String str2;
        int i = 1237;
        int A03 = ((((((((((((1BL.A03(this.A02) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass002.A00(this.A0H ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0Q ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0E ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0J ? 1 : 0)) * 31) + 1237) * 31;
        if (this.A0O) {
            i = 1231;
        }
        int A00 = (((((A03 + i) * 31) + AnonymousClass002.A00(this.A0P ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0F ? 1 : 0)) * 31;
        Integer num = this.A08;
        switch (num.intValue()) {
            case 0:
                str = "APPLY";
                break;
            case 1:
                str = "DONE";
                break;
            default:
                str = "SEND";
                break;
        }
        int A05 = AnonymousClass002.A05(this.A01, 7zV.A03(num, str, A00));
        switch (this.A0A.intValue()) {
            case 0:
                str2 = "CREATION";
                break;
            case 1:
                str2 = "EDIT";
                break;
            default:
                str2 = "EMU_EDIT";
                break;
        }
        return ((((((((((((((((((((((((((((AnonymousClass002.A05(this.A06, (AnonymousClass002.A07(this.A0B, (((7zR.A07(str2, r0, A05) - 2032180703) * 31 * 31) + 1BL.A05(this.A0C)) * 31) + AnonymousClass002.A00(this.A0G ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0I ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0K ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + this.A00) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass002.A00(this.A0L ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0M ? 1 : 0)) * 31) + 1237) * 31) + 1237) * 31 * 31) + 2433880) * 31) + 4YU.A03(this.A07)) * 31) + AnonymousClass002.A00(this.A0D ? 1 : 0)) * 31) + 1237) * 31) + 75160172) * 31) + 1237;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImagineCreateParams(source=");
        A0k.append(this.A02);
        DKG.A1Y(A0k, ", sourceStringOverride=");
        A0k.append(", promptParams=");
        A0k.append(this.A05);
        A0k.append(", isEditingEnabled=");
        A0k.append(this.A0H);
        A0k.append(", isFlashEnabled=");
        A0k.append(this.A0Q);
        A0k.append(", isAnimateEnabled=");
        A0k.append(this.A0E);
        A0k.append(", isMEmuEnabled=");
        A0k.append(this.A0J);
        4YV.A1Q(A0k, ", isIgPersonalizationEnabled=");
        A0k.append(", useGridForResults=");
        A0k.append(this.A0O);
        A0k.append(", useVScrollGridForSuggestions=");
        A0k.append(this.A0P);
        A0k.append(", isDarkModeForced=");
        A0k.append(this.A0F);
        A0k.append(", actionButtonText=");
        switch (this.A08.intValue()) {
            case 0:
                str = "APPLY";
                break;
            case 1:
                str = "DONE";
                break;
            default:
                str = "SEND";
                break;
        }
        A0k.append(str);
        A0k.append(", imageAspectRatio=");
        A0k.append(this.A01);
        A0k.append(", launchWithFeature=");
        switch (this.A0A.intValue()) {
            case 0:
                str2 = "CREATION";
                break;
            case 1:
                str2 = "EDIT";
                break;
            default:
                str2 = "EMU_EDIT";
                break;
        }
        A0k.append(str2);
        A0k.append(", imagineIceBreakerType=");
        A0k.append("DEFAULT");
        DKG.A1Y(A0k, ", appSessionId=");
        A0k.append(", surfaceSessionId=");
        A0k.append(this.A0C);
        A0k.append(", bottomSheetSessionId=");
        A0k.append(this.A0B);
        A0k.append(", isE2EE=");
        A0k.append(this.A0G);
        A0k.append(", loggingParams=");
        A0k.append(this.A06);
        A0k.append(", isEmuEditEnabled=");
        A0k.append(this.A0I);
        A0k.append(", isTapToSelectEnabled=");
        A0k.append(this.A0K);
        A0k.append(", popoverParams=");
        A0k.append(this.A04);
        A0k.append(", numberOfImagesToGenerate=");
        A0k.append(this.A00);
        A0k.append(", mediaEditParams=");
        A0k.append(this.A03);
        A0k.append(", persistSession=");
        A0k.append(this.A0L);
        A0k.append(", restoreSession=");
        A0k.append(this.A0M);
        A0k.append(", isMEmuOnlyCreation=");
        A0k.append(false);
        A0k.append(", keepBottomSheetOpenOnSuccess=");
        A0k.append(false);
        DKG.A1Y(A0k, ", textInputPlaceholderText=");
        A0k.append(", suggestionToResultPassthrough=");
        A0k.append("None");
        A0k.append(", headerSubtitleText=");
        A0k.append((Object) this.A07);
        A0k.append(", enableMEmuSpotlight=");
        A0k.append(this.A0D);
        A0k.append(", allowBackNavWhenResultsIsInitialScreen=");
        A0k.append(false);
        A0k.append(", promptSummarizationStrategy=");
        A0k.append("Never");
        A0k.append(", enableTopicalResults=");
        return DKH.A0q(A0k, false);
    }
}
