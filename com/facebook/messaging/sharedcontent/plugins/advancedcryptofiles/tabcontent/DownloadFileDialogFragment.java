package com.facebook.messaging.sharedcontent.plugins.advancedcryptofiles.tabcontent;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BJ;
import X.1Bi;
import X.1Br;
import X.1Bu;
import X.66I;
import X.AbG;
import X.AnonymousClass001;
import X.BxS;
import X.C67J;
import X.Ch1;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.dialog.ConfirmActionDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadview.model.doc.Doc;

/* loaded from: DownloadFileDialogFragment.class */
public final class DownloadFileDialogFragment extends ConfirmActionDialogFragment {
    public Doc A00;
    public ThreadKey A01;
    public final 1Br A02 = 1Bu.A00(66170);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalArgumentException A0L;
        int i;
        int A02 = 0FI.A02(1937941611);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("thread_key_data_key");
        if (parcelable != null) {
            this.A01 = (ThreadKey) parcelable;
            Parcelable parcelable2 = requireArguments.getParcelable("file_key");
            if (parcelable2 != null) {
                Doc doc = (Doc) parcelable2;
                this.A00 = doc;
                if (doc != null) {
                    BxS bxS = new BxS(doc.A03, getString(2131952923));
                    Doc doc2 = this.A00;
                    if (doc2 != null) {
                        if (doc2.A01 > 0) {
                            66I r0 = (66I) 1Bi.A03(49956);
                            Doc doc3 = this.A00;
                            if (doc3 != null) {
                                bxS.A03 = r0.A00((int) doc3.A01);
                            }
                        }
                        AbG.A1P(this, bxS);
                        ((C67J) 1Br.A0B(this.A02)).A04(new Ch1(this), 1BJ.A00(17), getString(2131968262));
                        0FI.A08(-1016117600, A02);
                        return;
                    }
                }
                11T.A0L("fileResource");
                throw 0Q8.createAndThrow();
            }
            A0L = AnonymousClass001.A0L("Required value was null.");
            i = 10769337;
        } else {
            A0L = AnonymousClass001.A0L("Required value was null.");
            i = 1755749160;
        }
        0FI.A08(i, A02);
        throw A0L;
    }
}
