package com.facebook.messaging.sms.defaultapp;

import X.0Mu;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.6Pl;
import X.AbF;
import X.C2121Dea;
import X.DKS;
import X.DMV;
import X.IGG;
import X.IGK;
import X.IGS;
import X.IPy;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.google.common.base.Platform;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: ClassZeroDialogActivity.class */
public final class ClassZeroDialogActivity extends FbFragmentActivity {
    public IPy A00;
    public Executor A01;
    public DMV A02 = null;
    public final Queue A04 = AbF.A1F();
    public final 6Pl A03 = (6Pl) 1Bi.A03(50090);

    private void A12(Intent intent) {
        ContentValues contentValues = intent.getExtras() != null ? (ContentValues) intent.getParcelableExtra("sms_message") : null;
        if (Platform.stringIsNullOrEmpty(contentValues.getAsString("body"))) {
            return;
        }
        this.A04.add(new 0Mu(contentValues, Integer.valueOf(intent.getIntExtra("subscription", -1))));
    }

    private void A15(0Mu r302) {
        ContentValues contentValues = (ContentValues) r302.A00;
        Object obj = r302.A01;
        C2121Dea c2121Dea = new C2121Dea(this);
        c2121Dea.A0E(new IGK(1, contentValues, this, obj), 2131965428);
        c2121Dea.A0D(IGS.A00(this, 28), 2131955874);
        c2121Dea.A06(2131954194);
        c2121Dea.A0A(contentValues.getAsString("body"));
        ((DKS) c2121Dea).A01.A01 = new IGG(this, 3);
        DMV A0I = c2121Dea.A0I();
        this.A02 = A0I;
        A0I.show();
    }

    public static void A16(ClassZeroDialogActivity classZeroDialogActivity) {
        Queue queue = classZeroDialogActivity.A04;
        if (!queue.isEmpty()) {
            queue.remove();
        }
        if (queue.isEmpty()) {
            classZeroDialogActivity.finish();
        } else {
            classZeroDialogActivity.A15((0Mu) queue.element());
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        super.A2x(intent);
        A12(intent);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        requestWindowFeature(1);
        super.A2y(bundle);
        this.A00 = (IPy) 1Bn.A0E(this, (1BY) null, 116277);
        this.A01 = (Executor) 1Bi.A03(16467);
        A12(getIntent());
        Queue queue = this.A04;
        if (queue.isEmpty()) {
            finish();
        } else if (queue.size() == 1) {
            A15((0Mu) queue.element());
        }
    }
}
