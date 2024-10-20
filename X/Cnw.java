package X;

import android.graphics.Bitmap;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.publicchats.notify.BaseMessengerChannelsNotification;
import java.util.List;

/* loaded from: Cnw.class */
public final class Cnw implements C5pz {
    public final List A00 = AnonymousClass001.A0s();
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C10924uz A03;
    public final /* synthetic */ BaseMessengerChannelsNotification A04;
    public final /* synthetic */ CHX A05;
    public final /* synthetic */ 0CL A06;

    public Cnw(C10924uz c10924uz, BaseMessengerChannelsNotification baseMessengerChannelsNotification, CHX chx, 0CL r305, int i, long j) {
        this.A06 = r305;
        this.A03 = c10924uz;
        this.A05 = chx;
        this.A04 = baseMessengerChannelsNotification;
        this.A02 = j;
        this.A01 = i;
    }

    public static void A00(Cnw cnw) {
        C10924uz c10924uz = cnw.A03;
        CHX chx = cnw.A05;
        chx.A05.A00.get();
        Bitmap bitmap = (Bitmap) cnw.A06.element;
        CallerContext callerContext = 5bF.A0V;
        c10924uz.A0F(bitmap.copy(bitmap.getConfig(), bitmap.isMutable()));
        CHX.A00(c10924uz, chx, cnw.A01, cnw.A02);
    }

    @Override // X.C5pz
    public void Blg() {
        A00(this);
    }

    @Override // X.C5pz
    public void BpV(2EU r302) {
        11T.A0F(r302, 0);
        List list = this.A00;
        list.add(r302);
        try {
            if (AbG.A1a(r302)) {
                0CL r0 = this.A06;
                Object A09 = r302.A09();
                11T.A0I(A09, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableBitmap");
                r0.element = ((2EY) A09).A04;
            }
        } finally {
            A00(this);
            2EU.A05(list);
        }
    }
}
