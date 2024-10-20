package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.photos.editing.ImageLayer;
import com.facebook.messaging.photos.editing.MontageStickerLayer;
import com.facebook.messaging.photos.editing.StickerLayer;

/* renamed from: X.Gg1, reason: case insensitive filesystem */
/* loaded from: Gg1.class */
public final class C2521Gg1 extends 4gL {
    public final int A00;
    public final Object A01;

    public C2521Gg1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public void Bxg(String str, Throwable th) {
        JLj jLj;
        String str2;
        boolean z;
        Object[] objArr;
        Uri uri;
        ImageLayer imageLayer;
        switch (this.A00) {
            case 3:
                4gJ r0 = (4gJ) this.A01;
                if (r0 != null) {
                    r0.Bxg(str, th);
                    return;
                }
                return;
            case 4:
            case 10:
            default:
                super/*X.4gM*/.Bxg(str, th);
                return;
            case 5:
                jLj = ((C2796GoZ) this.A01).A0D;
                jLj.BrD(th);
                return;
            case 6:
                GoX goX = (GoX) this.A01;
                CallerContext callerContext = GoX.A0A;
                jLj = goX.A04;
                jLj.BrD(th);
                return;
            case 7:
                str2 = "ImageLayerPresenter";
                z = true;
                objArr = new Object[1];
                ImageLayer imageLayer2 = ((GpH) this.A01).A02;
                uri = imageLayer2.A00;
                imageLayer = imageLayer2;
                objArr[0] = uri;
                0fH.A14(str2, "Failed to load image: %s", objArr);
                imageLayer.A04(z);
                return;
            case 8:
                str2 = "MontageStickerLayerPresenter";
                z = true;
                objArr = new Object[1];
                MontageStickerLayer montageStickerLayer = ((GpD) this.A01).A02;
                uri = montageStickerLayer.A0A();
                imageLayer = montageStickerLayer;
                objArr[0] = uri;
                0fH.A14(str2, "Failed to load image: %s", objArr);
                imageLayer.A04(z);
                return;
            case 9:
                str2 = "StickerLayerPresenter";
                z = true;
                objArr = new Object[1];
                StickerLayer stickerLayer = ((GpE) this.A01).A07;
                uri = stickerLayer.A00.A09;
                imageLayer = stickerLayer;
                objArr[0] = uri;
                0fH.A14(str2, "Failed to load image: %s", objArr);
                imageLayer.A04(z);
                return;
            case 11:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v121, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v124, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v141, types: [androidx.fragment.app.Fragment, X.Da5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void Byc(android.graphics.drawable.Animatable r302, java.lang.Object r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2521Gg1.Byc(android.graphics.drawable.Animatable, java.lang.Object, java.lang.String):void");
    }

    public void C2D(String str, Throwable th) {
        switch (this.A00) {
            case 3:
                4gJ r0 = (4gJ) this.A01;
                if (r0 != null) {
                    r0.C2D(str, th);
                    return;
                }
                return;
            case 4:
                C2771Gno c2771Gno = (C2771Gno) this.A01;
                CallerContext callerContext = C2771Gno.A0A;
                c2771Gno.A03 = false;
                return;
            default:
                super/*X.4gM*/.C2D(str, th);
                return;
        }
    }

    public /* bridge */ /* synthetic */ void C2E(String str, Object obj) {
        if (3 - this.A00 != 0) {
            super/*X.4gM*/.C2E(str, obj);
            return;
        }
        4gJ r0 = (4gJ) this.A01;
        if (r0 != null) {
            r0.C2E(str, obj);
        }
    }

    public void CG6(String str) {
        switch (this.A00) {
            case 3:
                4gJ r0 = (4gJ) this.A01;
                if (r0 != null) {
                    r0.CG6(str);
                    return;
                }
                return;
            case 11:
                return;
            default:
                super/*X.4gM*/.CG6(str);
                return;
        }
    }

    public void COC(String str, Object obj) {
        switch (this.A00) {
            case 3:
                4gJ r0 = (4gJ) this.A01;
                if (r0 != null) {
                    r0.COC(str, obj);
                    return;
                }
                return;
            case 11:
                return;
            default:
                super/*X.4gM*/.COC(str, obj);
                return;
        }
    }
}
