package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashSet;

/* renamed from: X.3tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3tz.class */
public final class C02103tz implements MailboxCallback {
    public final /* synthetic */ C2es A00;
    public final /* synthetic */ C2eo A01;
    public final /* synthetic */ C1qy A02;
    public final /* synthetic */ SettableFuture A03;

    public C02103tz(C2es c2es, C2eo c2eo, C1qy c1qy, SettableFuture settableFuture) {
        this.A01 = c2eo;
        this.A00 = c2es;
        this.A02 = c1qy;
        this.A03 = settableFuture;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        try {
            HashSet hashSet = new HashSet();
            C2es c2es = this.A00;
            if (c2es.A0D) {
                ImmutableList A02 = c2es.A02();
                if (A02 != null) {
                    hashSet.addAll(A02);
                }
            }
            1qY r0 = (1qY) mailboxNullable.value;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            if (r0 != null) {
                int i = 0;
                while (true) {
                    if (i >= ((1qX) r0).mResultSet.getCount()) {
                        break;
                    }
                    builder.m11011add(this.A02.Anc(r0, i));
                    hashSet.remove(Long.valueOf(((1qX) r0).mResultSet.getLong(i, 0)));
                    i++;
                }
            }
            C2eo.A04(this.A01, hashSet);
            ImmutableList build = builder.build();
            0fH.A0g(Integer.valueOf(build.size()), "MsysContactAdapterImpl", "loadContactList result count: %d");
            this.A03.set(build);
        } catch (Throwable th) {
            0fH.A0s("MsysContactAdapterImpl", "loadContactList failed", th);
            this.A03.setException(th);
        }
    }
}
