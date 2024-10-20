package X;

import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.business.plugins.suggestedreply.model.ReplyEntry;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: B17.class */
public final class B17 extends C1rj {
    public AnonymousClass574 A00;
    public static final CharSequence A02 = "·";
    public static final CallerContext A01 = CallerContext.A0B("SuggestedReplyListItemLayoutSpec");

    public B17() {
        super("SuggestedReplyListItemLayout");
    }

    public static SpannableString A00(1GS r301, MigColorScheme migColorScheme, String str, String str2) {
        int indexOf;
        SpannableString spannableString = new SpannableString(str2);
        if (!1JF.A0B(str) && (indexOf = str2.trim().toLowerCase(r301.A05()).indexOf(str.trim().toLowerCase(r301.A05()))) >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(migColorScheme.B9Q()), indexOf, str.length() + indexOf, 18);
        }
        return spannableString;
    }

    public static 5BG A01(1Iw r301, ReplyEntry replyEntry) {
        String str = replyEntry.A07;
        if (str == null) {
            return null;
        }
        5BH A012 = 5BG.A01(r301);
        A012.A0z(66.0f);
        A012.A0l(66.0f);
        A012.A15(8.0f);
        Uri uri = null;
        try {
            uri = C0A2.A03(str);
        } catch (SecurityException unused) {
        }
        A012.A2X(uri);
        C07004ik A00 = 5BI.A00(C06974ih.A0Q);
        ((C07014il) A00).A04 = 5BJ.A00(C0A8.A00(r301.A0D, 12.0f));
        C06984ii.A01(A012, A00);
        A012.A0S();
        A012.A2b(A01);
        A012.A0J();
        return A012.A00;
    }

    public static String A0L(String str, String str2) {
        StringBuilder sb = new StringBuilder(3);
        if (!1JF.A0B(str)) {
            sb.append(str);
        }
        if (!1JF.A0B(str) && !1JF.A0B(str2)) {
            sb.append(" · ");
        }
        if (!1JF.A0B(str2)) {
            sb.append(str2);
        }
        return sb.toString();
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2cl A0J;
        C1rq A012;
        AnonymousClass574 anonymousClass574 = this.A00;
        C1u2 A0R = 7zP.A0R();
        1GS r0 = (1GS) 1Bi.A03(16504);
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        C26z c26z = C26z.HORIZONTAL;
        A013.A0X();
        A013.A0e();
        2cM A014 = 2cK.A01(r302, (String) null, 0);
        C1rq A015 = C1rg.A01(r302, null, 0);
        C1rq A016 = C1rg.A01(r302, null, 0);
        A016.A1A(8.0f);
        A016.A19(12.0f);
        A016.A0R();
        A016.A2b();
        int i = anonymousClass574.A01;
        if (i != 1) {
            MigColorScheme migColorScheme = anonymousClass574.A05;
            2KD A0V = AbN.A0V(r302, migColorScheme, 4YU.A0E(r302).getString(2131966570, AnonymousClass001.A1b(Integer.valueOf(anonymousClass574.A00 + 1), i)));
            A0V.A2n();
            A016.A2e(A0V);
            2KD A0V2 = AbN.A0V(r302, migColorScheme, "·");
            A0V2.A2n();
            A0V2.A25(c26z, 4.0f);
            A0V2.A2t(TextUtils.TruncateAt.MARQUEE);
            A016.A2e(A0V2);
        }
        MigColorScheme migColorScheme2 = anonymousClass574.A05;
        Resources A0E = 4YU.A0E(r302);
        ReplyEntry replyEntry = anonymousClass574.A04;
        2KD A0V3 = AbN.A0V(r302, migColorScheme2, A0E.getText(replyEntry.A00));
        A0V3.A2n();
        A016.A2e(A0V3);
        2KD A0V4 = AbN.A0V(r302, migColorScheme2, "·");
        A0V4.A2n();
        A0V4.A24(c26z, 4.0f);
        A0V4.A2t(TextUtils.TruncateAt.MARQUEE);
        A016.A2e(A0V4);
        2KD A0V5 = AbN.A0V(r302, migColorScheme2, A0E.getString(2131966571));
        A0V5.A2n();
        A016.A2e(A0V5);
        A015.A2f(A016.A00);
        if (anonymousClass574.A00 != 0) {
            A0J = null;
        } else {
            C2cm A00 = C2cl.A00(r302);
            7zM.A1H(A00, migColorScheme2);
            7zN.A18(A00, C1u3.A2N, A0R);
            A00.A0S();
            A00.A1J(2131966587);
            7zN.A1D(A00, r302, B17.class, "SuggestedReplyListItemLayout", 847160241);
            A00.A2K("control_icon");
            A0J = 7zL.A0J(A00);
        }
        A015.A2f(A0J);
        7zL.A1I(A014, A015);
        BKs bKs = replyEntry.A01;
        String str = anonymousClass574.A06;
        if (bKs == BKs.A03 || bKs == BKs.A02) {
            A012 = C1rg.A01(r302, null, 0);
            A012.A2f(A01(r302, replyEntry));
            SpannableString A002 = A00(r0, migColorScheme2, str, A0L(replyEntry.A0A, replyEntry.A06));
            2KD A003 = 2K3.A00(r302);
            A003.A2x(migColorScheme2);
            A003.A2z(A002);
            A003.A2b();
            A003.A2h();
            A003.A2q(3);
            7zN.A1T(A012, A003);
            A012.A1A(12.0f);
            A012.A2b();
        } else {
            if (bKs != BKs.A01) {
                throw AnonymousClass001.A0L("replyType does not match");
            }
            C0k4.A01("typedMessage in catalog must be not null", str);
            String str2 = replyEntry.A08;
            C0k4.A01("replyEntry.getPrice() in catalog must be not null", str2);
            SpannableString A004 = A00(r0, migColorScheme2, str, A0L(replyEntry.A0A, replyEntry.A06));
            2KD A005 = 2K3.A00(r302);
            A005.A2x(migColorScheme2);
            A005.A2z(A004);
            A005.A2b();
            A005.A2h();
            A005.A2q(2);
            2K3 A2W = A005.A2W();
            2KD A0V6 = AbN.A0V(r302, migColorScheme2, str2);
            A0V6.A2k();
            A0V6.A2q(1);
            2K3 A2W2 = A0V6.A2W();
            A012 = C1rg.A01(r302, null, 0);
            A012.A2b();
            A012.A2f(A01(r302, replyEntry));
            2cM A017 = 2cK.A01(r302, (String) null, 0);
            A017.A2e(A2W);
            A017.A2e(A2W2);
            A017.A25(C26z.LEFT, 12.0f);
            A012.A2f(A017.A00);
            A012.A1A(12.0f);
        }
        7zL.A1I(A014, A012);
        7zN.A1C(A014, r302, B17.class, "SuggestedReplyListItemLayout");
        7zL.A1G(A014, A013);
        return A013.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Br r306;
        int i = r302.A01;
        if (i == -1351902487) {
            1Is r0 = r302.A00.A01;
            View view = ((3xC) obj).A00;
            AnonymousClass574 anonymousClass574 = ((B17) r0).A00;
            anonymousClass574.A03.CP5(view, anonymousClass574.A04);
            return null;
        }
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 847160241) {
            return null;
        }
        1Iv r02 = r302.A00;
        1Is r03 = r02.A01;
        1Iw r04 = r02.A00;
        AnonymousClass574 anonymousClass5742 = ((B17) r03).A00;
        Bot bot = (Bot) 1Bn.A0E(r04.A0D, (1BY) null, 83810);
        ReplyEntry replyEntry = anonymousClass5742.A04;
        BKs bKs = replyEntry.A01;
        C0k4.A00(bKs);
        11T.A0F(bKs, 0);
        int ordinal = bKs.ordinal();
        if (ordinal == 0) {
            r306 = bot.A01;
        } else {
            if (ordinal != 2 && ordinal != 1) {
                throw AnonymousClass001.A0L("Unknown Reply Type");
            }
            r306 = bot.A00;
        }
        C6W c6w = (C6W) 1Br.A0B(r306);
        DGf dGf = anonymousClass5742.A03;
        0D2 baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
        baseMigBottomSheetDialogFragment.A02 = replyEntry;
        baseMigBottomSheetDialogFragment.A00 = c6w;
        baseMigBottomSheetDialogFragment.A01 = dGf;
        baseMigBottomSheetDialogFragment.setArguments(1BK.A05());
        baseMigBottomSheetDialogFragment.A00 = anonymousClass5742.A05;
        baseMigBottomSheetDialogFragment.A0m(anonymousClass5742.A02, "suggested_reply_bottom_sheet");
        1UG A08 = 1BK.A08(c6w.A01(), "biim_smart_suggestions_business_control_mini_menu_entry_button_click");
        if (!A08.isSampled()) {
            return null;
        }
        1UG.A02(A08, "biim");
        C6W.A00(new 0DA(), A08, c6w);
        return null;
    }
}
