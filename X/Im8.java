package X;

import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.composer.audio.recordcontrols.fragments.BaseRecordingControlsDialogFragment;
import com.facebook.xapp.messaging.composer.audio.recordcontrols.fragments.XappRecordingControlsDialogFragment;
import java.util.concurrent.TimeUnit;

/* loaded from: Im8.class */
public final class Im8 implements JN5 {
    public final /* synthetic */ XappRecordingControlsDialogFragment A00;

    public Im8(XappRecordingControlsDialogFragment xappRecordingControlsDialogFragment) {
        this.A00 = xappRecordingControlsDialogFragment;
    }

    @Override // X.JN5
    public void C1G() {
    }

    @Override // X.JN5
    public void C4m() {
    }

    @Override // X.JN5
    public void CB5(long j) {
        JMs jMs;
        70S r0;
        XappRecordingControlsDialogFragment xappRecordingControlsDialogFragment = this.A00;
        94S r02 = MigBottomSheetDialogFragment.A01;
        xappRecordingControlsDialogFragment.A00 = j;
        MediaResource mediaResource = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A01;
        if (mediaResource != null) {
            long j2 = mediaResource.A08;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(j2);
            long seconds2 = TimeUnit.MILLISECONDS.toSeconds(xappRecordingControlsDialogFragment.A00);
            long j3 = xappRecordingControlsDialogFragment.A00;
            if (1 <= j3 && j3 < j2 && (r0 = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A02) != null) {
                r0.BbA(seconds2, seconds);
            }
            70K r03 = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A00;
            if (r03 == null || (jMs = r03.A08) == null) {
                return;
            }
            jMs.CCE();
        }
    }

    @Override // X.JN5
    public void CC8() {
        JMs jMs;
        70K r0 = ((BaseRecordingControlsDialogFragment) this.A00).A00;
        if (r0 == null || (jMs = r0.A08) == null) {
            return;
        }
        jMs.CC7();
    }

    @Override // X.JN5
    public void CC9() {
        XappRecordingControlsDialogFragment xappRecordingControlsDialogFragment = this.A00;
        94S r0 = MigBottomSheetDialogFragment.A01;
        MediaResource mediaResource = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A01;
        if (mediaResource != null) {
            long j = mediaResource.A08;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Long valueOf = Long.valueOf(timeUnit.toSeconds(j));
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                long seconds = timeUnit.toSeconds(xappRecordingControlsDialogFragment.A00);
                70S r02 = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A02;
                if (r02 != null) {
                    MediaResource mediaResource2 = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A01;
                    r02.Ban(mediaResource2 != null ? mediaResource2.A0E : null, seconds, longValue);
                }
            }
        }
    }

    @Override // X.JN5
    public void CCK() {
        JMs jMs;
        70K r0 = ((BaseRecordingControlsDialogFragment) this.A00).A00;
        if (r0 == null || (jMs = r0.A08) == null) {
            return;
        }
        jMs.CCG();
    }

    @Override // X.JN5
    public void CHx() {
        JMs jMs;
        IDp iDp;
        XappRecordingControlsDialogFragment xappRecordingControlsDialogFragment = this.A00;
        94S r0 = MigBottomSheetDialogFragment.A01;
        70W r02 = xappRecordingControlsDialogFragment.A07;
        if (r02 != null && (iDp = r02.A03) != null) {
            xappRecordingControlsDialogFragment.A1N().A01 = iDp;
        }
        70K r03 = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A00;
        if (r03 == null || (jMs = r03.A08) == null) {
            return;
        }
        jMs.CCJ();
    }

    @Override // X.JN5
    public void CN3() {
        JMs jMs;
        IDp iDp;
        XappRecordingControlsDialogFragment xappRecordingControlsDialogFragment = this.A00;
        94S r0 = MigBottomSheetDialogFragment.A01;
        70W r02 = xappRecordingControlsDialogFragment.A07;
        if (r02 != null && (iDp = r02.A03) != null) {
            xappRecordingControlsDialogFragment.A1N().A01 = iDp;
        }
        70K r03 = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A00;
        if (r03 == null || (jMs = r03.A08) == null) {
            return;
        }
        jMs.CCO();
    }

    @Override // X.JN5
    public void CNp() {
    }

    @Override // X.JN5
    public void CSd(long j, float f) {
        XappRecordingControlsDialogFragment xappRecordingControlsDialogFragment = this.A00;
        MediaResource mediaResource = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A01;
        Long valueOf = mediaResource != null ? Long.valueOf(mediaResource.A08) : null;
        if (Float.valueOf(f).equals(Float.valueOf(100.0f))) {
            xappRecordingControlsDialogFragment.A1M().A02(HAN.A02);
            xappRecordingControlsDialogFragment.A00 = 0L;
            if (valueOf == null) {
                return;
            }
        } else {
            if (valueOf == null) {
                return;
            }
            long longValue = valueOf.longValue();
            xappRecordingControlsDialogFragment.A1N().A01(longValue - j, longValue);
        }
        long longValue2 = valueOf.longValue();
        70K r0 = ((BaseRecordingControlsDialogFragment) xappRecordingControlsDialogFragment).A00;
        if (r0 != null) {
            long j2 = xappRecordingControlsDialogFragment.A00;
            r0.A01 = j2;
            r0.A00 = longValue2;
            JMs jMs = r0.A08;
            if (jMs != null) {
                jMs.Csn(j2, longValue2);
            }
        }
    }

    @Override // X.JN5
    public void CSg(double d) {
        JMs jMs;
        70K r0 = ((BaseRecordingControlsDialogFragment) this.A00).A00;
        if (r0 == null || (jMs = r0.A08) == null) {
            return;
        }
        jMs.Cwd(d);
    }
}
