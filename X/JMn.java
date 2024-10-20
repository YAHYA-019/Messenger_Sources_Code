package X;

import android.content.Intent;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;

/* loaded from: JMn.class */
public interface JMn {
    void AHT(RequestPermissionsConfig requestPermissionsConfig, JKS jks, String[] strArr);

    void Bi4(MediaResource mediaResource);

    void Bo8();

    void BxE(Intent intent);

    void C1T(ThreadKey threadKey, MigColorScheme migColorScheme);

    void CGQ(MediaResource mediaResource, boolean z);

    void CKN(ImmutableList immutableList);

    void CVY(C6r6 c6r6, MontageComposerFragmentParams.Builder builder);

    void CpP(boolean z);
}
