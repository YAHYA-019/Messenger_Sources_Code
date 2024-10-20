package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.view.ViewStub;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.executors.annotations.ForUiThreadImmediate;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.media.editing.ContentFramingLayout;
import java.util.concurrent.Executor;

/* renamed from: X.GoZ, reason: case insensitive filesystem */
/* loaded from: GoZ.class */
public final class C2796GoZ extends Ht2 implements JFM, CallerContextable {
    public static final String __redex_internal_original_name = "MontageViewerPhotoController";
    public Animatable A00;
    public CallerContext A01;
    public FbDraweeView A02;
    public ImageAttachmentData A03;
    public ContentFramingLayout A04;
    public final Context A05;
    public final FbUserSession A06;
    public final JFJ A0B;
    public final JKA A0C;
    public final JLj A0D;
    public final 7Yb A0E;
    public final 53U A0F;
    public final 2Wo A0G;
    public final Executor A0H;
    public final Resources A0I;
    public final C00i A09 = 1Bn.A09(HU1.class, (Class) null);
    public final C00i A08 = 1Bn.A09(C69m.class, (Class) null);
    public final C00i A07 = 1Bi.A02(1CO.class, (Class) null);
    public final C00i A0A = 1Bn.A09(C09374px.class, (Class) null);

    public C2796GoZ(Context context, ViewStub viewStub, FbUserSession fbUserSession, JKA jka, JLj jLj, 53U r307) {
        Executor executor = (Executor) 1Bi.A05(Executor.class, ForUiThreadImmediate.class);
        7Yb r0 = (7Yb) 1Bi.A05(7Yb.class, (Class) null);
        this.A0C = jka;
        this.A05 = context;
        this.A06 = fbUserSession;
        this.A0D = jLj;
        this.A0F = r307;
        this.A0I = context.getResources();
        this.A0G = 2Wo.A00(viewStub);
        this.A0H = executor;
        this.A0E = r0;
        this.A01 = CallerContext.A0A(C2796GoZ.class, "photo_status_thread_view", "photo_status_thread_view");
        this.A0B = new IX6(this);
    }

    public static void A00(C2796GoZ c2796GoZ) {
        5YB r0 = c2796GoZ.A02;
        if (r0 != null) {
            r0.A06(null);
        }
        c2796GoZ.A03 = null;
        HsD hsD = (HsD) 1Lo.A0A(c2796GoZ.A06, HsD.class);
        hsD.A03.remove(c2796GoZ.A0B);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e3, code lost:
    
        r302 = X.InterfaceC07034in.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e0, code lost:
    
        if (java.lang.Double.compare(java.lang.Math.abs((r0 - r0) / r0), 0.15d) < 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008c, code lost:
    
        if ((r0 / r0) >= (r0.A01 / r0.A00)) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008f, code lost:
    
        r302 = X.InterfaceC07034in.A04;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(X.C2796GoZ r301) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2796GoZ.A01(X.GoZ):void");
    }

    public void pause() {
        Animatable animatable = this.A00;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
