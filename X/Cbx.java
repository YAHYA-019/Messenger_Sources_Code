package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.neue.contactpicker.broadcastsection.ContactPickerBroadcastSection;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Cbx.class */
public final class Cbx implements 2TV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Cbx(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    public /* bridge */ /* synthetic */ void C47(Object obj, Object obj2) {
        Throwable th;
        2TV r305;
        switch (this.A00) {
            case 0:
                th = (Throwable) obj2;
                CnV cnV = (CnV) this.A01;
                1BK.A09(cnV.A04).softReport("BroadcastRecipientsLoader failure", "", th);
                r305 = cnV.A00;
                if (r305 == null) {
                    return;
                }
                break;
            case 1:
                Cbl cbl = (Cbl) this.A01;
                CallerContext callerContext = Cbl.A08;
                1BK.A09(cbl.A03).D0v(Cbl.__redex_internal_original_name, "RecentThreads loader failure");
                cbl.A00.C47(this.A03, ((2fP) obj2).A00);
                return;
            case 2:
                th = (Throwable) obj2;
                CnW cnW = (CnW) this.A01;
                cnW.A03.softReport("SmsInviteLoader", "Load sms invite contacts failed", th);
                r305 = cnW.A00;
                break;
            default:
                RZP rzp = (RZP) this.A01;
                ImmutableSet immutableSet = RZP.A09;
                1BK.A09(rzp.A03).D0v("ClientSideSectionRowFactory", 0Pz.A0W("Falied to load section ", ((ContactPickerBroadcastSection) this.A03).A02));
                ((1FX) this.A02).setException((Throwable) obj2);
                return;
        }
        r305.C47(this.A03, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0212, code lost:
    
        if (r0 != false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v169, types: [X.Cf5, X.AoO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v178, types: [X.AoP, X.Cf5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void C4X(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cbx.C4X(java.lang.Object, java.lang.Object):void");
    }

    public /* bridge */ /* synthetic */ void C4n(ListenableFuture listenableFuture, Object obj) {
        2TV r306;
        switch (this.A00) {
            case 0:
                r306 = ((CnV) this.A01).A00;
                if (r306 == null) {
                    return;
                }
                break;
            case 1:
                Cbl cbl = (Cbl) this.A01;
                CallerContext callerContext = Cbl.A08;
                r306 = cbl.A00;
                break;
            case 2:
                r306 = ((CnW) this.A01).A00;
                break;
            default:
                return;
        }
        r306.C4n(listenableFuture, this.A03);
    }

    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
    }
}
