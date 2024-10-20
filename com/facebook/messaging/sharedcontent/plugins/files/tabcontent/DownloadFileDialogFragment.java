package com.facebook.messaging.sharedcontent.plugins.files.tabcontent;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BJ;
import X.1Bi;
import X.1Bu;
import X.1HG;
import X.66I;
import X.7zM;
import X.AbG;
import X.AnonymousClass001;
import X.BxS;
import X.C00i;
import X.C67J;
import X.Roy;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.dialog.ConfirmActionDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: DownloadFileDialogFragment.class */
public final class DownloadFileDialogFragment extends ConfirmActionDialogFragment {
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public MediaResource A03;
    public ThreadKey A04;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalArgumentException A0L;
        int i;
        int A02 = 0FI.A02(-1500113923);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("thread_key_data_key");
        if (parcelable != null) {
            this.A04 = (ThreadKey) parcelable;
            Parcelable parcelable2 = requireArguments.getParcelable("file_key");
            if (parcelable2 != null) {
                this.A03 = (MediaResource) parcelable2;
                this.A02 = 1Bu.A00(66170);
                this.A00 = 1HG.A00(requireContext(), 50020);
                this.A01 = 7zM.A0M();
                MediaResource mediaResource = this.A03;
                String str = "fileResource";
                if (mediaResource != null) {
                    BxS bxS = new BxS(mediaResource.A0n, getString(2131952923));
                    MediaResource mediaResource2 = this.A03;
                    if (mediaResource2 != null) {
                        if (mediaResource2.A07 > 0) {
                            66I r0 = (66I) 1Bi.A03(49956);
                            MediaResource mediaResource3 = this.A03;
                            if (mediaResource3 != null) {
                                bxS.A03 = r0.A00((int) mediaResource3.A07);
                            }
                        }
                        AbG.A1P(this, bxS);
                        C00i c00i = this.A02;
                        if (c00i != null) {
                            ((C67J) c00i.get()).A04(new Roy(this), 1BJ.A00(17), getString(2131968262));
                            0FI.A08(145893234, A02);
                            return;
                        }
                        str = "zeroDialogController";
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
            A0L = AnonymousClass001.A0L("Required value was null.");
            i = -1359382483;
        } else {
            A0L = AnonymousClass001.A0L("Required value was null.");
            i = 1861684130;
        }
        0FI.A08(i, A02);
        throw A0L;
    }
}
