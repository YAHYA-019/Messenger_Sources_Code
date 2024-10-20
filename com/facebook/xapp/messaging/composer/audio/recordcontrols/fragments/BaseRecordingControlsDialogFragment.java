package com.facebook.xapp.messaging.composer.audio.recordcontrols.fragments;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1BY;
import X.1Bi;
import X.1Br;
import X.1Lm;
import X.1Lo;
import X.1Um;
import X.4YT;
import X.70K;
import X.70N;
import X.70S;
import X.7zL;
import X.8Ln;
import X.9Hp;
import X.9Nc;
import X.A1d;
import X.C00i;
import X.C9ce;
import X.HAN;
import X.HtZ;
import X.I5O;
import X.IDp;
import X.IEI;
import X.Iaj;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.composer.mediaclips.avataraudiomessages.msys.data.AvatarAudioMessagePose;
import com.facebook.messaging.composer.mediaclips.recordingcontrols.RecordingControlsDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: BaseRecordingControlsDialogFragment.class */
public abstract class BaseRecordingControlsDialogFragment extends MigBottomSheetDialogFragment {
    public 70K A00;
    public MediaResource A01;
    public 70S A02;
    public HtZ A03;
    public boolean A04;
    public I5O A05;
    public Long A06;

    public final HtZ A1M() {
        HtZ htZ = this.A03;
        if (htZ != null) {
            return htZ;
        }
        11T.A0L("stateController");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final I5O A1N() {
        Context context = getContext();
        context.getClass();
        I5O i5o = this.A05;
        if (i5o == null) {
            i5o = new I5O(context, new 8Ln(), this.A02);
        }
        if (this.A05 == null) {
            this.A05 = i5o;
        }
        return i5o;
    }

    public HAN A1O() {
        IDp iDp;
        if (!(this instanceof XappRecordingControlsDialogFragment)) {
            RecordingControlsDialogFragment recordingControlsDialogFragment = (RecordingControlsDialogFragment) this;
            HAN han = recordingControlsDialogFragment.A06;
            if (han == null) {
                IEI iei = recordingControlsDialogFragment.A03;
                if (iei != null && (iDp = iei.A00.A00) != null && !iDp.A0E() && iDp.A05() != -1) {
                    han = HAN.A03;
                }
            }
            return han;
        }
        return HAN.A02;
    }

    public final boolean A1P(MediaResource mediaResource) {
        Long l = this.A06;
        boolean z = false;
        if (l != null) {
            long longValue = l.longValue();
            if (mediaResource != null && mediaResource.A08 >= longValue - 500) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        Long valueOf;
        int A02 = 0FI.A02(-450799376);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A01 = bundle2 != null ? (MediaResource) bundle2.getParcelable(4YT.A00(742)) : null;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || (valueOf = Long.valueOf(bundle3.getLong(4YT.A00(743)))) == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-1561573851, A02);
            throw A0h;
        }
        this.A06 = valueOf;
        if (this.A04 && this.A00 == null) {
            this.A00 = (70K) 1Bi.A03(68065);
            FbUserSession A01 = 1BM.A01(this);
            70K r0 = this.A00;
            if (r0 != null) {
                Context requireContext = requireContext();
                11T.A0F(A01, 0);
                r0.A02 = requireContext;
                r0.A03 = A01;
                C00i c00i = r0.A0B.A00;
                r0.A09 = 7zL.A1X(((C9ce) c00i.get()).A00, AvatarAudioMessagePose.A0D);
                r0.A07 = this;
                r0.A04 = 1Lm.A00(requireContext, A01, 68862);
                C9ce c9ce = (C9ce) c00i.get();
                70N r02 = r0.A0D;
                11T.A0F(r02, 0);
                c9ce.A05.add(r02);
                C9ce c9ce2 = (C9ce) c00i.get();
                9Nc r03 = (9Nc) 1Lo.A04((Context) null, A01, (1BY) null, 68861);
                if (r03 != null) {
                    9Hp r04 = new 9Hp(c9ce2);
                    MailboxFeature mailboxFeature = (MailboxFeature) r03.A01.getValue();
                    1Um A0O = 1BK.A0O(mailboxFeature, 0);
                    MailboxFutureImpl A0P = 1BK.A0P(A0O);
                    1Um.A02(A0O, new Iaj(mailboxFeature, A0P, 2), A0P, false);
                    A0P.addResultCallback(new A1d(r04, 44));
                }
            }
            I5O A1N = A1N();
            70K r05 = this.A00;
            A1N.A04(r05 != null ? ((C9ce) 1Br.A0B(r05.A0B)).A00.A00() : null);
        }
        if (bundle != null) {
            A0o();
        }
        0FI.A08(485176984, A02);
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-344896960);
        super.onDestroy();
        70K r0 = this.A00;
        if (r0 != null) {
            C9ce c9ce = (C9ce) 1Br.A0B(r0.A0B);
            70N r02 = r0.A0D;
            11T.A0F(r02, 0);
            c9ce.A05.remove(r02);
        }
        0FI.A08(-910285665, A02);
    }
}
