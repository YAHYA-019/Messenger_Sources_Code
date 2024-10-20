package com.facebook.bitmaps;

import X.1BK;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.7zL;
import X.C00i;
import X.Hd2;
import X.HsX;
import X.IMO;
import X.JJZ;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.media.upload.photo.model.UploadFile;

/* loaded from: SpectrumImageResizer.class */
public class SpectrumImageResizer implements JJZ, CallerContextable {
    public 1BY A00;
    public final C00i A03 = 1BQ.A00();
    public final C00i A01 = 1BV.A01((1BY) null, 116436);
    public final C00i A02 = 1BV.A01((1BY) null, 116440);

    public SpectrumImageResizer(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public Hd2 Cjb(HsX hsX, UploadFile uploadFile, String str) {
        return ((JJZ) (1BK.A0N(this.A03).AZk(36310851826877760L) ? this.A01 : this.A02).get()).Cjb(hsX, uploadFile, str);
    }

    public Hd2 Cjc(HsX hsX, String str, String str2) {
        return ((JJZ) (1BK.A0N(this.A03).AZk(36310851826877760L) ? this.A01 : this.A02).get()).Cjc(hsX, str, str2);
    }

    public void Cux(boolean z) {
        ((IMO) this.A01.get()).Cux(false);
        ((SpectrumImageResizerImpl) this.A02.get()).Cux(false);
    }
}
