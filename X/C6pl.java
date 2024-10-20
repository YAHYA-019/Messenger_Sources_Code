package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.common.util.TriState;
import com.facebook.graphql.enums.GraphQLStickerState;
import com.facebook.graphql.enums.GraphQLStickerType;
import com.facebook.inject.FbInjector;
import com.facebook.stickers.model.Sticker;
import com.facebook.stickers.model.StickerCapabilities;
import com.facebook.stickers.model.StickerPack;
import com.google.common.collect.ImmutableList;

/* renamed from: X.6pl, reason: invalid class name */
/* loaded from: 6pl.class */
public final class C6pl {
    public Float A00;
    public final Context A01;
    public final Boolean A02;
    public final 5Yf A03;
    public final C6pm A04;

    public C6pl() {
        Context A00 = FbInjector.A00();
        this.A01 = A00;
        this.A04 = (C6pm) 1Bi.A03(50154);
        2yD r0 = (2yD) 1Bi.A03(16385);
        this.A03 = (5Yf) 1Hv.A02(A00, 84088);
        this.A02 = Boolean.valueOf(r0.AZk(36314953510101331L));
    }

    public static int A00(C6pl c6pl) {
        Resources resources = c6pl.A01.getResources();
        int i = resources.getDisplayMetrics().widthPixels;
        Hh5 A00 = 7kT.A00(resources, c6pl.A04.A00, i, i - resources.getDimensionPixelSize(2132279437));
        return (A00.A01 - A00.A03) - A00.A04;
    }

    public static Uri A01(2JX r301) {
        String A0r;
        Uri uri = null;
        if (r301 != null && (A0r = r301.A0r(116076)) != null) {
            uri = C0A2.A03(A0r);
        }
        return uri;
    }

    public static StickerCapabilities A02(C7z7 c7z7) {
        TriState valueOf = TriState.valueOf(c7z7.Ary());
        TriState valueOf2 = TriState.valueOf(c7z7.Arz());
        TriState valueOf3 = TriState.valueOf(c7z7.AsB());
        TriState valueOf4 = TriState.valueOf(c7z7.AsI());
        TriState valueOf5 = TriState.valueOf(c7z7.AsG());
        return 7Qn.A01(valueOf, valueOf2, valueOf3, TriState.valueOf(c7z7.AsC()), TriState.valueOf(c7z7.AsD()), valueOf5, valueOf4);
    }

    public static StickerPack A03(7eR r301) {
        ImmutableList A0c;
        String A0r;
        String A0r2;
        String A0r3;
        2JY A0L = r301.A0L(-687617957, 2JX.class, -715416304);
        if (A0L == null) {
            throw new RuntimeException("node tray_button is missing");
        }
        String A0r4 = r301.A0r(3355);
        11T.A0F(A0r4, 0);
        String A0r5 = r301.A0r(3373707);
        String A0r6 = r301.A0r(-1409097913);
        String A0r7 = r301.A0r(-1724546052);
        2JY A0L2 = r301.A0L(2074606664, 2JX.class, -60314278);
        Uri A03 = (A0L2 == null || (A0r3 = A0L2.A0r(116076)) == null) ? null : C0A2.A03(A0r3);
        2JY A0L3 = r301.A0L(696777252, 2JX.class, -60314278);
        Uri A032 = (A0L3 == null || (A0r2 = A0L3.A0r(116076)) == null) ? null : C0A2.A03(A0r2);
        2JY A0L4 = A0L.A0L(-1039745817, 2JX.class, -60314278);
        Uri A033 = (A0L4 == null || (A0r = A0L4.A0r(116076)) == null) ? null : C0A2.A03(A0r);
        int intValue = r301.getIntValue(106934601);
        long timeValue = r301.getTimeValue(-472881199);
        boolean booleanValue = r301.getBooleanValue(1785469597);
        boolean booleanValue2 = r301.getBooleanValue(-1025689693);
        boolean booleanValue3 = r301.getBooleanValue(-1473037314);
        boolean booleanValue4 = r301.getBooleanValue(-834872350);
        boolean booleanValue5 = r301.getBooleanValue(-1234615273);
        boolean booleanValue6 = r301.getBooleanValue(-1730642919);
        boolean booleanValue7 = r301.getBooleanValue(-237239854);
        StickerCapabilities A01 = 7Qn.A01(TriState.valueOf(r301.getBooleanValue(2131704662)), TriState.valueOf(r301.getBooleanValue(-1687276926)), TriState.valueOf(r301.getBooleanValue(-418104533)), TriState.valueOf(r301.getBooleanValue(647178427)), TriState.valueOf(r301.getBooleanValue(-1672298513)), TriState.valueOf(r301.getBooleanValue(1061423467)), TriState.valueOf(r301.getBooleanValue(-772418639)));
        ImmutableList A0Z = r301.A0Z(-35060340);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        2JY A0L5 = r301.A0L(1531715286, 2JX.class, -348313025);
        if (A0L5 != null && (A0c = A0L5.A0c(104993457, 2JX.class, -581489812)) != null) {
            1Du it = A0c.iterator();
            while (it.hasNext()) {
                builder.m11011add((Object) ((2JY) it.next()).A0r(3355));
            }
        }
        return new StickerPack(A032, A033, null, A03, A01, A0r6, A0r7, A0r4, A0r5, A0Z, builder.build(), intValue, timeValue, booleanValue5, false, booleanValue, booleanValue2, booleanValue3, booleanValue7, booleanValue4, booleanValue6);
    }

