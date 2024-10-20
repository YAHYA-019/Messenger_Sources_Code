package X;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.payments.auth.model.NuxFollowUpAction;
import com.facebook.payments.p2p.messenger.core.prefs.transactions.MessengerPayHistoryLoaderResult;
import com.facebook.resources.ui.FbTextView;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Da8, reason: case insensitive filesystem */
/* loaded from: Da8.class */
public final class C2047Da8 extends 33A {
    public static final String __redex_internal_original_name = "MessengerPayHistoryFragment";
    public View A00;
    public ListView A01;
    public 1PA A02;
    public 1Mc A03;
    public DPZ A04;
    public Fcu A05;
    public MessengerPayHistoryLoaderResult A06;
    public EL2 A07;
    public Exx A08;
    public EOe A09;
    public Ewo A0A;
    public FbTextView A0B;
    public 1CQ A0C;
    public 82O A0D;
    public CIu A0E;
    public final C00i A0F = 1BQ.A01();

    public static void A03(C2047Da8 c2047Da8) {
        c2047Da8.A01.removeFooterView(c2047Da8.A00);
        DPZ dpz = c2047Da8.A04;
        MessengerPayHistoryLoaderResult messengerPayHistoryLoaderResult = c2047Da8.A06;
        ImmutableList immutableList = messengerPayHistoryLoaderResult.A01;
        if (immutableList == null) {
            immutableList = messengerPayHistoryLoaderResult.A00;
        }
        dpz.A00 = immutableList;
        0V5.A00(dpz, -1232862849);
        c2047Da8.A05(AnonymousClass001.A1N(c2047Da8.A04.getCount()));
    }

    public static void A04(C2047Da8 c2047Da8) {
        RQu rQu;
        EKm eKm;
        EL2 el2 = c2047Da8.A07;
        int ordinal = el2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                eKm = EKm.A01;
            } else {
                if (ordinal != 2) {
                    throw AnonymousClass002.A0C(el2, "Unknown MessengerPayHistoryMode provided ", AnonymousClass001.A0k());
                }
                eKm = EKm.A02;
            }
            rQu = new RQu(Qny.A01, (EOe) null, eKm);
        } else {
            rQu = new RQu(Qny.A01, c2047Da8.A09, (EKm) null);
        }
        c2047Da8.A05.A01(rQu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A05(boolean z) {
        Ewo ewo;
        int i;
        if (z) {
            this.A01.setVisibility(0);
            this.A0B.setVisibility(8);
            return;
        }
        EOe eOe = this.A09;
        if (eOe != null) {
            int ordinal = eOe.ordinal();
            if (ordinal == 1) {
                ewo = this.A0A;
                i = 2131957880;
            } else if (ordinal == 2) {
                ewo = this.A0A;
                i = 2131962830;
            }
            ewo.A00(this.A0B, "[[learn_more_link]]", getString(2131967415), "https://m.facebook.com/help/messenger-app/750020781733477", i);
        }
        this.A01.setVisibility(8);
        this.A0B.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(1338859913);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        this.A01.addFooterView(this.A00);
        this.A01.setAdapter((ListAdapter) this.A04);
        this.A01.setOnScrollListener(new FYM(this));
        EL2 el2 = (EL2) this.mArguments.get("messenger_pay_history_mode");
        this.A07 = el2;
        if (el2 == EL2.A03) {
            this.A09 = (EOe) this.mArguments.get("payment_transaction_query_type");
        }
        this.A05.A02 = new Fcr(this, 1);
        this.A01.setOnItemClickListener(new FYO(this, 5));
        if (bundle != null) {
            Fcu fcu = this.A05;
            fcu.A03 = (MessengerPayHistoryLoaderResult) bundle.getParcelable("current_result");
            fcu.A04 = bundle.getBoolean("initial_loading_done");
            MessengerPayHistoryLoaderResult messengerPayHistoryLoaderResult = (MessengerPayHistoryLoaderResult) bundle.getParcelable("messenger_pay_history_loader_result");
            this.A06 = messengerPayHistoryLoaderResult;
            if (messengerPayHistoryLoaderResult != null) {
                A03(this);
            }
        }
        if (this.A06 == null) {
            A04(this);
            if (this.A05.A04) {
                this.A01.removeFooterView(this.A00);
                A05(AnonymousClass001.A1N(this.A04.getCount()));
            }
        }
        0FI.A08(-364781310, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super/*androidx.fragment.app.Fragment*/.onActivityResult(i, i2, intent);
        } else {
            if (i2 != -1 || intent == null) {
                return;
            }
            F5W.A00((NuxFollowUpAction) intent.getParcelableExtra("nux_follow_up_action"), this.A0D.A0T(getContext(), this.mFragmentManager), 2131965720, 2131965719);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1575176407);
        super.onCreate(bundle);
        this.A04 = (DPZ) 7zO.A0l(this, 99190);
        this.A05 = (Fcu) 1Bn.A0A(99227);
        this.A0A = (Ewo) 7zO.A0l(this, 99202);
        this.A0D = (82O) 1Bn.A0A(65587);
        this.A08 = (Exx) 7zO.A0l(this, 99026);
        this.A0C = (1CQ) 1Bi.A03(131252);
        this.A03 = (1Mc) 7zO.A0m(this, 65732);
        this.A0E = (CIu) 7zO.A0m(this, 83864);
        Frp frp = new Frp(this, 14);
        1P9 r0 = new 1P9(this.A03);
        r0.A05(frp, "com.facebook.messaging.payment.ACTION_PAYMENT_TRANSACTION_CACHE_UPDATED");
        r0.A05(frp, "com.facebook.messaging.payment.ACTION_NEW_TRANSFER");
        this.A02 = 1P9.A01(r0, frp, "com.facebook.messaging.payment.ACTION_PAYMENT_REQUEST_CACHE_UPDATED");
        0FI.A08(-1550496932, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1268193175);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542590);
        this.A01 = (ListView) A08.findViewById(R.id.list);
        this.A0B = DKC.A0e(A08, 2131365705);
        this.A00 = DKF.A0B(layoutInflater, 2132542591);
        0FI.A08(-639628223, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(303860339);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        Fcu fcu = this.A05;
        if (fcu != null) {
            fcu.AEC();
        }
        this.A02.A01();
        0FI.A08(1478526858, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1265431116);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A02.A00();
        0fH.A0A(C2047Da8.class, "MessengerPayHistoryFragment.onResume");
        0FI.A08(2130367725, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        Fcu fcu = this.A05;
        bundle.putParcelable("current_result", fcu.A03);
        bundle.putBoolean("initial_loading_done", fcu.A04);
        bundle.putParcelable("messenger_pay_history_loader_result", this.A06);
    }
}
