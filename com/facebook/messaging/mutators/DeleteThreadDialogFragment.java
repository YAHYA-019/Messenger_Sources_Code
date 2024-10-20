package com.facebook.messaging.mutators;

import X.02W;
import X.06Z;
import X.0FI;
import X.0S2;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Du;
import X.1G1;
import X.1HH;
import X.1Ho;
import X.1Lo;
import X.1Uj;
import X.1Um;
import X.1lN;
import X.23F;
import X.2fE;
import X.6In;
import X.6Pl;
import X.7zL;
import X.7zM;
import X.7zO;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AbstractC01593ro;
import X.AnonymousClass001;
import X.ApQ;
import X.BfR;
import X.BxS;
import X.Byb;
import X.C00i;
import X.C0D1;
import X.C1296Ad8;
import X.C1392Afz;
import X.C1F6;
import X.C1kw;
import X.C2J3;
import X.C5P;
import X.C5Q;
import X.C5yl;
import X.C5ym;
import X.C5yq;
import X.CHy;
import X.CaD;
import X.Cbd;
import X.CfG;
import X.ClY;
import X.Czf;
import X.D7v;
import X.DFR;
import X.DIS;
import X.IbT;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.dialog.ConfirmActionDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.MarketplaceThreadData;
import com.facebook.messaging.model.threads.MarketplaceThreadUserData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* loaded from: DeleteThreadDialogFragment.class */
public class DeleteThreadDialogFragment extends ConfirmActionDialogFragment {
    public FbUserSession A00;
    public 1Ho A01;
    public CfG A02;
    public C00i A03;
    public C00i A04;
    public DIS A05;
    public DFR A06;
    public C5Q A07;
    public ImmutableList A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public C00i A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final C00i A0H = AbH.A0K();
    public final C00i A0N = AbH.A0P();
    public final C00i A0J = FbInjector.A00;
    public final C00i A0L = 1BQ.A00();
    public final C00i A0K = AbF.A0S(this, 83019);
    public final C00i A0M = 1BQ.A02(50090);
    public final C00i A0I = new 1HH(this, 83020);

