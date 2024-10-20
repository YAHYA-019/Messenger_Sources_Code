package X;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataResponse;

/* loaded from: Ere.class */
public final class Ere {
    public final /* synthetic */ XplatAsyncMetadataCompletionCallback A00;

    public Ere(XplatAsyncMetadataCompletionCallback xplatAsyncMetadataCompletionCallback) {
        this.A00 = xplatAsyncMetadataCompletionCallback;
    }

    public void A00(RMK rmk) {
        11T.A0F(rmk, 0);
        String str = rmk.A02;
        String str2 = rmk.A00;
        String str3 = rmk.A03;
        EMT xplatCompressionType = ARRequestAsset.CompressionMethod.toXplatCompressionType(ARRequestAsset.CompressionMethod.fromString(rmk.A01));
        11T.A0A(xplatCompressionType);
        this.A00.onSuccess(new XplatAsyncMetadataResponse(str, str2, str3, xplatCompressionType));
    }
}
