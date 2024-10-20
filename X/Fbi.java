package X;

import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.assetmanager.XplatAssetManagerCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import java.util.Arrays;
import java.util.List;

/* loaded from: Fbi.class */
public final class Fbi implements GJJ {
    public static final List A01 = Arrays.asList(ARAssetType.ASYNC, ARAssetType.REMOTE);
    public final Fcf A00;

    public Fbi(Fcf fcf) {
        this.A00 = fcf;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.Fbn, X.JHj, java.lang.Object] */
    public GEI BjR(OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener, ARRequestAsset aRRequestAsset) {
        0fH.A0e(aRRequestAsset.A02.A08, aRRequestAsset.A09, "DefaultAsyncAssetFetchCallback", "[ARD-PTL] [%s] onAsyncAssetRequested(), url : %s");
        ?? obj = new Object();
        obj.A00 = onAsyncAssetFetchCompletedListener;
        Fcf fcf = this.A00;
        return fcf.A08.fetchAsyncAsset(new XplatRemoteAsset(aRRequestAsset), new XplatAssetManagerCompletionCallback(obj, fcf.A0C));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Fbn, X.JHj, java.lang.Object] */
    public GEI BjS(OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener, ARAssetType aRAssetType, EMi eMi, String str, String str2, String str3, boolean z) {
        0fH.A0h(str, "DefaultAsyncAssetFetchCallback", "[ARD-PTL] onAsyncAssetRequested(), fbId : %s");
        ?? obj = new Object();
        obj.A00 = onAsyncAssetFetchCompletedListener;
        Fcf fcf = this.A00;
        11T.A0H(str, str2);
        return fcf.A08.fetchAsyncAssetByFBID(str, str2, new XplatAssetManagerCompletionCallback(obj, fcf.A0C));
    }

    public GEI Bxy(OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener, String str, String str2) {
        0fH.A0h(str, "DefaultAsyncAssetFetchCallback", "[ARD-PTL] onFetchAsyncAssetMetadataRequested(), fbId : %s");
        Fcf fcf = this.A00;
        7zT.A1S(str, str2, onAsyncAssetFetchCompletedListener);
        return fcf.A08.fetchAsyncAssetMetadata(str, str2, onAsyncAssetFetchCompletedListener);
    }
}
