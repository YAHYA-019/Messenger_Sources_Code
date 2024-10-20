package com.facebook.messaging.composer.mediaclips.recordingcontrols;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1Bi;
import X.1Bn;
import X.1Iw;
import X.1LI;
import X.2S4;
import X.53P;
import X.5zD;
import X.6Sm;
import X.6Sn;
import X.70K;
import X.70Q;
import X.7zP;
import X.8L3;
import X.C2666Gki;
import X.C2699Glm;
import X.C9ce;
import X.HAN;
import X.HQy;
import X.HtZ;
import X.ICT;
import X.IEI;
import X.JN6;
import X.Rpy;
import X.S3s;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.composer.audio.recordcontrols.fragments.BaseRecordingControlsDialogFragment;
import java.util.BitSet;

/* loaded from: RecordingControlsDialogFragment.class */
public final class RecordingControlsDialogFragment extends BaseRecordingControlsDialogFragment {
    public 2S4 A00;
    public 8L3 A01;
    public HQy A02;
    public IEI A03;
    public C9ce A04;
    public 6Sn A05;
    public HAN A06;
    public 70Q A07;
    public final JN6 A08 = new Rpy(this);

    /* JADX WARN: Type inference failed for: r0v99, types: [X.HtZ, java.lang.Object] */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String str;
        11T.A0F(r302, 0);
        this.A04 = (C9ce) 1Bi.A03(68928);
        70Q r0 = (70Q) 1Bn.A0A(115912);
        this.A07 = r0;
        if (r0 != null) {
            r0.Bb9();
        }
        ((BaseRecordingControlsDialogFragment) this).A02 = this.A07;
        11T.A0A(r302.A0D);
        IEI iei = this.A03;
        if (iei == null) {
            2S4 r02 = this.A00;
            if (r02 != null) {
                iei = (IEI) r02.A00(115943);
                this.A03 = iei;
            }
            if (iei != null) {
                iei.A01.A00.add(this.A08);
            }
        }
        70K r03 = ((BaseRecordingControlsDialogFragment) this).A00;
        if (r03 != null) {
            IEI iei2 = this.A03;
            r03.A06 = iei2 != null ? iei2.A02 : null;
        }
        if (((BaseRecordingControlsDialogFragment) this).A03 == null) {
            HAN A1O = A1O();
            ?? obj = new Object();
            ((HtZ) obj).A01 = A1O;
            ((BaseRecordingControlsDialogFragment) this).A03 = obj;
        }
        C2666Gki c2666Gki = new C2666Gki(r302, new C2699Glm());
        MigColorScheme A1F = A1F();
        C2699Glm c2699Glm = c2666Gki.A01;
        c2699Glm.A06 = A1F;
        BitSet bitSet = c2666Gki.A02;
        bitSet.set(2);
        c2699Glm.A09 = new S3s(this);
        bitSet.set(1);
        c2699Glm.A0B = A1N();
        bitSet.set(10);
        c2699Glm.A0A = A1M();
        bitSet.set(7);
        MediaResource mediaResource = ((BaseRecordingControlsDialogFragment) this).A01;
        c2699Glm.A07 = mediaResource;
        bitSet.set(5);
        c2699Glm.A0E = A1P(mediaResource);
        bitSet.set(4);
        8L3 r04 = this.A01;
        70K r305 = null;
        if (r04 == null) {
            str = "recordControlsColorsConfig";
        } else {
            c2699Glm.A00 = r04;
            bitSet.set(6);
            c2699Glm.A0C = null;
            bitSet.set(3);
            c2699Glm.A03 = null;
            bitSet.set(8);
            c2699Glm.A04 = null;
            bitSet.set(9);
            if (((BaseRecordingControlsDialogFragment) this).A04) {
                r305 = ((BaseRecordingControlsDialogFragment) this).A00;
            }
            c2699Glm.A05 = r305;
            70K r05 = ((BaseRecordingControlsDialogFragment) this).A00;
            c2699Glm.A0D = r05 != null ? r05.A09 : false;
            6Sn r06 = this.A05;
            if (r06 != null) {
                c2699Glm.A08 = r06;
                bitSet.set(0);
                7zP.A1A(c2666Gki, bitSet, c2666Gki.A03);
                return c2699Glm;
            }
            str = "audioGatingConfig";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.xapp.messaging.composer.audio.recordcontrols.fragments.BaseRecordingControlsDialogFragment
    public void onDestroy() {
        IEI iei;
        int A02 = 0FI.A02(219053636);
        super.onDestroy();
        if (A1M().A01 == HAN.A05 && (iei = this.A03) != null) {
            iei.A05();
        }
        IEI iei2 = this.A03;
        if (iei2 != null) {
            iei2.A01.A00.remove(this.A08);
        }
        HQy hQy = this.A02;
        if (hQy == null) {
            11T.A0L("composerCallback");
            throw 0Q8.createAndThrow();
        }
        6Sm r0 = hQy.A00;
        ICT ict = r0.A04;
        if (ict != null) {
            ict.A04(0S2.A0j);
            ICT ict2 = r0.A04;
            ict2.A04 = true;
            ICT.A01(ict2);
            5zD r02 = ict2.A08;
            ICT.A02(ict2, r02.BEz());
            Chronometer chronometer = ict2.A06;
            if (chronometer != null) {
                chronometer.setTextColor(ict2.A04 ? r02.BKa() : -1);
            }
        }
        70Q r03 = this.A07;
        if (r03 != null) {
            r03.Bb8();
        }
        0FI.A08(-75515300, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        A1L().A11(new 53P(this));
    }
}
