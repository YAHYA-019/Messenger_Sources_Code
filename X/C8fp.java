package X;

import android.text.Html;
import android.text.Spanned;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8fp, reason: invalid class name */
/* loaded from: 8fp.class */
public final class C8fp extends 1LH {
    public static final 2qR A03;
    public final View.OnClickListener A00;
    public final MigColorScheme A01;
    public final C5xv A02;

    static {
        2qQ A0o = 7zL.A0o();
        7zM.A1V(A0o, 2132346632);
        A03 = 7zQ.A0k(A0o, 2132346631);
    }

    public C8fp(View.OnClickListener onClickListener, MigColorScheme migColorScheme, C5xv c5xv) {
        11T.A0F(migColorScheme, 1);
        this.A01 = migColorScheme;
        this.A00 = onClickListener;
        this.A02 = c5xv;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A01;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C5yw A0b = 7zN.A0b(AeS, A1W);
        A0b.A2X();
        A0b.A2b(migColorScheme);
        A0b.A2d(this.A02);
        A0b.A2i(A1W);
        7zN.A1R(A0L, A0b);
        Spanned fromHtml = Html.fromHtml("Thank you for dogfooding GenAI Stickers in Messenger Android! The text prompts you send to GenAI Stickers, the four AI generated stickers created in response to the text prompt, and the AI generated sticker you ultimately send in Messenger Android may be stored and retained by the Generative AI team, and used to further train the Sticker Generator and as otherwise specified in our Data Policy. Do not include personal information (for example, name, address, email, or phone number) in your text prompts.<br><br>The text prompts you send to GenAI Stickers, the four AI generated stickers created in response to the text prompt, and the AI generated sticker you ultimately send in Messenger Android will be retained for 2 years.<br><br>Do not share any AI generated stickers outside of this dogfooding experience, including on any of your personal accounts. Remember that you should not share outputs from the tool externally. Do not use GenAI Stickers if you are located within the EU or in Japan.<br><br>Your use of GenAI Stickers in Messenger Android is completely voluntary. If you choose to interact with GenAI Stickers, you may find some AI generated stickers surprising, inaccurate, or offensive. Please report any troubling content so we can continue to improve the technology. For more information about your privacy rights, please see the employee <a href=\"https://www.internalfb.com/intern/people/portal/facebook-inc/company-policies/privacy-policies\">Privacy Policies</a>.");
        return 8Tn.A06(A0L, c2k5, A0g, 8Tn.A08(AeS, new 8NJ(new 8Lf(83S.A00(this, 55), "OK"), C8xf.A00(7zS.A02(A03, migColorScheme)), fromHtml, (CharSequence) null, "[Employee only] AI Stickers", (List) null, true), migColorScheme));
    }
}
