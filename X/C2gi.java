package X;

import android.os.Bundle;
import com.facebook.common.util.TriState;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadConnectivityData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.base.Charsets;
import com.google.common.base.Objects;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.2gi, reason: invalid class name */
/* loaded from: 2gi.class */
public final class C2gi extends 2UP {
    public final TriState A00;
    public final ThreadSummary A01;
    public final 2SI A02;
    public final C2fr A03;
    public final HeterogeneousMap A04;
    public final 2Sh A05;
    public final C2g4 A06;
    public final ImmutableMap A07;
    public final Integer A08;
    public final String A09;
    public final Bundle A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C2gi(Bundle bundle, TriState triState, StaticUnitConfig staticUnitConfig, ThreadSummary threadSummary, 2SI r306, C2fr c2fr, HeterogeneousMap heterogeneousMap, 2Sh r309, C2g4 c2g4, ImmutableMap immutableMap, Integer num, String str, boolean z, boolean z2) {
        super((C2gu) null, staticUnitConfig);
        this.A01 = threadSummary;
        this.A02 = r306;
        this.A06 = c2g4;
        this.A03 = c2fr;
        this.A09 = str;
        this.A08 = num;
        this.A0C = z;
        this.A0B = z2;
        this.A00 = triState;
        this.A05 = r309;
        this.A07 = immutableMap;
        this.A0A = bundle;
        this.A04 = heterogeneousMap;
    }

    public long A00() {
        1TX A03 = 2UQ.A02.A03();
        String str = ((2UP) this).A00.A03;
        11T.A0A(str);
        A03.A04(str, Charsets.UTF_8);
        ThreadKey threadKey = this.A01.A0n;
        long hashCode = threadKey.A06.hashCode();
        long j = 63;
        A03.A03((((((((((hashCode * j) + threadKey.A04) * j) + threadKey.A02) * j) + threadKey.A05) * j) + threadKey.A03) * j) + threadKey.A01);
        return A03.A07().A02();
    }

    public String A01() {
        ThreadSummary threadSummary = this.A01;
        ThreadKey threadKey = threadSummary.A0n;
        Long valueOf = (threadKey == null || threadKey.A04 == ((long) (-1))) ? threadSummary.A1e : Long.valueOf(threadKey.A0r());
        StringBuilder sb = new StringBuilder();
        String str = ((2UP) this).A00.A03;
        11T.A0A(str);
        sb.append(str);
        sb.append(":");
        sb.append(valueOf);
        return sb.toString();
    }

