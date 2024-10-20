package com.facebook.intent.thirdparty;

import X.C16l;
import X.C1ic;
import X.FGF;
import android.content.Intent;
import android.net.Uri;
import java.util.Locale;

/* loaded from: NativeThirdPartyUriHelper$FbrpcIntent.class */
public final class NativeThirdPartyUriHelper$FbrpcIntent extends Intent {
    public transient Uri A00;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Intent, com.facebook.intent.thirdparty.NativeThirdPartyUriHelper$FbrpcIntent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.content.Intent, com.facebook.intent.thirdparty.NativeThirdPartyUriHelper$FbrpcIntent] */
    public static NativeThirdPartyUriHelper$FbrpcIntent A00(Uri uri, String str) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null || C16l.A00(scheme.toLowerCase(Locale.ENGLISH))) {
            uri = FGF.A00(C1ic.A0F);
            if (uri == null) {
                return new Intent(str);
            }
        }
        return new Intent(str, uri);
    }

    @Override // android.content.Intent
    public Object clone() {
        return new Intent(this);
    }
}
