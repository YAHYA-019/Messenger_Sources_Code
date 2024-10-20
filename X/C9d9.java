package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.9d9, reason: invalid class name */
/* loaded from: 9d9.class */
public abstract class C9d9 {
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Throwable, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(final android.content.Context r301, X.06Z r302, final X.8LD r303, final com.facebook.messaging.model.threadkey.ThreadKey r304, java.lang.Integer r305, int r306) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9d9.A00(android.content.Context, X.06Z, X.8LD, com.facebook.messaging.model.threadkey.ThreadKey, java.lang.Integer, int):void");
    }

    public static final void A01(Context context, 8LD r302) {
        C7f c7f = (C7f) 1Bu.A06(context, 82282);
        1WY A0e = 7zQ.A0e();
        String valueOf = String.valueOf(r302.A05);
        int i = r302.A00;
        long j = r302.A02;
        boolean A0I = A0e.A0I(j);
        Integer valueOf2 = Integer.valueOf(i);
        Long valueOf3 = Long.valueOf(j);
        String A00 = 4YT.A00(211);
        11T.A0F(context, 3);
        Uri.Builder appendPath = new Uri.Builder().scheme("fb-messenger").authority(AbE.A00(56)).appendPath(0Pz.A0W("COMMUNITY_CHANNEL:", valueOf));
        if (!0CU.A0O(A00)) {
            appendPath.appendQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE, A00);
        }
        if (valueOf2 != null && valueOf3 != null && A0I) {
            appendPath.appendQueryParameter(4YT.A00(ActionId.BEGIN_START_ACTIVITY), String.valueOf(BM8.A06.intValue));
            appendPath.appendQueryParameter("thread_type", valueOf2.toString());
        }
        Uri build = appendPath.build();
        11T.A0A(build);
        ((16Y) 1Br.A0B(c7f.A02)).BXk(context, build);
    }
}
