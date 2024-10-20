package X;

import android.content.Intent;
import com.facebook.messaging.media.mediatraydialogfragment.MediaTrayDialogFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;

/* loaded from: Cm9.class */
public final class Cm9 implements JMn {
    public final /* synthetic */ MediaTrayDialogFragment A00;

    public Cm9(MediaTrayDialogFragment mediaTrayDialogFragment) {
        this.A00 = mediaTrayDialogFragment;
    }

    @Override // X.JMn
    public void AHT(RequestPermissionsConfig requestPermissionsConfig, JKS jks, String[] strArr) {
        2Ov r0 = this.A00;
        53T A00 = ((53S) 7zO.A0l(r0, 49478)).A00(r0.requireContext());
        if (requestPermissionsConfig == null) {
            A00.AHR(jks, strArr);
        } else {
            A00.AHQ(requestPermissionsConfig, jks, strArr);
        }
    }

    @Override // X.JMn
    public void Bi4(MediaResource mediaResource) {
    }

    @Override // X.JMn
    public void Bo8() {
    }

    @Override // X.JMn
    public void BxE(Intent intent) {
    }

    @Override // X.JMn
    public void C1T(ThreadKey threadKey, MigColorScheme migColorScheme) {
    }

    @Override // X.JMn
    public void CGQ(MediaResource mediaResource, boolean z) {
    }

    @Override // X.JMn
    public void CKN(ImmutableList immutableList) {
    }

    @Override // X.JMn
    public void CVY(C6r6 c6r6, MontageComposerFragmentParams.Builder builder) {
    }

    @Override // X.JMn
    public void CpP(boolean z) {
    }
}
