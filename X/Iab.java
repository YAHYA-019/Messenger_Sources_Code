package X;

import com.facebook.models.ModelLoader;
import com.facebook.models.ModelLoaderCallbacks;
import com.facebook.models.ModelMetadata;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Iab.class */
public final class Iab implements ModelLoaderCallbacks {
    public final /* synthetic */ ModelLoader A00;
    public final /* synthetic */ SettableFuture A01;

    public Iab(ModelLoader modelLoader, SettableFuture settableFuture) {
        this.A00 = modelLoader;
        this.A01 = settableFuture;
    }

    @Override // com.facebook.models.ModelLoaderCallbacks
    public void onError(String str) {
        Class cls = ModelLoader.TAG;
        0fH.A0T(ModelLoader.class, "Failed to load personalized models, Error: %s", new Object[]{str});
        this.A01.setException(AnonymousClass001.A0G(str));
    }

    @Override // com.facebook.models.ModelLoaderCallbacks
    public void onResult(ModelMetadata modelMetadata) {
        Class cls = ModelLoader.TAG;
        0fH.A0A(ModelLoader.class, "Personalized model is loaded successfully.");
        this.A01.set(modelMetadata);
    }
}
