package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.mobileconfig.factory.module.AdminIdMC;
import java.util.Locale;

/* loaded from: Fcg.class */
public final class Fcg implements CallerContextable {
    public static final C00i A05 = new C00y(new G7B(0));
    public static final String __redex_internal_original_name = "FBIconImpl";
    public final C00i A00;
    public final C00i A01;
    public final 1CO A02 = (1CO) 1Bi.A05(1CO.class, AdminIdMC.class);
    public final C00i A03;
    public final C00i A04;

    public Fcg(C00i c00i, C00i c00i2, C00i c00i3, C00i c00i4) {
        this.A04 = c00i;
        this.A01 = c00i2;
        this.A03 = c00i3;
        this.A00 = c00i4;
    }

    private Drawable A00(Resources resources, GHl gHl, GHm gHm, String str) {
        String str2;
        if (gHm == ERE.A03) {
            return new C6qs(A00(resources, gHl, ERE.A02, str), A00(resources, gHl, ERE.A01, str));
        }
        Integer BAG = gHm.BAG();
        if (BAG == 0S2.A00) {
            this.A00.get();
        }
        String str3 = this.A02.AZk(72339189283356963L) ? "&is_nucleus_global_rollout_enabled=true" : null;
        this.A00.get();
        str2 = "";
        str2 = str3 != null ? 0Pz.A0W(str3, str2) : "";
        float f = resources.getDisplayMetrics().density;
        11T.A0F(str, 0);
        String A01 = A01(str, "_", "-");
        String obj = gHm.toString();
        Locale locale = Locale.US;
        String upperCase = obj.toUpperCase(locale);
        11T.A0F(upperCase, 0);
        try {
            String format = String.format(locale, "%s?set=%s&name=%s&density=%.1f&variant=%s&size=%d", "https://lookaside.facebook.com/assets/key/", BAG.intValue() != 0 ? "meta_brand_design_system_icons_raster" : "facebook_icons", A01, Float.valueOf(f), A01(upperCase, "_", "-"), Integer.valueOf(gHl.BB8()));
            if (!TextUtils.isEmpty(str2)) {
                format = 0Pz.A0W(format, str2);
            }
            Drawable drawable = new 5OF((Paint) null, (2Ff) this.A03.get(), 1BK.A1E(this.A04), 0);
            int ceil = (int) Math.ceil(gHl.BB8() * (resources.getDisplayMetrics().densityDpi / 160.0f));
            drawable.A06(format, ceil, ceil, str);
            ((C3m8) A05.get()).A59(drawable, str, gHm.toString(), gHl.BB8());
            return drawable;
        } catch (NullPointerException e) {
            0fH.A0N(F0U.class, "caught float formatting bug with density == %s ", e, new Object[]{Float.valueOf(f).toString()});
            throw e;
        }
    }

    public static final String A01(String str, String str2, String str3) {
        if (str.length() != 0) {
            if (str.charAt(0) == '_') {
                str = DKC.A19(str, 1);
            }
            str = 0CV.A0W(1BK.A13(str), str2, str3);
        }
        return str;
    }

    public final Drawable A02(Context context, GHk gHk) {
        return A06(context, gHk, ERC.A05, ERE.A01);
    }

    public final Drawable A03(Context context, GHk gHk) {
        return A06(context, gHk, ERC.A03, ERE.A01);
    }

    public final Drawable A04(Context context, GHk gHk) {
        return A06(context, gHk, ERC.A06, ERE.A01);
    }

    public final Drawable A05(Context context, GHk gHk) {
        return A06(context, gHk, ERC.A06, ERE.A02);
    }

