package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.composer.audio.recordcontrols.fragments.BaseRecordingControlsDialogFragment;
import com.facebook.xapp.messaging.composer.audio.recordcontrols.fragments.XappRecordingControlsDialogFragment;
import java.util.concurrent.TimeUnit;

/* loaded from: Ilm.class */
public final class Ilm implements JMk {
    public final /* synthetic */ XappRecordingControlsDialogFragment A00;

    public Ilm(XappRecordingControlsDialogFragment xappRecordingControlsDialogFragment) {
        this.A00 = xappRecordingControlsDialogFragment;
    }

    @Override // X.JMk
    public void BkP() {
        70K r0 = ((BaseRecordingControlsDialogFragment) this.A00).A00;
        if (r0 != null) {
            ((C9ce) 1Br.A0B(r0.A0B)).A02(true);
        }
    }

    @Override // X.JMk
    public void Bt0() {
    }

    @Override // X.JMk
    public void CB1() {
    }

    @Override // X.JMk
    public void CB3() {
        70K r0;
        JMs jMs;
        XappRecordingControlsDialogFragment xappRecordingControlsDialogFragment = this.A00;
        MediaResource mediaResource = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A01;
        if (mediaResource == null || (r0 = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A00) == null || (jMs = r0.A08) == null) {
            return;
        }
        jMs.Cwe(mediaResource.A0X);
    }

    @Override // X.JMk
    public void CC0() {
        IDp iDp;
        70K r0;
        XappRecordingControlsDialogFragment xappRecordingControlsDialogFragment = this.A00;
        MediaResource mediaResource = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A01;
        if (mediaResource != null) {
            long j = mediaResource.A08;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long seconds = timeUnit.toSeconds(j);
            long seconds2 = timeUnit.toSeconds(xappRecordingControlsDialogFragment.A00);
            long j2 = xappRecordingControlsDialogFragment.A00;
            if (1 > j2 || j2 >= j) {
                70S r02 = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A02;
                if (r02 != null) {
                    r02.BbB(seconds);
                }
            } else {
                70S r03 = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A02;
                if (r03 != null) {
                    r03.BbE(seconds2, seconds);
                }
            }
            70W r04 = xappRecordingControlsDialogFragment.A07;
            if (r04 == null || (iDp = r04.A03) == null || (r0 = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A00) == null) {
                return;
            }
            r0.A00(iDp);
        }
    }

    @Override // X.JMk
    public void CHN() {
        70S r0 = ((BaseRecordingControlsDialogFragment) this.A00).A02;
        if (r0 != null) {
            r0.BbD();
        }
    }

    @Override // X.JMk
    public void CHv() {
        70S r0 = ((BaseRecordingControlsDialogFragment) this.A00).A02;
        if (r0 != null) {
            r0.BbC();
        }
    }

    @Override // X.JMk
    public void CKM() {
    }
}
