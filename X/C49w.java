package X;

import android.content.Context;
import com.facebook.flexiblesampling.SamplingPolicyConfig;

/* renamed from: X.49w, reason: invalid class name */
/* loaded from: 49w.class */
public final class C49w {
    public final C49y A00;
    public final C49x A01;
    public final C03z A02;

    public C49w(Context context, C03z c03z, SamplingPolicyConfig samplingPolicyConfig, String str) {
        this.A02 = c03z;
        this.A01 = new C49x(context, str);
        this.A00 = samplingPolicyConfig != null ? new C49y(samplingPolicyConfig) : null;
    }
}
