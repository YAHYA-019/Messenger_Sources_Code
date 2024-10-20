package com.facebook.messaging.quickpromotion.interstitial.ui.bottomsheet;

import X.0CU;
import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.2bM;
import X.2qQ;
import X.7zQ;
import X.7zS;
import X.8Lf;
import X.8Ll;
import X.8NJ;
import X.AnonymousClass001;
import X.C1u3;
import X.C8xg;
import X.CZF;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.facebook.messaging.quickpromotion.model.MessengerQuickPromotionViewModel;
import com.facebook.mig.nux.MigNuxBottomSheet;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: MessengerQpBottomSheetFragment.class */
public final class MessengerQpBottomSheetFragment extends MigNuxBottomSheet {
    public InterstitialTrigger A00;
    public MessengerQuickPromotionViewModel A01;
    public boolean A02;
    public final 1Br A03 = 1Bu.A02(this, 67256);

    public static final MessengerQuickPromotionViewModel A05(MessengerQpBottomSheetFragment messengerQpBottomSheetFragment) {
        MessengerQuickPromotionViewModel messengerQuickPromotionViewModel = messengerQpBottomSheetFragment.A01;
        if (messengerQuickPromotionViewModel != null) {
            return messengerQuickPromotionViewModel;
        }
        11T.A0L("quickPromotionViewModel");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v66, types: [X.2qQ, java.lang.Object] */
    @Override // com.facebook.mig.nux.MigNuxBottomSheet
    public 8NJ A1M() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = A05(this).A09;
        str = "";
        if (str5 == null) {
            str5 = str;
        }
        String str6 = A05(this).A06;
        C8xg c8xg = str6 != null ? new C8xg(null, null, null, str6) : null;
        String str7 = A05(this).A05;
        str = str7 != null ? str7 : "";
        ImmutableList immutableList = A05(this).A00;
        ArrayList arrayList = null;
        if (immutableList != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                MessengerQuickPromotionViewModel.BulletListItem bulletListItem = (MessengerQuickPromotionViewModel.BulletListItem) it.next();
                String str8 = bulletListItem.A01;
                if (str8 != null && (str2 = bulletListItem.A00) != null) {
                    MigColorScheme A1F = A1F();
                    ?? obj = new Object();
                    ((2qQ) obj).A01 = str8;
                    ((2qQ) obj).A00 = str2;
                    Object Ci4 = A1F.Ci4(obj.A00());
                    11T.A0A(Ci4);
                    String str9 = (String) Ci4;
                    if (str9 != null && !0CU.A0O(str9) && (((str3 = bulletListItem.A03) != null && !0CU.A0O(str3)) || ((str4 = bulletListItem.A02) != null && !0CU.A0O(str4)))) {
                        A0s.add(8Ll.A01((C1u3) null, str3, bulletListItem.A02, str9, 1));
                    }
                }
            }
            arrayList = A0s;
        }
        String str10 = A05(this).A07;
        if (str10 == null) {
            str10 = str;
        }
        return new 8NJ(new 8Lf(CZF.A00(this, 49), A05(this).A08 != null ? CZF.A00(this, 50) : null, str10, A05(this).A08), c8xg, str, (CharSequence) null, str5, arrayList, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.nux.MigNuxBottomSheet, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        Throwable A0v;
        int i;
        Parcelable.Creator creator;
        Parcelable.Creator creator2;
        int A02 = 0FI.A02(2146007583);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Object obj = MessengerQuickPromotionViewModel.class.getDeclaredField("CREATOR").get(null);
        if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
            A0v = 7zS.A0v(MessengerQuickPromotionViewModel.class);
            i = -1061307113;
        } else {
            Parcelable A0K = 7zQ.A0K(requireArguments, creator, MessengerQuickPromotionViewModel.class, "qp_view_model");
            if (A0K != null) {
                MessengerQuickPromotionViewModel messengerQuickPromotionViewModel = (MessengerQuickPromotionViewModel) A0K;
                11T.A0F(messengerQuickPromotionViewModel, 0);
                this.A01 = messengerQuickPromotionViewModel;
                Object obj2 = InterstitialTrigger.class.getDeclaredField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator) || (creator2 = (Parcelable.Creator) obj2) == null) {
                    A0v = 7zS.A0v(InterstitialTrigger.class);
                    i = -1062247870;
                } else {
                    Parcelable A0K2 = 7zQ.A0K(requireArguments, creator2, InterstitialTrigger.class, "qp_trigger");
                    if (A0K2 != null) {
                        InterstitialTrigger interstitialTrigger = (InterstitialTrigger) A0K2;
                        11T.A0F(interstitialTrigger, 0);
                        this.A00 = interstitialTrigger;
                        0FI.A08(-1705246067, A02);
                        return;
                    }
                    A0v = AnonymousClass001.A0N("An InterstitialTrigger must be passed via intent");
                    i = 46495165;
                }
            } else {
                A0v = AnonymousClass001.A0N("A MessengerQuickPromotionViewModel object must be passed via intent");
                i = -1647728976;
            }
        }
        0FI.A08(i, A02);
        throw A0v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        Window window;
        int A02 = 0FI.A02(-1564219048);
        super.onDestroy();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(48);
        }
        if (!this.A02) {
            2bM r0 = (2bM) 1Br.A0B(this.A03);
            Long l = A05(this).A01;
            InterstitialTrigger interstitialTrigger = this.A00;
            if (interstitialTrigger != null) {
                InterstitialTriggerContext interstitialTriggerContext = interstitialTrigger.A01;
                String A00 = interstitialTriggerContext != null ? interstitialTriggerContext.A00("client_context_id") : null;
                if (getContext() == null) {
                    IllegalStateException A0h = 1BK.A0h();
                    0FI.A08(1944714227, A02);
                    throw A0h;
                }
                InterstitialTrigger interstitialTrigger2 = this.A00;
                if (interstitialTrigger2 != null) {
                    r0.A01(interstitialTrigger2.A01, l, A00);
                }
            }
            11T.A0L("trigger");
            throw 0Q8.createAndThrow();
        }
        0FI.A08(-1570217450, A02);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        2bM r0 = (2bM) 1Br.A0B(this.A03);
        Long l = A05(this).A03;
        11T.A09(l);
        long longValue = l.longValue();
        InterstitialTrigger interstitialTrigger = this.A00;
        if (interstitialTrigger == null) {
            11T.A0L("trigger");
            throw 0Q8.createAndThrow();
        }
        InterstitialTriggerContext interstitialTriggerContext = interstitialTrigger.A01;
        r0.A04(interstitialTriggerContext != null ? interstitialTriggerContext.A00("client_context_id") : null, (Map) null, longValue);
    }
}
