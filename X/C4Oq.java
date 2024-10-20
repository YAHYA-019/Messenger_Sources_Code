package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.4Oq, reason: invalid class name */
/* loaded from: 4Oq.class */
public final class C4Oq extends C1iw {
    public static final String __redex_internal_original_name = "FeatureWalletEventHandler$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 3yB A01;
    public final /* synthetic */ BDX A02;
    public final /* synthetic */ ImmutableMap A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4Oq(3yB r302, BDX bdx, ImmutableMap immutableMap, int i) {
        super("feature-wallet-handle-event-low-priority");
        this.A01 = r302;
        this.A02 = bdx;
        this.A00 = i;
        this.A03 = immutableMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        0QO r0 = new 0QO(0);
        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", Long.toString(802523197203077L));
        BDX bdx = this.A02;
        Long valueOf = Long.valueOf(-1);
        Integer valueOf2 = Integer.valueOf(this.A00);
        ImmutableMap immutableMap = this.A03;
        1Um AQV = bdx.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        1Um.A02(AQV, new Cyl(bdx, mailboxFutureImpl, newPrivacyContextNative, valueOf, valueOf2, 0, 0L, r0, immutableMap), mailboxFutureImpl, false);
        0fH.A0g(valueOf2, "FeatureWalletEventHandler", "handle mldw event: %d");
    }
}
