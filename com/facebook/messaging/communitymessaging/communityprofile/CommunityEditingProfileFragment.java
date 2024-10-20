package com.facebook.messaging.communitymessaging.communityprofile;

import X.0FI;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Br;
import X.1Bu;
import X.1pI;
import X.1vD;
import X.7zL;
import X.7zN;
import X.7zP;
import X.7zQ;
import X.7zR;
import X.7zV;
import X.8Jy;
import X.8Oh;
import X.9NN;
import X.AdC;
import X.AnonymousClass001;
import X.C1I;
import X.C3R9;
import X.C5ic;
import X.C8jp;
import X.C9ad;
import X.C9qn;
import X.C9ye;
import X.C9zj;
import X.CMt;
import X.CaD;
import X.Cwn;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.communitymessaging.model.Member;
import com.facebook.messaging.profile.bottomsheet.model.ProfileSheet;
import com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.BitSet;

/* loaded from: CommunityEditingProfileFragment.class */
public final class CommunityEditingProfileFragment extends SlidingSheetFullScreenDialogFragment {
    public LithoView A00;
    public C9ad A01;
    public CMt A02;
    public Community A03;
    public Member A04;
    public ProfileSheet A05;
    public C5ic A06;
    public MigColorScheme A07;
    public 1pI A08;
    public AdC A09;
    public final 1Br A0C = 1Bu.A00(83430);
    public final 1Br A0B = 1Bu.A02(this, 83066);
    public final 1Br A0A = 1Bu.A02(this, 67784);

