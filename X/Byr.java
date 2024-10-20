package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Byr.class */
public final class Byr {
    public AeX A00;
    public FRXParams A01;
    public FeedbackReportFragment A02;
    public ThreadKey A03;
    public ThreadSummary A04;
    public final FbUserSession A05;
    public final 6Io A06;
    public final C1740Ara A07;
    public final C3t A08;
    public final C9U A09 = (C9U) 1Bi.A05(C9U.class, (Class) null);
    public final C5yr A0A = (C5yr) 1Bi.A05(C5yr.class, (Class) null);
    public final CQX A0B;
    public final CHm A0C;
    public final CJj A0D;

    public Byr(Context context, FbUserSession fbUserSession, FRXParams fRXParams, ThreadKey threadKey) {
        this.A03 = threadKey;
        this.A01 = fRXParams;
        this.A04 = fRXParams.A05;
        this.A05 = fbUserSession;
        this.A00 = (AeX) 1Bn.A0F(context, AeX.class, (Class) null);
        this.A0B = (CQX) 1Bn.A0F(context, CQX.class, (Class) null);
        this.A06 = (6Io) 1Bn.A0F(context, 6Io.class, (Class) null);
        this.A08 = (C3t) 1Bn.A0F(context, C3t.class, (Class) null);
        this.A07 = (C1740Ara) 1Bn.A0F(context, C1740Ara.class, (Class) null);
        this.A0D = (CJj) 1Bn.A0F(context, CJj.class, (Class) null);
        this.A0C = (CHm) 1Bn.A0F(context, CHm.class, (Class) null);
    }
}
