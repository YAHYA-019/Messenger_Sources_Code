package X;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.inboxads.common.InboxAdsData;
import com.facebook.messaging.business.inboxads.common.InboxAdsMediaInfo;
import com.facebook.messaging.dialog.MenuDialogFragment;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.dialog.MenuDialogParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import java.util.Iterator;

/* loaded from: Ezq.class */
public final class Ezq {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ F4H A01;
    public final /* synthetic */ EqM A02;

    public Ezq(FbUserSession fbUserSession, F4H f4h, EqM eqM) {
        this.A02 = eqM;
        this.A00 = fbUserSession;
        this.A01 = f4h;
    }

    public void A00() {
        Erm erm = this.A02.A03;
        if (erm != null) {
            0D2 r0 = erm.A00;
            if (r0.A02 != null) {
                ((Ets) r0.A01.get()).A00("postclick_user_action_close", r0.A03.A00.A0F);
                ((EqW) r0.A09.get()).A04 = 0S2.A01;
                ((InputMethodManager) r0.A07.get()).hideSoftInputFromWindow(r0.A02.getWindowToken(), 0);
                r0.A0p();
                FbUserSession fbUserSession = r0.A00;
                fbUserSession.getClass();
                ((2cH) ((C2ef) 1Lo.A04(r0.getContext(), fbUserSession, (1BY) null, 17059)).A06.get()).A01 = false;
            }
        }
    }

    public void A01() {
        EqM eqM = this.A02;
        2UZ r0 = (2UZ) eqM.A06.get();
        String str = eqM.A02.A0F;
        C31o c31o = C31o.A02;
        1UG A08 = 1BK.A08(1BK.A07(r0.A03), 1BJ.A00(1426));
        if (A08.isSampled()) {
            A08.A7R("client_token", str);
            A08.A7R("see_more_source", "see_more");
            A08.A7R("pigeon_reserved_keyword_module", "messenger_inbox_ads");
            A08.A7R("tap_context", c31o.toString());
            A08.BZL();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.fragment.app.Fragment, com.facebook.messaging.business.inboxads.postclick.fragment.InboxAdsPostClickFragment] */
    public void A02() {
        Erm erm = this.A02.A03;
        if (erm != null) {
            ?? r0 = erm.A00;
            final Context context = r0.getContext();
            final 06Z r02 = r0.mFragmentManager;
            if (context == null || r02 == null) {
                return;
            }
            EiH eiH = (EiH) r0.A0A.get();
            C52j c52j = C52j.A09;
            if (eiH.A00) {
                ((IPf) eiH.A01.get()).A00(c52j);
            }
            BkR bkR = (BkR) r0.A08.get();
            final InboxAdsData inboxAdsData = r0.A03.A00;
            EdZ edZ = new EdZ(erm);
            C00i c00i = bkR.A01;
            ((C4Zl) c00i.get()).A01 = new Rpm(edZ, bkR);
            final C4Zl c4Zl = (C4Zl) c00i.get();
            C31o c31o = C31o.A02;
            inboxAdsData.getClass();
            2UZ r03 = (2UZ) c4Zl.A06.get();
            String str = inboxAdsData.A0F;
            1UG A08 = 1BK.A08(1BK.A07(r03.A03), 1BJ.A00(1427));
            if (A08.isSampled()) {
                A08.A7R("client_token", str);
                A08.A7R("tap_context", c31o.toString());
                A08.A7R("pigeon_reserved_keyword_module", "messenger_inbox_ads");
                A08.BZL();
            }
            MenuDialogFragment A05 = MenuDialogFragment.A05(new MenuDialogParams(C4Zl.A00(context, inboxAdsData)));
            c4Zl.A01.getClass();
            final int i = 0;
            A05.A02 = new 6Gp(i, context, r02, inboxAdsData, c4Zl) { // from class: X.9uc
                public final int A00;
                public final Object A01;
                public final Object A02;
                public final Object A03;
                public final Object A04;

                {
                    this.A00 = i;
                    this.A01 = c4Zl;
                    this.A02 = inboxAdsData;
                    this.A03 = r02;
                    this.A04 = context;
                }

                public final boolean C6c(MenuDialogItem menuDialogItem, Object obj) {
                    switch (this.A00) {
                        case 0:
                            C4Zl c4Zl2 = (C4Zl) this.A01;
                            InboxAdsData inboxAdsData2 = (InboxAdsData) this.A02;
                            06Z r04 = (06Z) this.A03;
                            C4Zl.A01((Context) this.A04, r04, inboxAdsData2, c4Zl2, C5yq.A0k, menuDialogItem.A01);
                            return true;
                        case 1:
                            int i2 = menuDialogItem.A01;
                            if (i2 == 0) {
                                ((9Ze) this.A04).A00((ThreadKey) this.A03, 0S2.A01);
                                return true;
                            }
                            if (i2 != 1) {
                                return true;
                            }
                            BUc.A00((Context) this.A01, ((9Ze) this.A04).A01, (User) this.A02, AbstractC00603o4.A00(224));
                            return true;
                        default:
                            A4E a4e = (A4E) this.A04;
                            int i3 = menuDialogItem.A01;
                            Iterator it = a4e.A00.iterator();
                            while (it.hasNext()) {
                                C9c2 c9c2 = (C9c2) it.next();
                                if (c9c2.A05.ordinal() == i3) {
                                    AYf aYf = c9c2.A04;
                                    if (aYf == null) {
                                        return true;
                                    }
                                    aYf.C6e((1Iw) this.A01, (C5j5) this.A03, c9c2, (5vW) this.A02);
                                    return true;
                                }
                            }
                            return true;
                    }
                }
            };
            A05.A18(new Ih1(c4Zl, 0));
            A05.A0m(r02, "messenger_inbox_ads_setting_dialog");
        }
    }

    public void A03(C5ba c5ba, int i) {
        EqM eqM = this.A02;
        if (eqM.A00 == null || eqM.A01 == null || eqM.A03 == null) {
            return;
        }
        if (((Ev9) eqM.A07.get()).A00(eqM.A01, this.A00, eqM.A02, C31o.A02, c5ba, this.A01, i)) {
            eqM.A03.A00();
        }
    }

    public void A04(String str) {
        EqM eqM = this.A02;
        2UZ r0 = (2UZ) eqM.A06.get();
        InboxAdsData inboxAdsData = eqM.A02;
        2UZ.A01(r0, C31o.A02, inboxAdsData.A0F, str, ((InboxAdsMediaInfo) 1BK.A0r(inboxAdsData.A07())).A01);
    }
}
