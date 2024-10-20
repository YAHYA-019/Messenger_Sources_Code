package com.fasterxml.jackson.databind.jsontype.impl;

import X.1BL;
import X.24S;
import X.3BX;
import X.3BY;
import X.3eR;
import X.AnonymousClass001;
import X.AnonymousClass253;
import X.AnonymousClass260;
import X.C24h;
import X.C24j;
import X.C25p;
import X.InterfaceC00923pT;
import X.JQx;
import X.Jyi;
import X.Jyr;
import X.Jys;
import X.Jyv;
import X.KN1;
import X.KNk;
import X.MKA;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: StdTypeResolverBuilder.class */
public class StdTypeResolverBuilder implements InterfaceC00923pT {
    public MKA _customIdResolver;
    public Class _defaultImpl;
    public KNk _idType;
    public KN1 _includeAs;
    public boolean _typeIdVisible = false;
    public String _typeProperty;

    private MKA A00(24S r302, AnonymousClass253 anonymousClass253, C24j c24j, Collection collection, boolean z, boolean z2) {
        HashMap A0u;
        ConcurrentHashMap concurrentHashMap;
        MKA mka = this._customIdResolver;
        if (mka == null) {
            KNk kNk = this._idType;
            if (kNk == null) {
                throw AnonymousClass001.A0N("Cannot build, 'init()' not yet called");
            }
            int ordinal = kNk.ordinal();
            if (ordinal == 4 || ordinal == 1) {
                return new 3BX(r302, c24j, anonymousClass253._base._typeFactory);
            }
            if (ordinal == 2) {
                return new Jys(r302, c24j, anonymousClass253._base._typeFactory);
            }
            if (ordinal == 3) {
                if (z == z2) {
                    throw JQx.A0n();
                }
                if (z) {
                    concurrentHashMap = JQx.A13();
                    A0u = null;
                } else {
                    A0u = AnonymousClass001.A0u();
                    concurrentHashMap = new ConcurrentHashMap(4);
                }
                boolean A09 = anonymousClass253.A09(AnonymousClass260.A03);
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        3eR r0 = (3eR) it.next();
                        Class cls = r0._class;
                        String str = r0._name;
                        if (str == null) {
                            str = cls.getName();
                            int lastIndexOf = str.lastIndexOf(46);
                            if (lastIndexOf >= 0) {
                                str = AnonymousClass001.A0W(lastIndexOf, str);
                            }
                        }
                        if (z) {
                            JQx.A1K(cls, str, concurrentHashMap);
                        }
                        if (z2) {
                            if (A09) {
                                str = str.toLowerCase();
                            }
                            24S r02 = (24S) A0u.get(str);
                            if (r02 == null || !cls.isAssignableFrom(r02._class)) {
                                A0u.put(str, anonymousClass253._base._typeFactory.A09(cls));
                            }
                        }
                    }
                }
                return new 3BY(r302, anonymousClass253, A0u, concurrentHashMap);
            }
            if (ordinal != 0) {
                throw 1BL.A0h(kNk, "Do not know how to construct standard type id resolver for idType: ", AnonymousClass001.A0k());
            }
            mka = null;
        }
        return mka;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x018e, code lost:
    
        if (r303._class == r301._defaultImpl) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d6  */
    @Override // X.InterfaceC00923pT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.Jyp ACs(X.C26L r302, X.24S r303, java.util.Collection r304) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.ACs(X.26L, X.24S, java.util.Collection):X.Jyp");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC00923pT
    public Jyi ACt(24S r302, C25p c25p, Collection collection) {
        if (this._idType == KNk.NONE || r302._class.isPrimitive()) {
            return null;
        }
        C24j c24j = c25p._base._typeValidator;
        C24j c24j2 = c24j;
        if (c24j == C24h.A00) {
            c24j2 = c24j;
            if ((c25p._mapperFeatures & AnonymousClass260.A0D._mask) != 0) {
                c24j2 = new Object();
            }
        }
        MKA A00 = A00(r302, c25p, c24j2, collection, true, false);
        if (this._idType != KNk.DEDUCTION) {
            KN1 kn1 = this._includeAs;
            int ordinal = kn1.ordinal();
            if (ordinal == 2) {
                return new Jyi(null, A00);
            }
            if (ordinal == 0) {
                return new Jyr(null, A00, this._typeProperty);
            }
            if (ordinal == 1) {
                return new Jyi(null, A00);
            }
            if (ordinal == 3) {
                return new Jyv(null, A00, this._typeProperty);
            }
            if (ordinal != 4) {
                throw 1BL.A0h(kn1, "Do not know how to construct standard type serializer for inclusion type: ", AnonymousClass001.A0k());
            }
        }
        return new Jyr(null, A00, this._typeProperty);
    }
}
