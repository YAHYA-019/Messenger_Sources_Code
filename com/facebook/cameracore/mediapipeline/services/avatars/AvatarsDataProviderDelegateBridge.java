package com.facebook.cameracore.mediapipeline.services.avatars;

import X.JJh;

/* loaded from: AvatarsDataProviderDelegateBridge.class */
public class AvatarsDataProviderDelegateBridge {
    public final JJh mDelegate;

    public AvatarsDataProviderDelegateBridge(JJh jJh) {
        this.mDelegate = jJh;
    }

    public byte[] consumeAvatarFrame(String str) {
        return null;
    }

    public String getDefaultAvatarResourcePath(String str) {
        return null;
    }

    public String getPersonalAvatarUriOverride() {
        return this.mDelegate.B2Z();
    }

    public void onAvatarRendered() {
    }

    public void onInitialAvatarColorizationApplied() {
    }

    public void onLoadFailure(String str) {
        this.mDelegate.C4D(str);
    }

    public void onLoadSuccess(String str) {
        this.mDelegate.C4e(str);
    }

    public void sendAvatarFrame(String str, byte[] bArr) {
    }

    public void sendAvatarMemoryCreationSuccess(String str) {
    }

    public void sendAvatarMemoryLoadResult(String str, String str2, boolean z, String str3) {
    }

    public void sendAvatarRampUpdateEvent(String str, String str2) {
    }
}
