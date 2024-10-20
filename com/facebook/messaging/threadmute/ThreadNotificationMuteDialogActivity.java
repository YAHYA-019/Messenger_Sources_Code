package com.facebook.messaging.threadmute;

import X.0S2;
import X.11T;
import X.1BK;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1F9;
import X.1iF;
import X.1vZ;
import X.2Kl;
import X.2Pd;
import X.2Pe;
import X.2Ph;
import X.4YT;
import X.5Up;
import X.AbH;
import X.AbK;
import X.AbL;
import X.AnonymousClass208;
import X.C00i;
import X.C45d;
import X.C5ap;
import X.C5dz;
import X.C80;
import X.CPS;
import X.CSH;
import X.Cng;
import X.Cu9;
import X.JZj;
import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.Toast;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.NotificationSetting;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;

/* loaded from: ThreadNotificationMuteDialogActivity.class */
public class ThreadNotificationMuteDialogActivity extends FbFragmentActivity implements 1vZ, 2Kl {
    public JZj A01;
    public FbUserSession A02;
    public C00i A03;
    public ThreadKey A04;
    public AnonymousClass208 A05;
    public 2Pe A06;
    public 5Up A07;
    public final C00i A09 = AbH.A0Y();
    public boolean A08 = true;
    public int A00 = -1;

    private void A12(Intent intent) {
        ThreadKey threadKey = (ThreadKey) intent.getParcelableExtra("thread_key");
        this.A04 = threadKey;
        threadKey.getClass();
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        CharSequence charSequence = resultsFromIntent != null ? resultsFromIntent.getCharSequence("voice_reply") : null;
        if (!TextUtils.isEmpty(charSequence)) {
            2Pd r0 = this.A06;
            FbUserSession fbUserSession = this.A02;
            fbUserSession.getClass();
            String charSequence2 = charSequence.toString();
            ThreadKey threadKey2 = this.A04;
            CPS cps = (CPS) r0.A01.get();
            11T.A0F(charSequence2, 1);
            ImmutableList A01 = ((C80) 1Br.A0B(cps.A06)).A01(threadKey2);
            int size = A01.size();
            for (int i = 0; i < size; i++) {
                if (11T.A0O(((Cu9) A01.get(i)).A03, charSequence2)) {
                    cps.A04(fbUserSession, threadKey2, (Cu9) A01.get(i));
                    A15(this);
                    return;
                }
            }
        }
        JZj AL7 = this.A06.AL7(this, (1F9) null, this.A04, new Cng(this), this.A00);
        this.A01 = AL7;
        AL7.setOnDismissListener(new CSH(this, 3));
        this.A01.show();
    }

    public static void A15(ThreadNotificationMuteDialogActivity threadNotificationMuteDialogActivity) {
        String A0v;
        if (!threadNotificationMuteDialogActivity.A08) {
            threadNotificationMuteDialogActivity.A08 = true;
            return;
        }
        2Pd r0 = threadNotificationMuteDialogActivity.A06;
        NotificationSetting A02 = ((2Ph) r0.A02.get()).A02(threadNotificationMuteDialogActivity.A04);
        if (!A02.A02()) {
            if (A02.A01() == 0S2.A01) {
                A0v = threadNotificationMuteDialogActivity.getString(2131962009);
            } else {
                A0v = 1BK.A0v(threadNotificationMuteDialogActivity, DateFormat.getTimeFormat(threadNotificationMuteDialogActivity).format(AbK.A1B(A02.A00)), 2131962010);
            }
            Toast.makeText(threadNotificationMuteDialogActivity, A0v, 0).show();
            threadNotificationMuteDialogActivity.A05.AFx(threadNotificationMuteDialogActivity.A04, 4YT.A00(785));
            ((C45d) threadNotificationMuteDialogActivity.A09.get()).A0H(null, threadNotificationMuteDialogActivity.A04, null, "mute", true);
            Intent intent = threadNotificationMuteDialogActivity.getIntent();
            if (intent.hasExtra("notification_type")) {
                Serializable serializableExtra = intent.getSerializableExtra("notification_type");
                if ((serializableExtra instanceof C5ap) && serializableExtra != null) {
                    C5dz c5dz = (C5dz) threadNotificationMuteDialogActivity.A03.get();
                    ThreadKey threadKey = threadNotificationMuteDialogActivity.A04;
                    if (serializableExtra == C5ap.A1r) {
                        C5dz.A01(threadKey, c5dz, "notification_mute_action_success");
                    }
                }
            }
        }
        threadNotificationMuteDialogActivity.finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbL.A0A();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        super.A2x(intent);
        JZj jZj = this.A01;
        if (jZj != null) {
            this.A08 = false;
            jZj.cancel();
            this.A00 = -1;
        }
        A12(intent);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A02 = AbL.A08(this);
        this.A07 = (5Up) 1Bn.A0A(83289);
        this.A05 = (AnonymousClass208) 1Bn.A0E(this, (1BY) null, 17006);
        this.A06 = (2Pe) 1Bn.A0E(this, (1BY) null, 17005);
        this.A03 = 1BV.A00(49805);
        if (bundle != null) {
            this.A00 = bundle.getInt("selected_mute_item", -1);
        }
        A12(getIntent());
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_mute_item", this.A00);
    }
}
