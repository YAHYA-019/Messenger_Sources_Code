package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.media.upload.base.NoOpMediaUploadManagerImpl;
import com.facebook.messaging.media.upload.msys.MsysMediaUploadManagerImpl;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6fm, reason: invalid class name */
/* loaded from: 6fm.class */
public final class C6fm {
    public final 1Br A00;
    public final 1Br A01;
    public final 1BP A02 = FbInjector.A00;
    public final 1De A03;

    public C6fm(1De r302) {
        this.A03 = r302;
        Context context = FbInjector.A03;
        11T.A0A(context);
        this.A01 = 1Bu.A01(context, 16428);
        this.A00 = 1Bq.A00(66266);
    }

    public 5HO A00(ThreadKey threadKey) {
        return ThreadKey.A0p(threadKey) ? (NoOpMediaUploadManagerImpl) 4YU.A0n(1Br.A03(this.A01), this.A03, 67798) : ThreadKey.A0S(threadKey) ? (C86w) 1Lm.A07(1Fw.A04((1EZ) this.A01.A00.get()), this.A03.A00, 68291) : ((threadKey == null || !threadKey.A19()) && !((2rT) this.A00.A00.get()).A02(threadKey)) ? (5HN) 1Lm.A07(1Fw.A04((1EZ) this.A01.A00.get()), this.A03.A00, 49639) : (MsysMediaUploadManagerImpl) 1Lm.A07(1Fw.A04((1EZ) this.A01.A00.get()), this.A03.A00, 50123);
    }
}
