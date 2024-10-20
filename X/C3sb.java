package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3sb, reason: invalid class name */
/* loaded from: 3sb.class */
public abstract class C3sb implements C3s4 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C04r A04;
    public 1iF A05;
    public Integer A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public C04r A0E;
    public String A0F;
    public ArrayList A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final 2Jf A0K;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0QO, X.04r] */
    public C3sb(2Jf r302) {
        this.A0G = new ArrayList();
        this.A0E = new 0QO(0);
        this.A0D = -1;
        this.A01 = 0;
        this.A0I = false;
        this.A0H = false;
        this.A0F = "";
        this.A06 = 0S2.A00;
        this.A05 = null;
        this.A00 = 0;
        this.A08 = "";
        this.A02 = 0L;
        this.A03 = 604800000L;
        this.A0B = true;
        this.A0A = false;
        this.A0C = false;
        this.A0J = false;
        this.A09 = false;
        r302.getClass();
        this.A0K = r302;
        this.A07 = r302.A08;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0QO, X.04r] */
    public C3sb(C3sb c3sb) {
        this.A0G = new ArrayList();
        this.A0E = new 0QO(0);
        this.A0D = -1;
        this.A01 = 0;
        this.A0I = false;
        this.A0H = false;
        this.A0F = "";
        this.A06 = 0S2.A00;
        this.A05 = null;
        this.A00 = 0;
        this.A08 = "";
        this.A02 = 0L;
        this.A03 = 604800000L;
        this.A0B = true;
        this.A0A = false;
        this.A0C = false;
        this.A0J = false;
        this.A09 = false;
        this.A0K = c3sb.A0K;
        this.A0G = c3sb.A0G;
        this.A0E = c3sb.A0E;
        this.A0D = c3sb.A0D;
        this.A01 = c3sb.A01;
        this.A0I = c3sb.A0I;
        this.A0H = c3sb.A0H;
        this.A0F = c3sb.A0F;
        this.A07 = c3sb.A07;
        this.A02 = c3sb.A02;
        this.A03 = c3sb.A03;
        this.A0A = c3sb.A0A;
        this.A0J = c3sb.A0J;
        this.A0C = c3sb.A0C;
        this.A04 = c3sb.A04;
        this.A05 = c3sb.A05;
        this.A09 = c3sb.A09;
    }

    public 2Jf A01() {
        return this.A0K;
    }

    public void A02(int i) {
        this.A01 = i;
    }

    public void A03(String str, String str2) {
        str.getClass();
        C04r c04r = this.A0E;
        if (str2 != null) {
            c04r.put(str, str2);
        } else {
            c04r.remove(str);
        }
    }

    public void A04(boolean z) {
        this.A0B = z;
    }

    public C3sb A05(int i) {
        if (i <= -1) {
            i = -1;
        }
        this.A0D = i;
        return this;
    }

    public C3sb A06(1iF r302) {
        this.A05 = r302;
        return this;
    }

    public C3sb A07(String str) {
        this.A0G.add(str);
        return this;
    }

    @Override // X.C3s4
    public java.util.Map getAdaptiveFetchClientParams() {
        return this.A04;
    }

    @Override // X.C3s4
    public java.util.Map getAdditionalHttpHeaders() {
        return this.A0E;
    }

    @Override // X.C3s4
    public List getAnalyticTags() {
        return Collections.unmodifiableList(this.A0G);
    }

    @Override // X.C3s4
    public String getClientTraceId() {
        return this.A0F;
    }

    @Override // X.C3s4
    public boolean getEnableAsyncQuery() {
        return this.A09;
    }

    @Override // X.C3s4
    public boolean getEnableOfflineCaching() {
        return this.A0A;
    }

    @Override // X.C3s4
    public boolean getEnsureCacheWrite() {
        return this.A0B;
    }

    @Override // X.C3s4
    public long getFreshCacheAgeMs() {
        return this.A02;
    }

    @Override // X.C3s4
    public String getFriendlyName() {
        return this.A07;
    }

    @Override // X.C3s4
    public boolean getMarkHttpRequestAsReplaySafe() {
        return this.A0H;
    }

    @Override // X.C3s4
    public long getMaxToleratedCacheAgeMs() {
        return this.A03;
    }

    @Override // X.C3s4
    public int getNetworkTimeoutSeconds() {
        return this.A0D;
    }

    @Override // X.C3s4
    public boolean getOnlyCacheInitialNetworkResponse() {
        return this.A0C;
    }

    @Override // X.C3s4
    public String getOverrideRequestURL() {
        switch (this.A06.intValue()) {
            case 1:
                return "https://graph-www.facebook.com/graphql";
            case 2:
                return "https://b-graph.facebook.com/graphql";
            case 3:
                return "https://graph.oculus.com/graphql";
            case 4:
                return "https://payments-graph.facebook.com/graphql";
            case 5:
                return "https://genai-graph.facebook.com/graphql";
            default:
                return "";
        }
    }

    @Override // X.C3s4
    public boolean getParseOnClientExecutor() {
        return this.A0I;
    }

    @Override // X.C3s4
    public /* bridge */ /* synthetic */ 2Jg getQuery() {
        return this.A0K;
    }

    @Override // X.C3s4
    public int getRequestPurpose() {
        return this.A00;
    }

    @Override // X.C3s4
    public int getRetryPolicy() {
        return this.A01;
    }

    @Override // X.C3s4
    public String getSequencingKey() {
        return this.A08;
    }

    @Override // X.C3s4
    public boolean getTerminateAfterFreshResponse() {
        return this.A0J;
    }

    @Override // X.C3s4
    public boolean hasAcsToken() {
        boolean z = false;
        if (this.A0K.A0C != null) {
            z = true;
        }
        return z;
    }

    @Override // X.C3s4
    public boolean hasOhaiConfig() {
        boolean z = false;
        if (this.A0K.A0D != null) {
            z = true;
        }
        return z;
    }

    @Override // X.C3s4
    public boolean isMutation() {
        return this.A0K.A04();
    }

    @Override // X.C3s4
    public /* bridge */ /* synthetic */ C3s4 setEnsureCacheWrite(boolean z) {
        this.A0B = false;
        return this;
    }

    @Override // X.C3s4
    public /* bridge */ /* synthetic */ C3s4 setFreshCacheAgeMs(long j) {
        this.A02 = j;
        return this;
    }

    @Override // X.C3s4
    public /* bridge */ /* synthetic */ C3s4 setMaxToleratedCacheAgeMs(long j) {
        this.A03 = j;
        return this;
    }

    @Override // X.C3s4
    public /* bridge */ /* synthetic */ C3s4 setNetworkTimeoutSeconds(int i) {
        A05(i);
        return this;
    }

    @Override // X.C3s4
    public /* bridge */ /* synthetic */ C3s4 setRequestPurpose(int i) {
        this.A00 = 2;
        return this;
    }

    @Override // X.C3s4
    public /* bridge */ /* synthetic */ C3s4 setRetryPolicy(int i) {
        this.A01 = i;
        return this;
    }
}
