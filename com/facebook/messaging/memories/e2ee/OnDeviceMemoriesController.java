package com.facebook.messaging.memories.e2ee;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2Zo;
import X.2aI;
import X.2aK;
import X.7zO;
import X.9fA;
import X.AJi;
import X.AMx;
import X.C01g;
import X.C01i;
import X.C03i;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mantle.messenger.MessengerMantle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: OnDeviceMemoriesController.class */
public final class OnDeviceMemoriesController {
    public MessengerMantle A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final C01i A04;
    public final FbUserSession A05;
    public final AtomicBoolean A06;

    public OnDeviceMemoriesController(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A05 = fbUserSession;
        this.A02 = 1Bu.A00(68663);
        this.A03 = 1Bu.A00(68206);
        this.A01 = 1Bq.A00(50135);
        this.A04 = C01g.A00(C03i.A02, AMx.A00);
        this.A06 = 7zO.A15();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0254 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0206  */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(android.content.Context r301, com.facebook.messaging.memories.e2ee.OnDeviceMemoriesController r302, com.facebook.ui.media.attachments.model.MediaResource r303, X.0DR r304) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.memories.e2ee.OnDeviceMemoriesController.A00(android.content.Context, com.facebook.messaging.memories.e2ee.OnDeviceMemoriesController, com.facebook.ui.media.attachments.model.MediaResource, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A01(android.content.Context r301, com.facebook.messaging.memories.e2ee.OnDeviceMemoriesController r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.memories.e2ee.OnDeviceMemoriesController.A01(android.content.Context, com.facebook.messaging.memories.e2ee.OnDeviceMemoriesController, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A02(android.content.Context r301, com.facebook.messaging.memories.e2ee.OnDeviceMemoriesController r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.memories.e2ee.OnDeviceMemoriesController.A02(android.content.Context, com.facebook.messaging.memories.e2ee.OnDeviceMemoriesController, X.0DR):java.lang.Object");
    }

    public void A03(Context context) {
        if (this.A06.get()) {
            return;
        }
        String BD0 = 1Br.A09(((9fA) 1Br.A0B(this.A03)).A00).BD0(9fA.A01);
        if (BD0 == null || BD0.length() == 0) {
            2aK.A03((Integer) null, 2Zo.A00(), AJi.A03(context, this, null, 38), (2aI) this.A04.getValue(), 2);
        }
    }
}
