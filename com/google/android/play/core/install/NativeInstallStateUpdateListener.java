package com.google.android.play.core.install;

import X.C2uf;

/* loaded from: NativeInstallStateUpdateListener.class */
public final class NativeInstallStateUpdateListener implements C2uf {
    @Override // X.C2uf
    public final /* bridge */ /* synthetic */ void CNC(Object obj) {
        onStateUpdate(null);
    }

    public native void onStateUpdate(InstallState installState);
}
