package X;

import com.facebook.storage.cask.fbapps.FBCask;
import java.io.File;

/* renamed from: X.32F, reason: invalid class name */
/* loaded from: 32F.class */
public final class C32F implements 1Mm {
    public final /* synthetic */ 5Ju A00;

    public C32F(5Ju r302) {
        this.A00 = r302;
    }

    public File AUV(1Z6 r302) {
        5Ju r0 = this.A00;
        1Mx r02 = ((FBCask) r0.A00.get()).A00;
        r302.A01 = r0.A01;
        return r02.AUV(r302);
    }

    public File CcY(1Z6 r302, File file) {
        5Ju r0 = this.A00;
        1Mx r02 = ((FBCask) r0.A00.get()).A00;
        r302.A01 = r0.A01;
        1ZB.A00(r02, r302, file);
        return file;
    }
}
