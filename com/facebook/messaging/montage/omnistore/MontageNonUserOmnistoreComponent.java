package com.facebook.messaging.montage.omnistore;

import X.0S2;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Fv;
import X.3rM;
import X.C00i;
import X.C01213qU;
import X.C3qh;
import X.CAk;
import X.InterfaceC01203qT;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.montage.omnistore.MontageNonUserOmnistoreComponent;
import com.facebook.omnistore.CollectionName;
import com.facebook.omnistore.IndexedFields;
import com.facebook.omnistore.Omnistore;
import com.facebook.omnistore.QueueIdentifier;
import com.facebook.omnistore.module.OmnistoreComponent;
import java.nio.ByteBuffer;

/* loaded from: MontageNonUserOmnistoreComponent.class */
public final class MontageNonUserOmnistoreComponent implements OmnistoreComponent {
    public CollectionName A00;
    public final InterfaceC01203qT A07;
    public final C00i A04 = new 1BQ(16511);
    public final C00i A03 = FbInjector.A00;
    public final C00i A05 = new 1BQ(66351);
    public final C00i A06 = new 1BV(85181);
    public final C00i A02 = new 1BV(32787);
    public final C00i A01 = new 1BQ(32807);

    public MontageNonUserOmnistoreComponent() {
        InterfaceC01203qT interfaceC01203qT = new InterfaceC01203qT() { // from class: X.3qW
            @Override // X.InterfaceC01203qT
            public final void C78() {
                boolean z;
                MontageNonUserOmnistoreComponent montageNonUserOmnistoreComponent = MontageNonUserOmnistoreComponent.this;
                3rM r0 = (3rM) montageNonUserOmnistoreComponent.A01.get();
                synchronized (r0) {
                    z = false;
                    if (r0.A00 != null) {
                        z = true;
                    }
                }
                if (z) {
                    return;
                }
                ((C01273qk) montageNonUserOmnistoreComponent.A02.get()).A00(montageNonUserOmnistoreComponent, new StringBuilder());
            }
        };
        this.A07 = interfaceC01203qT;
        C01213qU c01213qU = (C01213qU) 1Bi.A03(67917);
        synchronized (c01213qU) {
            c01213qU.A00.add(interfaceC01203qT);
        }
    }

    public IndexedFields BOY(String str, String str2, ByteBuffer byteBuffer) {
        try {
            this.A06.get();
            return CAk.A00(byteBuffer);
        } catch (Exception e) {
            1BK.A09(this.A04).softReport("com.facebook.messaging.montage.omnistore.MontageNonUserOmnistoreComponent", "indexObject", e);
            return new IndexedFields();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r310 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BtA(java.util.List r302) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.omnistore.MontageNonUserOmnistoreComponent.BtA(java.util.List):void");
    }

    public void CLx(int i) {
        0fH.A0g(Integer.valueOf(i), "com.facebook.messaging.montage.omnistore.MontageNonUserOmnistoreComponent", "onSnapshotStateChanged %s");
    }

    @Override // com.facebook.omnistore.module.OmnistoreComponent
    public String getCollectionLabel() {
        return "messenger_montage_non_user";
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011f, code lost:
    
        if (r304 != null) goto L62;
     */
    @Override // com.facebook.omnistore.module.OmnistoreComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCollectionAvailable(com.facebook.omnistore.Collection r302) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.omnistore.MontageNonUserOmnistoreComponent.onCollectionAvailable(com.facebook.omnistore.Collection):void");
    }

    @Override // com.facebook.omnistore.module.OmnistoreComponent
    public void onCollectionInvalidated() {
        3rM r0 = (3rM) this.A01.get();
        synchronized (r0) {
            r0.A00 = null;
        }
    }

    public void onDeltaClusterEnded(int i, QueueIdentifier queueIdentifier) {
    }

    public void onDeltaClusterStarted(int i, long j, QueueIdentifier queueIdentifier) {
    }

    @Override // com.facebook.omnistore.module.OmnistoreComponent
    public C3qh provideSubscriptionInfo(Omnistore omnistore) {
        CollectionName.Builder createCollectionNameBuilder = omnistore.createCollectionNameBuilder(getCollectionLabel());
        createCollectionNameBuilder.addSegment(((1Fv) this.A05.get()).A04().A05);
        createCollectionNameBuilder.addDeviceId();
        CollectionName build = createCollectionNameBuilder.build();
        this.A00 = build;
        Integer num = 0S2.A01;
        build.getClass();
        return new C3qh(build, num);
    }
}
