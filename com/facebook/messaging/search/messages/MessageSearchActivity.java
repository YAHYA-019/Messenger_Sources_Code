package com.facebook.messaging.search.messages;

import X.06Z;
import X.0FI;
import X.0S2;
import X.0fH;
import X.1BQ;
import X.1BY;
import X.1F9;
import X.1JF;
import X.1Lo;
import X.1iF;
import X.2fE;
import X.7zL;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbK;
import X.AbL;
import X.AbstractC00603o4;
import X.AfJ;
import X.Bye;
import X.C00i;
import X.C06c;
import X.C1583Am2;
import X.C1wv;
import X.C1zm;
import X.C2T;
import X.CaE;
import X.DEN;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.SearchViewerThreadModel;
import com.facebook.quicklog.reliability.CancelReason;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: MessageSearchActivity.class */
public class MessageSearchActivity extends FbFragmentActivity implements DEN {
    public String A00;
    public ThreadSummary A01;
    public C1583Am2 A02;
    public Long A03;
    public String A04;
    public String A05;
    public ArrayList A06;
    public final C00i A07 = 1BQ.A02(83522);
    public final C00i A08 = AbH.A0X();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.Fragment, X.Am2] */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity
    public void A2b(Fragment fragment) {
        super.A2b(fragment);
        if (fragment instanceof C1583Am2) {
            ?? r0 = (C1583Am2) fragment;
            this.A02 = r0;
            r0.A05 = this;
            String str = this.A00;
            String str2 = this.A04;
            ThreadSummary threadSummary = this.A01;
            String str3 = this.A05;
            Long l = this.A03;
            ArrayList arrayList = this.A06;
            AfJ A0b = r0.mFragmentManager.A0b("MessageSearchDataFragment");
            A0b.getClass();
            Bye bye = A0b.A00;
            r0.A06 = bye;
            if (bye.A03 == 0S2.A00) {
                bye.A07 = str;
                bye.A05 = str2;
                bye.A01 = threadSummary;
                bye.A06 = str3;
                bye.A04 = l;
                bye.A02 = arrayList == null ? null : ImmutableList.copyOf((Collection) arrayList);
                boolean z = true;
                r0.A06.A09 = !1JF.A0A(str3);
                Bye bye2 = r0.A06;
                if (bye2.A09 || threadSummary == null) {
                    z = false;
                }
                bye2.A0A = z;
            }
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(949036578942304L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        FbUserSession A08 = AbL.A08(this);
        this.A00 = getIntent().getStringExtra("search_query");
        this.A04 = getIntent().getStringExtra("entry_surface");
        getIntent().getStringExtra("message_search_entry_type");
        getIntent().getStringExtra("session_id");
        this.A01 = ((2fE) 1Lo.A04(this, A08, (1BY) null, 17064)).A06((ThreadKey) getIntent().getParcelableExtra("thread_key"));
        ThreadSummary threadSummary = null;
        this.A05 = getIntent().getStringExtra("message_id");
        this.A03 = Long.valueOf(getIntent().getLongExtra("message_sort_order", -1));
        if (this.A01 == null) {
            SearchViewerThreadModel searchViewerThreadModel = (SearchViewerThreadModel) getIntent().getParcelableExtra("search_viewer_thread_model");
            if (searchViewerThreadModel != null) {
                C1zm c1zm = new C1zm();
                c1zm.A03(searchViewerThreadModel.A01);
                c1zm.A0g = 1F9.A0I;
                c1zm.A0E(searchViewerThreadModel.A02);
                c1zm.A20 = searchViewerThreadModel.A03;
                c1zm.A0V = searchViewerThreadModel.A00;
                threadSummary = AbF.A0i(c1zm);
            }
            this.A01 = threadSummary;
        }
        this.A06 = getIntent().getParcelableArrayListExtra(AbstractC00603o4.A00(607));
        if (AbF.A0n(this.A08).A08()) {
            C1wv c1wv = (C1wv) 1Lo.A04(getBaseContext(), A08, (1BY) null, 68883);
            C1wv.A04(c1wv);
            CaE.A02(this, c1wv.A02, ActionId.CONTROLLER_INITIATED);
        }
        if (1JF.A0A(this.A00)) {
            0fH.A0o("MessageSearchActivity", "MessageSearchActivity requires MessagingExtras.EXTRA_SEARCH_QUERY");
            finish();
            return;
        }
        String str = this.A00;
        getIntent().putExtra("search_query", str);
        this.A00 = str;
        getIntent().putExtra(AbstractC00603o4.A00(578), false);
        setContentView(2132542563);
        06Z BDe = BDe();
        if (!(BDe.A0b("message_search_fragment") instanceof C1583Am2)) {
            C06c A0G = 7zL.A0G(BDe);
            A0G.A0P(new C1583Am2(), "message_search_fragment", 2131365681);
            C06c.A00(A0G, false);
        }
        ((C2T) this.A07.get()).A00();
        AbK.A1D(this, A08);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        06Z BDe = BDe();
        if (BDe.A0b("MessageSearchDataFragment") == null) {
            C06c A0G = 7zL.A0G(BDe);
            A0G.A0O(new AfJ(), "MessageSearchDataFragment");
            A0G.A06();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C1583Am2 c1583Am2 = this.A02;
        if (c1583Am2 == null || !c1583Am2.A0D.A02()) {
            super.onBackPressed();
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(171777844);
        C2T c2t = (C2T) this.A07.get();
        AbG.A0r(c2t.A01).flowEndCancel(c2t.A00, CancelReason.USER_CANCELLED);
        super.onStop();
        0FI.A07(1465599165, A00);
    }
}
