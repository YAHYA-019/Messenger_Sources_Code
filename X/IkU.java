package X;

import android.graphics.RectF;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.ui.media.attachments.model.MediaUploadResult;

/* loaded from: IkU.class */
public final class IkU implements JMJ {
    public final RJB A00;
    public final MediaResource A01;
    public final HkB A02;
    public final /* synthetic */ I0Z A03;

    public IkU(I0Z i0z, RJB rjb, MediaResource mediaResource, HkB hkB) {
        this.A03 = i0z;
        this.A01 = mediaResource;
        this.A02 = hkB;
        this.A00 = rjb;
    }

    public /* bridge */ /* synthetic */ void Bn7(Object obj) {
        Exception exc = (Exception) obj;
        I0Z i0z = this.A03;
        RectF rectF = I0Z.A0K;
        C7qv A00 = 5Ha.A00((5Ha) i0z.A09.get(), this.A01);
        if (A00 != null) {
            2Jy r0 = A00.A01;
            5Ha.A02(r0, A00.A02, "upload_finish");
            r0.A0B("upload_retry_count", 0);
            r0.A0D("canceled_stage", "upload");
        }
        this.A00.A01 = exc;
    }

    public /* bridge */ /* synthetic */ void Bxd(Object obj) {
        Exception exc = (Exception) obj;
        I0Z i0z = this.A03;
        RectF rectF = I0Z.A0K;
        ((5Ha) i0z.A09.get()).A0A(this.A01, (MediaUploadResult) null, exc, (java.util.Map) null, 0);
        this.A00.A01 = exc;
    }

    public void CEI(float f) {
        I0Z i0z = this.A03;
        RectF rectF = I0Z.A0K;
        AbstractC2326GOr.A0w(this.A01, (1I7) i0z.A08.get(), "com.facebook.orca.media.upload.MEDIA_UPLOAD_PROGRESS", f);
    }

    public /* synthetic */ void CSx(double d) {
    }

    public void onStart() {
        I0Z i0z = this.A03;
        RectF rectF = I0Z.A0K;
        ((5Ha) i0z.A09.get()).A07(this.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r311.optBoolean(com.facebook.common.dextricks.OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IkU.onSuccess(java.lang.Object):void");
    }
}
