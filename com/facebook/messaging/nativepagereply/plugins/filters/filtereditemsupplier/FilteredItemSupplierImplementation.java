package com.facebook.messaging.nativepagereply.plugins.filters.filtereditemsupplier;

import X.0QD;
import X.0S2;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Hk;
import X.2Si;
import X.2Sk;
import X.2Uu;
import X.4YV;
import X.7zR;
import X.AKO;
import X.AbU;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C2xd;
import X.C9P;
import X.Cbt;
import X.Cc6;
import X.Ctw;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.model.threads.ThreadsCollection;
import com.facebook.messaging.service.model.virtualfolders.FetchVirtualFolderThreadsResult;
import java.util.HashSet;

/* loaded from: FilteredItemSupplierImplementation.class */
public final class FilteredItemSupplierImplementation implements CallerContextable {
    public int A00;
    public FetchVirtualFolderThreadsResult A01;
    public 2Uu A02;
    public AbU A03;
    public AbU A04;
    public final Context A05;
    public final FbUserSession A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 2Si A0A;
    public final 2Sk A0B;
    public final C01i A0C;
    public final Ctw A0D;

    public FilteredItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2Si r304, 2Sk r305) {
        7zR.A1O(r304, fbUserSession);
        this.A0B = r305;
        this.A0A = r304;
        this.A06 = fbUserSession;
        this.A05 = context;
        Ctw ctw = new Ctw(this);
        this.A0D = ctw;
        AbU abU = AbU.A02;
        this.A03 = abU;
        this.A04 = abU;
        this.A09 = 1Bu.A01(context, 83876);
        this.A08 = 1Bu.A01(context, 1101);
        this.A0C = C01g.A01(new AKO(this, 37));
        this.A07 = 1Bq.A00(17078);
        this.A02 = ((C2xd) 1Br.A0B(this.A08)).A0H(fbUserSession, ctw);
        ((Cc6) 1Br.A0B(this.A09)).A02 = new Cbt(this, 11);
    }

    public static final void A00(FilteredItemSupplierImplementation filteredItemSupplierImplementation, Integer num) {
        1Hk r303;
        ThreadsCollection A01;
        ThreadSummary threadSummary;
        filteredItemSupplierImplementation.A0A.A00("FILTERED_THREAD_LIST", "filtered thread list loading started");
        long j = -1;
        if (num == 0S2.A01) {
            FetchVirtualFolderThreadsResult fetchVirtualFolderThreadsResult = filteredItemSupplierImplementation.A01;
            if (fetchVirtualFolderThreadsResult != null && (A01 = fetchVirtualFolderThreadsResult.A01()) != null && (threadSummary = (ThreadSummary) 0QD.A0G(A01.A01)) != null) {
                j = threadSummary.A0N;
            }
            j--;
        }
        HashSet A0v = AnonymousClass001.A0v();
        switch (filteredItemSupplierImplementation.A0B.A01().ordinal()) {
            case 5:
                r303 = 1Hk.A04;
                break;
            case 6:
                r303 = 1Hk.A07;
                break;
            case 7:
                r303 = 1Hk.A03;
                break;
            case 8:
                r303 = 1Hk.A02;
                break;
            case 9:
                r303 = 1Hk.A0D;
                break;
            case 10:
                r303 = 1Hk.A0C;
                break;
            default:
                throw new IllegalArgumentException();
        }
        ((Cc6) 1Br.A0B(filteredItemSupplierImplementation.A09)).A00(new C9P(r303, num, 4YV.A0z("loadType", A0v, A0v), j));
    }
}
