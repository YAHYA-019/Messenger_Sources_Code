package com.facebook.common.json;

import X.0Pz;
import X.1BK;
import X.24S;
import X.2LD;
import X.4DN;
import X.5BB;
import X.AbstractC01033pi;
import X.AnonymousClass243;
import X.C27T;
import X.C2cb;
import X.C42f;
import X.C42h;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.io.IOException;

/* loaded from: ImmutableMapDeserializer.class */
public class ImmutableMapDeserializer extends JsonDeserializer {
    public JsonDeserializer A00;
    public JsonDeserializer A01;
    public boolean A02 = false;
    public final 24S A03;
    public final Class A04;

    public ImmutableMapDeserializer(24S r302) {
        boolean z = false;
        Class cls = r302.A09(0)._class;
        this.A04 = cls;
        Preconditions.checkArgument((cls == String.class || Enum.class.isAssignableFrom(cls)) ? true : z, "Map keys must be a String or an enum.");
        this.A03 = r302.A09(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        C42h A1J;
        AnonymousClass243 anonymousClass243 = (AnonymousClass243) abstractC01033pi.A1M();
        if (!abstractC01033pi.A1m() || (A1J = abstractC01033pi.A1J()) == C42h.A09) {
            abstractC01033pi.A20();
            return RegularImmutableMap.A03;
        }
        if (A1J != C42h.A06) {
            4DN A1C = abstractC01033pi.A1C();
            IOException iOException = new IOException("Failed to deserialize to a map - missing start_object token", null);
            ((2LD) iOException)._location = A1C;
            throw iOException;
        }
        if (!this.A02) {
            Class cls = this.A04;
            if (cls != String.class) {
                this.A00 = anonymousClass243.A0e(c27t, cls);
            }
            this.A02 = true;
        }
        if (this.A01 == null) {
            this.A01 = anonymousClass243.A0d(c27t, this.A03);
        }
        ImmutableMap.Builder A0c = 1BK.A0c();
        while (5BB.A00(abstractC01033pi) != C42h.A02) {
            if (abstractC01033pi.A1J() == C42h.A03) {
                String A1Y = abstractC01033pi.A1Y();
                abstractC01033pi.A1K();
                Object A0M = this.A01.A0M(abstractC01033pi, c27t);
                if (A0M != null) {
                    if (this.A00 != null) {
                        C42f A05 = anonymousClass243._jsonFactory.A05(0Pz.A0j("\"", A1Y, "\""));
                        A05.A1K();
                        try {
                            A1Y = this.A00.A0M(A05, c27t);
                        } catch (C2cb unused) {
                        }
                    }
                    A0c.put(A1Y, A0M);
                }
            }
        }
        return A0c.build();
    }
}