    /* JADX WARN: Multi-variable type inference failed */
    public static final C8jp A05(FbUserSession fbUserSession, CommunityEditingProfileFragment communityEditingProfileFragment) {
        String str;
        communityEditingProfileFragment.A07 = 7zV.A0S(communityEditingProfileFragment);
        C3R9 c3r9 = new C3R9();
        Community community = communityEditingProfileFragment.A03;
        if (community == null) {
            str = "community";
        } else {
            c3r9.A01(community);
            ParcelableSecondaryData A00 = c3r9.A00();
            LithoView lithoView = communityEditingProfileFragment.A00;
            if (lithoView == null) {
                str = "lithoView";
            } else {
                8Oh r0 = new 8Oh(lithoView.A09, new C8jp());
                C8jp c8jp = r0.A01;
                c8jp.A01 = fbUserSession;
                BitSet bitSet = r0.A02;
                bitSet.set(3);
                c8jp.A00 = communityEditingProfileFragment.getParentFragmentManager();
                bitSet.set(4);
                c8jp.A09 = A06(communityEditingProfileFragment);
                bitSet.set(10);
                MigColorScheme migColorScheme = communityEditingProfileFragment.A07;
                if (migColorScheme == null) {
                    str = "colorScheme";
                } else {
                    c8jp.A07 = migColorScheme;
                    bitSet.set(1);
                    c8jp.A0A = A00;
                    bitSet.set(2);
                    c8jp.A08 = new C9zj(communityEditingProfileFragment, 14);
                    bitSet.set(9);
                    c8jp.A06 = new Cwn(fbUserSession, communityEditingProfileFragment, 5);
                    bitSet.set(8);
                    C9ad c9ad = communityEditingProfileFragment.A01;
                    if (c9ad != null) {
                        c8jp.A02 = c9ad.A01;
                        bitSet.set(0);
                        c8jp.A05 = C9ye.A01(communityEditingProfileFragment, 15);
                        bitSet.set(7);
                        c8jp.A04 = communityEditingProfileFragment.A05;
                        bitSet.set(6);
                        c8jp.A03 = communityEditingProfileFragment.A04;
                        bitSet.set(5);
                        7zP.A1A(r0, bitSet, r0.A03);
                        return c8jp;
                    }
                    str = "profileCache";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final User A06(CommunityEditingProfileFragment communityEditingProfileFragment) {
        return (User) 1Br.A0B(communityEditingProfileFragment.A0C);
    }

    public static final void A07(CommunityEditingProfileFragment communityEditingProfileFragment) {
        1pI r0 = communityEditingProfileFragment.A08;
        if (r0 == null) {
            communityEditingProfileFragment.A0o();
        } else if (r0.BVa()) {
            1pI r02 = communityEditingProfileFragment.A08;
            if (r02 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            r02.CeH("CommunityEditingProfileFragment");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, -1217913070);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A0M = 7zR.A0M(this);
        this.A00 = A0M;
        0FI.A08(-949164895, A04);
        return A0M;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(109983113);
        super.onDestroy();
        C9ad c9ad = this.A01;
        if (c9ad == null) {
            11T.A0L("profileCache");
            throw 0Q8.createAndThrow();
        }
        c9ad.A00 = null;
        0FI.A08(-521651663, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putParcelable("profile_sheet", this.A05);
        bundle.putParcelable("member", this.A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, X.8Jy] */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        FbUserSession A01 = 1BM.A01(this);
        this.A01 = (C9ad) 7zN.A0n(this, A01, 83373);
        this.A06 = 7zQ.A0l();
        this.A02 = (CMt) 7zN.A0n(this, A01, 83067);
        this.A09 = (AdC) 7zN.A0n(this, A01, 82391);
        Parcelable parcelable = requireArguments().getParcelable("community");
        if (parcelable == null) {
            throw 1BK.A0h();
        }
        this.A03 = (Community) parcelable;
        try {
            this.A08 = 1vD.A00(view);
        } catch (IllegalStateException e) {
            0fH.A0p("CommunityEditingProfileFragment", "contentViewManager not found", e);
        }
        String str = "profileCache";
        if (bundle == null) {
            C9ad c9ad = this.A01;
            if (c9ad != null) {
                ?? obj = new Object();
                ((8Jy) obj).A05 = null;
                ((8Jy) obj).A03 = null;
                ((8Jy) obj).A00 = null;
                ((8Jy) obj).A04 = null;
                ((8Jy) obj).A01 = null;
                ((8Jy) obj).A06 = null;
                ((8Jy) obj).A02 = null;
                c9ad.A01 = obj;
                Community community = this.A03;
                if (community != null) {
                    long A0C = 7zQ.A0C(community);
                    C1I c1i = (C1I) 1Br.A0B(this.A0B);
                    Context requireContext = requireContext();
                    Long valueOf = Long.valueOf(A0C);
                    c1i.A00(requireContext, A01, valueOf, 0L, 7zQ.A0H(A06(this))).observe(getViewLifecycleOwner(), new CaD(A01, this, 18));
                    AdC adC = this.A09;
                    if (adC != null) {
                        MutableLiveData A0H = 7zL.A0H();
                        adC.A01 = A0H;
                        AdC adC2 = this.A09;
                        if (adC2 != null) {
                            Community community2 = this.A03;
                            if (community2 != null) {
                                String str2 = community2.A0U;
                                11T.A0A(str2);
                                adC2.A04(requireContext(), valueOf, 1BK.A0n(str2), 7zQ.A0H(A06(this)), 0L);
                                C9qn.A00(getViewLifecycleOwner(), A0H, A01, this, 2);
                            }
                        }
                    }
                    11T.A0L("adminActionsMsysApi");
                    throw 0Q8.createAndThrow();
                }
                11T.A0L("community");
                throw 0Q8.createAndThrow();
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        this.A05 = (ProfileSheet) bundle.getParcelable("profile_sheet");
        this.A04 = (Member) bundle.getParcelable("member");
        C9ad c9ad2 = this.A01;
        if (c9ad2 != null) {
            c9ad2.A00 = new 9NN(A01, this);
            LithoView lithoView = this.A00;
            if (lithoView != null) {
                lithoView.A0y(A05(A01, this));
                return;
            }
            str = "lithoView";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
