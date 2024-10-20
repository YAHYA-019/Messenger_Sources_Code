package com.fasterxml.jackson.datatype.guava.deser;

import X.0Q8;
import X.24S;
import X.68U;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass437;
import X.C26L;
import X.C27T;
import X.C42h;
import X.C42x;
import X.C68e;
import X.JQx;
import X.JQy;
import X.L6w;
import X.LiY;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.google.common.base.Preconditions;
import com.google.common.collect.BoundType;
import com.google.common.collect.Cut;
import com.google.common.collect.Range;
import java.util.Arrays;

/* loaded from: RangeDeserializer.class */
public class RangeDeserializer extends StdDeserializer implements AnonymousClass437 {
    public static final long serialVersionUID = 1;
    public final BoundType _defaultBoundType;
    public final JsonDeserializer _endpointDeserializer;
    public final LiY _fieldNames;
    public final 24S _rangeType;

    public RangeDeserializer(24S r302, JsonDeserializer jsonDeserializer, LiY liY, BoundType boundType) {
        super(r302);
        this._rangeType = r302;
        this._endpointDeserializer = jsonDeserializer;
        this._defaultBoundType = boundType;
        this._fieldNames = liY;
    }

    private BoundType A00(AbstractC01033pi abstractC01033pi, C27T c27t) {
        A03(C42h.A0C, abstractC01033pi.A1J(), c27t);
        String A1Z = abstractC01033pi.A1Z();
        try {
            return BoundType.valueOf(A1Z);
        } catch (IllegalArgumentException unused) {
            c27t.A0l(BoundType.class, A1Z, "not a valid BoundType name (should be one oF: %s)", Arrays.asList(BoundType.values()));
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public Range A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Cut cut;
        Cut cut2;
        C42h A1J = abstractC01033pi.A1J();
        if (A1J == C42h.A06) {
            A1J = abstractC01033pi.A1K();
        }
        BoundType boundType = this._defaultBoundType;
        Comparable comparable = null;
        BoundType boundType2 = boundType;
        Comparable comparable2 = null;
        while (A1J != C42h.A02) {
            A03(C42h.A03, A1J, c27t);
            String A1Y = abstractC01033pi.A1Y();
            try {
                LiY liY = this._fieldNames;
                if (A1Y.equals(liY.lowerEndpoint)) {
                    abstractC01033pi.A1K();
                    comparable = A02(abstractC01033pi, c27t);
                } else if (A1Y.equals(liY.upperEndpoint)) {
                    abstractC01033pi.A1K();
                    comparable2 = A02(abstractC01033pi, c27t);
                } else if (A1Y.equals(liY.lowerBoundType)) {
                    abstractC01033pi.A1K();
                    boundType = A00(abstractC01033pi, c27t);
                } else if (A1Y.equals(liY.upperBoundType)) {
                    abstractC01033pi.A1K();
                    boundType2 = A00(abstractC01033pi, c27t);
                } else {
                    c27t.A0X(abstractC01033pi, this, Range.class, A1Y);
                }
                A1J = abstractC01033pi.A1K();
            } catch (IllegalStateException e) {
                c27t.A0E(e.getMessage(), A0S());
                throw 0Q8.createAndThrow();
            }
        }
        boolean z = true;
        if (comparable == null) {
            if (comparable2 == null) {
                return Range.A00;
            }
            if (boundType2 == null) {
                z = false;
            }
            Preconditions.checkState(z, "'upperEndpoint' field found, but not 'upperBoundType'");
            return Range.A01(boundType2, comparable2);
        }
        if (comparable2 == null) {
            if (boundType == null) {
                z = false;
            }
            Preconditions.checkState(z, "'lowerEndpoint' field found, but not 'lowerBoundType'");
            return Range.A00(boundType, comparable);
        }
        Class<?> cls = comparable.getClass();
        Class<?> cls2 = comparable2.getClass();
        Preconditions.checkState(AnonymousClass001.A1W(cls, cls2), "Endpoint types are not the same - 'lowerEndpoint' deserialized to [%s], and 'upperEndpoint' deserialized to [%s].", cls.getName(), cls2.getName());
        Preconditions.checkState(AnonymousClass001.A1T(boundType), "'lowerEndpoint' field found, but not 'lowerBoundType'");
        if (boundType2 == null) {
            z = false;
        }
        Preconditions.checkState(z, "'upperEndpoint' field found, but not 'upperBoundType'");
        Range range = Range.A00;
        boundType.getClass();
        boundType2.getClass();
        BoundType boundType3 = BoundType.OPEN;
        if (boundType == boundType3) {
            new Cut(comparable);
        } else {
            new Cut(comparable);
        }
        if (boundType2 == boundType3) {
            new Cut(comparable2);
        } else {
            new Cut(comparable2);
        }
        return new Range(cut, cut2);
    }

    private Comparable A02(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object A0M = this._endpointDeserializer.A0M(abstractC01033pi, c27t);
        if (A0M instanceof Comparable) {
            return (Comparable) A0M;
        }
        JQx.A1I(c27t, this._rangeType, "Field [%s] deserialized to [%s], which does not implement Comparable.", new Object[]{abstractC01033pi.A1Y(), AnonymousClass001.A0Y(A0M)});
        throw 0Q8.createAndThrow();
    }

    private void A03(C42h c42h, C42h c42h2, C27T c27t) {
        if (c42h2 != c42h) {
            c27t.A0e(this, String.format("Problem deserializing %s: expecting %s, found %s", A0S().getName(), c42h, c42h2), new Object[0]);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.POJO;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        return c68e.A07(abstractC01033pi, c27t);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public 24S A0c() {
        return this._rangeType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v0 */
    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        JsonDeserializer AJM;
        C26L c26l = c27t._config;
        LiY A00 = L6w.A00(c26l._base._propertyNamingStrategy, c26l);
        ?? r307 = this._endpointDeserializer;
        if (r307 == 0) {
            AJM = c27t.A0G(r302, JQy.A0Z(this._rangeType, 0));
        } else {
            boolean z = r307 instanceof AnonymousClass437;
            AJM = r307;
            if (z) {
                AJM = ((AnonymousClass437) r307).AJM(r302, c27t);
            }
        }
        if (AJM == this._endpointDeserializer && A00 == this._fieldNames) {
            return this;
        }
        return new RangeDeserializer(this._rangeType, AJM, A00, this._defaultBoundType);
    }
}
