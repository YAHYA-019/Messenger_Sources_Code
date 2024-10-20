package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.98O, reason: invalid class name */
/* loaded from: 98O.class */
public final class C98O implements C07n {
    public static final /* synthetic */ C98O[] A00;
    public static final C98O A01;
    public static final C98O A02;
    public static final C98O A03;
    public static final C98O A04;
    public static final C98O A05;
    public static final C98O A06;
    public static final C98O A07;
    public static final C98O A08;
    public static final C98O A09;
    public static final C98O A0A;
    public static final C98O A0B;
    public static final C98O A0C;
    public static final C98O A0D;
    public static final C98O A0E;
    public static final C98O A0F;
    public static final C98O A0G;
    public static final C98O A0H;
    public static final C98O A0I;
    public static final C98O A0J;
    public static final C98O A0K;
    public static final C98O A0L;
    public static final C98O A0M;
    public static final C98O A0N;
    public final long mValue;

    static {
        C98O c98o = new C98O("STICKER_PACK", 0, 0L);
        A0D = c98o;
        C98O c98o2 = new C98O("STICKER_RECENT", 1, 1L);
        A0E = c98o2;
        C98O c98o3 = new C98O("STICKER_SEARCH_TRENDING", 2, 2);
        A0J = c98o3;
        C98O c98o4 = new C98O("STICKER_SEARCH_MANUAL_TYPE", 3, 3);
        A0G = c98o4;
        C98O c98o5 = new C98O("STICKER_SEARCH_RECOMMENDATION_TAG", 4, 4);
        A0I = c98o5;
        C98O c98o6 = new C98O("STICKER_FAVORITE", 5, 5);
        A0C = c98o6;
        C98O c98o7 = new C98O("GIF_RECENT", 6, 6);
        C98O c98o8 = new C98O("GIF_SEARCH_TRENDING", 7, 7);
        A09 = c98o8;
        C98O c98o9 = new C98O("GIF_SEARCH_MANUAL_TYPE", 8, 8);
        A08 = c98o9;
        C98O c98o10 = new C98O("GIF_SEARCH_RECOMMENDATION_TAG", 9, 9);
        C98O c98o11 = new C98O("GIF_FAVORITE", 10, 10);
        C98O c98o12 = new C98O("STICKER_SEARCH_PROACTIVE", 11, 11);
        A0H = c98o12;
        C98O c98o13 = new C98O("SUGGESTED_TAB_SEARCH_TRENDING", 12, 12);
        A0M = c98o13;
        C98O c98o14 = new C98O("SUGGESTED_TAB_SEARCH_MANUAL_TYPE", 13, 13);
        A0K = c98o14;
        C98O c98o15 = new C98O("SUGGESTED_TAB_SEARCH_MANUAL_TYPE_UPSELL", 14, 14);
        A0L = c98o15;
        C98O c98o16 = new C98O("STICKER_SEARCH_AVATAR", 15, 15);
        A0F = c98o16;
        C98O c98o17 = new C98O("GENAI_SEARCH_MANUAL_TYPE", 16, 16);
        A01 = c98o17;
        C98O c98o18 = new C98O("STICKER_IMPORT_PASTE", 17, 17);
        C98O c98o19 = new C98O("GENAI_STICKER_USER_GENERATED", 18, 18);
        A02 = c98o19;
        C98O c98o20 = new C98O("GIF_PREVIEW", 19, 19);
        C98O c98o21 = new C98O("GIF_TRENDING_TAB", 20, 20);
        A0B = c98o21;
        C98O c98o22 = new C98O("GIF_LAUGH_TAB", 21, 21);
        A05 = c98o22;
        C98O c98o23 = new C98O("GIF_LOVE_TAB", 22, 22);
        A06 = c98o23;
        C98O c98o24 = new C98O("GIF_SAD_TAB", 23, 23);
        A07 = c98o24;
        C98O c98o25 = new C98O("GIF_BYE_TAB", 24, 24);
        A03 = c98o25;
        C98O c98o26 = new C98O("GIF_THUMBS_UP_TAB", 25, 25);
        A0A = c98o26;
        C98O c98o27 = new C98O("GIF_CELEBRATION_TAB", 26, 26);
        A04 = c98o27;
        C98O c98o28 = new C98O(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 27, 999L);
        A0N = c98o28;
        C98O[] c98oArr = new C98O[28];
        System.arraycopy(new C98O[]{c98o, c98o2, c98o3, c98o4, c98o5, c98o6, c98o7, c98o8, c98o9, c98o10, c98o11, c98o12, c98o13, c98o14, c98o15, c98o16, c98o17, c98o18, c98o19, c98o20, c98o21, c98o22, c98o23, c98o24, c98o25, c98o26, c98o27}, 0, c98oArr, 0, 27);
        System.arraycopy(new C98O[]{c98o28}, 0, c98oArr, 27, 1);
        A00 = c98oArr;
    }

    public C98O(String str, int i, long j) {
        this.mValue = j;
    }

    public static C98O valueOf(String str) {
        return (C98O) Enum.valueOf(C98O.class, str);
    }

    public static C98O[] values() {
        return (C98O[]) A00.clone();
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.mValue);
    }
}
