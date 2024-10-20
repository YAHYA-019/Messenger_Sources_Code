package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.RemoteModelVersionFetcher;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetchCompletionCallback;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: Fbx.class */
public final class Fbx implements RemoteModelVersionFetcher {
    public final GEM A00;
    public final EhV A01;
    public final 1Ve A02;

    public Fbx(GEM gem, EhV ehV, 1Ve r304) {
        1BL.A1F(r304, gem);
        this.A02 = r304;
        this.A00 = gem;
        this.A01 = ehV;
    }

    @Override // com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.RemoteModelVersionFetcher
    public void fetchServerPreferredVersions(List list, XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback) {
        11T.A0H(list, xplatRemoteModelVersionFetchCompletionCallback);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String serverValue = ((VersionedCapability) it.next()).toServerValue();
            11T.A0A(serverValue);
            A0s.add(serverValue);
        }
        0fH.A0g(A0s, "NMLMLRemoteModelVersionFetcher", "capabilities will be requested: %s");
        GCV gcv = F1V.class;
        try {
            gcv = (GCV) DKF.A0n(gcv);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0s);
            Ffw ffw = (Ffw) gcv;
            ffw.A01.A06("models", copyOf);
            ffw.A02 = AnonymousClass001.A1T(copyOf);
            C3s4 ACe = ffw.ACe();
            if (ACe instanceof C3sb) {
                ((C3sb) ACe).A03 = 3600000L;
            }
            FfP.A00(new FfW(2, list, xplatRemoteModelVersionFetchCompletionCallback, this, A0s), this.A02, ACe, xplatRemoteModelVersionFetchCompletionCallback, 5);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw AnonymousClass001.A0U(gcv);
        }
    }
}
