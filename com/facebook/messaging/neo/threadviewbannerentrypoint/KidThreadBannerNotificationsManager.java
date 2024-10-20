package com.facebook.messaging.neo.threadviewbannerentrypoint;

import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1EZ;
import X.1QB;
import X.1Qc;
import X.C00i;
import X.G2Q;
import X.KTN;
import X.Ktg;
import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.lang.ref.WeakReference;

/* loaded from: KidThreadBannerNotificationsManager.class */
public final class KidThreadBannerNotificationsManager {
    public static final ImmutableList A0C = ImmutableList.of();
    public Ktg A00;
    public KTN A01;
    public User A02;
    public WeakReference A03;
    public final Context A04;
    public final Uri A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final Object A0A;
    public final 1EZ A0B;

    public KidThreadBannerNotificationsManager() {
    }

    public KidThreadBannerNotificationsManager(Context context) {
        this.A0A = new Object();
        this.A06 = new 1BQ(99390);
        this.A07 = FbInjector.A00;
        this.A09 = new 1BQ(16456);
        this.A04 = context;
        this.A0B = (1EZ) 1Bn.A0E(context, (1BY) null, 16428);
        this.A08 = new 1BV(context, 82146);
        this.A05 = new Uri.Builder().scheme("android.resource").authority(FbInjector.A03.getResources().getResourcePackageName(2132346766)).appendPath(FbInjector.A03.getResources().getResourceTypeName(2132346766)).appendPath(FbInjector.A03.getResources().getResourceEntryName(2132346766)).build();
    }

    public static void A00(FbUserSession fbUserSession, KidThreadBannerNotificationsManager kidThreadBannerNotificationsManager) {
        if (kidThreadBannerNotificationsManager.A02 != null) {
            1Qc r0 = (1Qc) 1Bi.A03(65837);
            1QB r02 = (1QB) 1Bn.A0A(65841);
            r02.A02(new G2Q(fbUserSession, kidThreadBannerNotificationsManager));
            r02.A04("ManagingKidBannerDataFetch");
            r02.A03("ForUiThread");
            r0.A03(r02.A01(), "KeepExisting");
        }
    }
}
