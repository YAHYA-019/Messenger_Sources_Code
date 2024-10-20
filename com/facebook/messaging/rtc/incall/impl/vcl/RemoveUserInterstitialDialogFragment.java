package com.facebook.messaging.rtc.incall.impl.vcl;

import X.0D7;
import X.0FI;
import X.0Pz;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BV;
import X.1Iw;
import X.1Lo;
import X.1iF;
import X.2Ov;
import X.2R2;
import X.4YU;
import X.4zI;
import X.7zM;
import X.7zS;
import X.9xL;
import X.AbF;
import X.AbG;
import X.AbI;
import X.AbK;
import X.C00i;
import X.C1rs;
import X.C2531Gge;
import X.C8mi;
import X.EAX;
import X.ETa;
import X.FeI;
import X.GOq;
import X.GkS;
import X.IFc;
import X.QPf;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import com.google.common.base.Platform;
import com.google.common.collect.SingletonImmutableSet;
import java.util.BitSet;

/* loaded from: RemoveUserInterstitialDialogFragment.class */
public class RemoveUserInterstitialDialogFragment extends 2Ov {
    public EAX A00;
    public LithoView A01;
    public 9xL A02;
    public C00i A03;
    public final C00i A06 = 1BV.A00(82061);
    public final C00i A05 = AbF.A0S(this, 16980);
    public final ETa A04 = new C2531Gge(this, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public static C8mi A05(1Iw r301, RemoveUserInterstitialDialogFragment removeUserInterstitialDialogFragment, UserKey userKey, String str, String str2, boolean z) {
        int i;
        String A0W;
        Context context = removeUserInterstitialDialogFragment.getContext();
        if (z) {
            removeUserInterstitialDialogFragment.A06.get();
            i = 2131964361;
        } else {
            i = 2131964366;
        }
        String A0v = 1BK.A0v(context, str, i);
        Context context2 = removeUserInterstitialDialogFragment.getContext();
        if (z) {
            A0W = context2.getString(2131964360);
        } else {
            A0W = 0Pz.A0W(0Pz.A0v(1BK.A0v(context2, str, 2131964362), " ", !Platform.stringIsNullOrEmpty(str2) ? removeUserInterstitialDialogFragment.getContext().getString(2131964359, str, str2) : "\n", "\n\n"), 1BK.A0v(removeUserInterstitialDialogFragment.getContext(), AbK.A12(removeUserInterstitialDialogFragment.getContext()), 2131964358));
        }
        String A0v2 = 1BK.A0v(removeUserInterstitialDialogFragment.getContext(), str, 2131964365);
        Context context3 = removeUserInterstitialDialogFragment.getContext();
        int i2 = 2131964363;
        if (z) {
            i2 = 2131964364;
        }
        String string = context3.getString(i2);
        String string2 = removeUserInterstitialDialogFragment.getContext().getString(2131965022);
        MigColorScheme A11 = 7zM.A11(removeUserInterstitialDialogFragment.A05);
        QPf qPf = new QPf(removeUserInterstitialDialogFragment);
        7zS.A16(1, userKey, A0v, A0W);
        11T.A0F(A0v2, 4);
        11T.A0F(string, 5);
        11T.A0F(string2, 6);
        11T.A0F(A11, 7);
        GkS gkS = new GkS(r301, new C8mi());
        C8mi c8mi = gkS.A01;
        c8mi.A02 = userKey;
        BitSet bitSet = gkS.A02;
        bitSet.set(6);
        c8mi.A06 = A0v;
        bitSet.set(4);
        c8mi.A07 = A0W;
        bitSet.set(5);
        c8mi.A04 = A0v2;
        bitSet.set(1);
        c8mi.A03 = string;
        bitSet.set(0);
        c8mi.A05 = string2;
        bitSet.set(2);
        c8mi.A00 = qPf;
        bitSet.set(3);
        c8mi.A01 = A11;
        C1rs.A05(bitSet, gkS.A03, 7);
        gkS.A0J();
        return c8mi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        Bundle requireArguments = requireArguments();
        UserKey userKey = (UserKey) AbG.A07(requireArguments, "user_key_to_remove");
        String string = requireArguments.getString("user_name_to_remove");
        string.getClass();
        String string2 = requireArguments.getString("link_creator_name");
        boolean z = requireArguments.getBoolean("is_meetup_link", false);
        1Iw A0P = AbI.A0P(this);
        this.A01 = LithoView.A04(A0P, ComponentTree.A01(A05(A0P, this, userKey, string, string2, z), A0P, null).A00());
        EAX eax = new EAX(getContext());
        this.A00 = eax;
        eax.A0A(FeI.A00);
        this.A00.A0C(false);
        this.A00.setContentView(this.A01);
        IFc iFc = (IFc) 4YU.A0p(this.A03);
        11T.A0F(userKey, 0);
        if (!IFc.A0C(iFc)) {
            2R2 A01 = IFc.A01(iFc, "remove_guest_sheet_shown");
            if (A01 != null) {
                A01.A0E("links_surface", "messenger_guest_removal_sheet");
                ((0D7) A01).A00.A7M("user_ids_to_be_removed", new SingletonImmutableSet(userKey.id));
                A01.BZL();
            }
            4zI.A03.A05("VideoChatLinksAnalyticsLogger", "Event: %s. User: %s.", new Object[]{"remove_guest_sheet_shown", userKey.id});
        }
        EAX eax2 = this.A00;
        eax2.A08 = this.A04;
        return eax2;
    }

    public 1iF A17() {
        return GOq.A0U();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c9, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCancel(android.content.DialogInterface r302) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.vcl.RemoveUserInterstitialDialogFragment.onCancel(android.content.DialogInterface):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(476590580);
        super.onCreate(bundle);
        this.A03 = 1Lo.A02(1BL.A0G(this), this, 67965);
        0FI.A08(1859867436, A02);
    }
}
