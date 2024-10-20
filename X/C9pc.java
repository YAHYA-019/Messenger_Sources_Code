package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.integrity.frx.proactivewarning.model.ProactiveWarningInfo;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.translation.nux.bottomsheetnux.TranslationNuxFragment;
import com.facebook.messaging.wellbeing.reportingenforcement.plugins.unsend.unsendwarningbanner.UnsendWarningBanner;
import com.facebook.messaging.wellbeing.supportinclusion.plugins.proactivewarning.threadviewbanner.ProactiveWarningThreadViewBanner;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.user.model.User;
import java.util.List;

/* renamed from: X.9pc, reason: invalid class name */
/* loaded from: 9pc.class */
public final class C9pc implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C9pc(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        ThreadKey threadKey;
        int i;
        int A052;
        int i2;
        switch (this.A00) {
            case 0:
                A05 = 0FI.A05(-1366450870);
                8eF r0 = (8eF) this.A04;
                C2k5 c2k5 = (C2k5) this.A03;
                FbUserSession fbUserSession = (FbUserSession) this.A01;
                C2lh c2lh = (C2lh) this.A02;
                C65h c65h = C65h.A04;
                1Br r02 = C65h.A02;
                if (1Br.A07(r02).AZk(36322001553081350L)) {
                    C3Ss c3Ss = r0.A02;
                    98A r03 = 98A.A01;
                    C3Ss.A01(98G.A01, r03, c3Ss);
                    Context A0K = 7zP.A0K(c2k5);
                    C3Ss.A01(98G.A05, r03, c3Ss);
                    C0dv.A02(A0K, c65h.A06(r0.A00, r0.A08));
                } else if (1Br.A07(r02).AZk(36322001553015813L)) {
                    C3Ss c3Ss2 = r0.A02;
                    C3Ss.A01(98G.A04, 98A.A01, c3Ss2);
                    Context A0K2 = 7zP.A0K(c2k5);
                    c2lh.A01();
                    View view2 = r0.A01;
                    if (view2 != null) {
                        C3Ss.A01(98G.A05, 98A.A03, c3Ss2);
                        6LF r04 = (6LF) 7zN.A0k(A0K2, 67784);
                        MigColorScheme migColorScheme = r0.A05;
                        String str = r0.A07;
                        r04.A00(C9pw.A00(c2k5, r0, 21), view2, view2, migColorScheme, (KT3) null, str != null ? 3yH.A0A(c2k5, str, 2131956386) : 3yH.A09(c2k5, 2131956387), 3yH.A09(c2k5, 2131956385), 0, 1);
                    }
                    if (r0.A09) {
                        ThreadSummary threadSummary = r0.A03;
                        if (threadSummary != null && (threadKey = threadSummary.A0n) != null) {
                            Message A0K3 = ((CQl) 1Hv.A02(A0K2, 65898)).A0K(fbUserSession, threadKey, c65h.A06(r0.A00, r0.A08));
                            64W r05 = r0.A04;
                            if (r05 != null) {
                                11T.A0D(A0K3);
                                r05.Cko(5Pz.A0S, A0K3);
                            }
                        }
                    } else {
                        2Of r06 = r0.A06;
                        if (r06 != null) {
                            String A06 = c65h.A06(r0.A00, r0.A08);
                            11T.A0F(A06, 0);
                            r06.AQN(new 7Ar(A06));
                            r06.AQN(new 7Af((CharSequence) null, (String) null, (List) null, (java.util.Map) null, AnonymousClass001.A0v(), 0L));
                        }
                    }
                }
                i = 1727087037;
                0FI.A0B(i, A05);
                return;
            case 1:
                A052 = 0FI.A05(22991043);
                7UA r07 = (7UA) this.A04;
                r07.dismiss();
                9gJ r08 = r07.A01;
                if (r08 == null) {
                    IllegalStateException A0h = 1BK.A0h();
                    0FI.A0B(1461089580, A052);
                    throw A0h;
                }
                9gJ.A00(C98R.A01, r08);
                ((7EN) 1Br.A0B(r07.A02)).A07((06Z) this.A01, (ThreadSummary) this.A03, BNT.A0S, (User) this.A02);
                i2 = -2106766869;
                0FI.A0B(i2, A052);
                return;
            case 2:
                A052 = 0FI.A05(-506481448);
                BUb.A00((FbUserSession) this.A02, (ThreadKey) this.A03, (ThreadSummary) this.A04, (6RU) this.A01);
                i2 = -454198304;
                0FI.A0B(i2, A052);
                return;
            case 3:
                A05 = 0FI.A05(1195176176);
                ThreadSummary threadSummary2 = (ThreadSummary) this.A04;
                if (threadSummary2 != null) {
                    DHd dHd = (DHd) this.A03;
                    User user = (User) this.A02;
                    Context context = (Context) this.A01;
                    dHd.CWB(user != null ? user.A0k : null, 6);
                    1Bn.A0A(147709);
                    ThreadKey threadKey2 = threadSummary2.A0n;
                    11T.A0A(threadKey2);
                    8vM r309 = threadKey2.A0z() ? new 8vM(context, threadKey2) : new 8vN(context, threadKey2);
                    if (r309 instanceof 8vL) {
                        AQV.A00(r309, 39).invoke();
                    } else if (r309 instanceof 8vN) {
                        8vN.A02((8vN) r309, "open_content_panel", (String) null);
                    }
                }
                i = -1287092584;
                0FI.A0B(i, A05);
                return;
            case 4:
                A052 = 0FI.A05(1268733270);
                9DV.A00((1Iw) this.A03, (6Kq) this.A02, (MigColorScheme) this.A04, (List) this.A01);
                i2 = 1066941374;
                0FI.A0B(i2, A052);
                return;
            case 5:
                A05 = 0FI.A05(1689959187);
                Context context2 = ((1Iw) this.A01).A0D;
                ((FIu) 7zN.A0k(context2, 100011)).A09(context2, 4YU.A0F("https://www.facebook.com/help/messenger-app/329901696451149?ref=ipl"), C5id.A0V);
                ThreadKey threadKey3 = (ThreadKey) this.A02;
                if (threadKey3 != null) {
                    9cS r09 = (9cS) this.A03;
                    TranslationNuxFragment translationNuxFragment = (TranslationNuxFragment) this.A04;
                    94S r010 = MigBottomSheetDialogFragment.A01;
                    FbUserSession fbUserSession2 = translationNuxFragment.A00;
                    if (fbUserSession2 == null) {
                        7zL.A1C();
                        throw 0Q8.createAndThrow();
                    }
                    r09.A00(fbUserSession2, threadKey3, 0S2.A05);
                }
                i = 227899299;
                0FI.A0B(i, A05);
                return;
            case 6:
                A052 = 0FI.A05(-545884914);
                ((7OX) this.A02).BNt();
                UnsendWarningBanner unsendWarningBanner = (UnsendWarningBanner) this.A01;
                unsendWarningBanner.A03.A02();
                C3v c3v = unsendWarningBanner.A02;
                Context context3 = (Context) this.A03;
                ThreadSummary threadSummary3 = (ThreadSummary) this.A04;
                c3v.A00(context3, threadSummary3, 0S2.A00);
                C9eu.A00(unsendWarningBanner.A01, threadSummary3, "learn_more_clicked");
                i2 = 952129030;
                0FI.A0B(i2, A052);
                return;
            case 7:
                A05 = 0FI.A05(601465156);
                ProactiveWarningThreadViewBanner proactiveWarningThreadViewBanner = (ProactiveWarningThreadViewBanner) this.A04;
                C9cb c9cb = (C9cb) 1Br.A0B(proactiveWarningThreadViewBanner.A0B);
                FbUserSession fbUserSession3 = proactiveWarningThreadViewBanner.A06;
                ThreadSummary threadSummary4 = (ThreadSummary) this.A03;
                ProactiveWarningInfo proactiveWarningInfo = (ProactiveWarningInfo) this.A02;
                6mL r011 = proactiveWarningThreadViewBanner.A03;
                Fragment AnK = proactiveWarningThreadViewBanner.A0G.AnK();
                C5yq c5yq = null;
                06Z childFragmentManager = AnK != null ? AnK.getChildFragmentManager() : null;
                C7Q1 c7q1 = proactiveWarningThreadViewBanner.A00;
                if (c7q1 != null) {
                    c5yq = c7q1.A00;
                }
                c9cb.A00(childFragmentManager, fbUserSession3, c5yq, proactiveWarningInfo, threadSummary4, r011, (C00m) this.A01);
                i = -242460760;
                0FI.A0B(i, A05);
                return;
            case 8:
                A05 = 0FI.A05(-1156752937);
                ProactiveWarningThreadViewBanner proactiveWarningThreadViewBanner2 = (ProactiveWarningThreadViewBanner) this.A04;
                C9cb c9cb2 = (C9cb) 1Br.A0B(proactiveWarningThreadViewBanner2.A0B);
                FbUserSession fbUserSession4 = proactiveWarningThreadViewBanner2.A06;
                ThreadSummary threadSummary5 = (ThreadSummary) this.A03;
                ProactiveWarningInfo proactiveWarningInfo2 = (ProactiveWarningInfo) this.A02;
                6mL r012 = proactiveWarningThreadViewBanner2.A03;
                C00m c00m = (C00m) this.A01;
                c9cb2.A02(fbUserSession4, threadSummary5);
                if (c00m != null) {
                    c00m.invoke();
                }
                ((9mA) 1Br.A0B(c9cb2.A01)).A03(fbUserSession4, threadSummary5, C5yl.A0G, proactiveWarningInfo2.A02);
                if (r012 != null) {
                    r012.A05(0S2.A00);
                }
                i = 1616337601;
                0FI.A0B(i, A05);
                return;
            case 9:
                A052 = 0FI.A05(308039070);
                ((GJs) this.A04).Bm6(((View) this.A01).getContext(), (Dkz) this.A02, (CurrencyAmount) this.A03);
                i2 = 1673982391;
                0FI.A0B(i2, A052);
                return;
            case 10:
                A052 = 0FI.A05(-2085811628);
                7La r013 = ((QG8) this.A04).A00.A03;
                1Iw r014 = ((C2k5) this.A03).A05;
                11T.A0D(view);
                r013.BoZ(view, r014, new RsM((C2lh) this.A01), (7LX) this.A02);
                i2 = 172647421;
                0FI.A0B(i2, A052);
                return;
            default:
                return;
        }
    }
}
