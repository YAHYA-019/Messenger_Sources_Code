package com.facebook.xapp.messaging.composer.audio.recordcontrols.fragments;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1Iw;
import X.1LI;
import X.6RU;
import X.6Sn;
import X.70K;
import X.70S;
import X.70U;
import X.70W;
import X.7zP;
import X.8L3;
import X.C2666Gki;
import X.C2699Glm;
import X.C77n;
import X.HAN;
import X.HtZ;
import X.Ilm;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.BitSet;

/* loaded from: XappRecordingControlsDialogFragment.class */
public final class XappRecordingControlsDialogFragment extends BaseRecordingControlsDialogFragment {
    public long A00;
    public 8L3 A01;
    public ThreadKey A02;
    public 6Sn A03;
    public 70U A04;
    public C77n A05;
    public 6RU A06;
    public 70W A07;

    /* JADX WARN: Type inference failed for: r0v102, types: [X.HtZ, java.lang.Object] */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String str;
        11T.A0F(r302, 0);
        if (((BaseRecordingControlsDialogFragment) this).A03 == null) {
            HAN A1O = A1O();
            ?? obj = new Object();
            ((HtZ) obj).A01 = A1O;
            ((BaseRecordingControlsDialogFragment) this).A03 = obj;
        }
        70K r0 = ((BaseRecordingControlsDialogFragment) this).A00;
        70K r303 = null;
        if (r0 != null) {
            ThreadKey threadKey = this.A02;
            if (threadKey == null) {
                str = "threadKey";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
            r0.A06 = threadKey;
        }
        C2666Gki c2666Gki = new C2666Gki(r302, new C2699Glm());
        MigColorScheme A1F = A1F();
        C2699Glm c2699Glm = c2666Gki.A01;
        c2699Glm.A06 = A1F;
        BitSet bitSet = c2666Gki.A02;
        bitSet.set(2);
        c2699Glm.A09 = new Ilm(this);
        bitSet.set(1);
        c2699Glm.A0A = A1M();
        bitSet.set(7);
        c2699Glm.A0B = A1N();
        bitSet.set(10);
        MediaResource mediaResource = ((BaseRecordingControlsDialogFragment) this).A01;
        c2699Glm.A07 = mediaResource;
        bitSet.set(5);
        c2699Glm.A0E = A1P(mediaResource);
        bitSet.set(4);
        8L3 r02 = this.A01;
        if (r02 == null) {
            str = "recordControlsColorsConfig";
        } else {
            c2699Glm.A00 = r02;
            bitSet.set(6);
            6RU r03 = this.A06;
            if (r03 == null) {
                str = "composerContext";
            } else {
                c2699Glm.A0C = r03;
                bitSet.set(3);
                70U r04 = this.A04;
                str = "audioComposerViewProxy";
                if (r04 != null) {
                    c2699Glm.A03 = r04.BIB();
                    bitSet.set(8);
                    c2699Glm.A04 = r04.BIC();
                    bitSet.set(9);
                    6Sn r05 = this.A03;
                    if (r05 != null) {
                        c2699Glm.A08 = r05;
                        bitSet.set(0);
                        if (((BaseRecordingControlsDialogFragment) this).A04) {
                            r303 = ((BaseRecordingControlsDialogFragment) this).A00;
                        }
                        c2699Glm.A05 = r303;
                        70K r06 = ((BaseRecordingControlsDialogFragment) this).A00;
                        c2699Glm.A0D = r06 != null ? r06.A09 : false;
                        7zP.A1A(c2666Gki, bitSet, c2666Gki.A03);
                        return c2699Glm;
                    }
                    str = "audioGatingConfig";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.xapp.messaging.composer.audio.recordcontrols.fragments.BaseRecordingControlsDialogFragment
    public void onDestroy() {
        int A02 = 0FI.A02(-410875682);
        super.onDestroy();
        70U r0 = this.A04;
        if (r0 != null) {
            r0.AB2(0S2.A0j);
        }
        70S r02 = ((BaseRecordingControlsDialogFragment) this).A02;
        if (r02 != null) {
            r02.Bb8();
        }
        0FI.A08(294241107, A02);
    }
}
