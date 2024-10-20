package com.facebook.messaging.attribution;

import X.0FI;
import X.0Pz;
import X.0fH;
import X.1BQ;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Kd;
import X.4YT;
import X.7hZ;
import X.AbH;
import X.AbJ;
import X.AbK;
import X.AbL;
import X.AbstractC00603o4;
import X.C00i;
import X.C15h;
import X.C1xj;
import X.C2125Dee;
import X.C3o5;
import X.DKC;
import X.Et9;
import X.Fw1;
import X.G7K;
import X.Hsr;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.chatheads.service.ChatHeadService;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Executor;

/* loaded from: ChatHeadsReplyFlowHandlerActivity.class */
public class ChatHeadsReplyFlowHandlerActivity extends Activity {
    public Intent A00;
    public FbUserSession A01;
    public C2125Dee A02;
    public ThreadKey A03;
    public Hsr A04;
    public Executor A05;
    public C15h A06;
    public Context A07;
    public Et9 A08;
    public final C00i A0A = AbH.A0D();
    public final C00i A09 = 1BQ.A01();

    private Intent A00(ThreadKey threadKey) {
        Intent A0D = C3o5.A0D(this.A08.A00, ChatHeadService.class);
        A0D.setAction(C1xj.A07);
        A0D.putExtra(C1xj.A0W, threadKey.toString());
        A0D.putExtra(C1xj.A0T, "reply_flow");
        A0D.putExtra(C1xj.A0Q, (String) this.A06.get());
        return A0D;
    }

    public static void A01(Intent intent, ChatHeadsReplyFlowHandlerActivity chatHeadsReplyFlowHandlerActivity) {
        AbK.A0q(chatHeadsReplyFlowHandlerActivity.A0A).A0C(chatHeadsReplyFlowHandlerActivity.A07, intent);
        chatHeadsReplyFlowHandlerActivity.moveTaskToBack(true);
        chatHeadsReplyFlowHandlerActivity.finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        7hZ r306;
        if (i != 1003) {
            0fH.A07(ChatHeadsReplyFlowHandlerActivity.class, Integer.valueOf(i), "Got unexpected request code: %d");
            moveTaskToBack(true);
            finish();
            return;
        }
        if (i2 != -1) {
            A01(A00(this.A03), this);
            return;
        }
        C2125Dee c2125Dee = new C2125Dee(this);
        this.A02 = c2125Dee;
        c2125Dee.A03 = 1;
        c2125Dee.A05(true);
        this.A02.setCancelable(true);
        this.A02.A04(getString(2131957324));
        C2125Dee c2125Dee2 = this.A02;
        c2125Dee2.A0C = null;
        C2125Dee.A02(c2125Dee2);
        C2125Dee c2125Dee3 = this.A02;
        c2125Dee3.A0D = null;
        C2125Dee.A02(c2125Dee3);
        this.A02.show();
        if (intent != null) {
            MediaResource mediaResource = new MediaResource(this.A04.A00(intent.getData(), (Uri) intent.getParcelableExtra(4YT.A00(316)), intent.getType()));
            Hsr hsr = this.A04;
            FbUserSession fbUserSession = this.A01;
            fbUserSession.getClass();
            r306 = hsr.A01(fbUserSession, ImmutableList.of((Object) mediaResource));
        } else {
            r306 = new 7hZ(0Pz.A05(this.A00.getPackage(), " returned with RESULT_OK but with no data."));
        }
        1Kd.A0F(new Fw1(8, intent, this, A00(this.A03)), r306, this.A05);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = 0FI.A00(1390326424);
        super.onCreate(bundle);
        this.A01 = AbL.A08(this);
        this.A07 = this;
        this.A08 = (Et9) 1Bi.A03(99950);
        this.A06 = G7K.A01(this, 34);
        this.A04 = (Hsr) 1Bn.A0E(this, (1BY) null, 115949);
        this.A05 = AbJ.A1D();
        Intent intent = getIntent();
        this.A00 = (Intent) intent.getParcelableExtra(AbstractC00603o4.A00(175));
        this.A03 = (ThreadKey) intent.getParcelableExtra("thread_key");
        DKC.A0f(this.A0A).A00().A09(this, this.A00, 1003);
        0FI.A07(912241032, A00);
    }
}
