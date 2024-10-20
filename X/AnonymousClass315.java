package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.tray.model.metadata.montage.TrayListItemMontageMetadata;
import com.facebook.messaging.tray.plugins.loader.montage.TrayMontageLoaderImpl;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.315, reason: invalid class name */
/* loaded from: 315.class */
public final class AnonymousClass315 implements 2TV {
    public final /* synthetic */ 2T5 A00;
    public final /* synthetic */ TrayMontageLoaderImpl A01;

    public AnonymousClass315(2T5 r302, TrayMontageLoaderImpl trayMontageLoaderImpl) {
        this.A01 = trayMontageLoaderImpl;
        this.A00 = r302;
    }

    public /* synthetic */ void C47(Object obj, Object obj2) {
    }

    public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
    }

    public /* synthetic */ void C4n(ListenableFuture listenableFuture, Object obj) {
    }

    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
        2TM r0 = (2TM) obj2;
        11T.A0F(r0, 1);
        TrayMontageLoaderImpl trayMontageLoaderImpl = this.A01;
        if (2Ss.A00((2Ss) 1Br.A0B(trayMontageLoaderImpl.A02)).AZk(72340198592417063L) && 11T.A0O(trayMontageLoaderImpl.A00, r0)) {
            return;
        }
        C00j.A05("ANL:MontageListLoader.Callback", -2003232012);
        trayMontageLoaderImpl.A00 = r0;
        2T5 r02 = this.A00;
        ImmutableList immutableList = r0.A00;
        11T.A09(immutableList);
        ArrayList A0z = 1BL.A0z(immutableList);
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            MontageBucketPreview montageBucketPreview = (MontageBucketPreview) it.next();
            HashSet A0v = AnonymousClass001.A0v();
            User user = montageBucketPreview.A05;
            C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_USER, user);
            Parcelable.Creator creator = HeterogeneousMap.CREATOR;
            AnonymousClass201 A00 = C1zz.A00();
            A00.A01(TrayListItemMontageMetadata.A01, new TrayListItemMontageMetadata(montageBucketPreview));
            HeterogeneousMap A002 = A00.A00();
            A0z.add(new 4LA(user, A002, C1pq.A07(A002, "metadata", A0v, A0v)));
        }
        r02.Bgc(A0z, "MONTAGE", "Montage loaded");
        C00j.A01(-221440997);
    }
}
