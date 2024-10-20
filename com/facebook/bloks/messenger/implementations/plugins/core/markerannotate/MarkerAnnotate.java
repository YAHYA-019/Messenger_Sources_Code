package com.facebook.bloks.messenger.implementations.plugins.core.markerannotate;

import X.11T;
import X.1BK;
import X.1Bi;
import X.7zM;
import X.AbE;
import X.AnonymousClass001;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKc;
import X.F7S;
import X.FIV;
import com.facebook.quicklog.MarkerEditor;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: MarkerAnnotate.class */
public final class MarkerAnnotate {
    public static final Object A00(DKc dKc) {
        String A0j;
        double A00;
        F7S f7s = (F7S) 1Bi.A03(99797);
        Object A10 = DKC.A10(dKc, 2);
        11T.A0I(A10, AbE.A00(641));
        AbstractMap abstractMap = (AbstractMap) A10;
        Object A102 = DKC.A10(dKc, 0);
        A102.getClass();
        int A05 = DKD.A05(A102, "null cannot be cast to non-null type kotlin.Number");
        int A0B = DKE.A0B(dKc);
        Set entrySet = abstractMap.entrySet();
        if (entrySet.isEmpty()) {
            return null;
        }
        MarkerEditor withMarker = 1BK.A0U(f7s.A00).withMarker(A05, A0B);
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            Object value = A0z.getValue();
            if (value instanceof Integer) {
                withMarker.annotate(AnonymousClass001.A0j(A0z), AnonymousClass001.A03(value));
            } else if (value instanceof Long) {
                withMarker.annotate(AnonymousClass001.A0j(A0z), AnonymousClass001.A05(value));
            } else {
                if (value instanceof Double) {
                    A0j = AnonymousClass001.A0j(A0z);
                    A00 = DKC.A00(value);
                } else if (value instanceof Float) {
                    A0j = AnonymousClass001.A0j(A0z);
                    A00 = 7zM.A00(value);
                } else {
                    boolean z = value instanceof Boolean;
                    String A0j2 = AnonymousClass001.A0j(A0z);
                    if (z) {
                        withMarker.annotate(A0j2, AnonymousClass001.A1V(value));
                    } else {
                        withMarker.annotate(A0j2, FIV.A00(value));
                    }
                }
                withMarker.annotate(A0j, A00);
            }
        }
        withMarker.markerEditingCompleted();
        return null;
    }
}
