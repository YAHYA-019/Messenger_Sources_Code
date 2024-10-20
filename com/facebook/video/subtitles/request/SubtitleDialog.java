package com.facebook.video.subtitles.request;

import X.0FI;
import X.11T;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1CO;
import X.1EZ;
import X.1Fv;
import X.1Lm;
import X.1iF;
import X.2Ov;
import X.9Pk;
import X.AbF;
import X.C03713yu;
import X.C6dl;
import X.GOp;
import X.Hcv;
import X.JGj;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.model.GraphQLMedia;

/* loaded from: SubtitleDialog.class */
public final class SubtitleDialog extends 2Ov {
    public DialogInterface.OnDismissListener A01;
    public FbUserSession A02;
    public C03713yu A03;
    public GraphQLMedia A04;
    public Hcv A05;
    public JGj A06;
    public C6dl A07;
    public 1CO A08;
    public 9Pk A09;
    public final 1Br A0B = 1Bq.A00(66167);
    public final 1Br A0A = 1Bq.A00(16504);
    public int A00 = 1;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (r308 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog A0n(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.subtitles.request.SubtitleDialog.A0n(android.os.Bundle):android.app.Dialog");
    }

    public 1iF A17() {
        return AbF.A0C(2444622522461689L);
    }

    public void onCancel(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        DialogInterface.OnDismissListener onDismissListener = this.A01;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-844521167);
        super.onCreate(bundle);
        FbUserSession A00 = 1Fv.A00(bundle, (1Fv) 1Bi.A03(66351), (1EZ) null);
        this.A02 = A00;
        this.A05 = (Hcv) 1Lm.A06(A00, 115817);
        this.A08 = GOp.A0j();
        this.A09 = (9Pk) 1Bn.A0A(66166);
        0FI.A08(2004528402, A02);
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-120921552);
        this.A06 = null;
        super.onDestroy();
        0FI.A08(1364445043, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.A01;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
