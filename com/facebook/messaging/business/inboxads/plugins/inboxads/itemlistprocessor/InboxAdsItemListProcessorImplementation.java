package com.facebook.messaging.business.inboxads.plugins.inboxads.itemlistprocessor;

import X.11T;
import X.1Bq;
import X.1Br;
import X.2fV;
import android.content.Context;
import com.facebook.messaging.business.inboxads.common.InboxAdsItem;
import com.google.common.base.Function;
import com.google.common.base.Predicate;

/* loaded from: InboxAdsItemListProcessorImplementation.class */
public final class InboxAdsItemListProcessorImplementation {
    public int A00;
    public InboxAdsItem A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 2fV A05;
    public final Context A06;
    public static final Predicate A09 = new Predicate() { // from class: X.2h4
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
        
            if ((r302 instanceof X.C03223xf) != false) goto L6;
         */
        @Override // com.google.common.base.Predicate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Object r302) {
            /*
                r301 = this;
                r0 = r302
                boolean r0 = r0 instanceof X.C2gi
                r303 = r0
                r0 = r303
                if (r0 != 0) goto L14
                r0 = r302
                boolean r0 = r0 instanceof X.C03223xf
                r304 = r0
                r0 = 0
                r303 = r0
                r0 = r304
                if (r0 == 0) goto L16
            L14:
                r0 = 1
                r303 = r0
            L16:
                r0 = r303
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C2h4.apply(java.lang.Object):boolean");
        }
    };
    public static final Function A07 = new Function() { // from class: X.2h5
        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            2UR r0 = (2UR) obj;
            if (r0 instanceof C03223xf) {
                return ((C03223xf) r0).A03;
            }
            C2gi c2gi = (C2gi) r0;
            11T.A0D(c2gi);
            return c2gi.A01;
        }
    };
    public static final Predicate A08 = new Predicate() { // from class: X.2h6
        @Override // com.google.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return obj instanceof InboxAdsItem;
        }
    };

    public InboxAdsItemListProcessorImplementation(Context context, 2fV r303) {
        11T.A0F(context, 1);
        11T.A0F(r303, 2);
        this.A06 = context;
        this.A05 = r303;
        this.A02 = 1Bq.A00(17034);
        this.A03 = 1Bq.A00(16385);
        this.A00 = (-1) << (-1);
        this.A04 = 1Bq.A00(116396);
    }
}
