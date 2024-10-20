package com.fasterxml.jackson.datatype.guava.ser;

import X.1BL;
import X.24S;
import X.28Q;
import X.68U;
import X.AnonymousClass001;
import X.C25p;
import X.C26c;
import X.C27r;
import X.C42h;
import X.C4Nr;
import X.JQx;
import X.JQy;
import X.Kls;
import X.L6w;
import X.LiY;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.google.common.collect.BoundType;
import com.google.common.collect.Cut;
import com.google.common.collect.Range;

/* loaded from: RangeSerializer.class */
public class RangeSerializer extends StdSerializer implements C27r {
    public final JsonSerializer _endpointSerializer;
    public final LiY _fieldNames;
    public final 24S _rangeType;

    public RangeSerializer(24S r302, JsonSerializer jsonSerializer, LiY liY) {
        super(r302);
        this._rangeType = r302;
        this._endpointSerializer = jsonSerializer;
        this._fieldNames = liY;
    }

    private void A03(28Q r302, C26c c26c, Range range) {
        BoundType boundType;
        BoundType boundType2;
        Cut cut = range.lowerBound;
        if (cut != Cut.BelowAll.A00) {
            String str = this._fieldNames.lowerEndpoint;
            if (this._endpointSerializer != null) {
                r302.A0o(str);
                this._endpointSerializer.A0A(r302, c26c, range.lowerBound.A01());
            } else {
                c26c.A0X(r302, cut.A01(), str);
            }
            String str2 = this._fieldNames.lowerBoundType;
            Cut cut2 = range.lowerBound;
            if (cut2 instanceof Cut.BelowValue) {
                boundType2 = BoundType.CLOSED;
            } else {
                if (cut2 instanceof Cut.BelowAll) {
                    throw JQx.A0o();
                }
                if (!(cut2 instanceof Cut.AboveValue)) {
                    throw AnonymousClass001.A0J("this statement should be unreachable");
                }
                boundType2 = BoundType.OPEN;
            }
            String name = boundType2.name();
            r302.A0o(str2);
            r302.A0r(name);
        }
        Cut cut3 = range.upperBound;
        if (cut3 != Cut.AboveAll.A00) {
            String str3 = this._fieldNames.upperEndpoint;
            if (this._endpointSerializer != null) {
                r302.A0o(str3);
                this._endpointSerializer.A0A(r302, c26c, range.upperBound.A01());
            } else {
                c26c.A0X(r302, cut3.A01(), str3);
            }
            String str4 = this._fieldNames.upperBoundType;
            Cut cut4 = range.upperBound;
            if (cut4 instanceof Cut.BelowValue) {
                boundType = BoundType.OPEN;
            } else {
                if (cut4 instanceof Cut.BelowAll) {
                    throw AnonymousClass001.A0J("this statement should be unreachable");
                }
                if (!(cut4 instanceof Cut.AboveValue)) {
                    throw JQx.A0o();
                }
                boundType = BoundType.CLOSED;
            }
            String name2 = boundType.name();
            r302.A0o(str4);
            r302.A0r(name2);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        Range range = (Range) obj;
        r302.A0O(range);
        Kls A0Z = 1BL.A0Z(r302, C42h.A06, c4Nr, range);
        A03(r302, c26c, range);
        c4Nr.A02(r302, A0Z);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        Range range = (Range) obj;
        r302.A0m(range);
        A03(r302, c26c, range);
        r302.A0Y();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        Range range = (Range) obj;
        return range.lowerBound.equals(range.upperBound);
    }

    @Override // X.C27r
    public JsonSerializer AJN(68U r302, C26c c26c) {
        C25p c25p = c26c._config;
        LiY A00 = L6w.A00(c25p._base._propertyNamingStrategy, c25p);
        JsonSerializer jsonSerializer = this._endpointSerializer;
        if (jsonSerializer == null) {
            24S A0Z = JQy.A0Z(this._rangeType, 0);
            if (A0Z._class != Object.class) {
                jsonSerializer = c26c.A0J(r302, A0Z);
            }
        } else {
            jsonSerializer = JQy.A0b(r302, jsonSerializer, c26c, jsonSerializer instanceof C27r ? 1 : 0);
        }
        return new RangeSerializer(this._rangeType, jsonSerializer, A00);
    }
}
