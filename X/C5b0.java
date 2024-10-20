package X;

import com.facebook.messaging.montage.model.MontageBucketInfo;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5b0, reason: invalid class name */
/* loaded from: 5b0.class */
public final class C5b0 {
    public int A00;
    public long A01;
    public ImmutableList A02;
    public ImmutableList A03;
    public Set A04;
    public boolean A05;

    public C5b0() {
        this.A04 = new HashSet();
        this.A02 = ImmutableList.of();
    }

    public C5b0(MontageBucketInfo montageBucketInfo) {
        this.A04 = AnonymousClass001.A0v();
        this.A02 = montageBucketInfo.A02;
        this.A05 = montageBucketInfo.A05;
        this.A01 = montageBucketInfo.A01;
        this.A00 = montageBucketInfo.A00;
        this.A03 = montageBucketInfo.A03;
        this.A04 = new HashSet(montageBucketInfo.A04);
    }

    public void A00(ImmutableList immutableList) {
        this.A03 = immutableList;
        C1pq.A08("seenByUserList", immutableList);
        if (this.A04.contains("seenByUserList")) {
            return;
        }
        HashSet hashSet = new HashSet(this.A04);
        this.A04 = hashSet;
        hashSet.add("seenByUserList");
    }

    public /* bridge */ /* synthetic */ void A01(ImmutableList immutableList) {
        this.A02 = immutableList;
        C1pq.A08("cards", immutableList);
    }
}
