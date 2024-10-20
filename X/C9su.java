package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.9su, reason: invalid class name */
/* loaded from: 9su.class */
public final class C9su implements InterfaceC02083tw {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 9RG A01;
    public final /* synthetic */ String A02;

    public C9su(FbUserSession fbUserSession, 9RG r303, String str) {
        this.A01 = r303;
        this.A02 = str;
        this.A00 = fbUserSession;
    }

    @Override // X.InterfaceC02083tw
    public boolean BoV(ClickableSpan clickableSpan, View view) {
        String url;
        String replaceAll;
        C68t c68t;
        Uri A0F;
        C5id c5id;
        9RG r0 = this.A01;
        String str = this.A02;
        FbUserSession fbUserSession = this.A00;
        if (!(clickableSpan instanceof URLSpan) || (url = ((URLSpan) clickableSpan).getURL()) == null || (replaceAll = url.replaceAll("[^a-zA-Z0-9_]", "")) == null) {
            return false;
        }
        Context context = view.getContext();
        IFc iFc = (IFc) 1Lo.A04(context, fbUserSession, (1BY) null, 67965);
        1Bn.A0E((Context) null, r0.A00, 147726);
        CLr cLr = new CLr(fbUserSession, context);
        if (TextUtils.equals(replaceAll, "LEARN_MORE")) {
            CLr.A01(cLr).A0M(str, "r2l_learn_more_link");
            I91.A01((I91) r0.A01.get(), Qmj.class, "LEARN_MORE_DIALOG_FRAGMENT_TAG");
            return true;
        }
        if (TextUtils.equals(replaceAll, "COMMUNITY_STANDARDS")) {
            iFc.A0M(str, "r2l_community_standards_link");
            c68t = (C68t) r0.A02.get();
            A0F = 4YU.A0F("https://www.facebook.com/communitystandards/");
            c5id = C5id.A0q;
        } else if (TextUtils.equals(replaceAll, "PRIVACY_POLICY")) {
            iFc.A0M(str, "r2l_data_policy_url_link");
            c68t = (C68t) r0.A02.get();
            A0F = 4YU.A0F("https://facebook.com/privacy/policy");
            c5id = C5id.A0r;
        } else if (TextUtils.equals(replaceAll, "REPORT_OR_GIVE_FEEDBACK")) {
            CLr.A01(cLr).A0M(str, "r2l_report_or_give_feedback_link");
            c68t = (C68t) r0.A02.get();
            A0F = 4YU.A0F("https://www.facebook.com/help/286623469342495?ref=learn_more");
            c5id = C5id.A0u;
        } else {
            if (!TextUtils.equals(replaceAll, "FACEBOOK_LIVE_POLICIES")) {
                return true;
            }
            iFc.A0M(str, "r2l_facebook_live_policies_link");
            c68t = (C68t) r0.A02.get();
            A0F = 4YU.A0F("https://www.facebook.com/policies/live");
            c5id = C5id.A0s;
        }
        c68t.A0G(context, A0F, c5id);
        return true;
    }

    @Override // X.InterfaceC02083tw
    public boolean C5A(View view, C6nn c6nn) {
        return false;
    }
}
