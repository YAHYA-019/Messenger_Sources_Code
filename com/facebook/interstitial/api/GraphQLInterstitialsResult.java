package com.facebook.interstitial.api;

import X.2tJ;
import X.2tS;
import X.2vS;
import X.2vV;
import X.2vY;
import X.2xA;
import X.AnonymousClass001;
import X.C2va;
import X.C2x8;
import android.util.Base64;
import com.facebook.graphservice.asset.GraphServiceAsset;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: GraphQLInterstitialsResult.class */
public final class GraphQLInterstitialsResult implements 2xA {
    public C2x8 A00;
    public String A01;
    public final long clientTimeMs;
    public final boolean isValid;
    public final int maxViews;
    public final String nuxID;
    public final int rank;

    public GraphQLInterstitialsResult() {
        this(null, null, null, 0, 0, 0L, false);
    }

    public GraphQLInterstitialsResult(C2x8 c2x8, String str, String str2, int i, int i2, long j, boolean z) {
        this.A00 = c2x8;
        this.clientTimeMs = j;
        this.isValid = z;
        this.nuxID = str;
        this.rank = i;
        this.maxViews = i2;
        this.A01 = str2;
    }

    private final void setModel(String str) {
        this.A01 = str;
    }

    public final C2x8 A00() {
        String str;
        C2x8 c2x8 = this.A00;
        if (c2x8 == null && (str = this.A01) != null) {
            try {
                c2x8 = (C2x8) 2tS.A04(GraphServiceAsset.getDefaultConfigName()).deserializeTreeFromByteBuffer(ByteBuffer.wrap(Base64.decode(str, 2)), C2x8.class, -832065796);
                this.A00 = c2x8;
            } catch (IOException unused) {
                throw AnonymousClass001.A0L("Exception during deserialization of TreeModel");
            }
        }
        return c2x8;
    }

    public long AG6() {
        return this.clientTimeMs;
    }

    public int Avl() {
        return this.maxViews;
    }

    public String Azq() {
        return this.nuxID;
    }

    public int B5m() {
        return this.rank;
    }

    public void CYi(2tJ r302, boolean z) {
        if (r302 instanceof 2vV) {
            2vV r0 = (2vV) r302;
            Class Ao7 = r0.Ao7();
            boolean isInstance = Ao7.isInstance(A00());
            boolean z2 = r302 instanceof 2vS;
            if (!isInstance) {
                if (z2) {
                    2vY.A01(((2vS) r302).A00, (List) null);
                    return;
                } else {
                    r0.CYk((Object) null);
                    return;
                }
            }
            if (!z2) {
                r0.CYk(Ao7.cast(A00()));
            } else {
                ((2vS) r302).A00.A06((C2va) Ao7.cast(A00()));
            }
        }
    }

    public final String getModelString() {
        String str = this.A01;
        if (str == null && this.A00 != null) {
            try {
                ByteBuffer serializeTreeToByteBuffer = 2tS.A04(GraphServiceAsset.getDefaultConfigName()).serializeTreeToByteBuffer(this.A00);
                byte[] bArr = new byte[serializeTreeToByteBuffer.limit()];
                serializeTreeToByteBuffer.get(bArr);
                str = Base64.encodeToString(bArr, 2);
                this.A01 = str;
            } catch (IOException unused) {
                throw AnonymousClass001.A0L("Exception during serialization of TreeModel");
            }
        }
        return str;
    }

    public boolean isValid() {
        return this.isValid;
    }
}
