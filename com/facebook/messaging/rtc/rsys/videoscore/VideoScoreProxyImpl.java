package com.facebook.messaging.rtc.rsys.videoscore;

import X.1BK;
import X.1Br;
import X.4YV;
import X.5Jq;
import X.AnonymousClass000;
import X.C06w;
import X.C06z;
import X.C0il;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.rsys.videoscore.gen.VideoScoreProxy;

/* loaded from: VideoScoreProxyImpl.class */
public final class VideoScoreProxyImpl extends VideoScoreProxy {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(VideoScoreProxyImpl.class, "fbSharedPreferences", "getFbSharedPreferences()Lcom/facebook/prefs/shared/FbSharedPreferences;", 0)};
    public final 1Br fbSharedPreferences$delegate = 1BK.A0E();

    private final FbSharedPreferences getFbSharedPreferences() {
        return 1Br.A09(this.fbSharedPreferences$delegate);
    }

    @Override // com.facebook.rsys.videoscore.gen.VideoScoreProxy
    public String getModelPath() {
        try {
            C0il.A0C(AnonymousClass000.A00(94), 16);
        } catch (UnsatisfiedLinkError unused) {
        }
        return 4YV.A0r(1Br.A09(this.fbSharedPreferences$delegate), 5Jq.A06);
    }
}
