package X;

import com.facebook.acra.constants.ActionId;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.889, reason: invalid class name */
/* loaded from: 889.class */
public final class AnonymousClass889 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ AnonymousClass889[] A01;
    public static final AnonymousClass889 A02;
    public static final AnonymousClass889 A03;
    public static final AnonymousClass889 A04;
    public static final AnonymousClass889 A05;
    public static final AnonymousClass889 A06;
    public final int cardHeightDp;
    public final float cardRotationDeg;
    public final int cardWidthDp;
    public final int cardWithShadowHeightDp;
    public final int cardWithShadowWidthDp;
    public final int cornerRadiusDp;
    public final boolean hasDefaultBorder;
    public final int maxCard;
    public final float offsetPercentage;
    public final int stackWidthDp;
    public final int xmaBottomMarginDp;

    static {
        AnonymousClass889 anonymousClass889 = new AnonymousClass889("SQUARE", 1.0f, 4.0f, 0, ActionId.OFFLINE, ActionId.OFFLINE, 240, 16, 16, 4, false);
        A05 = anonymousClass889;
        AnonymousClass889 anonymousClass8892 = new AnonymousClass889("SMALL_SQUARE", 0.5f, 12.0f, 1, 48, 48, 64, 6, 6, 2, true);
        A04 = anonymousClass8892;
        AnonymousClass889 anonymousClass8893 = new AnonymousClass889("MEDIUM_SQUARE", 1.0f, 4.0f, 2, ActionId.VIEW_DID_LOAD_BEGIN, ActionId.VIEW_DID_LOAD_BEGIN, ActionId.OFFLINE, 16, 6, 4, false);
        A02 = anonymousClass8893;
        AnonymousClass889 anonymousClass8894 = new AnonymousClass889("SQUARE_V2", 0.6f, 4.0f, 3, ActionId.OFFLINE, ActionId.OFFLINE, 194, 18, 0, 4, false);
        A06 = anonymousClass8894;
        AnonymousClass889 anonymousClass8895 = new AnonymousClass889("RECTANGLE", 1.0f, 4.0f, 4, 213, ActionId.OFFLINE, 224, 16, 16, 4, false);
        A03 = anonymousClass8895;
        AnonymousClass889[] anonymousClass889Arr = {anonymousClass889, anonymousClass8892, anonymousClass8893, anonymousClass8894, anonymousClass8895};
        A01 = anonymousClass889Arr;
        A00 = C00t.A00(anonymousClass889Arr);
    }

    public AnonymousClass889(String str, float f, float f2, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.cardHeightDp = i2;
        this.cardWidthDp = i3;
        this.stackWidthDp = i4;
        this.cornerRadiusDp = i5;
        this.offsetPercentage = f;
        this.xmaBottomMarginDp = i6;
        this.cardRotationDeg = f2;
        this.maxCard = i7;
        this.hasDefaultBorder = z;
        this.cardWithShadowHeightDp = i2 + 16;
        this.cardWithShadowWidthDp = i3 + 16;
    }

    public static AnonymousClass889 valueOf(String str) {
        return (AnonymousClass889) Enum.valueOf(AnonymousClass889.class, str);
    }

    public static AnonymousClass889[] values() {
        return (AnonymousClass889[]) A01.clone();
    }
}
