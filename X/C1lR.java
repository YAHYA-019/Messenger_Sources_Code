package X;

import android.os.Bundle;
import java.io.File;

/* renamed from: X.1lR, reason: invalid class name */
/* loaded from: 1lR.class */
public final class C1lR {
    public String A00;
    public final int A01;
    public final File A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C1lR(C1l1 c1l1, File file, int i) {
        Class cls = c1l1.A06;
        this.A00 = c1l1.A00.getName();
        this.A0B = cls.getName();
        Class cls2 = c1l1.A04;
        String str = null;
        this.A08 = cls2 != null ? cls2.getName() : null;
        Class cls3 = c1l1.A03;
        this.A07 = cls3 != null ? cls3.getName() : null;
        this.A09 = c1l1.A07.getName();
        Class cls4 = c1l1.A05;
        this.A0A = cls4 != null ? cls4.getName() : null;
        this.A02 = file;
        this.A03 = c1l1.A08;
        this.A06 = c1l1.A09;
        this.A01 = i;
        this.A0C = c1l1.A0A;
        this.A0D = c1l1.A0B;
        Class cls5 = c1l1.A01;
        this.A04 = cls5 != null ? cls5.getName() : null;
        Class cls6 = c1l1.A02;
        this.A05 = cls6 != null ? cls6.getName() : str;
    }

    public C1lR(Bundle bundle) {
        C49k c49k = new C49k(bundle);
        String A02 = c49k.A02("uploader_class");
        if (A02 == null) {
            throw new Exception("uploader_class is null or empty");
        }
        String A022 = c49k.A02("flexible_sampling_updater");
        String A023 = c49k.A02("acs_provider");
        String A024 = c49k.A02("privacy_policy");
        String A025 = c49k.A02("thread_handler_factory");
        String A026 = c49k.A02("upload_job_instrumentation");
        String A027 = c49k.A02("priority_dir");
        if (A027 == null) {
            throw new Exception("priority_dir is null or empty");
        }
        int A00 = c49k.A00("network_priority", 0);
        String A028 = c49k.A02("marauder_tier");
        if (A028 == null) {
            throw new Exception("marauder_tier is null or empty");
        }
        int A002 = c49k.A00("multi_batch_payload_size", 20000);
        c49k.A02("ffdb_token");
        String A029 = c49k.A02("ffdb_provider");
        this.A0B = A02;
        this.A08 = A022;
        this.A07 = A024;
        this.A09 = A025;
        this.A0A = A026;
        this.A02 = new File(A027);
        this.A03 = 0S2.A00(2)[A00];
        this.A06 = A028;
        this.A01 = A002;
        boolean z = false;
        this.A0C = c49k.A00("non_sticky_handling", 0) == 1;
        this.A0D = c49k.A00("use_fifo_uploads", 0) == 1 ? true : z;
        this.A04 = c49k.A02("batch_payload_iterator_factory");
        this.A00 = A023;
        this.A05 = A029;
    }

    public Bundle A00(C49k c49k) {
        c49k.A04("uploader_class", this.A0B);
        c49k.A04("flexible_sampling_updater", this.A08);
        c49k.A04("privacy_policy", this.A07);
        c49k.A04("thread_handler_factory", this.A09);
        c49k.A04("upload_job_instrumentation", this.A0A);
        c49k.A04("priority_dir", this.A02.getAbsolutePath());
        c49k.A03("network_priority", this.A03.intValue());
        c49k.A04("marauder_tier", this.A06);
        c49k.A03("multi_batch_payload_size", this.A01);
        c49k.A03("non_sticky_handling", this.A0C ? 1 : 0);
        c49k.A03("use_fifo_uploads", this.A0D ? 1 : 0);
        c49k.A04("batch_payload_iterator_factory", this.A04);
        c49k.A04("acs_provider", this.A00);
        c49k.A04("ffdb_provider", this.A05);
        return c49k.A01();
    }
}
