package X;

import android.content.res.Resources;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* loaded from: Fce.class */
public final class Fce implements CallerContextable {
    public static final CallerContext A02 = CallerContext.A08(Fce.class, "quick_promotion_interstitial");
    public static final String __redex_internal_original_name = "QuickPromotionImageFetcher";
    public final 1BP A01 = FbInjector.A00;
    public final 1Br A00 = 1Bq.A00(65609);

    public static final 2Dp A00(QuickPromotionDefinition.Creative creative) {
        String str;
        String str2;
        2IA A01;
        String str3;
        String str4;
        11T.A0F(creative, 0);
        QuickPromotionDefinition.ImageParameters A00 = F2F.A00(creative);
        5Q7 r0 = new 5Q7();
        r0.A00 = -1;
        C06804hy c06804hy = new C06804hy(r0);
        QuickPromotionDefinition.ImageParameters imageParameters = creative.animatedImageParams;
        QuickPromotionDefinition.ImageParameters imageParameters2 = creative.imageParams;
        2Dp r303 = null;
        if (imageParameters == null || (str3 = imageParameters.uri) == null || str3.length() == 0 || A00 == null || (str4 = A00.uri) == null) {
            if (imageParameters2 != null && (str = imageParameters2.uri) != null && str.length() != 0 && A00 != null && (str2 = A00.uri) != null) {
                A01 = 2IA.A01(C0A2.A03(str2));
            }
            return r303;
        }
        A01 = 2IA.A01(C0A2.A03(str4));
        A01.A04 = c06804hy;
        r303 = A01.A04();
        return r303;
    }

    public final int A01(QuickPromotionDefinition.Creative creative, QuickPromotionDefinition.ImageParameters imageParameters) {
        Resources resources;
        int i;
        11T.A0H(imageParameters, creative);
        int i2 = imageParameters.width;
        float f = DKD.A08().density;
        float f2 = imageParameters.scale;
        if (f2 > 0.0f && f < f2) {
            i2 = (int) ((imageParameters.width * (f / f2)) + 0.5d);
        }
        QuickPromotionDefinition.TemplateType templateType = creative.template;
        if (templateType != null && templateType != QuickPromotionDefinition.TemplateType.A0x) {
            int ordinal = templateType.ordinal();
            if (ordinal == 13) {
                resources = FbInjector.A03.getResources();
                i = 2132279360;
            } else if (ordinal == 14) {
                resources = FbInjector.A03.getResources();
                i = 2132279430;
            } else if (ordinal == 3 || ordinal == 4 || ordinal == 5) {
                resources = FbInjector.A03.getResources();
                i = 2132279492;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            float f3 = 0.0f / 0.0f;
            if (dimensionPixelSize != -1) {
                return Math.min(i2, dimensionPixelSize);
            }
        }
        return i2;
    }

    public final ImmutableMap A02(QuickPromotionDefinition quickPromotionDefinition) {
        ImmutableMap.Builder A0c = 1BK.A0c();
        ImmutableList A03 = quickPromotionDefinition.A03();
        int size = A03.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                ImmutableMap build = A0c.build();
                11T.A0A(build);
                return build;
            }
            2Dp A00 = A00((QuickPromotionDefinition.Creative) 4YU.A0q(A03, i2));
            if (A00 != null) {
                DKF.A1U(A0c, A00, i2);
            }
            i = i2 + 1;
        }
    }
}