    public final Drawable A06(Context context, GHk gHk, GHl gHl, GHm gHm) {
        int ordinal;
        int i;
        if (gHm == ERE.A03) {
            return new C6qs(A06(context, gHk, gHl, ERE.A02), A06(context, gHk, gHl, ERE.A01));
        }
        if (gHk == null || (ordinal = gHk.ordinal()) == 0) {
            this.A00.get();
            return A07(context, gHl, gHm, "___NOT_AN_ICON");
        }
        Drawable drawable = null;
        this.A01.get();
        switch ((ordinal << 8) | (gHk.BAG().intValue() << 24) | (gHm.ordinal() << 5) | gHl.ordinal()) {
            case 16777473:
                i = 2132346728;
                break;
            case 16777729:
                i = 2132346729;
                break;
            case 16777984:
                i = 2132346730;
                break;
            case 16778273:
                i = 2132346731;
                break;
            case 16778528:
                i = 2132346732;
                break;
            case 16779264:
                i = 2132346733;
                break;
            case 16779297:
                i = 2132346734;
                break;
            case 16779520:
            case 16779552:
                i = 2132346735;
                break;
            case 16779777:
                i = 2132346736;
                break;
            case 16780065:
                i = 2132346739;
                break;
            case 16780321:
                i = 2132346737;
                break;
            case 16780576:
                i = 2132346738;
                break;
            case 16780833:
                i = 2132346741;
                break;
            case 16781089:
                i = 2132346740;
                break;
            case 16781601:
                i = 2132346742;
                break;
            case 16781857:
                i = 2132346743;
                break;
            case 16782081:
                i = 2132345419;
                break;
            case 16782369:
                i = 2132346745;
                break;
            case 16782593:
            case 16782625:
                i = 2132346746;
                break;
            case 16782848:
            case 16782880:
                i = 2132346747;
                break;
            case 16782849:
            case 16782881:
                i = 2132346748;
                break;
            case 16783361:
            case 16783393:
                i = 2132346749;
                break;
        }
        drawable = context.getDrawable(i);
        String obj = gHk.toString();
        if (drawable == null) {
            C00s.A00();
            return A00(context.getResources(), gHl, gHm, obj);
        }
        ((C3m8) A05.get()).A59(drawable, gHk.toString(), gHm.toString(), gHl.BB8());
        return drawable;
    }

    public final Drawable A07(Context context, GHl gHl, GHm gHm, String str) {
        ERA era;
        if (gHm == ERE.A03) {
            return new C6qs(A07(context, gHl, ERE.A02, str), A07(context, gHl, ERE.A01, str));
        }
        if (TextUtils.isEmpty(str)) {
            this.A00.get();
            str = "___NOT_AN_ICON";
        }
        this.A01.get();
        Integer BAG = gHm.BAG();
        11T.A0F(str, 0);
        switch (BAG.intValue() ^ A01(str, "-", "_").hashCode()) {
            case -2079216025:
                era = ERA.A02;
                break;
            case -1832112161:
                era = ERA.A05;
                break;
            case -1831883966:
                era = ERA.A08;
                break;
            case -1729822084:
                era = ERA.A01;
                break;
            case -1623061863:
                era = ERA.A0M;
                break;
            case -1515994903:
                era = ERA.A0G;
                break;
            case -1399679920:
                era = ERA.A06;
                break;
            case -1360216879:
                era = ERA.A0B;
                break;
            case -1291065760:
                era = ERA.A0F;
                break;
            case -948167071:
                era = ERA.A09;
                break;
            case -340254361:
                era = ERA.A0J;
                break;
            case -320360519:
                era = ERA.A03;
                break;
            case -286031436:
                era = ERA.A0N;
                break;
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                era = ERA.A0P;
                break;
            case 3715:
                era = ERA.A0O;
                break;
            case 100912:
                era = ERA.A0E;
                break;
            case 3168654:
                era = ERA.A0H;
                break;
            case 3444123:
                era = ERA.A0K;
                break;
            case 64549662:
                era = ERA.A0C;
                break;
            case 69208187:
                era = ERA.A0A;
                break;
            case 200189046:
                era = ERA.A0D;
                break;
            case 385370471:
                era = ERA.A07;
                break;
            case 1497395016:
                era = ERA.A0L;
                break;
            case 1634908210:
                era = ERA.A04;
                break;
            default:
                return A00(context.getResources(), gHl, gHm, str);
        }
        return A06(context, era, gHl, gHm);
    }
}
