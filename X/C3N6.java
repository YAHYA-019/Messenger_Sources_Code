package X;

import android.content.Context;
import com.facebook.messaging.communitymessaging.plugins.communitypreview.touchinterceptor.CommunityPreviewTouchInterceptorImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* renamed from: X.3N6, reason: invalid class name */
/* loaded from: 3N6.class */
public final class C3N6 {
    public CommunityPreviewTouchInterceptorImplementation A00;
    public Object A01;
    public final 06Z A02;
    public final ThreadKey A03;
    public final 1YC A04 = 1YC.A03;
    public final 2SI A05;
    public final ParcelableSecondaryData A06;
    public final Context A07;

    public C3N6(Context context, 06Z r303, ThreadKey threadKey, 2SI r305, ParcelableSecondaryData parcelableSecondaryData) {
        this.A07 = context;
        this.A05 = r305;
        this.A02 = r303;
        this.A03 = threadKey;
        this.A06 = parcelableSecondaryData;
    }
}
