package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6M7, reason: invalid class name */
/* loaded from: 6M7.class */
public final class C6M7 implements 6M8 {
    public C62v A00;
    public Capabilities A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 6M9 A06;
    public final C5eR A07;
    public final Context A08;
    public final C00i A09;
    public final C00i A0A;
    public final 6M6 A0B;

    public C6M7(Context context, 6M6 r303) {
        11T.A0F(context, 1);
        this.A08 = context;
        this.A04 = 1Bq.A00(16822);
        this.A03 = 1Bq.A00(68543);
        this.A01 = C5tt.A02;
        this.A02 = 1Bu.A00(50228);
        this.A05 = 1Bu.A01(context, 16428);
        this.A0B = r303;
        this.A06 = new 6M9(context);
        this.A07 = 6MA.A00(context);
        this.A09 = 1HG.A00(context, 68492);
        this.A0A = 1HG.A00(context, 68159);
    }

    public boolean ADs(View view, float f, int i) {
        AnonymousClass624 anonymousClass624 = (AnonymousClass624) this.A0B.A00.A0Q.get(i);
        if (!(anonymousClass624 instanceof AnonymousClass622) || !this.A01.A00.get(42)) {
            return false;
        }
        FbUserSession A04 = 1Fw.A04((1EZ) this.A05.A00.get());
        C60i c60i = (C60i) 1Lm.A05(this.A08, A04, 49936);
        AnonymousClass622 anonymousClass622 = (AnonymousClass622) anonymousClass624;
        Message message = anonymousClass622.A03;
        if (!c60i.A04(message) || ((C62g) this.A09.get()).A01(A04, anonymousClass622, null)) {
            return false;
        }
        ThreadSummary threadSummary = anonymousClass622.A05;
        if (threadSummary != null && threadSummary.A0n.A1K()) {
            this.A02.A00.get();
            23F r0 = (23F) 1Lo.A06(A04, 33102);
            1Du it = threadSummary.A1L.iterator();
            while (it.hasNext()) {
                User A00 = r0.A00(new UserKey(1Js.A03, C28p.A03((ThreadParticipant) it.next())));
                if (A00 != null && A00.A02() != C1z1.NOT_BLOCKED) {
                    return false;
                }
            }
        }
        Object obj = this.A0A.get();
        11T.A0A(obj);
        return (((C63e) obj).A00(anonymousClass622, null) || C1q7.A0Y(message)) ? false : true;
    }

    public int BDz(int i) {
        return (int) (this.A07.A00 / 0.5f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        return X.0S2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r0 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
    
        if (r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        return X.0S2.A01;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer BET(android.view.View r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            X.6M6 r0 = r0.A0B
            X.6Ff r0 = r0.A00
            com.google.common.collect.ImmutableList r0 = r0.A0Q
            r1 = r303
            java.lang.Object r0 = r0.get(r1)
            X.624 r0 = (X.AnonymousClass624) r0
            r304 = r0
            r0 = r301
            android.content.Context r0 = r0.A08
            r305 = r0
            r0 = r305
            boolean r0 = X.C2rY.A00(r0)
            r306 = r0
            r0 = r304
            boolean r0 = r0 instanceof X.AnonymousClass622
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L59
            r0 = r301
            X.1Br r0 = r0.A04
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            r0 = r304
            X.622 r0 = (X.AnonymousClass622) r0
            r304 = r0
            r0 = r304
            com.facebook.messaging.model.messages.Message r0 = r0.A03
            r305 = r0
            r0 = r305
            boolean r0 = X.C1q7.A0X(r0)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L59
            r0 = r306
            if (r0 == 0) goto L5e
        L55:
            java.lang.Integer r0 = X.0S2.A01
            return r0
        L59:
            r0 = r306
            if (r0 == 0) goto L55
        L5e:
            java.lang.Integer r0 = X.0S2.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6M7.BET(android.view.View, int):java.lang.Integer");
    }

    public float BEd() {
        return 0.5f;
    }

    public List BKL(C2lb c2lb) {
        11T.A0F(c2lb, 0);
        View view = c2lb.A0I;
        11T.A09(view);
        List singletonList = Collections.singletonList(view);
        11T.A0A(singletonList);
        return singletonList;
    }

    public void Bv9(Canvas canvas, C2lb c2lb, RecyclerView recyclerView, Integer num, float f) {
        11T.A0F(canvas, 0);
        11T.A0F(num, 4);
        View view = (View) BKL(c2lb).get(0);
        float bottom = view.getBottom() + view.getTop();
        6M9 r0 = this.A06;
        r0.A01(num, f, bottom, canvas.getWidth());
        r0.draw(canvas);
    }

    public void CPc(View view, int i) {
        if (this.A00 != null) {
            AnonymousClass624 anonymousClass624 = (AnonymousClass624) this.A0B.A00.A0Q.get(i);
            if (anonymousClass624 instanceof AnonymousClass622) {
                C62v c62v = this.A00;
                11T.A0D(c62v);
                c62v.CGe((AnonymousClass622) anonymousClass624);
            }
        }
    }
}