    /* JADX WARN: Type inference failed for: r0v34, types: [com.facebook.messaging.mutators.DeleteThreadDialogFragment, androidx.fragment.app.Fragment] */
    public static DeleteThreadDialogFragment A05(Byb byb) {
        String str;
        Bundle A05 = 1BK.A05();
        A05.putSerializable("thread_keys", byb.A00);
        A05.putString("dialog_title", byb.A0B);
        A05.putString("dialog_message", byb.A09);
        A05.putString("neutral_text", byb.A0A);
        A05.putString("confirm_text", byb.A06);
        A05.putParcelable("extra_other_user", null);
        Boolean bool = byb.A01;
        if (bool != null) {
            A05.putBoolean("allow_partial_success", bool.booleanValue());
        }
        Boolean bool2 = byb.A03;
        if (bool2 != null) {
            A05.putBoolean("should_recreate_thread", bool2.booleanValue());
        }
        Boolean bool3 = byb.A04;
        if (bool3 != null) {
            A05.putBoolean("should_show_delete_more", bool3.booleanValue());
        }
        Boolean bool4 = byb.A02;
        if (bool4 != null && (str = byb.A05) != null) {
            A05.putBoolean("delete_for_channel", bool4.booleanValue());
            A05.putString("community_id", str);
            A05.putString("group_id", byb.A08);
        }
        A05.putString("entry_point", byb.A07);
        ?? deleteThreadDialogFragment = new DeleteThreadDialogFragment();
        deleteThreadDialogFragment.setArguments(A05);
        return deleteThreadDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String A06() {
        int i;
        1Du it = this.A08.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!ThreadKey.A0o(AbG.A0k(it))) {
                z = false;
            }
        }
        if (z) {
            i = 2131966052;
        } else {
            i = 2131955704;
            if (AbI.A1b(1BK.A0N(this.A0L))) {
                i = 2131968166;
            }
        }
        return getString(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String A07() {
        boolean A1b = AbI.A1b(1BK.A0N(this.A0L));
        if (!this.A08.isEmpty()) {
            this.A08.get(0);
        }
        int i = 2131966933;
        if (A1b) {
            i = 2131968167;
        }
        return getString(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v158, types: [X.Afz, X.2J3] */
    public static void A08(DeleteThreadDialogFragment deleteThreadDialogFragment) {
        View view;
        if (deleteThreadDialogFragment.A01 == null) {
            Fragment fragment = deleteThreadDialogFragment.mParentFragment;
            if (fragment != null) {
                view = fragment.requireView();
            } else {
                FragmentActivity activity = deleteThreadDialogFragment.getActivity();
                if (activity != null) {
                    view = 7zM.A0F(activity);
                } else {
                    0fH.A0k("DeleteThreadDialogFragment", "Not attached to an activity.");
                    view = null;
                }
            }
            DIS dis = deleteThreadDialogFragment.A05;
            if (dis != null) {
                dis.Bt2();
            }
            C1kw A06 = 1BK.A06(deleteThreadDialogFragment.A0N);
            if (C1392Afz.A00 == null) {
                synchronized (C1392Afz.class) {
                    if (C1392Afz.A00 == null) {
                        C1392Afz.A00 = new C2J3(A06);
                    }
                }
            }
            AbstractC01593ro A07 = AbF.A07(C1392Afz.A00, "delete_thread", false);
            if (A07.A0B()) {
                1lN r0 = deleteThreadDialogFragment.mParentFragment;
                if (r0 instanceof 1lN) {
                    A07.A06("pigeon_reserved_keyword_module", r0.AWg());
                }
                A07.A02(deleteThreadDialogFragment.A08, "thread_key");
                A07.A0A();
            }
            if (!deleteThreadDialogFragment.A0F) {
                C5P c5p = (C5P) deleteThreadDialogFragment.A0K.get();
                FbUserSession fbUserSession = deleteThreadDialogFragment.A00;
                fbUserSession.getClass();
                1Ho A00 = c5p.A00(fbUserSession, new ApQ(view, deleteThreadDialogFragment, 8), deleteThreadDialogFragment.A08, deleteThreadDialogFragment.A0E);
                deleteThreadDialogFragment.A01 = A00;
                A00.A06(deleteThreadDialogFragment.A02);
                return;
            }
            C1296Ad8 A0V = AbI.A0V();
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("entry_point", deleteThreadDialogFragment.A0A);
            String str = deleteThreadDialogFragment.A09;
            str.getClass();
            A0V.A04(new CommunityMessagingLoggerModel(null, null, str, null, Long.toString(((ThreadKey) deleteThreadDialogFragment.A08.get(0)).A04), null, "channel_delete_admin", "messenger", null, null, null, A0u));
            deleteThreadDialogFragment.A02.ABm();
            C5P c5p2 = (C5P) deleteThreadDialogFragment.A0K.get();
            FbUserSession fbUserSession2 = deleteThreadDialogFragment.A00;
            fbUserSession2.getClass();
            ThreadKey threadKey = (ThreadKey) deleteThreadDialogFragment.A08.get(0);
            Object A03 = 1Bi.A03(66360);
            MutableLiveData A0H = 7zL.A0H();
            1BY r02 = c5p2.A00;
            MailboxFeature mailboxFeature = new MailboxFeature((1Uj) 1Lo.A04((Context) null, fbUserSession2, r02, 16686));
            Object A04 = 1Lo.A04((Context) null, fbUserSession2, r02, 84535);
            Object A042 = 1Lo.A04((Context) null, fbUserSession2, r02, 49712);
            long A0r = threadKey.A0r();
            1Um A0O = 1BK.A0O(mailboxFeature, 0);
            MailboxFutureImpl A0P = 1BK.A0P(A0O);
            1Um.A02(A0O, Czf.A00(mailboxFeature, A0P, 10, A0r), A0P, false);
            A0P.addResultCallback(new IbT(2, A0H, A03, threadKey, c5p2, A04, A042));
            1BK.A1E(c5p2.A02).execute(new D7v(c5p2, ImmutableList.of((Object) threadKey)));
            A0H.observeForever(new CaD(deleteThreadDialogFragment, A0H, 32));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0C(DeleteThreadDialogFragment deleteThreadDialogFragment) {
        DIS dis = deleteThreadDialogFragment.A05;
        if (dis != null) {
            dis.Bt7();
        }
        if (deleteThreadDialogFragment.A0G) {
            1Du it = deleteThreadDialogFragment.A08.iterator();
            while (it.hasNext()) {
                ThreadKey A0k = AbG.A0k(it);
                02W.A06(ThreadKey.A0n(A0k), "Only Secret Conversations threads should be recreated after deletion");
                ((Cbd) deleteThreadDialogFragment.A0D.get()).A02(A0k, AnonymousClass001.A0K(), null);
            }
        }
        try {
            06Z childFragmentManager = deleteThreadDialogFragment.getChildFragmentManager();
            if (childFragmentManager == null || !C0D1.A01(childFragmentManager)) {
                return;
            }
            deleteThreadDialogFragment.A0o();
        } catch (IllegalStateException e) {
            0fH.A0s("DeleteThreadDialogFragment", "exception when getting childFragmentManager before dismissing deletion dialog", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void A1C() {
        6In r305;
        int i;
        if (!this.A08.isEmpty() && ThreadKey.A0p((ThreadKey) 1BK.A0r(this.A08))) {
            6Pl.A01((6Pl) this.A0M.get(), AbG.A10(1BK.A0c(), "action", "cancel"), "sms_takeover_delete_thread_dialog_action");
        }
        C5Q c5q = this.A07;
        FbUserSession fbUserSession = this.A00;
        fbUserSession.getClass();
        if (!c5q.A00(fbUserSession) || this.mFragmentManager == null) {
            DFR dfr = this.A06;
            if (dfr != null) {
                dfr.C8q(this.A02);
                return;
            }
            DIS dis = this.A05;
            if (dis != null) {
                dis.Bsz();
            }
            A0o();
            return;
        }
        C5Q c5q2 = this.A07;
        FbUserSession fbUserSession2 = this.A00;
        fbUserSession2.getClass();
        06Z r0 = this.mFragmentManager;
        BfR bfR = new BfR(this);
        String str = ((1G1) fbUserSession2).A02;
        ImmutableList immutableList = c5q2.A00;
        if (immutableList.size() == 1) {
            ThreadSummary A06 = ((2fE) 1Lo.A04(c5q2.A01, fbUserSession2, (1BY) null, 17064)).A06((ThreadKey) 1BK.A0r(immutableList));
            if (A06 != null) {
                MarketplaceThreadData marketplaceThreadData = A06.A0r;
                if (marketplaceThreadData != null) {
                    MarketplaceThreadUserData marketplaceThreadUserData = marketplaceThreadData.A01;
                    if (marketplaceThreadUserData == null || !str.equalsIgnoreCase(marketplaceThreadUserData.A08)) {
                        MarketplaceThreadUserData marketplaceThreadUserData2 = marketplaceThreadData.A00;
                        if (marketplaceThreadUserData2 != null && str.equalsIgnoreCase(marketplaceThreadUserData2.A08)) {
                            C00i c00i = c5q2.A02;
                            ((6In) c00i.get()).Czh(r0, C5yq.A0Y, A06, C5yl.A07, marketplaceThreadUserData.A08);
                            r305 = (6In) c00i.get();
                            i = 6;
                        }
                    } else {
                        C00i c00i2 = c5q2.A02;
                        ((6In) c00i2.get()).Czh(r0, C5yq.A0O, A06, C5yl.A07, marketplaceThreadData.A00.A08);
                        r305 = (6In) c00i2.get();
                        i = 5;
                    }
                    r305.A5K(new ClY(bfR, c5q2, i));
                    return;
                }
                C5yq A00 = ((C5ym) c5q2.A03.get()).A00(fbUserSession2, A06, 0S2.A00);
                if (A00 != null) {
                    C00i c00i3 = c5q2.A02;
                    ((6In) c00i3.get()).Czt(r0, A00, A06, C5yl.A07);
                    r305 = (6In) c00i3.get();
                    i = 7;
                    r305.A5K(new ClY(bfR, c5q2, i));
                    return;
                }
            }
            0fH.A0o("ReportThreadHelper", "Failed to start FRX for thread delete");
        }
        A08(bfR.A00);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DIS dis = this.A05;
        if (dis != null) {
            dis.Bsz();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void onCreate(Bundle bundle) {
        BxS bxS;
        String str;
        User A00;
        int A02 = 0FI.A02(495192304);
        super.onCreate(bundle);
        this.A00 = AbL.A09(this);
        Bundle requireArguments = requireArguments();
        this.A08 = AbG.A0y(ImmutableList.builder(), (Iterable) requireArguments.getSerializable("thread_keys"));
        this.A0E = requireArguments.getBoolean("allow_partial_success", false);
        this.A0G = requireArguments.getBoolean("should_recreate_thread", false);
        this.A0C = requireArguments.getBoolean("should_show_delete_more", false);
        this.A0F = requireArguments.getBoolean("delete_for_channel", false);
        this.A09 = requireArguments.getString("community_id");
        this.A0B = requireArguments.getString("group_id");
        this.A0A = requireArguments.getString("entry_point");
        this.A03 = new 1HH(this, 50020);
        this.A0D = 1Lo.A02(this.A00, this, 84719);
        this.A04 = 1Lo.A02(this.A00, this, 67488);
        C1F6 c1f6 = (C1F6) 1Bn.A0A(403);
        Context requireContext = requireContext();
        ImmutableList immutableList = this.A08;
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            C5Q c5q = new C5Q(requireContext, immutableList);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A07 = c5q;
            boolean A002 = c5q.A00(this.A00);
            String string = requireArguments().getString("dialog_title", A07());
            Bundle bundle2 = this.mArguments;
            if (A002) {
                C5Q c5q2 = this.A07;
                FbUserSession fbUserSession = this.A00;
                fbUserSession.getClass();
                ImmutableList immutableList2 = c5q2.A00;
                if (immutableList2.size() == 1 && (A00 = ((23F) 1Lo.A06(fbUserSession, 33102)).A00(AbJ.A0o((ThreadKey) immutableList2.get(0)))) != null) {
                    Name name = A00.A0X;
                    if (name.displayName != null) {
                        str = name.A02();
                        String string2 = bundle2.getString("dialog_message", getString(2131966937, str, getString(2131956666)));
                        String string3 = this.mArguments.getString("confirm_text", A06());
                        bxS = new BxS(string, getString(2131955696));
                        bxS.A03 = string2;
                        bxS.A02 = getString(2131966935);
                        bxS.A04 = string3;
                    }
                }
                str = "";
                String string22 = bundle2.getString("dialog_message", getString(2131966937, str, getString(2131956666)));
                String string32 = this.mArguments.getString("confirm_text", A06());
                bxS = new BxS(string, getString(2131955696));
                bxS.A03 = string22;
                bxS.A02 = getString(2131966935);
                bxS.A04 = string32;
            } else {
                String string4 = bundle2.getString("dialog_message", AbI.A1b(1BK.A0N(this.A0L)) ? getString(2131968165) : "");
                String string5 = this.mArguments.getString("neutral_text");
                bxS = new BxS(string, this.mArguments.getString("confirm_text", A06()));
                bxS.A03 = string4;
                String string6 = getString(2131955696);
                if (string5 != null) {
                    bxS.A04 = string6;
                    bxS.A02 = string5;
                } else {
                    bxS.A02 = string6;
                }
            }
            AbG.A1P(this, bxS);
            this.A02 = ((CHy) 7zO.A0l(this, 82650)).A01(requireContext(), 2131966936);
            0FI.A08(-464541841, A02);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
