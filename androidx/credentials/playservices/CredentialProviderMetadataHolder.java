package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* loaded from: CredentialProviderMetadataHolder.class */
public final class CredentialProviderMetadataHolder extends Service {
    public final LocalBinder binder = new LocalBinder();

    /* loaded from: CredentialProviderMetadataHolder$LocalBinder.class */
    public final class LocalBinder extends Binder {
        public LocalBinder() {
        }

        public final CredentialProviderMetadataHolder getService() {
            return CredentialProviderMetadataHolder.this;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.binder;
    }
}
