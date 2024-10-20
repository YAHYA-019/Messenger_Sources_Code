package com.facebook.messaging.memories.viewer.activity;

import X.0Q8;
import X.0fH;
import X.11T;
import X.1BK;
import X.1Br;
import X.1iF;
import X.1pH;
import X.2M3;
import X.2MX;
import X.4YT;
import X.7zL;
import X.7zM;
import X.7zQ;
import X.9Zk;
import X.9wL;
import X.AbstractC00603o4;
import X.C0ty;
import X.C96y;
import X.C9cw;
import X.C9ro;
import X.CfA;
import X.GOm;
import X.JQw;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.messaging.memories.model.MemoryMessageModel;
import com.facebook.messaging.memories.model.MemoryViewModel;
import com.facebook.messaging.memories.viewer.MemoryViewerFragment;
import java.util.List;

/* loaded from: MemoryViewerActivity.class */
public final class MemoryViewerActivity extends FbFragmentActivity {
    public FbUserSession A00;
    public 1pH A01;
    public final 2M3 A02 = new C9ro(this, 1);
    public final 1Br A03 = 7zM.A0f(this);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return new 1iF(1065372051377103L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        1pH r0 = this.A01;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        r0.A06();
    }

    /* JADX WARN: Type inference failed for: r0v172, types: [com.facebook.messaging.memories.viewer.MemoryViewerFragment, androidx.fragment.app.Fragment] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String str;
        String str2;
        super.A2y(bundle);
        this.A00 = 7zQ.A0N().A05(this);
        2M3 r0 = this.A02;
        View AUH = r0.AUH();
        11T.A0I(AUH, "null cannot be cast to non-null type android.view.ViewGroup");
        this.A01 = 1pH.A01((ViewGroup) AUH, BDe(), new CfA(this, 5));
        setIntent(getIntent());
        long j = -1;
        long longExtra = getIntent().getLongExtra("memory_server_id", j);
        String stringExtra = getIntent().getStringExtra("message_id");
        str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        String stringExtra2 = getIntent().getStringExtra("memory_id");
        str = stringExtra2 != null ? stringExtra2 : "";
        long j2 = 6;
        long longExtra2 = getIntent().getLongExtra(AbstractC00603o4.A00(57), j2);
        if (longExtra != j) {
            long longExtra3 = getIntent().getLongExtra("time_ago_ms", 0L);
            String stringExtra3 = getIntent().getStringExtra(GOm.A00(26));
            if (stringExtra3 == null) {
                stringExtra3 = str;
            }
            int intExtra = getIntent().getIntExtra(JQw.A00(100), 0);
            int intExtra2 = getIntent().getIntExtra(JQw.A00(99), 0);
            int intExtra3 = getIntent().getIntExtra(4YT.A00(1516), C96y.A04.modeId);
            Intent intent = getIntent();
            List A01 = Build.VERSION.SDK_INT >= 34 ? C9cw.A01(intent) : intent.getParcelableArrayListExtra("template_context_messages");
            if (A01 == null) {
                A01 = C0ty.A00;
            }
            long longExtra4 = getIntent().getLongExtra(4YT.A00(1601), j);
            int intExtra4 = getIntent().getIntExtra(4YT.A00(1602), -1);
            new 9Zk(r0.AUH(), 7zQ.A0m(this.A03));
            C0ty c0ty = C0ty.A00;
            MemoryViewModel memoryViewModel = new MemoryViewModel(null, Integer.valueOf(intExtra4), null, null, Long.valueOf(longExtra4), null, str, str, null, stringExtra3, null, null, null, null, str, stringExtra, c0ty, c0ty, c0ty, A01, intExtra, intExtra2, intExtra3, longExtra, longExtra3, j2, false, false, false);
            1pH r02 = this.A01;
            if (r02 != null) {
                ?? memoryViewerFragment = new MemoryViewerFragment();
                Bundle A05 = 1BK.A05();
                A05.putParcelable("arg_memory_view_model", new OpaqueParcelable(memoryViewModel));
                memoryViewerFragment.setArguments(A05);
                memoryViewerFragment.A0B = null;
                if (r02.BVa()) {
                    r02.Czy((Fragment) memoryViewerFragment, "memory_viewer_fragment");
                    return;
                }
                return;
            }
        } else if (7zL.A1V(stringExtra)) {
            new 9Zk(r0.AUH(), 7zQ.A0m(this.A03));
            1pH r03 = this.A01;
            if (r03 != null) {
                MemoryViewerFragment.A0R.A00(r03, new MemoryMessageModel(stringExtra, false, 0), (2MX) null);
                return;
            }
        } else {
            if (!7zL.A1V(str)) {
                0fH.A0o("MemoryViewerActivity", "No valid memory id or message id found for Memory Viewer Activity");
                return;
            }
            9Zk r04 = new 9Zk(r0.AUH(), 7zQ.A0m(this.A03));
            FbUserSession fbUserSession = this.A00;
            if (fbUserSession == null) {
                str2 = "fbUserSession";
                11T.A0L(str2);
                throw 0Q8.createAndThrow();
            }
            1pH r05 = this.A01;
            if (r05 != null) {
                r04.A00(fbUserSession, r05, new 9wL(this), (2MX) null, str, longExtra2);
                return;
            }
        }
        str2 = "contentViewManager";
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        1pH r0 = this.A01;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        r0.A07();
    }
}
