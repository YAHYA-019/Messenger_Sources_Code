package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: Esq.class */
public final class Esq {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ I1c A01;

    public Esq(Context context, I1c i1c) {
        this.A01 = i1c;
        this.A00 = context;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.0w6, java.lang.Object] */
    public void A00(Uri uri) {
        Context context = this.A00;
        try {
            Intent type = 4YU.A0A("android.intent.action.SEND").setType("image/png");
            11T.A0A(type);
            if ("file".equals(uri.getScheme())) {
                File A0E = AnonymousClass001.A0E(uri.getPath());
                HashMap hashMap = 10D.A06;
                uri = 10D.A01(context, (ProviderInfo) null, (C0w6) new Object()).A05(A0E);
            }
            AnonymousClass106.A01(type, new Uri[]{uri}, false);
            09X.A00().A05().A0A(context, Intent.createChooser(type, context.getString(2131956777)));
        } catch (IOException unused) {
        }
    }
}
