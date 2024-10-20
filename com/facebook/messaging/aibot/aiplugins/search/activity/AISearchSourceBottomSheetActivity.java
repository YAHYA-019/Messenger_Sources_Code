package com.facebook.messaging.aibot.aiplugins.search.activity;

import X.11T;
import X.1BK;
import X.2Ov;
import X.94S;
import X.C91v;
import X.C9d2;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.aibot.aiplugins.search.dialog.AISearchSourceBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.util.ArrayList;

/* loaded from: AISearchSourceBottomSheetActivity.class */
public final class AISearchSourceBottomSheetActivity extends FbFragmentActivity {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.util.List] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        super.A2y(bundle);
        overridePendingTransition(0, 0);
        ArrayList A01 = getIntent().getData() != null ? C9d2.A01(getIntent().getData()) : getIntent().getParcelableArrayListExtra("INTENT_AI_SOURCES");
        if (getIntent().getData() != null) {
            Uri data = getIntent().getData();
            stringExtra = data != null ? C9d2.A00(11T.A02(data)).getQueryParameter("source_query") : null;
        } else {
            stringExtra = getIntent().getStringExtra("INTENT_SEARCH_QUERY");
        }
        if (getIntent().getData() != null) {
            Uri data2 = getIntent().getData();
            stringExtra2 = data2 != null ? C9d2.A00(11T.A02(data2)).getQueryParameter("source_query_url") : null;
        } else {
            stringExtra2 = getIntent().getStringExtra("INTENT_SEARCH_QUERY_URL");
        }
        if (A01 == null || A01.isEmpty() || stringExtra == null || stringExtra2 == null) {
            return;
        }
        94S r0 = MigBottomSheetDialogFragment.A01;
        ArrayList<? extends Parcelable> A17 = 1BK.A17(A01);
        Bundle A05 = 1BK.A05();
        2Ov aISearchSourceBottomSheetDialogFragment = new AISearchSourceBottomSheetDialogFragment();
        A05.putParcelableArrayList("AI_SOURCES_LIST", A17);
        A05.putString("AI_SOURCES_QUERY", stringExtra);
        A05.putString("AI_SOURCES_QUERY_URL", stringExtra2);
        aISearchSourceBottomSheetDialogFragment.setArguments(A05);
        aISearchSourceBottomSheetDialogFragment.A18(new C91v(this, 0));
        aISearchSourceBottomSheetDialogFragment.A0m(BDe(), "AISearchSourceBottomSheetDialogFragment");
    }
}
