package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* renamed from: X.Aze, reason: case insensitive filesystem */
/* loaded from: Aze.class */
public final class C2017Aze extends C1rj {
    public Bundle A00;
    public 06Z A01;
    public LifecycleOwner A02;
    public FbUserSession A03;
    public MigColorScheme A04;
    public C5xv A05;
    public User A06;
    public ParcelableSecondaryData A07;

    public C2017Aze() {
        super("CommunityProfileComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A07, this.A03, this.A01, this.A02, this.A00, this.A05, this.A06};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0296, code lost:
    
        if (r320.length() == 0) goto L27;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2017Aze.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        B1g b1g = (B1g) r303;
        FbUserSession fbUserSession = this.A03;
        User user = this.A06;
        ParcelableSecondaryData parcelableSecondaryData = this.A07;
        LifecycleOwner lifecycleOwner = this.A02;
        11T.A0F(r302, 0);
        7zT.A11(3, fbUserSession, user, parcelableSecondaryData, lifecycleOwner);
        B4L b4l = B4L.A00;
        B4J b4j = B4J.A00;
        AnonymousClass001.A07().post(new DA2(lifecycleOwner, fbUserSession, r302, user, parcelableSecondaryData));
        b1g.A01 = b4l;
        b1g.A00 = b4j;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
