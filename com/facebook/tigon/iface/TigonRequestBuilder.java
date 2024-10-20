package com.facebook.tigon.iface;

import X.AnonymousClass001;
import X.AnonymousClass413;
import X.AnonymousClass414;
import X.C40y;
import X.EnumC04093zx;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: TigonRequestBuilder.class */
public class TigonRequestBuilder {
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public String A08;
    public String A09;
    public boolean A0D = true;
    public boolean A0C = false;
    public Map A0B = new HashMap();
    public EnumC04093zx A07 = EnumC04093zx.A0C;
    public Map A0A = new HashMap();
    public int A00 = 1;
    public C40y A06 = new C40y();

    /* loaded from: TigonRequestBuilder$TigonRequestImpl.class */
    public class TigonRequestImpl implements TigonRequest {
        public final int A00;
        public final int A01;
        public final long A02;
        public final long A03;
        public final long A04;
        public final long A05;
        public final long A06;
        public final C40y A07;
        public final EnumC04093zx A08;
        public final String A09;
        public final String A0A;
        public final String A0B;
        public final Map A0C;
        public final Map A0D;
        public final boolean A0E;
        public final boolean A0F;
        public final TigonAuthHandler mAuthHandler;
        public final HttpPriorityContext mHttpPriorityContext;

        public TigonRequestImpl(C40y c40y, HttpPriorityContext httpPriorityContext, EnumC04093zx enumC04093zx, TigonAuthHandler tigonAuthHandler, String str, String str2, String str3, Map map, Map map2, int i, int i2, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
            this.A0A = str2;
            this.A0B = str3;
            this.A0C = Collections.unmodifiableMap(map);
            this.A01 = i2;
            this.A07 = c40y;
            this.A0F = z2;
            this.A0E = z;
            this.A0D = Collections.unmodifiableMap(map2);
            this.A03 = j2;
            this.A05 = j4;
            this.A06 = j5;
            this.A04 = j3;
            this.A08 = enumC04093zx;
            this.A09 = str;
            this.A00 = i;
            this.A02 = j;
            this.mAuthHandler = tigonAuthHandler;
            this.mHttpPriorityContext = httpPriorityContext;
        }

        public TigonRequestImpl(TigonRequestBuilder tigonRequestBuilder) {
            this.A0A = tigonRequestBuilder.A08;
            this.A0B = tigonRequestBuilder.A09;
            this.A0C = Collections.unmodifiableMap(tigonRequestBuilder.A0A);
            this.A01 = tigonRequestBuilder.A00;
            this.A07 = tigonRequestBuilder.A06;
            this.A0F = tigonRequestBuilder.A0D;
            this.A0E = tigonRequestBuilder.A0C;
            this.A0D = Collections.unmodifiableMap(tigonRequestBuilder.A0B);
            this.A03 = tigonRequestBuilder.A02;
            this.A05 = tigonRequestBuilder.A04;
            this.A06 = tigonRequestBuilder.A05;
            this.A04 = tigonRequestBuilder.A03;
            this.A08 = tigonRequestBuilder.A07;
            this.A09 = "";
            this.A00 = -1;
            this.A02 = tigonRequestBuilder.A01;
            this.mAuthHandler = null;
            this.mHttpPriorityContext = null;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public long addedToMiddlewareSinceEpochMS() {
            return this.A02;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public TigonAuthHandler authHandler() {
            return this.mAuthHandler;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public long connectionTimeoutMS() {
            return this.A03;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public long expectedResponseSizeBytes() {
            return this.A04;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public Object getLayerInformation(AnonymousClass414 anonymousClass414) {
            Map map = this.A0D;
            if (map == null) {
                return null;
            }
            return map.get(anonymousClass414);
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public Map headers() {
            return this.A0C;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public C40y httpPriority() {
            return this.A07;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public HttpPriorityContext httpPriorityContext() {
            return this.mHttpPriorityContext;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public long idleTimeoutMS() {
            return this.A05;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public String loggingId() {
            return this.A09;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public String method() {
            return this.A0A;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public boolean replaySafe() {
            return this.A0E;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public EnumC04093zx requestCategory() {
            return this.A08;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public long requestTimeoutMS() {
            return this.A06;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public boolean retryable() {
            return this.A0F;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public int startupStatusOnAdded() {
            return this.A00;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public int tigonPriority() {
            return this.A01;
        }

        @Override // com.facebook.tigon.iface.TigonRequest
        public String url() {
            return this.A0B;
        }
    }

    public TigonRequestBuilder(String str, String str2) {
        this.A09 = "";
        long j = -1;
        this.A03 = j;
        this.A01 = j;
        this.A08 = str;
        this.A09 = str2;
    }

    public static TigonRequest create(String str, String str2, String[] strArr, int i, boolean z, FacebookLoggingRequestInfo facebookLoggingRequestInfo) {
        TigonRequestBuilder tigonRequestBuilder = new TigonRequestBuilder(str, str2);
        tigonRequestBuilder.A00 = i;
        tigonRequestBuilder.A0D = z;
        int length = strArr.length;
        if ((length & 1) != 0) {
            throw AnonymousClass001.A0L("must have even number of flattened headers");
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                break;
            }
            tigonRequestBuilder.A00(strArr[i3], strArr[i3 + 1]);
            i2 = i3 + 2;
        }
        if (facebookLoggingRequestInfo != null) {
            tigonRequestBuilder.A0B.put(AnonymousClass413.A01, facebookLoggingRequestInfo);
        }
        return new TigonRequestImpl(tigonRequestBuilder);
    }

    public void A00(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.A0A.put(str, str2);
    }
}
