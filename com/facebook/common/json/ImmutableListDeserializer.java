package com.facebook.common.json;

import X.24R;
import X.24S;
import X.2LD;
import X.3BP;
import X.4DN;
import X.5BB;
import X.AbstractC01033pi;
import X.AnonymousClass243;
import X.C27T;
import X.C42h;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.ImmutableList;
import java.io.IOException;

/* loaded from: ImmutableListDeserializer.class */
public class ImmutableListDeserializer extends JsonDeserializer {
    public JsonDeserializer A00;
    public final 24S A01;
    public final Class A02;

    public ImmutableListDeserializer(24S r302) {
        this.A02 = null;
        24S A09 = r302.A09(0);
        this.A01 = A09 == null ? 24R.A03 : A09;
        this.A00 = null;
    }

    public ImmutableListDeserializer(JsonDeserializer jsonDeserializer) {
        this.A02 = null;
        this.A01 = null;
        this.A00 = jsonDeserializer;
    }

    public ImmutableListDeserializer(Class cls) {
        this.A02 = cls;
        this.A01 = null;
        this.A00 = null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        C42h A1J;
        AnonymousClass243 anonymousClass243 = (AnonymousClass243) abstractC01033pi.A1M();
        if (!abstractC01033pi.A1m() || (A1J = abstractC01033pi.A1J()) == C42h.A09) {
            abstractC01033pi.A20();
            return ImmutableList.of();
        }
        if (A1J != C42h.A05) {
            4DN A1C = abstractC01033pi.A1C();
            IOException iOException = new IOException("Failed to deserialize to a list - missing start_array token", null);
            ((2LD) iOException)._location = A1C;
            throw iOException;
        }
        if (this.A00 == null) {
            24S r307 = this.A02;
            if (r307 == null) {
                r307 = this.A01;
            }
            this.A00 = anonymousClass243.A0f(c27t, r307);
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        while (5BB.A00(abstractC01033pi) != C42h.A01) {
            try {
                Object A0M = this.A00.A0M(abstractC01033pi, c27t);
                if (A0M != null) {
                    builder.m11011add(A0M);
                }
            } catch (3BP unused) {
            }
        }
        return builder.build();
    }
}
