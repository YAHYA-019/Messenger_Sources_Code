package X;

import com.instagram.common.bloks.componentquery.cache.ComponentQueryDiskCacheRecord;
import com.instagram.common.bloks.componentquery.cache.DiskCacheMetadata;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.Callable;

/* loaded from: G6m.class */
public final class G6m implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ FGk A01;
    public final /* synthetic */ BloksComponentQueryResources A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public G6m(FGk fGk, BloksComponentQueryResources bloksComponentQueryResources, String str, String str2, long j) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A02 = bloksComponentQueryResources;
        this.A01 = fGk;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        String str = this.A03;
        String A0W = 0Pz.A0W("storeResponseForKey:", str);
        String str2 = this.A04;
        long j = this.A00;
        BloksComponentQueryResources bloksComponentQueryResources = this.A02;
        FGk fGk = this.A01;
        try {
            DKD.A1P("BloksComponentQueryDiskCache", A0W);
            ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord = new ComponentQueryDiskCacheRecord(str2, j, bloksComponentQueryResources);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(componentQueryDiskCacheRecord);
                objectOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                11T.A0A(byteArray);
                fGk.A01.A00.write(str, byteArray);
                Object obj = fGk.A05.get();
                11T.A0A(obj);
                FGk.A01(fGk, 04R.A0E(04R.A0D((java.util.Map) obj), 1BK.A1G(str, new DiskCacheMetadata(j, bloksComponentQueryResources))));
                1kF.A00();
                return 04S.A00;
            } finally {
            }
        } catch (Throwable th) {
            1kF.A00();
            throw th;
        }
    }
}
