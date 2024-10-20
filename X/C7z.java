package X;

import com.facebook.messaging.montage.model.MontageBucketInfo;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.user.model.UserKey;

/* loaded from: C7z.class */
public final class C7z {
    public long A00;
    public MontageBucketInfo A01;
    public MontageBucketPreview A02;
    public UserKey A03;
    public Boolean A04;

    public BuZ A00() {
        return new BuZ(this.A01, this.A02, this.A03, this.A04, this.A00);
    }

    public void A01(BuZ buZ) {
        this.A01 = buZ.A01;
        this.A03 = buZ.A03;
        this.A04 = buZ.A04;
        this.A00 = buZ.A00;
        this.A02 = buZ.A02;
    }
}