    public Sticker A04(7eU r302) {
        GraphQLStickerType graphQLStickerType = (GraphQLStickerType) r302.A0g(GraphQLStickerType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, -2030994180);
        C7z7 c7z7 = (C7en) r302.A0L(3432985, C7en.class, -1755654713);
        if (c7z7 == null && graphQLStickerType == GraphQLStickerType.PAIR_AI_GENERATED) {
            c7z7 = new Igb(this);
        }
        String A0r = r302.A0r(3355);
        if (A0r != null) {
            2JX A0L = 1BL.A0L(r302, -277615898, -60314278);
            if (A01(A0L) != null) {
                GraphQLStickerType graphQLStickerType2 = GraphQLStickerType.AVATAR;
                if (graphQLStickerType != graphQLStickerType2) {
                    if (c7z7 == null) {
                        throw new RuntimeException("node pack is missing");
                    }
                    String id = c7z7.getId();
                    11T.A0F(id, 0);
                    String A0r2 = r302.A0r(102727412);
                    Uri A01 = A01(A0L);
                    11T.A0F(A01, 0);
                    Uri A012 = A01(1BL.A0L(r302, -1421463617, -60314278));
                    Uri A013 = A01(r302.A0L(696777252, 2JX.class, -60314278));
                    StickerCapabilities A02 = A02(c7z7);
                    Uri A014 = A01(r302.A0L(-1929818138, 2JX.class, -60314278));
                    String A0r3 = r302.A0r(-852058268);
                    Uri A03 = A0r3 != null ? C0A2.A03(A0r3) : null;
                    String A0r4 = r302.A0r(468458700);
                    return new Sticker(A01, null, A012, null, A013, null, A014, A03, A0r4 != null ? C0A2.A03(A0r4) : null, (GraphQLStickerState) r302.A0g(GraphQLStickerState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, 1462603535), graphQLStickerType, A02, A0r, id, A0r2, null, null, 0, false);
                }
                String A0r5 = r302.A0r(3355);
                11T.A0F(A0r5, 0);
                2JY A0L2 = r302.A0L(-1599248542, 7eS.class, 1518210797);
                String A0r6 = A0L2 == null ? null : A0L2.A0r(3355);
                String A0r7 = A0L2 == null ? null : A0L2.A0r(3373707);
                String A0r8 = r302.A0r(102727412);
                Uri A015 = A01(A0L);
                11T.A0F(A015, 0);
                Uri A016 = A01(1BL.A0L(r302, -1421463617, -60314278));
                Uri A017 = A01(r302.A0L(696777252, 2JX.class, -60314278));
                String A0r9 = r302.A0r(-852058268);
                Uri A032 = A0r9 != null ? C0A2.A03(A0r9) : null;
                String A0r10 = r302.A0r(468458700);
                Uri A033 = A0r10 != null ? C0A2.A03(A0r10) : null;
                TriState valueOf = TriState.valueOf(true);
                return new Sticker(A015, null, A016, null, A017, null, null, A032, A033, null, graphQLStickerType2, new StickerCapabilities(valueOf, valueOf, valueOf, valueOf, valueOf, valueOf, valueOf), A0r5, "2191329907595522", A0r8, A0r6, A0r7, 0, r302.getBooleanValue(1371047461));
            }
        }
        throw new RuntimeException("Either sticker id or static web uri is missing");
    }

    public String A05() {
        Float f = this.A00;
        if (f == null) {
            f = Float.valueOf(Math.min(this.A01.getResources().getDisplayMetrics().density, 3.0f));
            this.A00 = f;
        }
        return String.valueOf(f);
    }

    public void A06(2Jf r302) {
        String str;
        r302.A02(Integer.valueOf(A00(this)), "preview_size");
        str = "image/webp";
        r302.A02(str, "animated_media_type");
        r302.A02(this.A02.booleanValue() ? "image/webp" : "image/png", "media_type");
        r302.A02(A05(), "scaling_factor");
        r302.A02(Boolean.valueOf(AnonymousClass524.A01(this.A03.A00, true)), "sticker_labels_enabled");
    }
}
