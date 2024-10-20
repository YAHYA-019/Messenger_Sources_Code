package X;

import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.xplat.models.XplatARLocalAsset;
import java.io.IOException;
import java.util.List;

/* loaded from: Fbn.class */
public final class Fbn implements JHj {
    public OnAsyncAssetFetchCompletedListener A00;

    @Override // X.JHj
    public void BxX(ERn eRn) {
        0fH.A0l("DefaultAsyncAssetFetchCallback", "[ARD-PTL] [%s] onAsyncAssetRequested() failed");
        this.A00.onAsyncAssetFetchCompleted(null, eRn.A00());
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, X.Eti] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.Eti] */
    @Override // X.JHj
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            str = "empty asset downloaded";
        } else if (list.size() > 1) {
            str = "should not fetch more than 1 asset for at a time for async assets";
        } else {
            XplatARLocalAsset xplatARLocalAsset = (XplatARLocalAsset) 1BK.A0r(list);
            if (Fbi.A01.contains(xplatARLocalAsset.getARAssetType())) {
                try {
                    String str2 = xplatARLocalAsset.filePath;
                    0fH.A0e(xplatARLocalAsset.assetId, xplatARLocalAsset.cacheKey, "DefaultAsyncAssetFetchCallback", "[ARD-PTL] [%s] async asset fetch completed, cache key : %s");
                    this.A00.onAsyncAssetFetchCompleted(str2, null);
                    return;
                } catch (IOException | SecurityException unused) {
                    ?? obj2 = new Object();
                    obj2.A00 = ENM.A04;
                    obj2.A01 = "bad async asset file path";
                    BxX(obj2.A00());
                    return;
                }
            }
            str = 0Pz.A0V("Unsupported asset type used in Async Asset request : ", xplatARLocalAsset.getARAssetType());
        }
        ?? obj3 = new Object();
        obj3.A00 = ENM.A04;
        obj3.A01 = str;
        BxX(obj3.A00());
    }
}
