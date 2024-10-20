package X;

import com.facebook.messaging.montage.model.cards.MontageStickerOverlayBounds;
import com.mapbox.mapboxsdk.style.layers.Property;
import org.json.JSONObject;

/* loaded from: Inj.class */
public final class Inj implements 1K9 {
    public boolean A00;
    public final int A01;
    public final Object A02;

    public Inj(int i) {
        this.A01 = i;
    }

    public Inj(int i, Object obj, boolean z) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = z;
    }

    public Inj(C2s8 c2s8) {
        this.A01 = 3;
        this.A02 = c2s8;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "user_doodle";
            case 2:
                return "user_text";
            case 3:
                return "user_crop";
            case 4:
                return "user_color_adjust";
            case 5:
                return "user_video_trim";
            case 6:
                return "user_video_mute";
            default:
                return "art_asset";
        }
    }

    public static void A01(MontageStickerOverlayBounds montageStickerOverlayBounds, 2DM r302) {
        r302.A0g("x", montageStickerOverlayBounds.A00);
        r302.A0g("y", montageStickerOverlayBounds.A01);
    }

    public static void A02(MontageStickerOverlayBounds montageStickerOverlayBounds, 2DM r302) {
        r302.A0g(Property.ICON_TEXT_FIT_WIDTH, montageStickerOverlayBounds.A04);
        r302.A0g(Property.ICON_TEXT_FIT_HEIGHT, montageStickerOverlayBounds.A02);
        r302.A0g("rotation", montageStickerOverlayBounds.A03);
    }

    public static void A03(JSONObject jSONObject, int i) {
        jSONObject.put(String.valueOf(i), true);
    }

    public void A04(AbstractC08294mh abstractC08294mh) {
        11T.A0F(abstractC08294mh, 0);
        C2s8 c2s8 = (C2s8) this.A02;
        ESG A00 = FB3.A00(abstractC08294mh, GAR.A00);
        if (c2s8 == null || !c2s8.BQN()) {
            return;
        }
        c2s8.resumeWith(A00);
    }

    public void A05(Throwable th) {
        11T.A0F(th, 0);
        C2s8 c2s8 = (C2s8) this.A02;
        EJ1 ej1 = new EJ1(new EKF(th));
        if (c2s8 == null || !c2s8.BQN()) {
            return;
        }
        c2s8.resumeWith(ej1);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFailure(java.lang.Throwable r302) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Inj.onFailure(java.lang.Throwable):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x1534, code lost:
    
        r0 = r0.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x153d, code lost:
    
        if (r0 == 0) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x154b, code lost:
    
        r0.put(java.lang.String.valueOf(1), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x1553, code lost:
    
        r0 = r0.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x1558, code lost:
    
        r0 = 0.0f / 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x1564, code lost:
    
        if (r0 == (-1)) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x1579, code lost:
    
        r0.put(java.lang.String.valueOf(2), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x1581, code lost:
    
        r0 = r0.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x158a, code lost:
    
        if (r0 == (-1)) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x159b, code lost:
    
        r0.put(java.lang.String.valueOf(3), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x15ab, code lost:
    
        r0.put(java.lang.String.valueOf(0), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x1cdf, code lost:
    
        if (r0 == X.0S2.A01) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x1efd, code lost:
    
        if (r307 != null) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x1f0b, code lost:
    
        if (r307 != null) goto L560;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x1074  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x108d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x1114  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x1173  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x120b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x124e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x1272  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x12d5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x12f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x19d0  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x19ff  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x1a36  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x2529  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x2614  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x262b  */
    /* JADX WARN: Removed duplicated region for block: B:650:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:657:0x2688  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x2690  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x2698  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x26a0  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x26a8  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x26b0  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x26b8  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x26c0  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x26c8  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x200f  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x1b04  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x18eb  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x18f4  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x0393 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.messaging.media.mediapicker.dialog.PickMediaDialogFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v311, types: [com.facebook.messaging.montage.composer.MontageComposerFragment, androidx.fragment.app.Fragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 10628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Inj.onSuccess(java.lang.Object):void");
    }
}
