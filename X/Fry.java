package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: Fry.class */
public final class Fry implements AnonymousClass139 {
    public final 04J A00;

    public Fry(04J r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    @Override // X.AnonymousClass139
    public void BaI(13S r302) {
        1UG A08 = 1BK.A08(this.A00, "msf_mobile_fb_signed_url_key_cache_miss");
        if (A08.isSampled()) {
            A08.A7R("raw_key_id", r302.A02);
            A08.BZL();
        }
    }

    @Override // X.AnonymousClass139
    public void BaJ(13S r302, Throwable th) {
        1UG A08 = 1BK.A08(this.A00, "msf_mobile_fb_signed_url_key_cache_io_failure");
        if (A08.isSampled()) {
            A08.A7R("raw_key_id", r302.A02);
            A08.A7R("details", th.toString());
            A08.BZL();
        }
    }

    @Override // X.AnonymousClass139
    public void BaK(Throwable th) {
        11T.A0F(th, 0);
        1UG A08 = 1BK.A08(this.A00, "msf_mobile_fb_signed_url_key_sync_failure");
        String obj = th.toString();
        if (A08.isSampled()) {
            String str = th instanceof 13V ? "INVALID_KEYSET_FROM_SERVER" : th instanceof 2L0 ? "GRAPHQL_OR_NETWORK_FAILURE" : "CLIENT_CACHE_IO_FAILURE";
            A08.A7R("details", obj);
            A08.A7R("reason", str);
            A08.BZL();
        }
    }

    @Override // X.AnonymousClass139
    public void BaL(AnonymousClass138 anonymousClass138, long j) {
        1UG A08 = 1BK.A08(this.A00, "msf_mobile_fb_signed_url_key_sync_success");
        if (A08.isSampled()) {
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            ArrayList A0s3 = AnonymousClass001.A0s();
            Iterator it = Collections.unmodifiableSet(anonymousClass138.A00).iterator();
            while (it.hasNext()) {
                A0s.add(((13S) it.next()).A02);
            }
            Iterator it2 = Collections.unmodifiableSet(anonymousClass138.A02).iterator();
            while (it2.hasNext()) {
                A0s2.add(((13S) it2.next()).A02);
            }
            Iterator it3 = Collections.unmodifiableSet(anonymousClass138.A01).iterator();
            while (it3.hasNext()) {
                A0s3.add(((13S) it3.next()).A02);
            }
            A08.A6H("duration", Long.valueOf(j));
            A08.A6H("deleted_key_count", 1BK.A0l(A0s2.size()));
            A08.A6H("downloaded_key_count", 1BK.A0l(A0s.size()));
            A08.A6H("post_sync_key_count", 1BK.A0l(A0s3.size()));
            A08.A7h("deleted_key_ids", A0s2);
            A08.A7h("downloaded_key_ids", A0s);
            A08.A7h("post_sync_key_ids", A0s3);
            A08.BZL();
        }
    }
}