    public void A02(2hL r302) {
        C2fd BFg;
        super.A02(r302);
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        ThreadSummary threadSummary = this.A01;
        builder.put("unr", Boolean.toString(2Gt.A0F(threadSummary)));
        C2fr c2fr = this.A03;
        if (c2fr != null && (BFg = c2fr.BFg()) != null) {
            builder.put("bt", BFg.toString());
        }
        Integer num = this.A08;
        if (num != 0S2.A00) {
            builder.put("pt", 1 - num.intValue() != 0 ? "NONE" : "WAVE");
        }
        String str = this.A09;
        if (!Platform.stringIsNullOrEmpty(str)) {
            builder.put("ra", str);
        }
        ThreadConnectivityData threadConnectivityData = threadSummary.A11;
        builder.put("cs", threadConnectivityData != null ? threadConnectivityData.A00() : "unknown");
        builder.put("sid", threadConnectivityData != null ? threadConnectivityData.A03 : ConstantsKt.CAMERA_ID_FRONT);
        1F9 r307 = threadSummary.A0g;
        if (r307 == null) {
            r307 = 1F9.A0N;
        }
        builder.put("f", r307.toString());
        builder.put("tk", threadSummary.A0n.toString());
        Integer num2 = ((2UP) this).A00.A00;
        11T.A0A(num2);
        int i = 0;
        switch (num2.intValue()) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 8;
                break;
            case 3:
                i = 23;
                break;
            case 4:
                i = 24;
                break;
            case 5:
                i = 26;
                break;
            case 10:
                i = 62;
                break;
            case 12:
                i = 65;
                break;
            case 13:
                i = 66;
                break;
            case 14:
                i = 67;
                break;
        }
        builder.put("ut", String.valueOf(i));
        builder.putAll(this.A07);
        r302.A03 = builder.build();
        r302.A00 = this.A0A;
    }

    public String A03() {
        GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType = this.A01.A0Y;
        if (graphQLMessengerGroupThreadSubType == null || graphQLMessengerGroupThreadSubType == GraphQLMessengerGroupThreadSubType.A0E) {
            return null;
        }
        return graphQLMessengerGroupThreadSubType.toString();
    }

    public 2hJ AsW() {
        return 2hJ.A18;
    }

    public String BKC() {
        return "THREAD";
    }

    public boolean BVb(2UR r302) {
        boolean z = false;
        if (r302.getClass() == C2gi.class) {
            C2gi c2gi = (C2gi) r302;
            if (this.A0C == c2gi.A0C && this.A0B == c2gi.A0B && this.A00 == c2gi.A00 && this.A08 == c2gi.A08 && this.A02 == c2gi.A02) {
                ThreadSummary threadSummary = this.A01;
                long j = threadSummary.A0O;
                ThreadSummary threadSummary2 = c2gi.A01;
                if (j == threadSummary2.A0O && threadSummary.A01 == threadSummary2.A01 && threadSummary.A0n.equals(threadSummary2.A0n) && threadSummary.A0N == threadSummary2.A0N && threadSummary.A2c == threadSummary2.A2c && threadSummary.A2f == threadSummary2.A2f && 2Gt.A0F(threadSummary) == 2Gt.A0F(threadSummary2) && threadSummary.A2M == threadSummary2.A2M && threadSummary.A2I == threadSummary2.A2I && threadSummary.A2R == threadSummary2.A2R && threadSummary.B0N() == threadSummary2.B0N() && Objects.equal(threadSummary.A1L, threadSummary2.A1L) && Objects.equal(threadSummary.A20, threadSummary2.A20) && threadSummary.A0g == threadSummary2.A0g && Objects.equal(threadSummary.A1q, threadSummary2.A1q) && Objects.equal(threadSummary.A2A, threadSummary2.A2A) && Objects.equal(threadSummary.A0i, threadSummary2.A0i) && Objects.equal(threadSummary.A0b, threadSummary2.A0b) && Objects.equal(threadSummary.A1y, threadSummary2.A1y) && Objects.equal(threadSummary.BFG(), threadSummary2.BFG()) && threadSummary.Axu() == threadSummary2.Axu() && Objects.equal(threadSummary.A0k, threadSummary2.A0k) && Objects.equal(threadSummary.A0s, threadSummary2.A0s) && Objects.equal(threadSummary.A13, threadSummary2.A13)) {
                    String A00 = C2o7.A00(threadSummary);
                    String A002 = C2o7.A00(threadSummary2);
                    if (A00 != null ? A00.equals(A002) : A002 == null) {
                        if (threadSummary.A0J == threadSummary2.A0J && threadSummary.A0K == threadSummary2.A0K && Objects.equal(threadSummary.B3q(), threadSummary2.B3q()) && threadSummary.AoL() == threadSummary2.AoL() && threadSummary.A2j == threadSummary2.A2j && threadSummary.A04 == threadSummary2.A04 && Objects.equal(threadSummary.A0h, threadSummary2.A0h) && Objects.equal(this.A06, c2gi.A06) && Objects.equal(this.A03, c2gi.A03) && Objects.equal(this.A09, c2gi.A09) && Objects.equal(this.A05, c2gi.A05) && Objects.equal(this.A04, c2gi.A04)) {
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }
}
